package User_Kiosk_GUI;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import Admin_Kiosk_GUI.showMenu;

public class menu_Panel extends JPanel{
	JPanel coffeeMenu,IceDrinkMenu,DisertMenu,myCartList;
	String header[]= {"메뉴","가격"};
	public menu_Panel() {
		coffeeMenu=new showMenu(header, User_Kiosk_App.Allmenu.getCoffeemenuToStringMap());
		IceDrinkMenu=new showMenu(header, User_Kiosk_App.Allmenu.getIceDrinkmenuToStringMap());
		DisertMenu=new showMenu(header, User_Kiosk_App.Allmenu.getDisertmenuToStringMap());
		
		
		coffeeMenu.setBorder(new TitledBorder("커피 메뉴"));
		IceDrinkMenu.setBorder(new TitledBorder("에이드 메뉴"));
		DisertMenu.setBorder(new TitledBorder("디저트 메뉴"));
		

		
		add(coffeeMenu);
		add(IceDrinkMenu);
		add(DisertMenu);
		
		
	}
}
