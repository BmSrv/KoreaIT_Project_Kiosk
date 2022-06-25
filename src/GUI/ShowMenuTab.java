package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import variable.Product;
import variable.Product_menu_list;

public class ShowMenuTab extends JPanel implements ActionListener{
	JTable table;
	JPanel menu_panel,content,rightpanel;
	TextField name_field,price_field;
	JButton addbtn,rmbtn;
	JScrollPane scrolPane;
	public ShowMenuTab() {
		setLayout(new BorderLayout());
		
		
		String header[]= {"메뉴","가격"};		
		menu_panel=new showMenu(header, Admin_Kiosk_App.menuList.getCoffeemenuToStringMap());
		
		add(menu_panel,BorderLayout.WEST);
		
		name_field=new TextField(37);
		price_field=new TextField(37);
		
		content=new JPanel(new FlowLayout(FlowLayout.LEFT));
		content.setPreferredSize(new Dimension(350,800));	//테이블 크기 입력창 크기
		content.setBorder(new TitledBorder("추가/제거"));
		
		content.add(new JLabel("메뉴: "));
		content.add(name_field);
		content.add(new JLabel("가격: "));
		content.add(price_field);
		
		rightpanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		rightpanel.setPreferredSize(new Dimension(320,300));
		addbtn=new JButton("추가");
		rmbtn=new JButton("제거");
		addbtn.setPreferredSize(new Dimension(125,30));
		rmbtn.setPreferredSize(new Dimension(125,30));
		
		addbtn.addActionListener(this);
		rmbtn.addActionListener(this);
		
		rightpanel.add(addbtn);
		rightpanel.add(rmbtn);
		
		content.add(rightpanel);
		
		
		
		add(content,BorderLayout.EAST);
	}
	private void update_table() {
		remove(menu_panel);
		String header[]= {"메뉴","가격"};		
		menu_panel=new showMenu(header, Admin_Kiosk_App.menuList.getCoffeemenuToStringMap());

		add(menu_panel,BorderLayout.WEST);

		updateUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==addbtn) {
			Admin_Kiosk_App.menuList.CoffeeList.put(name_field.getText(), new Product(name_field.getText(),Integer.parseInt(price_field.getText())));
			update_table();			
		}else if (e.getSource()==rmbtn) {
			Admin_Kiosk_App.menuList.CoffeeList.remove(name_field.getText());
			update_table();			

		}
		
	}
}
