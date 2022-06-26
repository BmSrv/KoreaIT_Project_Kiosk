package Function;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import variable.Product;
import variable.Product_menu_list;

public class Product_menu_list_controller_ver_final {

	public static Product_menu_list load(String filePath) {
		Product_menu_list menu=new Product_menu_list();
		try (FileInputStream fos = new FileInputStream(filePath); ObjectInputStream oos = new ObjectInputStream(fos);) {
			menu = (Product_menu_list) oos.readObject();
			System.out.println("로드 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return menu;
	}

	public static void save(String filePath,Product_menu_list menu) {

		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(menu);
			System.out.println("저장 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
