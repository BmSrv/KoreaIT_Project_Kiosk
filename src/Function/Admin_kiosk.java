package Function;

import java.util.Scanner;

import variable.Product;
import variable.Product_menu_list;

public class Admin_kiosk {
	public static Product_menu_list menuList = new Product_menu_list();
	Scanner Scn = new Scanner(System.in);

	public Admin_kiosk() {
		loadMenu();
		init();
	}

	private void init() {
		while (true) {
			System.out.println("1:추가\n2:메뉴 보기\n3:삭제\n4:저장");
			int sel_user = Scn.nextInt();
			switch (sel_user) {
			case 1:
				System.out.println("추가");
				addmenu();
			case 2:
				System.out.println("메뉴보기");
				showmenu();
				break;
			case 3:
				System.out.println("삭제");

				break;

			case 4:
				System.out.println("저장");
				saveMenu();
				break;

			default:
				break;
			}

		}
	}

	public void showmenu() {
		menuList.showCoffeeList();
		menuList.showIceDrinkList();
		menuList.showDisertList();

	}

	public void saveMenu() {
		Function.Product_menu_list_controller_ver_Admin_kiosk.save("menu.obj");

	}

	public void loadMenu() {
		Function.Product_menu_list_controller_ver_Admin_kiosk.load("menu.obj");
	}

	private void addmenu() {
		System.out.println("1.커피 2.에이드 3. 디저트");
		int wht_add = Scn.nextInt();
		switch (wht_add) {

		case 1:
			addCoffeeList();
			break;

		case 2:
			addIceDrinkList();
			break;

		case 3:
			addDisertList();
			break;

		default:
			break;

		}
		System.out.println("저장을 안하면 적요이 안되요!");

	}

	private void addDisertList() {
		System.out.println("디저트추가");
		System.out.println("상품명 입력");
		String menu_name = Scn.next();
		System.out.println("가격 입력");

		int menu_price = Scn.nextInt();

		menuList.DisertList.put(menu_name, new Product(menu_name, menu_price));

	}

	private void addIceDrinkList() {
		System.out.println("에이드추가");
		System.out.println("상품명 입력");

		String menu_name = Scn.next();
		System.out.println("가격 입력");

		int menu_price = Scn.nextInt();

		menuList.IceDrinkList.put(menu_name, new Product(menu_name, menu_price));

	}

	private void addCoffeeList() {
		System.out.println("커피추가");
		System.out.println("상품명 입력");

		String menu_name = Scn.next();
		System.out.println("가격 입력");

		int menu_price = Scn.nextInt();

		menuList.CoffeeList.put(menu_name, new Product(menu_name, menu_price));

	}
	public static void main(String[] args) {
		new Admin_kiosk();
	}
	

}
