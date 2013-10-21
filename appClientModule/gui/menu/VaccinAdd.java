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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class VaccinAdd extends JFrame {

	private JPanel contentPane;
	private JTextField type;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccinAdd frame = new VaccinAdd();
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
	public VaccinAdd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VaccinAdd.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddVaccin = new JLabel("Add Vaccine");
		lblAddVaccin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddVaccin.setBounds(148, 32, 141, 29);
		contentPane.add(lblAddVaccin);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 76, 371, 163);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblVaccineDate = new JLabel("Vaccine date : ");
		lblVaccineDate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblVaccineDate.setBounds(28, 23, 133, 24);
		panel.add(lblVaccineDate);
		
		JLabel lblVaccineType = new JLabel("Vaccine type : ");
		lblVaccineType.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblVaccineType.setBounds(28, 68, 133, 24);
		panel.add(lblVaccineType);
		
		JLabel lblSheep = new JLabel("Sheep :");
		lblSheep.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSheep.setBounds(28, 112, 133, 24);
		panel.add(lblSheep);
		
		type = new JTextField();
		type.setBounds(196, 72, 133, 20);
		panel.add(type);
		type.setColumns(10);
		
		JComboBox cbSheep = new JComboBox();
		cbSheep.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cbSheep.setModel(new DefaultComboBoxModel(new String[] {"Sheep 1 ", "Sheep 2", "Sheep 3", "Sheep 4", "..."}));
		cbSheep.setBounds(196, 116, 133, 20);
		panel.add(cbSheep);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnAdd.setBounds(10, 262, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(338, 262, 89, 23);
		contentPane.add(btnCancel);
	}
}
