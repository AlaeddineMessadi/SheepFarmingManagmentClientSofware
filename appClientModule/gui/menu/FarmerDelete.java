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
import javax.swing.JButton;
import java.awt.Toolkit;

public class FarmerDelete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmerDelete frame = new FarmerDelete();
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
	public FarmerDelete() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FarmerDelete.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteFarmer = new JLabel("Delete Farmer ");
		lblDeleteFarmer.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeleteFarmer.setBounds(213, 39, 161, 45);
		contentPane.add(lblDeleteFarmer);
		
		JList list = new JList();
		list.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Farmer 1 ", "Farmer 2", "Farmer 3", "Farmer 4", "Farmer 5", "Farmer 6", "Farmer 7", "Farmer 8"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(35, 84, 113, 243);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(184, 84, 358, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLogin.setBounds(30, 34, 75, 14);
		panel.add(lblLogin);
		
		JLabel lblFirstName = new JLabel("First name :");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFirstName.setBounds(30, 76, 96, 14);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name : ");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLastName.setBounds(30, 117, 96, 14);
		panel.add(lblLastName);
		
		JLabel lblPost = new JLabel("Post : ");
		lblPost.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPost.setBounds(30, 155, 75, 14);
		panel.add(lblPost);
		
		JLabel lblBuilding = new JLabel("Building : ");
		lblBuilding.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBuilding.setBounds(30, 193, 75, 14);
		panel.add(lblBuilding);
		
		JLabel login = new JLabel("");
		login.setBounds(138, 34, 174, 14);
		panel.add(login);
		
		JLabel firstName = new JLabel("");
		firstName.setBounds(136, 77, 174, 14);
		panel.add(firstName);
		
		JLabel lastName = new JLabel("");
		lastName.setBounds(138, 118, 174, 14);
		panel.add(lastName);
		
		JLabel post = new JLabel("");
		post.setBounds(138, 156, 174, 14);
		panel.add(post);
		
		JLabel building = new JLabel("");
		building.setBounds(138, 194, 174, 14);
		panel.add(building);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnDelete.setBounds(152, 363, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(442, 363, 89, 23);
		contentPane.add(btnCancel);
	}
}
