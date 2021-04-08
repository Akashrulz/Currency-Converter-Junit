import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class convertor {

	public JFrame frame = new JFrame();
	public JPanel panel = new JPanel();
	public JComboBox country = new JComboBox();
	public JTextField inputtext = new JTextField();
	public JButton india = new JButton("Indian Rupee");
	public JButton usa = new JButton("USD");
	public JButton england = new JButton("English Pound ");
	public JButton japan = new JButton("Japanese Yen");
	public JButton russia = new JButton("USSR's Ruble");
	public JTextField outputtext = new JTextField();
	public JButton clear = new JButton("Clear");
	
	public void toindia(ActionEvent e) 
	{
		int i = country.getSelectedIndex();
		String s = inputtext.getText();
		double d = Double.parseDouble(s);
		if(i==0)
			outputtext.setText(Double.toString(d));
		if(i==1)
			outputtext.setText(Double.toString(d*71.03));
		if(i==2)
			outputtext.setText(Double.toString(d*87.51));
		if(i==3)
			outputtext.setText(Double.toString(d*0.66));
		if(i==4)
			outputtext.setText(Double.toString(d*1.09));
	}
	public void tousa(ActionEvent e) 
	{
		int i = country.getSelectedIndex();
		String s = inputtext.getText();
		double d = Double.parseDouble(s);
		if(i==0)
			outputtext.setText(Double.toString(d*0.014));
		if(i==1)
			outputtext.setText(Double.toString(d));
		if(i==2)
			outputtext.setText(Double.toString(d*1.23));
		if(i==3)
			outputtext.setText(Double.toString(d*0.0094));
		if(i==4)
			outputtext.setText(Double.toString(d*0.015));
	}
	public void toengland(ActionEvent e) 
	{
		int i = country.getSelectedIndex();
		String s = inputtext.getText();
		double d = Double.parseDouble(s);
		if(i==0)
			outputtext.setText(Double.toString(d*0.011));
		if(i==1)
			outputtext.setText(Double.toString(d*0.81));
		if(i==2)
			outputtext.setText(Double.toString(d));
		if(i==3)
			outputtext.setText(Double.toString(d*0.0076));
		if(i==4)
			outputtext.setText(Double.toString(d*0.012));
	}
	public void tojapan(ActionEvent e) 
	{
		int i = country.getSelectedIndex();
		String s = inputtext.getText();
		double d = Double.parseDouble(s);
		if(i==0)
			outputtext.setText(Double.toString(d*1.5));
		if(i==1)
			outputtext.setText(Double.toString(d*106.8));
		if(i==2)
			outputtext.setText(Double.toString(d*131.63));
		if(i==3)
			outputtext.setText(Double.toString(d));
		if(i==4)
			outputtext.setText(Double.toString(d*1.65));
	}
	public void torussia(ActionEvent e)
	{
		int i = country.getSelectedIndex();
		String s = inputtext.getText();
		double d = Double.parseDouble(s);
		if(i==0)
			outputtext.setText(Double.toString(d*0.91));
		if(i==1)
			outputtext.setText(Double.toString(d*64.91));
		if(i==2)
			outputtext.setText(Double.toString(d*80.01));
		if(i==3)
			outputtext.setText(Double.toString(d*0.61));
		if(i==4)
			outputtext.setText(Double.toString(d));
	}
	public void toclear(ActionEvent e)
	{
		String d = null;
		outputtext.setText(d);
		inputtext.setText(d);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					convertor window = new convertor();
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
	public convertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		panel.setBackground(new Color(204, 153, 255));
		panel.setBounds(0, 0, 882, 653);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConvertor = new JLabel("Currency Convertor");
		lblCurrencyConvertor.setForeground(new Color(255, 255, 255));
		lblCurrencyConvertor.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 50));
		lblCurrencyConvertor.setBounds(136, 27, 530, 55);
		panel.add(lblCurrencyConvertor);
		
		JLabel lblInputCountry = new JLabel("Input Country: -");
		lblInputCountry.setForeground(new Color(255, 255, 255));
		lblInputCountry.setFont(new Font("Elephant", Font.PLAIN, 28));
		lblInputCountry.setBounds(40, 136, 226, 39);
		panel.add(lblInputCountry);
		
		
		country.setBackground(new Color(204, 153, 255));
		country.setForeground(new Color(255, 255, 255));
		country.setFont(new Font("Elephant", Font.PLAIN, 20));
		country.setModel(new DefaultComboBoxModel(new String[] {"Indian Rupee", "USD", "English Pound", "Japanese Yen", "USSR's Ruble"}));
		country.setBounds(301, 142, 226, 32);
		panel.add(country);
		
		JLabel lblEnterAmount = new JLabel("Enter Amount: -");
		lblEnterAmount.setForeground(new Color(255, 255, 255));
		lblEnterAmount.setFont(new Font("Elephant", Font.PLAIN, 28));
		lblEnterAmount.setBounds(40, 210, 242, 39);
		panel.add(lblEnterAmount);
		
		
		inputtext.setFont(new Font("Elephant", Font.PLAIN, 28));
		inputtext.setBackground(new Color(204, 153, 255));
		inputtext.setForeground(new Color(255, 255, 255));
		inputtext.setBounds(301, 218, 226, 32);
		panel.add(inputtext);
		inputtext.setColumns(10);
		
		
		india.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				toindia(arg0);
			}
		});
		india.setFont(new Font("Elephant", Font.PLAIN, 20));
		india.setForeground(new Color(255, 255, 255));
		india.setBackground(new Color(153, 102, 204));
		india.setBounds(76, 362, 190, 32);
		panel.add(india);
		
		JLabel lblOutputCountry = new JLabel("Output Country: -");
		lblOutputCountry.setForeground(Color.WHITE);
		lblOutputCountry.setFont(new Font("Elephant", Font.PLAIN, 28));
		lblOutputCountry.setBounds(40, 279, 267, 39);
		panel.add(lblOutputCountry);
		usa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tousa(arg0);
			}
		});
		
		
		usa.setForeground(Color.WHITE);
		usa.setFont(new Font("Elephant", Font.PLAIN, 20));
		usa.setBackground(new Color(153, 102, 204));
		usa.setBounds(353, 362, 190, 32);
		panel.add(usa);
		england.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toengland(e);
			}
		});
		
		
		england.setForeground(Color.WHITE);
		england.setFont(new Font("Elephant", Font.PLAIN, 20));
		england.setBackground(new Color(153, 102, 204));
		england.setBounds(631, 362, 190, 32);
		panel.add(england);
		japan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tojapan(e);
			}
		});
		
		
		japan.setForeground(Color.WHITE);
		japan.setFont(new Font("Elephant", Font.PLAIN, 20));
		japan.setBackground(new Color(153, 102, 204));
		japan.setBounds(212, 432, 190, 32);
		panel.add(japan);
		russia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				torussia(e);
			}
		});
		
		
		russia.setForeground(Color.WHITE);
		russia.setFont(new Font("Elephant", Font.PLAIN, 20));
		russia.setBackground(new Color(153, 102, 204));
		russia.setBounds(498, 438, 190, 32);
		panel.add(russia);
		
		JLabel lblConvertedAmount = new JLabel("Converted Amount: -");
		lblConvertedAmount.setForeground(Color.WHITE);
		lblConvertedAmount.setFont(new Font("Elephant", Font.PLAIN, 28));
		lblConvertedAmount.setBounds(40, 496, 302, 39);
		panel.add(lblConvertedAmount);
		outputtext.setFont(new Font("Elephant", Font.PLAIN, 25));
		
		
		outputtext.setForeground(new Color(255, 255, 255));
		outputtext.setBackground(new Color(204, 153, 255));
		outputtext.setEditable(false);
		outputtext.setBounds(387, 503, 226, 35);
		panel.add(outputtext);
		outputtext.setColumns(10);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				toclear(e);
			}
		});
		
		
		clear.setFont(new Font("Elephant", Font.PLAIN, 24));
		clear.setBackground(new Color(153, 102, 204));
		clear.setForeground(new Color(255, 255, 255));
		clear.setBounds(409, 572, 118, 39);
		panel.add(clear);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\currency convertor\\images\\icons8_japanese_yen_48px.png"));
		lblNewLabel.setBounds(646, 27, 57, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\eclipse-workspace\\currency convertor\\images\\icons8_euro_48px.png"));
		lblNewLabel_1.setBounds(684, 82, 57, 55);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\eclipse-workspace\\currency convertor\\images\\icons8_refund_2_48px.png"));
		lblNewLabel_2.setBounds(735, 39, 66, 55);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\eclipse-workspace\\currency convertor\\images\\icons8_rupee_48px_1.png"));
		lblNewLabel_3.setBounds(779, 82, 91, 55);
		panel.add(lblNewLabel_3);
	}
}
