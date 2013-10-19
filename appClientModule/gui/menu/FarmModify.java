package gui.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import java.awt.Toolkit;

public class FarmModify extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAdress;
	private JTextField txtTel;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmModify frame = new FarmModify();
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
	public FarmModify() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FarmModify.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifyFarm = new JLabel("Modify Farm");
		lblModifyFarm.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblModifyFarm.setBounds(287, 11, 112, 54);
		contentPane.add(lblModifyFarm);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(211, 92, 431, 242);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(75, 45, 61, 14);
		panel.add(lblName);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAdress.setBounds(75, 93, 61, 14);
		panel.add(lblAdress);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTel.setBounds(75, 138, 61, 14);
		panel.add(lblTel);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEmail.setBounds(75, 186, 61, 14);
		panel.add(lblEmail);
		
		txtName = new JTextField();
		txtName.setBounds(191, 44, 159, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setColumns(10);
		txtAdress.setBounds(191, 92, 159, 20);
		panel.add(txtAdress);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(192, 137, 158, 20);
		panel.add(txtTel);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(191, 180, 159, 20);
		panel.add(txtEmail);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnModify.setBounds(87, 367, 89, 23);
		contentPane.add(btnModify);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(535, 367, 89, 23);
		contentPane.add(btnCancel);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("ccc\r\nvvvv\r\nxxxx\r\n");
		list.setBounds(45, 92, 112, 242);
		contentPane.add(list);
	}
}
