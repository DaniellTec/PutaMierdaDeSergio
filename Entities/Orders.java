package com.ejemplo.E02RestEjemplo.Entities;


import java.sql.Blob;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id", 
				"employee_id", 
				"customer_id", 
				"company", 
				"order_date", 
				"shipped_date", 
				"shipper_id", 
				"ship_name", 
				"ship_address", 
				"ship_city", 
				"ship_state_province", 
				"ship_zip_postal_code", 
				"ship_country_region", 
				"shipping_fee", 
				"taxes", 
				"payment_type", 
				"paid_date",
				"notes",
				"tax_rate",
				"tax_status_id",
				"status_id"
                     })

public class Orders {
	
	private Integer id;
	private Integer employee_id;
	private Integer customer_id;
	private String order_date;
	private String shipped_date;
	private Integer shipper_id;
	private String ship_name;
	private String ship_address;
	private String ship_city;
	private String ship_state_province;
	private String ship_zip_postal_code;
	private String ship_country_region;
	private String shipping_fee;
	private String taxes;
	private String payment_type;
	private String paid_date;
	private String notes;
	private String tax_rate;
	private Integer tax_status_id;
	private Integer status_id;
	
	
	public Orders() {

	}

	public Orders(Integer id, Integer employee_id, Integer customer_id, String order_date, String shipped_date, Integer shipper_id,
			String ship_name, String ship_address, String ship_city, String ship_state_province, String ship_zip_postal_code, String ship_country_region, 
			String shipping_fee, String taxes, String payment_type, String paid_date , String notes , String tax_rate , Integer tax_status_id , Integer status_id) {

		this.id = id;
		this.employee_id = employee_id;
		this.customer_id = customer_id;
		this.order_date = order_date;
		this.shipped_date = shipped_date;
		this.shipper_id = shipper_id;
		this.ship_name = ship_name;
		this.ship_address = ship_address;
		this.ship_city = ship_city;
		this.ship_state_province = ship_state_province;
		this.ship_zip_postal_code = ship_zip_postal_code;
		this.ship_country_region = ship_country_region;
		this.shipping_fee = shipping_fee;
		this.taxes = taxes;
		this.payment_type = payment_type;
		this.notes = notes;
		this.paid_date = paid_date;
		this.tax_rate = tax_rate;
		this.tax_status_id = tax_status_id;
		this.status_id = status_id;

	}
	
	public void setId(Integer id) 
	
	{
		this.id = id; //
	}

	public Integer getId() 
	
	{
		return id; //
	}

	public void setEmployeeId(Integer employee_id) 
	
	{
		this.employee_id = employee_id; //
	}
	
	public Integer getEmployeeId() 
	
	{
		return employee_id; //
	}

	public void setCustomerId(Integer customer_id) 
	
	{
		this.customer_id = customer_id; //
	}

	public Integer getCustomerId() 
	
	{
		return customer_id; //
	}
	
	public void setOrderDate(String order_date) 
	
	{
		this.order_date = order_date; //
	}
	
	public String getOrderDate() 
	
	{
		return order_date; //
	}

	public void setShippedDate(String shipped_date) 
	
	{
		this.shipped_date = shipped_date; //
	}
	
	public String getShippedDate() 
	
	{
		return shipped_date; //
	}

	public void setShipperId(Integer shipper_id) 
	
	{
		this.shipper_id = shipper_id; //
	}

	public Integer getShipperId() 
	
	{
		return shipper_id; //
	}

	public void setShipName(String ship_name) 
	
	{
		this.ship_name = ship_name; //
	}

	public String getShipName() 
	
	{
		return ship_name; //
	}

	public void setShipAddress(String ship_address)
	
	{
		this.ship_address = ship_address; //
	}

	public String getShipAddress() 
	
	{
		return ship_address; //
	}

	public void setShipCity(String ship_city) 
	
	{
		this.ship_city = ship_city; //
	} 

	public String getShipCity()
	
	{
		return ship_city; //
	}

	public void setShipStateProvince(String ship_state_province) 
	
	{
		this.ship_state_province = ship_state_province; //
	}

	public String getShipStateProvince() 
	
	{
		return ship_state_province; //
	}

	public void setShipZipPostalCode(String ship_zip_postal_code)
	
	{
		this.ship_zip_postal_code = ship_zip_postal_code; //
	}

	public String getShipZipPostalCode() 
	
	{
		return ship_zip_postal_code; //
	}
	
	public void setShipCountryRegion(String ship_country_region)
	
	{
		this.ship_country_region = ship_country_region; //
	}

	public String getShipCountryRegion() 
	
	{
		return ship_country_region; //
	}
	
	public void setShippingFee(String shipping_fee)
	
	{
		this.shipping_fee = shipping_fee; //
	}

	public String getShippingFee() 
	
	{
		return shipping_fee; //
	}

	public void setTaxes(String taxes)
	
	{
		this.taxes = taxes; //
	}

	public String getTaxes() 
	
	{
		return taxes; //
	}
	
	public void setPaymentType(String payment_type)
	
	{
		this.payment_type = payment_type; //
	}

	public String getPaymentType() 
	
	{
		return payment_type; //
	}
	
	public void setPaidDate(String paid_date)
	
	{
		this.paid_date = paid_date; //
	}

	public String getPaidDate() 
	
	{
		return paid_date; //
	}
	
	public void setNotes(String notes)
	
	{
		this.notes = notes; //
	}

	public String getNotes() 
	
	{
		return notes; //
	}
	
	public void setTaxRate(String tax_rate)
	
	{
		this.tax_rate = tax_rate; //
	}

	public String getTaxRate() 
	
	{
		return tax_rate; //
	}
	
	public void setTaxStatusId(Integer tax_status_id)
	
	{
		this.tax_status_id = tax_status_id; //
	}

	public Integer getTaxStatusId() 
	
	{
		return tax_status_id; //
	}
	
	public void setStatusId(Integer status_id)
	
	{
		this.status_id = status_id; //
	}

	public Integer getStatusId() 
	
	{
		return status_id; //
	}
	
	@Override
	public String toString() 
	
	{
		return "Orders [" + (id != null ? "id=" + id + ", " : "")
				+ (employee_id != null ? "employee_id=" + employee_id + ", " : "")
				+ (customer_id != null ? "customer_id=" + customer_id + ", " : "")
				+ (order_date != null ? "order_date=" + order_date + ", " : "")
				+ (shipped_date != null ? "shipped_date=" + shipped_date + ", " : "")
				+ (shipper_id != null ? "shipper_id=" + shipper_id + ", " : "")
				+ (ship_name != null ? "ship_name=" + ship_name + ", " : "")
				+ (ship_address != null ? "ship_address=" + ship_address : "")
				+ (ship_city != null ? "ship_city=" + ship_city : "") 
				+ (ship_state_province != null ? "ship_state_province=" + ship_state_province : "")
				+ (ship_zip_postal_code != null ? "ship_zip_postal_code=" + ship_zip_postal_code : "")
				+ (ship_country_region != null ? "ship_country_region=" + ship_country_region : "")
				+ (shipping_fee != null ? "shipping_fee=" + shipping_fee : "")
				+ (taxes != null ? "taxes=" + taxes : "")
				+ (payment_type != null ? "payment_type=" + payment_type : "")
				//+ (notes != null ? "notes=" + notes : "")
				+ (tax_rate != null ? "tax_rate=" + tax_rate : "")
				//+ (tax_status_id != null ? "tax_status_id=" + tax_status_id : "")
				+ (status_id != null ? "status_id=" + status_id : "")
				+ "]";
	}

}



