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
	JLabel count_text=new JLabel("����");
	String product_count[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9","10" };
	JComboBox<Integer> product_count_selecter;
	Checkbox chk_list[]=new Checkbox[2];
	
	public orderPenal() {
		product_Name = new JComboBox(new String[] { "������ �ּ���","Ŀ��", "���̵�", "����Ʈ" });
		System.out.println(product_count[0]);
		product_count_selecter = new JComboBox(product_count);

		add(new JLabel("�޴� : "));
		product_Name.addActionListener(this);
		add(product_Name);
		
		select_Pruduct=new JComboBox<String>(new String[]{"�����ϼ���"});
		add(select_Pruduct,BorderLayout.WEST);
		
		chk_list[0]=new Checkbox("Ice");
		chk_list[1]=new Checkbox("���߰�");
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (product_Name.getSelectedItem().toString().equals("Ŀ��")) {
			System.out.println("Ŀ�Ǽ���");
			
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
		
		if (product_Name.getSelectedItem().toString().equals("���̵�")) {
			System.out.println("Ŀ�Ǽ���");
			
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
		
		if (product_Name.getSelectedItem().toString().equals("����Ʈ")) {
			System.out.println("Ŀ�Ǽ���");
			
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
