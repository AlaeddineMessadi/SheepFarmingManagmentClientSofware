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
import javax.swing.JButton;
import java.awt.Toolkit;

public class VaccinDelete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccinDelete frame = new VaccinDelete();
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
	public VaccinDelete() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VaccinDelete.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteVaccine = new JLabel("Delete vaccine");
		lblDeleteVaccine.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeleteVaccine.setBounds(131, 41, 128, 33);
		contentPane.add(lblDeleteVaccine);
		
		JList list = new JList();
		list.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Vaccine 1 ", "Vaccine 2", "Vaccine 3", "Vaccine 4", "Vaccine 5", "Vaccine 6", "Vaccine 7", "Vaccine 8"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setFont(new Font("Times New Roman", Font.BOLD, 17));
		list.setBounds(69, 85, 255, 184);
		contentPane.add(list);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDelete.setBounds(27, 290, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCancel.setBounds(274, 290, 89, 23);
		contentPane.add(btnCancel);
	}

}
