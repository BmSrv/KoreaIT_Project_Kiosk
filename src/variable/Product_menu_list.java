package variable;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Product_menu_list implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HashMap<String, Product> CoffeeList = new HashMap<String, Product>();
	public HashMap<String, Product> IceDrinkList = new HashMap<String, Product>();
	public HashMap<String, Product> DisertList = new HashMap<String, Product>();

	public Product_menu_list() {

	}
	public void showCoffeeList() {
		System.out.println(CoffeeList);
	}
	public void showIceDrinkList() {
		System.out.println(IceDrinkList);
	}
	public void showDisertList() {
		System.out.println(DisertList);
	}
	public String[][] getCoffeemenuToStringMap(){
		String rtn_val[][]=new String[CoffeeList.size()][2];
		Set<java.util.Map.Entry<String, Product>> st=this.CoffeeList.entrySet();
		int i=0;
		for (java.util.Map.Entry<String, Product> en:st) {
			rtn_val[i] =en.getValue().getStringMap();
			i++;
		}
		return rtn_val;
	}
	public String[][] getIceDrinkmenuToStringMap(){
		String rtn_val[][]=new String[IceDrinkList.size()][2];
		Set<java.util.Map.Entry<String, Product>> st=this.IceDrinkList.entrySet();
		int i=0;
		for (java.util.Map.Entry<String, Product> en:st) {
			rtn_val[i] =en.getValue().getStringMap();
			i++;
		}
		return rtn_val;
	}
	public String[][] getDisertmenuToStringMap(){
		String rtn_val[][]=new String[DisertList.size()][2];
		Set<java.util.Map.Entry<String, Product>> st=this.DisertList.entrySet();
		int i=0;
		for (java.util.Map.Entry<String, Product> en:st) {
			rtn_val[i] =en.getValue().getStringMap();
			i++;
		}
		return rtn_val;
	}

//	private void writeObject(ObjectOutputStream oos) throws IOException {
//
//		oos.writeObject(CoffeeList);
//		oos.writeObject(IceDrinkList);
//		oos.writeObject(DisertList);
//
//		oos.defaultWriteObject();
//	}
//
//	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
//
//		CoffeeList = (HashMap<String, Product>) ois.readObject();
//		IceDrinkList = (HashMap<String, Product>) ois.readObject();
//		DisertList = (HashMap<String, Product>) ois.readObject();
//
//		ois.defaultReadObject();
//	}

}
