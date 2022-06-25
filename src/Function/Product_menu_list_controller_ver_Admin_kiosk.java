package Function;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import variable.Product;
import variable.Product_menu_list;

public class Product_menu_list_controller_ver_Admin_kiosk {

	public static void load(String filePath) {
		try (FileInputStream fos = new FileInputStream(filePath); ObjectInputStream oos = new ObjectInputStream(fos);) {
			Function.Admin_kiosk.menuList = (Product_menu_list) oos.readObject();
			System.out.println("완료");

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	public static void save(String filePath) {
		

		System.out.println(Function.Admin_kiosk.menuList.CoffeeList);
		System.out.println(Function.Admin_kiosk.menuList.IceDrinkList);
		System.out.println(Function.Admin_kiosk.menuList.DisertList);

		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(Function.Admin_kiosk.menuList);
			System.out.println("완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
