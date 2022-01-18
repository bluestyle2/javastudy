package basic;

public class JuiceDTO {
	
	String id, name, product, price;

	public JuiceDTO(){
		
	}	
	
	public JuiceDTO(String name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}	
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	public String toString() {
		return "id :" + id + ", name : " + name + ", product : " + product + ", price : " + price;
	}
	
	
}
