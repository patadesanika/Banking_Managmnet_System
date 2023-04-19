import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Screen extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Screen frame = new Login_Screen();
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
	public Login_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		Username = new JTextField();
		Username.setBounds(71, 59, 168, 30);
		contentPane.add(Username);
		Username.setColumns(10);
		
		Password = new JTextField();
		Password.setColumns(10);
		Password.setBounds(71, 136, 168, 30);
		contentPane.add(Password);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(71, 46, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(71, 122, 61, 14);
		contentPane.add(lblPassword);
		
		JLabel Login_Screen = new JLabel("LOGIN SCREEN");
		Login_Screen.setBounds(122, 11, 94, 14);
		contentPane.add(Login_Screen);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
                new Welcome_Screen().setVisible(true);//new keyword is used to go one frame to another frame(welcomw to customer_info)
			
			}
		});
		btnLogin.setBounds(122, 206, 89, 23);
		contentPane.add(btnLogin);
	}

}
