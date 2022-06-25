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
			System.out.println("1:�߰�\n2:�޴� ����\n3:����\n4:����");
			int sel_user = Scn.nextInt();
			switch (sel_user) {
			case 1:
				System.out.println("�߰�");
				addmenu();
			case 2:
				System.out.println("�޴�����");
				showmenu();
				break;
			case 3:
				System.out.println("����");

				break;

			case 4:
				System.out.println("����");
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
		System.out.println("1.Ŀ�� 2.���̵� 3. ����Ʈ");
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
		System.out.println("������ ���ϸ� ������ �ȵǿ�!");

	}

	private void addDisertList() {
		System.out.println("����Ʈ�߰�");
		System.out.println("��ǰ�� �Է�");
		String menu_name = Scn.next();
		System.out.println("���� �Է�");

		int menu_price = Scn.nextInt();

		menuList.DisertList.put(menu_name, new Product(menu_name, menu_price));

	}

	private void addIceDrinkList() {
		System.out.println("���̵��߰�");
		System.out.println("��ǰ�� �Է�");

		String menu_name = Scn.next();
		System.out.println("���� �Է�");

		int menu_price = Scn.nextInt();

		menuList.IceDrinkList.put(menu_name, new Product(menu_name, menu_price));

	}

	private void addCoffeeList() {
		System.out.println("Ŀ���߰�");
		System.out.println("��ǰ�� �Է�");

		String menu_name = Scn.next();
		System.out.println("���� �Է�");

		int menu_price = Scn.nextInt();

		menuList.CoffeeList.put(menu_name, new Product(menu_name, menu_price));

	}
	public static void main(String[] args) {
		new Admin_kiosk();
	}
	

}
