package User_Kiosk_GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class main_view extends JPanel{
	static JPanel menu_Panel,UserOrder;
	public main_view() {
		
		setLayout(new BorderLayout());
		menu_Panel=new menu_Panel();
		menu_Panel.setBorder(new TitledBorder(new Date().toString()));
		UserOrder=new UserOrder();
		UserOrder.setBorder(new TitledBorder("Order"));
		UserOrder.setPreferredSize(new Dimension(400,350));
		
		menu_Panel.setPreferredSize(new Dimension(780,280));
		UserOrder.setPreferredSize(new Dimension(780,280));
		
		add(menu_Panel,BorderLayout.NORTH);
		add(UserOrder,BorderLayout.CENTER);
	}
}
