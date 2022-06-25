package GUI;

import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class showMenu extends JPanel{
	JTable menu;
	JScrollPane scrolpan;
	public showMenu(String[] header,String[][] data) {
		setSize(new Dimension(200,400));
		setBorder(new TitledBorder("¸Þ´º"));
		
		menu=new JTable(data,header);
		scrolpan=new JScrollPane(menu);
		scrolpan.setPreferredSize(new Dimension(200,200));
		add(scrolpan);
	}
}
