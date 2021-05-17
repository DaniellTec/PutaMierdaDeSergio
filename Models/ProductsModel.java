package com.ejemplo.E02RestEjemplo.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.ejemplo.E02RestEjemplo.DBFactory.DBFactory;
import com.ejemplo.E02RestEjemplo.Entities.Orders;



public class ProductsModel {
    
    Connection conexion = null;

    public ProductsModel() throws SQLException {
	DataSource ds = DBFactory.getMySQLDataSource();
	conexion = ds.getConnection();
    }

    public Orders read(Integer id) {
	Orders pedido = null;
	Statement sentencia = null;

	String sql = "SELECT `id`, `employee_id`, `customer_id`, `order_date`, "
		+ "`shipped_date`, `shipper_id`, `ship_name` , `ship_address`,"
		+ "`ship_city`, `ship_state_province`, `ship_zip_postal_code`, `ship_country_region`, `shipping_fee`, "
		+ "`taxes`, `payment_type`, `paid_date`, `notes`, `tax_rate`, `tax_status_id`, `status_id`" + "FROM orders "
		+ "WHERE id = " + id;

	try {
	    sentencia = conexion.createStatement();
	    ResultSet rs = sentencia.executeQuery(sql);
	    while (rs.next()) { // Si hay un cliente que existe
		pedido = new Orders(
			rs.getInt("id"),
			rs.getInt("employee_id"),
			rs.getInt("customer_id"),
			rs.getString("order_date"),
			rs.getString("shipped_date"),
			rs.getInt("shipper_id"),
			rs.getString("ship_name"),
			rs.getString("ship_address"),
			rs.getString("ship_city"),
			rs.getString("ship_state_province"),
			rs.getString("ship_zip_postal_code"),
			rs.getString("ship_country_region"),
			rs.getString("shipping_fee"),
			rs.getString("taxes"),
			rs.getString("payment_type"),
			rs.getString("paid_date"),
			rs.getString("notes"),
			rs.getString("tax_rate"),
			rs.getInt("tax_status_id"),
			rs.getInt("status_id"));
	    };
	    
	} catch (SQLException e) {
	    System.err.println("Error en read de Pedidos: " + e.getMessage());
	    return null;
	}

	return pedido;
    }

    /**
     * 
     * @param cliente
     * @return Devuelve el id del registro recien insertado
     */
    public Integer insert(Orders pedido) throws  SQLException {
	Integer id = null;
	PreparedStatement ps = null;
	String sql = "INSERT INTO orders ( "
		+ "`employee_id`, `customer_id`, `order_date`, "
		+ "`shipped_date`, `shipper_id`, `ship_name` , `ship_address`,"
		+ "`ship_city`, `ship_state_province`, `ship_zip_postal_code`, `ship_country_region`, `shipping_fee`, "
		+ "`taxes`, `payment_type`, `paid_date`, `notes`, `tax_rate`, `tax_status_id`, `status_id`) "
		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	try {
	    ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	    //ps.setString(1, pedido.getEmployeeId());
	    //ps.setString(2, pedido.getCustomerId());
	    ps.setString(1, pedido.getOrderDate());
	    ps.setString(2, pedido.getShippedDate());
	    //ps.setString(5, pedido.getShipperId());
	    ps.setString(3, pedido.getShipName());
	    ps.setString(4, pedido.getShipAddress());
	    ps.setString(5, pedido.getShipCity());
	    ps.setString(6, pedido.getShipStateProvince());
	    ps.setString(7, pedido.getShipZipPostalCode());
	    ps.setString(8, pedido.getShipCountryRegion());
	    ps.setString(9, pedido.getShippingFee());
	    ps.setString(10, pedido.getTaxes());
	    ps.setString(11, pedido.getPaymentType());
	    ps.setString(12, pedido.getPaidDate());
	    ps.setString(13, pedido.getNotes());
	    ps.setString(14, pedido.getTaxRate());
	    //ps.setString(15, pedido.getTaxStatusId());
	    //ps.setString(16, pedido.getStatudId());
	    
	    if (ps.executeUpdate() > 0) {
		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
		    id = rs.getInt(1);
		}
	    }

	} catch (SQLException e) {
	    System.err.println("Error al insertar Customer: " + e.getMessage());
	    throw e;
	}

	return id;
    }

    public Boolean delete(Integer idpedido) throws SQLException {
	Boolean resultado = false;

	PreparedStatement ps = null;
	String sql = "DELETE FROM customers where id = ?";
	try {
	    ps = conexion.prepareStatement(sql);

	    ps.setInt(1, idpedido);

	    resultado = (ps.executeUpdate() > 0);

	} catch (SQLException e) {
	    System.err.println("Error al borrar Cliente: " + e.getMessage());
	    throw e;
	}

	return resultado;
    }

    public Boolean update(Orders pedido) throws SQLException  {
	Boolean resultado = false;

	PreparedStatement ps = null;
	String sql = "UPDATE orders set "
		+ "employee_id = ?, "
		+ "customer_id = ?, "
		+ "order_date = ?, "
		+ "shipped_date = ?, "
		+ "shipper_id = ?, "
		+ "ship_name  = ?, "
		+ "ship_address = ?, "
		+ "ship_city = ?, "
		+ "ship_state_province = ?, "
		+ "ship_zip_postal_code = ?, "
		+ "ship_country_region = ?, "
		+ "shipping_fee = ?, "
		+ "taxes = ?, "
		+ "payment_type = ?, "
		+ "paid_date = ?, "
		+ "notes = ?, "
		+ "tax_rate = ? "
		+ "tax_status_id = ? "
		+ "status_id = ? "
		+ "where id = ?";
	try {
	    ps = conexion.prepareStatement(sql);
	   
	    ps.setString(3, pedido.getOrderDate());
	    ps.setString(4, pedido.getShippedDate());
	   
	    ps.setString(6, pedido.getShipName());
	    ps.setString(7, pedido.getShipAddress());
	    ps.setString(8, pedido.getShipCity());
	    ps.setString(9, pedido.getShipStateProvince());
	    ps.setString(10, pedido.getShipZipPostalCode());
	    ps.setString(11, pedido.getShipCountryRegion());
	    ps.setString(12, pedido.getShippingFee());
	    ps.setString(13, pedido.getTaxes());
	    ps.setString(14, pedido.getPaymentType());
	    ps.setString(17, pedido.getPaidDate());
	    ps.setString(17, pedido.getNotes());
	    ps.setString(17, pedido.getTaxRate());
	   
	    
	    ps.setInt(19, pedido.getId());
	    ps.setInt(1, pedido.getEmployeeId());
	    ps.setInt(2, pedido.getCustomerId());
	    ps.setInt(5, pedido.getShipperId());
	    ps.setInt(17, pedido.getTaxStatusId());
	    ps.setInt(18, pedido.getStatusId());
	    
	    resultado = (ps.executeUpdate() > 0);

	} catch (SQLException e) {
	    System.err.println("Error al actualizar Pedido: " + e.getMessage());
	    throw e;
	}

	return resultado;
    }

    public ArrayList<Orders> lista(String filtro, Integer limite, Integer offset)

    {
	ArrayList<Orders> pedidos = new ArrayList<Orders>();
	Statement sentencia = null;

	String sql = "SELECT `id`, "
		+ "`company`, "
		+ "`last_name`, "
		+ "`first_name`, "
		+ "`email_address`, "
		+ "`job_title`, "
		+ "`business_phone` , "
		+ "`home_phone`,"
		+ "`mobile_phone`, "
		+ "`fax_number`, "
		+ "`address`, "
		+ "`city`, "
		+ "`state_province`, "
		+ "`zip_postal_code`, "
		+ "`country_region`, "
		+ "`web_page`, "
		+ "`notes`, "
		+ "`attachments` " 
		+ "FROM orders ";

	try {
	    if (filtro != null)
		sql += " WHERE " + filtro;
	    if (limite != null)
		sql += " LIMIT " + limite;
	    if (offset != null)
		sql += " OFFSET " + offset;
	    sentencia = conexion.createStatement();
	    ResultSet rs = sentencia.executeQuery(sql);
	    while (rs.next()) { // Si todavía hay un cliente lo añado al array
		pedidos.add(new Orders(
				rs.getInt("id"),
				rs.getInt("employee_id"),
				rs.getInt("customer_id"),
				rs.getString("order_date"),
				rs.getString("shipped_date"),
				rs.getInt("shipper_id"),
				rs.getString("ship_name"),
				rs.getString("ship_address"),
				rs.getString("ship_city"),
				rs.getString("ship_state_province"),
				rs.getString("ship_zip_postal_code"),
				rs.getString("ship_country_region"),
				rs.getString("shipping_fee"),
				rs.getString("taxes"),
				rs.getString("payment_type"),
				rs.getString("paid_date"),
				rs.getString("notes"),
				rs.getString("tax_rate"),
				rs.getInt("tax_status_id"),
				rs.getInt("status_id")));
	    };
	} catch (SQLException e) {
	    System.err.println("Error en read de Pedidos: " + e.getMessage());
	    return null;
	}

	return pedidos;
    }

}
