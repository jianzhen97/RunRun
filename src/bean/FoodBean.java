package bean;

public class FoodBean {
	int image;
	String name;
	String address;
	String price;

	public FoodBean(int image, String name, String address, String price) {
		super();
		this.image = image;
		this.name = name;
		this.address = address;
		this.price = price;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
