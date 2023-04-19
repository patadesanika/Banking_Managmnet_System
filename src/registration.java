import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.sql.*;
public class registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(10, 37, 227, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 105, 233, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 164, 227, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel userr = new JLabel("username");
		userr.setBounds(10, 11, 93, 25);
		contentPane.add(userr);
		
		JLabel pass = new JLabel("password");
		pass.setBounds(10, 78, 93, 25);
		contentPane.add(pass);
		
		JLabel mail = new JLabel("e_mail");
		mail.setBounds(10, 140, 74, 20);
		contentPane.add(mail);
		
		user = new JTextField();
		user.setText("Submit");
		user.setBounds(20, 221, 86, 30);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("submit");
		lblNewLabel_3.setBounds(30, 229, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Submit");
		lblNewLabel_4.setBounds(30, 229, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
}
