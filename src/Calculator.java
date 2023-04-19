import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField InputNum1;
	private JTextField InputNum2;
	private JTextField OutputResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		InputNum1 = new JTextField();
		InputNum1.setBounds(22, 21, 199, 30);
		contentPane.add(InputNum1);
		InputNum1.setColumns(10);
		
		InputNum2 = new JTextField();
		InputNum2.setColumns(10);
		InputNum2.setBounds(231, 21, 193, 30);
		contentPane.add(InputNum2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
				num1=Integer.parseInt(InputNum1.getText());
				num2=Integer.parseInt(InputNum2.getText());
				ans=num1+num2;
				OutputResult.setText(Integer.toString(ans));
				}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "please enter valid number");
					}
				
			}
		});
		btnAdd.setBounds(22, 91, 199, 39);
		contentPane.add(btnAdd);
		
		JButton btnMinus = new JButton("Minus");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
				num1=Integer.parseInt(InputNum1.getText());
				num2=Integer.parseInt(InputNum2.getText());
				ans=num1-num2;
				OutputResult.setText(Integer.toString(ans));
				}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "please enter valid number");
					}
				
			}
		});
		btnMinus.setBounds(231, 91, 199, 39);
		contentPane.add(btnMinus);
		
		OutputResult = new JTextField();
		OutputResult.setEnabled(false);
		OutputResult.setBounds(216, 176, 193, 30);
		contentPane.add(OutputResult);
		OutputResult.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 176, 81, 22);
		contentPane.add(lblNewLabel);
	}
}
