package gui.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class BuildingModify extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					BuildingModify frame = new BuildingModify();
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
	public BuildingModify() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuildingModify.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifyBuilding = new JLabel("Modify Building");
		lblModifyBuilding.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblModifyBuilding.setBounds(206, 38, 183, 35);
		contentPane.add(lblModifyBuilding);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"Building 1 ", "Building 2", "Building 3", "Building 4", "Building 5", "...", "...", "..."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(49, 88, 113, 190);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(204, 90, 328, 190);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(41, 35, 60, 14);
		panel.add(lblName);
		
		JLabel lblCapacity = new JLabel("Capacity :");
		lblCapacity.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCapacity.setBounds(41, 84, 80, 14);
		panel.add(lblCapacity);
		
		JLabel lblFarm = new JLabel("Farm :");
		lblFarm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFarm.setBounds(41, 129, 60, 14);
		panel.add(lblFarm);
		
		JComboBox cbFarm = new JComboBox();
		cbFarm.setModel(new DefaultComboBoxModel(new String[] {"Farm 1 ", "Farm 2", "Farm 3", "..."}));
		cbFarm.setBounds(159, 128, 116, 20);
		panel.add(cbFarm);
		
		txtName = new JTextField();
		txtName.setBounds(159, 34, 116, 20);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtCapacity = new JTextField();
		txtCapacity.setColumns(10);
		txtCapacity.setBounds(159, 83, 116, 20);
		panel.add(txtCapacity);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnModify.setBounds(128, 309, 89, 23);
		contentPane.add(btnModify);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(432, 309, 89, 23);
		contentPane.add(btnCancel);
	}

}
