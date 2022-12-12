package me;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class newproform {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newproform window = new newproform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public newproform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 813, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel r1 = new JLabel("");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Desktop\\weight gain.jpg"));
		r1.setBounds(396, 475, 46, 43);
		frame.getContentPane().add(r1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(172, 187, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(172, 213, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel gender = new JLabel("GENDER");
		gender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		gender.setBounds(35, 191, 70, 14);
		frame.getContentPane().add(gender);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(218, 28, 224, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FULLNAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(35, 125, 89, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(168, 125, 161, 30);
		frame.getContentPane().add(formattedTextField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE"}));
		comboBox.setBounds(325, 249, 255, -86);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("PHONE NUMBER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(35, 243, 134, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(218, 249, 5, 22);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(172, 249, 150, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("FAV PROG LANG");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(35, 300, 134, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"JAVA", "PYTOHON", "C"}));
		comboBox_2.setBounds(172, 309, 130, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(172, 449, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("EMAIL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(36, 369, 109, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(324, 371, 5, 22);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textArea_2.setBounds(120, 402, 134, 22);
		frame.getContentPane().add(textArea_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 372, 157, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
		
		
	}
}
