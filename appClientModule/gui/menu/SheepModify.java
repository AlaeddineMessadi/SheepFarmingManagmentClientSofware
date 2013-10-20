package gui.menu;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SheepModify extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtRace;
	private JTextField txtSex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SheepModify frame = new SheepModify();
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
	public SheepModify() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SheepModify.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 665, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModifySheep = new JLabel("Modify Sheep");
		lblModifySheep.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblModifySheep.setBounds(249, 54, 151, 51);
		contentPane.add(lblModifySheep);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sheep 1 ", "Sheep 2", "Sheep 3", "Sheep 4", "..."}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 11));
		comboBox.setBounds(38, 119, 89, 20);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(160, 101, 425, 241);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("Id : ");
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblId.setBounds(47, 27, 46, 14);
		panel.add(lblId);
		
		JLabel lblRace = new JLabel("Race : ");
		lblRace.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRace.setBounds(47, 52, 69, 14);
		panel.add(lblRace);
		
		JLabel lblSex = new JLabel("Sex : ");
		lblSex.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSex.setBounds(47, 77, 46, 14);
		panel.add(lblSex);
		
		JLabel lblDateBirth = new JLabel("Date birth :");
		lblDateBirth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDateBirth.setBounds(47, 102, 92, 14);
		panel.add(lblDateBirth);
		
		JLabel lblDataInput = new JLabel("Data input :");
		lblDataInput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDataInput.setBounds(47, 127, 92, 14);
		panel.add(lblDataInput);
		
		JLabel lblDateOutput = new JLabel("Date output :");
		lblDateOutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDateOutput.setBounds(47, 152, 92, 14);
		panel.add(lblDateOutput);
		
		JLabel lblPriceInput = new JLabel("Price input : ");
		lblPriceInput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPriceInput.setBounds(47, 177, 92, 14);
		panel.add(lblPriceInput);
		
		JLabel lblPriceOutput = new JLabel("Price output : ");
		lblPriceOutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPriceOutput.setBounds(47, 202, 107, 14);
		panel.add(lblPriceOutput);
		
		txtId = new JTextField();
		txtId.setBounds(192, 21, 173, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtRace = new JTextField();
		txtRace.setColumns(10);
		txtRace.setBounds(192, 51, 173, 20);
		panel.add(txtRace);
		
		txtSex = new JTextField();
		txtSex.setColumns(10);
		txtSex.setBounds(192, 76, 173, 20);
		panel.add(txtSex);
		
		JSpinner spInput = new JSpinner();
		spInput.setBounds(192, 170, 173, 20);
		panel.add(spInput);
		
		JSpinner spOutput = new JSpinner();
		spOutput.setBounds(192, 201, 173, 20);
		panel.add(spOutput);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnModify.setBounds(138, 353, 89, 23);
		contentPane.add(btnModify);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(521, 353, 89, 23);
		contentPane.add(btnCancel);
	}
}
