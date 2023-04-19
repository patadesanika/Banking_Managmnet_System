import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField.AbstractFormatter;
import org.jdatepicker.util.JDatePickerUtil;
import com.toedter.calendar.JDateChooser;

public class cust_Info extends JFrame {

	private JPanel dob;
	private JTextField cust_id;
	private JTextField first_name;
	private JTextField middle_name;
	private JTextField last_name;
	private JTextField email;
	private JTextField mob_no;
	private JTextField acc_no;
	private JTextField Dob;
	private JTextField Address;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cust_Info frame = new cust_Info();
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
	public cust_Info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 590);
		dob = new JPanel();
		dob.setBorder(new EmptyBorder(5, 5, 5, 5));
		dob.setLayout(null);
		setContentPane(dob);
		
		cust_id = new JTextField();
		cust_id.setBounds(10, 32, 171, 29);
		dob.add(cust_id);
		cust_id.setColumns(10);
		
		first_name = new JTextField();
		first_name.setColumns(10);
		first_name.setBounds(10, 101, 171, 29);
		dob.add(first_name);
		
		
		middle_name.setColumns(10);
		middle_name.setBounds(223, 101, 171, 29);
		dob.add(middle_name);
		
		last_name = new JTextField();
		last_name.setColumns(10);
		last_name.setBounds(443, 101, 171, 29);
		dob.add(last_name);
		
		email = new JTextField();
		email.setBounds(10, 171, 171, 35);
		dob.add(email);
		email.setColumns(10);
		
		mob_no = new JTextField();
		mob_no.setColumns(10);
		mob_no.setBounds(223, 243, 171, 29);
		dob.add(mob_no);
		
		acc_no = new JTextField();
		acc_no.setColumns(10);
		acc_no.setBounds(223, 174, 171, 29);
		dob.add(acc_no);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					//Connection conn=DriverManager.getConnection( "jdbc:sqlserver://localhost\\Bank_Application;user=sa;password=root");
			Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=root;databaseName=Bank_Application");
//System.out.println("hi");
//System.exit(0);
			if (first_name.getText().equals("")) {
				JFrame f=new JFrame();
				JOptionPane.showMessageDialog(f, "first_name is mandotory............");
			}
				else if (last_name.getText().equals("")) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "last_name is mandotory............");
				}
				else if(email.getText().equals("")) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "email should be mandotory............");
				}
				else if(mob_no.getText().length() !=10) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "mob_no  should be 10 digit............");	
				}
				
			else {
				
		
			
					PreparedStatement sp=conn.prepareStatement("insert into dbo.Cust_Info(Cust_id,First_name,Middle_name,Last_name,Email,Acc_no,dob,address,Mob_no)values(?,?,?,?,?,?,?,?,?);");
					sp.setString(1,cust_id.getText());
					sp.setString(2,first_name.getText());
					sp.setString(3,middle_name.getText());
					sp.setString(4,last_name.getText());
					sp.setString(5,email.getText());
					sp.setString(6,acc_no.getText());
					sp.setString(7,Dob.getText());
					sp.setString(8,Address.getText());				
					sp.setString(9,mob_no.getText());


					int x=sp.executeUpdate();
					if(x>0)			{	
					System.out.println("Reegistration done sucessfully................");	
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "Reegistration done sucessfully................");
					}
				
 					else {
						System.out.println("Reegistration Failed");
					}
			}	
				}catch(Exception e1) {
					System.out.println(e1);
				}
			
			}
		});
		btnNewButton.setBounds(231, 314, 89, 23);
		dob.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Cust_id");
		lblNewLabel.setBounds(10, 21, 46, 14);
		dob.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First_name");
		lblNewLabel_1.setBounds(10, 86, 89, 14);
		dob.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Middle_name");
		lblNewLabel_2.setBounds(225, 86, 76, 14);
		dob.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last_name");
		lblNewLabel_3.setBounds(454, 86, 115, 14);
		dob.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Mob_no");
		lblNewLabel_5.setBounds(223, 228, 76, 14);
		dob.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Acc_no");
		lblNewLabel_6.setBounds(231, 157, 76, 14);
		dob.add(lblNewLabel_6);
		
		JLabel lblNewLabel_9 = new JLabel("Email");
		lblNewLabel_9.setBounds(10, 157, 46, 14);
		dob.add(lblNewLabel_9);
		
		/*UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, null);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
		JFrame fr= new JFrame();
		fr.getContentPane().add(datePicker);
		Dob.setDate(1990, 8, 24);*/
	//	contentPane.add(Dob);
	//	Dob.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("dob");
		lblNewLabel_4.setBounds(443, 157, 70, 14);
		dob.add(lblNewLabel_4);
		
		
		Address = new JTextField();
		Address.setBounds(10, 243, 163, 29);
		dob.add(Address);
		Address.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("address");
		lblNewLabel_7.setBounds(10, 228, 86, 14);
		dob.add(lblNewLabel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 412, 2, -8);
		dob.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(444, 178, 125, 20);
		dob.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 105, 115, 20);
		dob.add(textField_1);
		textField_1.setColumns(10);
	}
}
