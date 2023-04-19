import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Customer_Create extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField cust_id;
	private JTextField first_name;
	private JTextField middle_name;
	private JTextField last_name;
	private JTextField email;
	private JTextField acc_no;
	private JTextField dob;
	private JTextField address;
	private JTextField mob_no;
	PreparedStatement pst;
	/*public void AutoID() {
		try {
			String Cust_id=cust_id.getText();
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Connection conn=DriverManager.getConnection( "jdbc:sqlserver://localhost\\Bank_Application;user=sa;password=root");
			Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=root;databaseName=Bank_Application");
	Statement s=conn.createStatement();
		ResultSet rs=s.executeQuery("select MAX(Cust_id) as newcust_id, MAX(Acc_no) as newacc_no from dbo.cust_Info");
		rs.next();
		
		rs.getString("newcust_id");
		if(rs.getString("newcust_id")==null){
			cust_id.setText("1");
		}
		else if(rs.getString("newacc_no")==null) {
			acc_no.setText("1001");
		}
		else {
		int ID=Integer.parseInt(rs.getString("newcust_id"));
		ID=ID+1;
		cust_id.setText(String.valueOf(ID));  
		
		int Account_no=Integer.parseInt(rs.getString("newacc_no"));
		Account_no=Account_no+1;
		acc_no.setText(String.valueOf(Account_no));
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		}*/	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Create CCframe = new Customer_Create();
					CCframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Customer_Create() {
	//	initComponents();
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		cust_id = new JTextField();
		cust_id.setBounds(10, 33, 163, 33);
		contentPane.add(cust_id);
		cust_id.setColumns(10);
		
		first_name = new JTextField();
		first_name.setColumns(10);
		first_name.setBounds(10, 93, 163, 33);
		contentPane.add(first_name);
		
		middle_name = new JTextField();
		middle_name.setColumns(10);
		middle_name.setBounds(183, 93, 163, 33);
		contentPane.add(middle_name);
		
		last_name = new JTextField();
		last_name.setColumns(10);
		last_name.setBounds(356, 93, 163, 33);
		contentPane.add(last_name);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(10, 166, 163, 33);
		contentPane.add(email);
		
		acc_no = new JTextField();
		acc_no.setColumns(10);
		acc_no.setBounds(183, 166, 163, 33);
		contentPane.add(acc_no);
		
		dob = new JTextField();
		dob.setColumns(10);
		dob.setBounds(356, 166, 163, 33);
		contentPane.add(dob);
		
		JLabel lblNewLabel = new JLabel("Cust_id");
		lblNewLabel.setBounds(10, 21, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("First_name");
		lblFirstname.setBounds(10, 82, 83, 14);
		contentPane.add(lblFirstname);
		
		JLabel lblMiddlename = new JLabel("Middle_name");
		lblMiddlename.setBounds(183, 82, 83, 14);
		contentPane.add(lblMiddlename);
		
		JLabel lblLastname = new JLabel("Last_name");
		lblLastname.setBounds(356, 82, 83, 14);
		contentPane.add(lblLastname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 151, 83, 14);
		contentPane.add(lblEmail);
		
		JLabel lblAccno = new JLabel("Acc_no");
		lblAccno.setBounds(183, 151, 83, 14);
		contentPane.add(lblAccno);
		
		JLabel lblDob = new JLabel("Dob");
		lblDob.setBounds(356, 151, 83, 14);
		contentPane.add(lblDob);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(10, 236, 163, 33);
		contentPane.add(address);
		
		mob_no = new JTextField();
		mob_no.setColumns(10);
		mob_no.setBounds(183, 236, 163, 33);
		contentPane.add(mob_no);
		
		JLabel lblNewLabel_5_1 = new JLabel("Address");
		lblNewLabel_5_1.setBounds(10, 222, 83, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Mob_no");
		lblNewLabel_5_2.setBounds(183, 222, 83, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					//Class.forName("com.mysql.jdbc.Driver");
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					//Connection conn=DriverManager.getConnection( "jdbc:sqlserver://localhost\\Bank_Application;user=sa;password=root");
			Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=root;databaseName=Bank_Application");
			if (first_name.getText().equals("")) {
				JFrame f=new JFrame();
				JOptionPane.showMessageDialog(f, "first_name is mandotory............");
			}
				else if (last_name.getText().equals("")) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "last_name is mandotory............");
				}
				else if(email.getText().equals("") && mob_no.getText().equals(""))  {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "atleast provide email or mob_no");
				}		
				else if(!"".equals(mob_no.getText()) && mob_no.getText().length() !=10) {
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "mob_no  should be 10 digit............");	
				}
			
				else {			
					PreparedStatement sp=conn.prepareStatement("insert into dbo.Cust_Info(Cust_id,First_name,Middle_name,Last_name,Email,Dob,Address,Mob_no)values(DEFAULT,?,?,?,?,?,?,?);");
					//sp.setString(1,cust_id.getText());
					sp.setString(1,first_name.getText());
					sp.setString(2,middle_name.getText());
					sp.setString(3,last_name.getText());
					sp.setString(4,email.getText());
					//sp.setString(5,acc_no.getText());
					sp.setString(5,dob.getText());
					sp.setString(6,address.getText());	
					if (mob_no.getText().equals("")) {
						sp.setString(7,"0");
					}
					else {
					sp.setString(7,mob_no.getText());
					}


					int x=sp.executeUpdate();
					if(x>0)			{	
//					System.out.println("Reegistration done sucessfully................");//on concole	
					JFrame f=new JFrame();
					JOptionPane.showMessageDialog(f, "Reegistration done sucessfully................");//on popup screen
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
		btnNewButton.setBounds(134, 349, 188, 23);
		contentPane.add(btnNewButton);
		//AutoID();
	}

}
