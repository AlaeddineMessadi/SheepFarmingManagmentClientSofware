package gui.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class FarmerModify extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirst;
	private JTextField txtLast;
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
					FarmerModify frame = new FarmerModify();
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
	public FarmerModify() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifyFarmer = new JLabel("Modify Farmer");
		lblModifyFarmer.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblModifyFarmer.setBounds(227, 43, 175, 61);
		contentPane.add(lblModifyFarmer);
		
		JList list = new JList();
		list.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Farmer 1 ", "Farmer 2", "Farmer 3", "Farmer 4", "Farmer 5", "Farmer 6", "Farmer 7", "Farmer 8", "..."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setFont(new Font("Times New Roman", Font.BOLD, 16));
		list.setBounds(50, 101, 123, 205);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBounds(227, 101, 338, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First name :");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFirstName.setBounds(39, 22, 97, 14);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name : ");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLastName.setBounds(39, 52, 97, 14);
		panel.add(lblLastName);
		
		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLogin.setBounds(39, 80, 97, 14);
		panel.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(39, 110, 97, 14);
		panel.add(lblPassword);
		
		JLabel lblCin = new JLabel("CIN :");
		lblCin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCin.setBounds(39, 138, 97, 14);
		panel.add(lblCin);
		
		JLabel lblPost = new JLabel("Post : ");
		lblPost.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPost.setBounds(39, 169, 97, 14);
		panel.add(lblPost);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(39, 196, 97, 14);
		panel.add(lblEmail);
		
		JLabel lblTel = new JLabel("Tel : ");
		lblTel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTel.setBounds(39, 221, 97, 14);
		panel.add(lblTel);
		
		JLabel lblAdress = new JLabel("Adress : ");
		lblAdress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAdress.setBounds(39, 246, 97, 14);
		panel.add(lblAdress);
		
		JLabel lblBuiding = new JLabel("Buiding : ");
		lblBuiding.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBuiding.setBounds(39, 271, 97, 14);
		panel.add(lblBuiding);
		
		txtFirst = new JTextField();
		txtFirst.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtFirst.setBounds(168, 20, 119, 20);
		panel.add(txtFirst);
		txtFirst.setColumns(10);
		
		txtLast = new JTextField();
		txtLast.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtLast.setColumns(10);
		txtLast.setBounds(168, 50, 119, 20);
		panel.add(txtLast);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtLogin.setColumns(10);
		txtLogin.setBounds(168, 78, 119, 20);
		panel.add(txtLogin);
		
		txtPwd = new JTextField();
		txtPwd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtPwd.setColumns(10);
		txtPwd.setBounds(168, 108, 119, 20);
		panel.add(txtPwd);
		
		txtCin = new JTextField();
		txtCin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtCin.setColumns(10);
		txtCin.setBounds(168, 136, 119, 20);
		panel.add(txtCin);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(168, 194, 119, 20);
		panel.add(txtEmail);
		
		txtTel = new JTextField();
		txtTel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtTel.setColumns(10);
		txtTel.setBounds(168, 219, 119, 20);
		panel.add(txtTel);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtAdress.setColumns(10);
		txtAdress.setBounds(168, 244, 119, 20);
		panel.add(txtAdress);
		
		JComboBox cbPost = new JComboBox();
		cbPost.setModel(new DefaultComboBoxModel(new String[] {"Post 1", "Post 2", "Post 3", "Post 4", "..."}));
		cbPost.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cbPost.setBounds(168, 167, 119, 20);
		panel.add(cbPost);
		
		JComboBox cbBuilding = new JComboBox();
		cbBuilding.setModel(new DefaultComboBoxModel(new String[] {"Building 1 ", "Building 2", "Building 3", "Building 4", "..."}));
		cbBuilding.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cbBuilding.setBounds(168, 269, 119, 20);
		panel.add(cbBuilding);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnModify.setBounds(179, 435, 89, 23);
		contentPane.add(btnModify);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(505, 435, 89, 23);
		contentPane.add(btnCancel);
	}

}
