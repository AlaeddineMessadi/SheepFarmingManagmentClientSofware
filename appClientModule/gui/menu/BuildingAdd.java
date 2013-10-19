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

public class BuildingAdd extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtCapacity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildingAdd frame = new BuildingAdd();
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
	public BuildingAdd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuildingAdd.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddBuilding = new JLabel("Add Building");
		lblAddBuilding.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddBuilding.setBounds(229, 16, 146, 46);
		contentPane.add(lblAddBuilding);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(65, 73, 475, 235);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(40, 34, 72, 19);
		panel.add(lblName);
		
		JLabel lblCapacity = new JLabel("Capacity:");
		lblCapacity.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCapacity.setBounds(40, 89, 72, 19);
		panel.add(lblCapacity);
		
		JLabel lblFarm = new JLabel("Farm:");
		lblFarm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFarm.setBounds(40, 142, 72, 19);
		panel.add(lblFarm);
		
		txtName = new JTextField();
		txtName.setBounds(165, 35, 209, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtCapacity = new JTextField();
		txtCapacity.setColumns(10);
		txtCapacity.setBounds(165, 90, 209, 20);
		panel.add(txtCapacity);
		
		JComboBox cbFarm = new JComboBox();
		cbFarm.setModel(new DefaultComboBoxModel(new String[] {"Farm 1 ", "Farm 2 ", "Farm 3 ", "Farm 4 ", "..."}));
		cbFarm.setBounds(165, 143, 209, 20);
		panel.add(cbFarm);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnAdd.setBounds(37, 338, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(482, 338, 89, 23);
		contentPane.add(btnCancel);
	}

}
