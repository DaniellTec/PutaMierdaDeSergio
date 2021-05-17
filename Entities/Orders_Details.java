package com.ejemplo.E02RestEjemplo.Entities;


import java.sql.Blob;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id", 
    		     "order_id", 
    		     "product_id", 
    		     "quantity", 
                     "discount", 
                     "list_price", 
                     "status_id", 
                     "date_allocated", 
                     "purchase_order_id", 
                     "inventory_id", 
                     })

public class Orders_Details {
	
	private Integer id;
	private Integer order_id;
	private Integer product_id;
	private Double quantity;
	private Double unit_price;
	private Double discount;
	private Integer status_id;
	private String date_allocated;
	private Integer purchase_order_id;
	private Integer inventory_id;

	
	public Orders_Details() {

	}

	public Orders_Details(Integer id, Integer order_id, Integer product_id, Double quantity, Double unit_price, Double discount,
			Integer status_id, String date_allocated, Integer purchase_order_id, Integer inventory_id) {

		this.id = id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.unit_price = unit_price;
		this.discount = discount;
		this.status_id = status_id;
		this.date_allocated = date_allocated;
		this.purchase_order_id = purchase_order_id;
		this.inventory_id = inventory_id;

	}
	
	public void setId(Integer id) 
	
	{
		this.id = id; //
	}

	public Integer getId() 
	
	{
		return id; //
	}

	public void setOrderId(Integer order_id) 
	
	{
		this.order_id = order_id; //
	}
	
	public Integer getOrderId() 
	
	{
		return order_id; //
	}

	public void setProductId(Integer product_id) 
	
	{
		this.product_id = product_id; //
	}

	public Integer getProductId() 
	
	{
		return product_id; //
	}
	
	public void setQuantity(Double quantity) 
	
	{
		this.quantity = quantity; //
	}
	
	public Double getQuantity() 
	
	{
		return quantity; //
	}

	public void setUnitPrice(Double unit_price) 
	
	{
		this.unit_price = unit_price; //
	}
	
	public Double getUnitPrice() 
	
	{
		return unit_price; //
	}

	public void setStatusId(Integer status_id) 
	
	{
		this.status_id = status_id; //
	}

	public Integer getStatusId() 
	
	{
		return status_id; //
	}

	public void setDateAllocated(String date_allocated) 
	
	{
		this.date_allocated = date_allocated; //
	}

	public String getDateAllocated() 
	
	{
		return date_allocated; //
	}

	public void setPurcharseOrderId(Integer purchase_order_id)
	
	{
		this.purchase_order_id = purchase_order_id; //
	}

	public Integer getPurcharseOrderId() 
	
	{
		return purchase_order_id; //
	}

	public void setInventoryId(Integer inventory_id) 
	
	{
		this.inventory_id = inventory_id; //
	} 

	public Integer setInventoryId()
	
	{
		return inventory_id; //
	}

	@Override
	public String toString() 
	
	{
		return "Customer [" + (id != null ? "id=" + id + ", " : "")
				+ (order_id != null ? "order_id=" + order_id + ", " : "")
				+ (product_id != null ? "product_id=" + product_id + ", " : "")
				+ (quantity != null ? "quantity=" + quantity + ", " : "")
				+ (unit_price != null ? "unit_price=" + unit_price + ", " : "")
				+ (discount != null ? "discount=" + discount + ", " : "")
				+ (status_id != null ? "status_id=" + status_id + ", " : "")
				//+ (date_allocated != null ? "date_allocated=" + date_allocated : "")
				//+ (purchase_order_id != null ? "purchase_order_id=" + purchase_order_id : "") 
				+ (inventory_id != null ? "inventory_id=" + inventory_id : "") 
				+ "]";
	}

}



