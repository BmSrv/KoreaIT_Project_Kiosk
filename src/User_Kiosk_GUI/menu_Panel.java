package User_Kiosk_GUI;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import Admin_Kiosk_GUI.showMenu;

public class menu_Panel extends JPanel{
	JPanel coffeeMenu,IceDrinkMenu,DisertMenu,myCartList;
	String header[]= {"�޴�","����"};
	public menu_Panel() {
		coffeeMenu=new showMenu(header, User_Kiosk_App.Allmenu.getCoffeemenuToStringMap());
		IceDrinkMenu=new showMenu(header, User_Kiosk_App.Allmenu.getIceDrinkmenuToStringMap());
		DisertMenu=new showMenu(header, User_Kiosk_App.Allmenu.getDisertmenuToStringMap());
		
		
		coffeeMenu.setBorder(new TitledBorder("Ŀ�� �޴�"));
		IceDrinkMenu.setBorder(new TitledBorder("���̵� �޴�"));
		DisertMenu.setBorder(new TitledBorder("����Ʈ �޴�"));
		

		
		add(coffeeMenu);
		add(IceDrinkMenu);
		add(DisertMenu);
		
		
	}
}
