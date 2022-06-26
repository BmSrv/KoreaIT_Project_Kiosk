package User_Kiosk_GUI;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class orderPenal extends JPanel implements ActionListener{
	JComboBox<String> product_Name,select_Pruduct;
	JLabel count_text=new JLabel("수량");
	String product_count[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9","10" };
	JComboBox<Integer> product_count_selecter;
	Checkbox chk_list[]=new Checkbox[2];
	
	public orderPenal() {
		product_Name = new JComboBox(new String[] { "선택해 주세요","커피", "에이드", "디저트" });
		System.out.println(product_count[0]);
		product_count_selecter = new JComboBox(product_count);

		add(new JLabel("메뉴 : "));
		product_Name.addActionListener(this);
		add(product_Name);
		
		select_Pruduct=new JComboBox<String>(new String[]{"선택하세요"});
		add(select_Pruduct,BorderLayout.WEST);
		
		chk_list[0]=new Checkbox("Ice");
		chk_list[1]=new Checkbox("샷추가");
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (product_Name.getSelectedItem().toString().equals("커피")) {
			System.out.println("커피선택");
			
			remove(select_Pruduct);
			remove(count_text);
			remove(chk_list[0]);
			remove(chk_list[1]);
			select_Pruduct=new JComboBox<String>(User_Kiosk_App.Allmenu.getCoffeeMenu());
			
			add(select_Pruduct);
			
			add(count_text);
			add(product_count_selecter);
			
			add(chk_list[0]);
			add(chk_list[1]);

			
			updateUI();
		}
		
		if (product_Name.getSelectedItem().toString().equals("에이드")) {
			System.out.println("커피선택");
			
			remove(select_Pruduct);
			remove(count_text);
			remove(chk_list[0]);
			remove(chk_list[1]);
			
			select_Pruduct=new JComboBox<String>(User_Kiosk_App.Allmenu.getIceDrinkMenu());
			
			add(select_Pruduct);
			
			add(count_text);
			add(product_count_selecter);
			
			updateUI();
		}
		
		if (product_Name.getSelectedItem().toString().equals("디저트")) {
			System.out.println("커피선택");
			
			remove(select_Pruduct);
			remove(count_text);
			remove(chk_list[0]);
			remove(chk_list[1]);
			
			select_Pruduct=new JComboBox<String>(User_Kiosk_App.Allmenu.getDisertMenu());
			
			add(select_Pruduct);
			
			add(count_text);
			add(product_count_selecter);
			
			updateUI();
		}
		

	}
}
