package User_Kiosk_GUI;

import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class myCartList extends JPanel{
	JTable myCart;
	
	public myCartList() {
		setBorder(new TitledBorder("��ٱ���"));

		setSize(new Dimension(200,400));
		String test[][]={{"1","1","1"},{"2","2","2"}};
		String header[]={"�޴�","����","����"};
		myCart=new JTable(test,header) ;
		
		JScrollPane scrolpan=new JScrollPane(myCart);
		scrolpan.setPreferredSize(new Dimension(200,200));

		add(scrolpan);
		
	}
}
