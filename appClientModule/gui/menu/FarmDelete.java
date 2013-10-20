package gui.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;

public class FarmDelete extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmDelete frame = new FarmDelete();
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
	public FarmDelete() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FarmDelete.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteFarm = new JLabel("Delete Farm");
		lblDeleteFarm.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeleteFarm.setBounds(237, 11, 130, 59);
		contentPane.add(lblDeleteFarm);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"Name 1 ", "Name 2 ", "Name 3 ", "Name 4"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		list.setBounds(73, 86, 104, 236);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(178, 352, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel\r\n");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.setBounds(475, 352, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(216, 86, 309, 236);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(44, 45, 45, 19);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblName);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAdress.setBounds(44, 92, 62, 19);
		panel.add(lblAdress);
		
		JLabel lblTel = new JLabel("Tel:");
		lblTel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTel.setBounds(44, 139, 45, 19);
		panel.add(lblTel);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblEmail.setBounds(44, 180, 62, 19);
		panel.add(lblEmail);
		
		JLabel name = new JLabel("");
		name.setForeground(new Color(0, 0, 0));
		name.setBackground(Color.WHITE);
		name.setBounds(144, 49, 102, 15);
		panel.add(name);
		
		JLabel adress = new JLabel("");
		adress.setForeground(Color.BLACK);
		adress.setBackground(Color.WHITE);
		adress.setBounds(144, 96, 102, 15);
		panel.add(adress);
		
		JLabel tel = new JLabel("");
		tel.setForeground(Color.BLACK);
		tel.setBackground(Color.WHITE);
		tel.setBounds(144, 139, 102, 15);
		panel.add(tel);
		
		JLabel email = new JLabel("");
		email.setForeground(Color.BLACK);
		email.setBackground(Color.WHITE);
		email.setBounds(144, 184, 102, 15);
		panel.add(email);
	}

}
