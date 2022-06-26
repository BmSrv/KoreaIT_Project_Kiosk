package User_Kiosk_GUI;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;

import Function.Product_menu_list_controller_ver_final;
import variable.Product_menu_list;

public class User_Kiosk_App extends JFrame {
	static Product_menu_list Allmenu = Product_menu_list_controller_ver_final.load("menu.obj");
	JPanel main, payment;

	public User_Kiosk_App() {
		init();

	}

	private void init() {
		JTabbedPane tab = new JTabbedPane();
		setResizable(false);
		main = new main_view();
		payment = new payment();
		tab.add(main, "구매");
		tab.add(payment, "결제");

		add(tab);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(800, 600));

	}

	public static void main(String[] args) {
		new User_Kiosk_App();
	}
}
