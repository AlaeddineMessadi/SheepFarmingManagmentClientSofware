package gui.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SheepDelete extends JFrame {

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
					SheepDelete frame = new SheepDelete();
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
	public SheepDelete() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SheepDelete.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 623, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteSheep = new JLabel("Delete Sheep");
		lblDeleteSheep.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDeleteSheep.setBounds(239, 46, 128, 50);
		contentPane.add(lblDeleteSheep);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sheep 1", "Sheep 2", "Sheep 3", "..."}));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		comboBox.setBounds(28, 103, 128, 26);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(164, 107, 406, 221);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblId.setBounds(41, 13, 46, 14);
		panel.add(lblId);
		
		JLabel lblRace = new JLabel("Race :");
		lblRace.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRace.setBounds(41, 36, 46, 14);
		panel.add(lblRace);
		
		JLabel lblSex = new JLabel("Sex :");
		lblSex.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSex.setBounds(41, 55, 46, 14);
		panel.add(lblSex);
		
		JLabel lblDateBirth = new JLabel("Date birth :");
		lblDateBirth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDateBirth.setBounds(41, 80, 99, 14);
		panel.add(lblDateBirth);
		
		JLabel lblDateInput = new JLabel("Date input : ");
		lblDateInput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDateInput.setBounds(41, 105, 99, 14);
		panel.add(lblDateInput);
		
		JLabel lblDateOutput = new JLabel("Date output :");
		lblDateOutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDateOutput.setBounds(41, 129, 99, 14);
		panel.add(lblDateOutput);
		
		JLabel lblPriceInput = new JLabel("Price input :");
		lblPriceInput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPriceInput.setBounds(41, 154, 99, 14);
		panel.add(lblPriceInput);
		
		JLabel lblPriceOutput = new JLabel("Price output : ");
		lblPriceOutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPriceOutput.setBounds(41, 181, 99, 14);
		panel.add(lblPriceOutput);
		
		JLabel id = new JLabel("");
		id.setBounds(183, 13, 133, 14);
		panel.add(id);
		
		JLabel race = new JLabel("");
		race.setBounds(183, 36, 133, 14);
		panel.add(race);
		
		JLabel sex = new JLabel("");
		sex.setBounds(183, 57, 133, 14);
		panel.add(sex);
		
		JLabel dateBirth = new JLabel("");
		dateBirth.setBounds(183, 82, 133, 14);
		panel.add(dateBirth);
		
		JLabel dateInput = new JLabel("");
		dateInput.setBounds(183, 107, 133, 14);
		panel.add(dateInput);
		
		JLabel dateOutput = new JLabel("");
		dateOutput.setBounds(183, 132, 133, 14);
		panel.add(dateOutput);
		
		JLabel priceInput = new JLabel("");
		priceInput.setBounds(183, 156, 133, 14);
		panel.add(priceInput);
		
		JLabel priceOutput = new JLabel("");
		priceOutput.setBounds(183, 181, 133, 14);
		panel.add(priceOutput);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnDelete.setBounds(164, 352, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(481, 352, 89, 23);
		contentPane.add(btnCancel);
	}
}
