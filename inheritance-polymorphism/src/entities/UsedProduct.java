package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Date manufactureDate;

	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getDate() {
		return manufactureDate;
	}

	public void setDate(Date date) {
		this.manufactureDate = date;
	}

	@Override
	public String TagProduct() {
		return getName() 
				+ " (used) R$" 
				+ String.format("%.2f", getPrice())
				+ " ( // Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
	
}
