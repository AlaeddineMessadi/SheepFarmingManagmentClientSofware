package gui.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FarmerAdd extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtLogin;
	private JTextField txtPwd;
	private JTextField txtCin;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTextField txtAdress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmerAdd frame = new FarmerAdd();
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
	public FarmerAdd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FarmerAdd.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 637, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Farmer");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(247, 36, 126, 48);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(66, 102, 488, 276);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First name : ");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFirstName.setBounds(72, 22, 100, 14);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name : ");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLastName.setBounds(72, 44, 100, 14);
		panel.add(lblLastName);
		
		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLogin.setBounds(72, 67, 100, 14);
		panel.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(72, 89, 100, 14);
		panel.add(lblPassword);
		
		JLabel lblCin = new JLabel("CIN :");
		lblCin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCin.setBounds(72, 114, 100, 14);
		panel.add(lblCin);
		
		JLabel lblPost = new JLabel("Post : ");
		lblPost.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPost.setBounds(72, 139, 100, 14);
		panel.add(lblPost);
		
		JLabel lblEmail = new JLabel("E-mail : ");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(72, 158, 100, 14);
		panel.add(lblEmail);
		
		JLabel lblTel = new JLabel("Tel : ");
		lblTel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTel.setBounds(72, 183, 100, 14);
		panel.add(lblTel);
		
		JLabel lblAdress = new JLabel("Adress :");
		lblAdress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAdress.setBounds(72, 208, 100, 14);
		panel.add(lblAdress);
		
		JLabel lblBuilding = new JLabel("Building : ");
		lblBuilding.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBuilding.setBounds(72, 233, 100, 14);
		panel.add(lblBuilding);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(223, 20, 163, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(223, 42, 163, 20);
		panel.add(txtLastName);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(223, 65, 163, 20);
		panel.add(txtLogin);
		
		txtPwd = new JTextField();
		txtPwd.setColumns(10);
		txtPwd.setBounds(223, 90, 163, 20);
		panel.add(txtPwd);
		
		txtCin = new JTextField();
		txtCin.setColumns(10);
		txtCin.setBounds(223, 112, 163, 20);
		panel.add(txtCin);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(223, 159, 163, 20);
		panel.add(txtEmail);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(223, 181, 163, 20);
		panel.add(txtTel);
		
		txtAdress = new JTextField();
		txtAdress.setColumns(10);
		txtAdress.setBounds(223, 206, 163, 20);
		panel.add(txtAdress);
		
		JComboBox cbBox = new JComboBox();
		cbBox.setModel(new DefaultComboBoxModel(new String[] {"Post 1", "Post 2", "Post 3", "..."}));
		cbBox.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cbBox.setBounds(223, 137, 163, 20);
		panel.add(cbBox);
		
		JComboBox cbBuilding = new JComboBox();
		cbBuilding.setModel(new DefaultComboBoxModel(new String[] {"Building 1 ", "Building 2", "Building 3", "..."}));
		cbBuilding.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cbBuilding.setBounds(223, 233, 163, 20);
		panel.add(cbBuilding);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnAdd.setBounds(26, 395, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(501, 395, 89, 23);
		contentPane.add(btnCancel);
	}

}
