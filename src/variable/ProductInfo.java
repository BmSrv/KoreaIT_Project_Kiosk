package variable;

public class ProductInfo extends Product{
	
	
	int count;
	int all_price;
	public ProductInfo(String name, int a_price, int count) {
		super();
		this.name = name;
		this.a_price = a_price;
		this.count = count;
		setAll_price(a_price*count);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA_price() {
		return a_price;
	}
	public void setA_price(int a_price) {
		this.a_price = a_price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getAll_price() {
		return all_price;
	}
	public void setAll_price(int all_price) {
		this.all_price = all_price;
	}
	
	
	
}
