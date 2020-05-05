package entities;

public class Product {
	
	protected String name;
	protected Double price;
	
	
	//Método construtor vazio
	
	public Product() {
	
	}

	//Método contrutor com argumentos
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	//Getters e Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
	
	public String TagProduct() {
		return getName() 
		+ " // R$" 
		+ String.format("%.2f", getPrice());
	}
}