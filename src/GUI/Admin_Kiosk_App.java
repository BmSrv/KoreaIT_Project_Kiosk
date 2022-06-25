package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Function.Admin_kiosk;
import Function.Product_menu_list_controller_ver_GUI;
import variable.Product_menu_list;

public class Admin_Kiosk_App extends JFrame{
	JPanel CoffeeMenu,IceDrinkMenu,DisertMenu,SaveMenu;
	public static Product_menu_list menuList=new Product_menu_list();
	public Admin_Kiosk_App() {
		init();
		setResizable(false);
		JTabbedPane jtab=new JTabbedPane();
		
		CoffeeMenu=new CoffeeMenuTab();
		IceDrinkMenu=new IceDrinkMenuTab();
		DisertMenu=new DisertMenuTab();
		SaveMenu=new SaveMenu();
		
		
		jtab.add(CoffeeMenu,"커피메뉴");
		jtab.add(IceDrinkMenu,"에이드 메뉴");
		jtab.add(DisertMenu,"디저트 메뉴");
		jtab.add(SaveMenu,"저장");
		
		add(jtab);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,300);
	}
	private void init() {
		Product_menu_list_controller_ver_GUI.load("menu.obj");
	}
	
}
