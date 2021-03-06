package gui.menu;

import java.awt.EventQueue;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

import delegate.FarmServicesDelegate;

import persistance.Farm;
import services.farmServices.FarmServicesRemote;


import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FarmAdd extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAdress;
	private JTextField txtTel;
	private JTextField txtEmail;
	private JLabel labelnote;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmAdd frame = new FarmAdd();
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
	public FarmAdd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FarmAdd.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 647, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddFarm = new JLabel("ADD FARM");
		lblAddFarm.setBounds(250, 11, 131, 47);
		lblAddFarm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblAddFarm);
		
		JButton btnAdd = new JButton("Add");
		
		btnAdd.setBounds(52, 408, 113, 23);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		contentPane.add(btnAdd);
		
		JPanel panel = new JPanel();
		panel.setBounds(104, 69, 421, 290);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new CompoundBorder(null, new EtchedBorder(EtchedBorder.LOWERED, null, null)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(168, 30, 183, 20);
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtName.setBackground(Color.WHITE);
		panel.add(txtName);
		
		txtName.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtAdress.setBounds(168, 101, 183, 20);
		panel.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTel.setBounds(168, 174, 182, 20);
		panel.add(txtTel);
		
		txtTel.setColumns(10);
		
		JLabel lblName = new JLabel("Name\t:");
		lblName.setBounds(72, 32, 71, 14);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblName);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(69, 103, 74, 14);
		lblAdress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblAdress);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setBounds(70, 176, 46, 14);
		lblTel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblTel);
		
		JLabel lblEmail = new JLabel("E-mail:\r\n");
		lblEmail.setBounds(70, 243, 73, 14);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtEmail.setBounds(169, 241, 182, 20);
		
		txtEmail.setColumns(10);
		panel.add(txtEmail);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(463, 408, 114, 23);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		contentPane.add(btnCancel);
		
		labelnote = new JLabel("");
		labelnote.setBounds(250, 370, 149, 14);
		contentPane.add(labelnote);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(txtTel.getText().matches("[0-9]*")==false){
					labelnote.setText("Wrong Phone Number");
				}else
					if ((txtEmail.getText().contains(" ") == false) && (txtEmail.getText().matches(".+@.+\\.[a-z]+"))){
					labelnote.setText("Wrong Email");
				}else{
					Farm farm=new Farm();
					farm.setNomFarm(txtName.getText());
					farm.setAdress(txtAdress.getText());
					farm.setTelephone(txtTel.getText());
					farm.setMail(txtEmail.getText());	
	            	FarmServicesDelegate.createFarm(farm);
				    dispose();
				}
				
			}
		});
	}
}
