package hibernate;

import java.util.HashSet;
import java.util.Set;

public class Products implements java.io.Serializable {

	private Integer productId;
	private Products products;
	private String productName;
	private String description;
	private Set<Products> productses = new HashSet<Products>(0);
	private Set<Images> imageses = new HashSet<Images>(0);

	public Products() {
	}

	public Products(Products products, String productName, String description, Set<Products> productses,
			Set<Images> imageses) {
		this.products = products;
		this.productName = productName;
		this.description = description;
		this.productses = productses;
		this.imageses = imageses;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

	public Set<Images> getImageses() {
		return this.imageses;
	}

	public void setImageses(Set<Images> imageses) {
		this.imageses = imageses;
	}

}
