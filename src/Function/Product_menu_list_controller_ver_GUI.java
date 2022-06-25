package Function;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import variable.Product;
import variable.Product_menu_list;

public class Product_menu_list_controller_ver_GUI {

	public static void load(String filePath) {
		try (FileInputStream fos = new FileInputStream(filePath); ObjectInputStream oos = new ObjectInputStream(fos);) {
			GUI.Admin_Kiosk_App.menuList = (Product_menu_list) oos.readObject();
			System.out.println("로드 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	public static void save(String filePath) {

		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(GUI.Admin_Kiosk_App.menuList);
			System.out.println("저장 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
