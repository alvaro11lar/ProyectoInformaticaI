package application;

public class Product {
	
	private String nombre;
	private double price;
	private double weight;
	private String decription;
	private  int quantityAvailble;
	
	public Product(String nombre, double price, double weight, String decription, int quantityAvailble) {
		super();
		this.nombre = nombre;
		this.price = price;
		this.weight = weight;
		this.decription = decription;
		this.quantityAvailble = quantityAvailble;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public int getQuantityAvailble() {
		return quantityAvailble;
	}

	public void setQuantityAvailble(int quantityAvailble) {
		this.quantityAvailble = quantityAvailble;
	}
	
	
	
}
