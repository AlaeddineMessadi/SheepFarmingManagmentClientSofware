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
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.Toolkit;

public class BuildingDelete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildingDelete frame = new BuildingDelete();
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
	public BuildingDelete() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuildingDelete.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteBuilding = new JLabel("Delete Building");
		lblDeleteBuilding.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeleteBuilding.setBounds(223, 27, 166, 67);
		contentPane.add(lblDeleteBuilding);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(259, 105, 304, 184);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(36, 28, 45, 19);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblName);
		
		JLabel lblCapacity = new JLabel("Capacity:");
		lblCapacity.setBounds(36, 79, 70, 19);
		lblCapacity.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblCapacity);
		
		JLabel lblFarm = new JLabel("Farm:");
		lblFarm.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblFarm.setBounds(36, 128, 45, 19);
		panel.add(lblFarm);
		
		JLabel name = new JLabel("");
		name.setBounds(145, 32, 103, 14);
		panel.add(name);
		
		JLabel capacity = new JLabel("");
		capacity.setBounds(145, 83, 103, 14);
		panel.add(capacity);
		
		JLabel farm = new JLabel("");
		farm.setBounds(145, 132, 103, 14);
		panel.add(farm);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Building 1 ", "Building 2 ", "Building 3 ", "Building 4 ", "...", "...", "..."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(48, 105, 117, 178);
		contentPane.add(list);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnDelete.setBounds(139, 332, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(466, 332, 89, 23);
		contentPane.add(btnCancel);
	}

}
