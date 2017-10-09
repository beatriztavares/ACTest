package hibernate;

public class Images implements java.io.Serializable {

	private Integer imageId;
	private Products products;
	private String imageType;

	public Images() {
	}

	public Images(Products products, String imageType) {
		this.products = products;
		this.imageType = imageType;
	}

	public Integer getImageId() {
		return this.imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

}
