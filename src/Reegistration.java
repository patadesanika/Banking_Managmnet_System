import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Reegistration extends JFrame {

	private JPanel contentPane;
	private JTextField User;
	private JTextField email;
	private JTextField pass;
	private JLabel passlabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reegistration frame = new Reegistration();
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
	public Reegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		User = new JTextField();
		User.setBounds(21, 31, 203, 33);
		contentPane.add(User);
		User.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(21, 98, 203, 33);
		contentPane.add(email);
		
		pass = new JTextField();
		pass.setColumns(10);
		pass.setBounds(21, 164, 203, 33);
		contentPane.add(pass);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(21, 11, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel emaillabel = new JLabel("Email");
		emaillabel.setBounds(21, 75, 76, 14);
		contentPane.add(emaillabel);
		
		passlabel = new JLabel("password");
		passlabel.setBounds(21, 142, 76, 14);
		contentPane.add(passlabel);
		
		JButton btnNewButton = new JButton("Reegistration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					//Connection conn=DriverManager.getConnection( "jdbc:sqlserver://localhost\\Bank_Application;user=sa;password=root");
			Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=root;databaseName=Bank_Application");
//System.out.println("hi");
//System.exit(0);
					PreparedStatement ps=conn.prepareStatement("insert into dbo.Customer(username,email,password)values(?,?,?);");
					ps.setString(1,User.getText());
					ps.setString(2,email.getText());
					ps.setString(3,pass.getText());
					int x=ps.executeUpdate();
					if(x>0) {
						System.out.println("Reegistration done sucessfully................");		
					}
					else {
						System.out.println("Reegistration Failed");
					}
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setBounds(31, 217, 126, 23);
		contentPane.add(btnNewButton);
	}

}
