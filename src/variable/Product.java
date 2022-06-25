package variable;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int a_price;
	
	public Product() {
		
	}

	public Product(String name, int a_price) {
		super();
		this.name = name;
		this.a_price = a_price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", a_price=" + a_price + "]";
	}
	public String[] getStringMap(){
		String temp[]={this.name,String.valueOf(this.a_price)};
		return temp;
	}
	
	
}
