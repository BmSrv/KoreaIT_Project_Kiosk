package User_Kiosk_GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Function.Admin_kiosk;

public class UserOrder extends JPanel {
	
	JPanel myCartList,orderPenal;
	public UserOrder() {
		setLayout(new BorderLayout());
		myCartList=new myCartList();
		
		orderPenal=new orderPenal();
		orderPenal.setBorder(new TitledBorder("주문선택"));
		
		myCartList.setPreferredSize(new Dimension(400,300));
		
		add(myCartList,BorderLayout.WEST);
		add(orderPenal,BorderLayout.CENTER);
		
		
		System.out.println(Arrays.toString(User_Kiosk_App.Allmenu.getCoffeeMenu()));
		
		
	}

	
}
