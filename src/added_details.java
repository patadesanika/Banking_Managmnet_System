import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.sql.*;
public class added_details extends JFrame {

	private JPanel contentPane;
	private JTextField NAME;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					added_details frame = new added_details();
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
	public added_details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		NAME = new JTextField();
		NAME.setColumns(10);
		NAME.setBounds(43, 39, 175, 38);
		contentPane.add(NAME);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
					PreparedStatement ps=conn.prepareStatement("insert into student1(name)values(?);");
					ps.setString(2,NAME.getText());
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
		btnNewButton.setBounds(45, 187, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(44, 26, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("added_deatils");
		lblNewLabel_2.setBounds(66, 191, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("add");
		lblNewLabel_3.setBounds(66, 191, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(66, 191, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
}
