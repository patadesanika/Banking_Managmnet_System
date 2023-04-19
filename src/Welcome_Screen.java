import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Welcome_Screen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
		//	JButton b1=new JButton("Create Customer"zl);	

			public void run() {
				try {
					Welcome_Screen WSframe = new Welcome_Screen();
					WSframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Welcome_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setTitle("Welcome_Screen");
		JButton CreateCustomer = new JButton("Create Customer");
		CreateCustomer.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				dispose();
                new Customer_Create().setVisible(true);//new keyword is used to go one frame to another frame(welcomw to customer_info)
			
			}
		});
		CreateCustomer.setBounds(63, 22, 211, 49);
		contentPane.add(CreateCustomer);
		
		JButton FundTransfer = new JButton("Fund Transfer");
		FundTransfer.setBounds(63, 132, 211, 49);
		contentPane.add(FundTransfer);
	}
}
