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
import javax.swing.JButton;
import java.awt.Toolkit;

public class VaccineModify extends JFrame {

	private JPanel contentPane;
	private JTextField txtNew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccineModify frame = new VaccineModify();
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
	public VaccineModify() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VaccineModify.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifyVaccine = new JLabel("Modify Vaccine");
		lblModifyVaccine.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblModifyVaccine.setBounds(184, 34, 153, 28);
		contentPane.add(lblModifyVaccine);
		
		JLabel lblListOfVaccines = new JLabel("List of vaccines :");
		lblListOfVaccines.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblListOfVaccines.setBounds(36, 89, 131, 28);
		contentPane.add(lblListOfVaccines);
		
		JList list = new JList();
		list.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Type 1 ", "Type 2", "Type 3", "Type 4 ", "Type 5 ", "Type 6 "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		list.setBounds(38, 128, 116, 147);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(185, 128, 300, 147);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPreviousType = new JLabel("Previous Type :");
		lblPreviousType.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPreviousType.setBounds(22, 37, 116, 25);
		panel.add(lblPreviousType);
		
		JLabel lblNewType = new JLabel("New Type :");
		lblNewType.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewType.setBounds(22, 88, 116, 25);
		panel.add(lblNewType);
		
		JLabel previousType = new JLabel("");
		previousType.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		previousType.setBounds(164, 44, 107, 18);
		panel.add(previousType);
		
		txtNew = new JTextField();
		txtNew.setBounds(161, 92, 110, 20);
		panel.add(txtNew);
		txtNew.setColumns(10);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnModify.setBounds(129, 300, 89, 23);
		contentPane.add(btnModify);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(370, 300, 89, 23);
		contentPane.add(btnCancel);
	}

}
