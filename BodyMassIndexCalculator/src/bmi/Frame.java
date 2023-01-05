package bmi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame {

	private JFrame frmBmiCalculator;
	private JTextField HeightInput;
	private JTextField WeightInput;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmBmiCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBmiCalculator = new JFrame();
		frmBmiCalculator.setTitle("BMI Calculator");
		frmBmiCalculator.setBounds(100, 100, 543, 548);
		frmBmiCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBmiCalculator.getContentPane().setLayout(null);
		
		JLabel lblExplain = new JLabel("This program calculates your body mass index.");
		lblExplain.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblExplain.setBounds(10, 24, 503, 75);
		frmBmiCalculator.getContentPane().add(lblExplain);
		
		JLabel lblNewLabel_1 = new JLabel("Height (in meters)");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 110, 205, 38);
		frmBmiCalculator.getContentPane().add(lblNewLabel_1);
		
		HeightInput = new JTextField();
		HeightInput.setFont(new Font("Verdana", Font.PLAIN, 19));
		HeightInput.setBounds(225, 110, 228, 40);
		frmBmiCalculator.getContentPane().add(HeightInput);
		HeightInput.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Weight (in Kg)");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(20, 182, 205, 38);
		frmBmiCalculator.getContentPane().add(lblNewLabel_2);
		
		WeightInput = new JTextField();
		WeightInput.setFont(new Font("Verdana", Font.PLAIN, 19));
		WeightInput.setColumns(10);
		WeightInput.setBounds(225, 182, 228, 40);
		frmBmiCalculator.getContentPane().add(WeightInput);
		
		JButton btnNewButton = new JButton("Calculate BMI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double height = Double.parseDouble(HeightInput.getText());
					double weight = Double.parseDouble(WeightInput.getText());
					
					output.setText(BMI_Calculator.calcolaBMI(height, weight));
					
				}catch (Exception ex) {
					output.setText("Invalid values!"); 
				}
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 19));
		btnNewButton.setBounds(135, 250, 228, 58);
		frmBmiCalculator.getContentPane().add(btnNewButton);
		
		output = new JTextField();
		output.setFont(new Font("Verdana", Font.PLAIN, 19));
		output.setBounds(10, 342, 503, 38);
		frmBmiCalculator.getContentPane().add(output);
		output.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HeightInput.setText("");
				WeightInput.setText("");
				output.setText("");
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 19));
		btnNewButton_1.setBounds(135, 409, 228, 47);
		frmBmiCalculator.getContentPane().add(btnNewButton_1);
	}
}
