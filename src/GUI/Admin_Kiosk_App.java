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
		
		
		jtab.add(CoffeeMenu,"Ŀ�Ǹ޴�");
		jtab.add(IceDrinkMenu,"���̵� �޴�");
		jtab.add(DisertMenu,"����Ʈ �޴�");
		jtab.add(SaveMenu,"����");
		
		add(jtab);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,300);
	}
	private void init() {
		Product_menu_list_controller_ver_GUI.load("menu.obj");
	}
	
}
