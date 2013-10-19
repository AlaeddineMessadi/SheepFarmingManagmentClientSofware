package gui.messages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import delegate.AdminServiceDelegate;

import persistance.Admin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class retypePassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	byte[] Image = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					retypePassword frame = new retypePassword(null, null, null, null);
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
	public retypePassword(final String login,final String password,final String email,final byte[] image) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(retypePassword.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 126);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRetypeThePassword = new JLabel("Retype the Password");
		lblRetypeThePassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRetypeThePassword.setBounds(20, 11, 193, 19);
		contentPane.add(lblRetypeThePassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(90, 41, 199, 20);
		contentPane.add(passwordField);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				System.out.println(login);
				System.out.println(password);
				System.out.println(image);
				System.out.println(passwordField.getText());
				if(password.equals(passwordField.getText().toString()) ){
					System.out.println("goooood");
                Admin admin = new Admin(null, null, login, password, email, null, null,image);
				AdminServiceDelegate.updateAdmin(admin);
				
				}
			}
		});
		btnConfirm.setBounds(375, 40, 89, 23);
		contentPane.add(btnConfirm);
		
		
	}
}
