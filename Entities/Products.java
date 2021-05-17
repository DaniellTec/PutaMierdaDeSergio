package com.ejemplo.E02RestEjemplo.Entities;


import java.sql.Blob;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id", 
    		     "product_code", 
    		     "product_name", 
    		     "description", 
                     "standard_cost", 
                     "list_price", 
                     "reorder_level", 
                     "target_level", 
                     "quantity_per_unit", 
                     "discontinued", 
                     "minimun_recorder_quantity", 
                     "category" 
                     })

public class Products {
	
	private Integer id;
	private String product_code;
	private String product_name;
	private String description;
	private String standard_cost;
	private String list_price;
	private String reorder_level;
	private String target_level;
	private String quantity_per_unit;
	private String discontinued;
	private String minimum_reorder_quantity;
	private String category;
	
	
	
	public Products() {

	}

	public Products(Integer id, String product_code, String product_name, String description, String standard_cost, String list_price,
			String reorder_level, String target_level, String quantity_per_unit, String discontinued, String minimum_reorder_quantity, String category,
			Blob attachments) {

		this.id = id;
		this.product_code = product_code;
		this.product_name = product_name;
		this.description = description;
		this.standard_cost = standard_cost;
		this.list_price = list_price;
		this.reorder_level = reorder_level;
		this.target_level = target_level;
		this.quantity_per_unit = quantity_per_unit;
		this.discontinued = discontinued;
		this.minimum_reorder_quantity = minimum_reorder_quantity;
		this.category = category;

	}
	
	public void setId(Integer id) 
	
	{
		this.id = id; //
	}

	public Integer getId() 
	
	{
		return id; //
	}

	public void setProductCode(String product_code) 
	
	{
		this.product_code = product_code; //
	}
	
	public String getProductCode() 
	
	{
		return product_code; //
	}

	public void setProductName(String product_name) 
	
	{
		this.product_name = product_name; //
	}

	public String getProductName() 
	
	{
		return product_name; //
	}
	
	public void setDescription(String description) 
	
	{
		this.description = description; //
	}
	
	public String getDescription() 
	
	{
		return description; //
	}

	public void setStandardCost(String standard_cost) 
	
	{
		this.standard_cost = standard_cost; //
	}
	
	public String getStandardCost() 
	
	{
		return standard_cost; //
	}

	public void setListPrice(String list_price) 
	
	{
		this.list_price = list_price; //
	}

	public String getListPrice() 
	
	{
		return list_price; //
	}

	public void setReorderLevel(String reorder_level) 
	
	{
		this.reorder_level = reorder_level; //
	}

	public String getReorderLevel() 
	
	{
		return reorder_level; //
	}

	public void setTargetLevel(String target_level)
	
	{
		this.target_level = target_level; //
	}

	public String getTargetLevel() 
	
	{
		return target_level; //
	}

	public void setQuantityPerUnit(String quantity_per_unit) 
	
	{
		this.quantity_per_unit = quantity_per_unit; //
	} 

	public String getQuantityPerUnit()
	
	{
		return quantity_per_unit; //
	}

	public void setDiscontinued(String discontinued) 
	
	{
		this.discontinued = discontinued; //
	}

	public String getDiscontinued() 
	
	{
		return discontinued; //
	}

	public void setMinimumReorderQuantity(String minimum_reorder_quantity)
	
	{
		this.minimum_reorder_quantity = minimum_reorder_quantity; //
	}

	public String getMinimumReorderQuantity() 
	
	{
		return minimum_reorder_quantity; //
	}

	public void setCategory(String category)
	
	{
		this.category = category; //
	}

	public String getCategory() 
	
	{
		return category; //
	}


	@Override
	public String toString() 
	
	{
		return "Products [" + (id != null ? "id=" + id + ", " : "")
				+ (product_code != null ? "product_code=" + product_code + ", " : "")
				+ (product_name != null ? "product_name=" + product_name + ", " : "")
				+ (description != null ? "description=" + description + ", " : "")
				+ (list_price != null ? "list_price=" + list_price + ", " : "")
				+ (reorder_level != null ? "reorder_level=" + reorder_level + ", " : "")
				+ (target_level != null ? "target_level=" + target_level + ", " : "")
				+ (quantity_per_unit != null ? "quantity_per_unit=" + quantity_per_unit : "")
				+ (discontinued != null ? "discontinued=" + discontinued : "") 
				+ (minimum_reorder_quantity != null ? "minimum_reorder_quantity=" + minimum_reorder_quantity : "")
				+ (category != null ? "category=" + category : "")
				+ "]";
	}

}



