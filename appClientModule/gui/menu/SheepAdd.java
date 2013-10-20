package gui.menu;

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
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SheepAdd extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SheepAdd frame = new SheepAdd();
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
	public SheepAdd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SheepAdd.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 660, 440);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Times New Roman", Font.BOLD, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddSheep = new JLabel("Add Sheep");
		lblAddSheep.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddSheep.setBounds(259, 24, 125, 47);
		contentPane.add(lblAddSheep);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(50, 82, 544, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("Id : ");
		lblId.setBounds(24, 11, 65, 14);
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblId);
		
		JLabel lblDatebirth = new JLabel("Date_birth :");
		lblDatebirth.setBounds(24, 89, 89, 14);
		lblDatebirth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblDatebirth);
		
		JLabel lblDateinput = new JLabel("Date_input : ");
		lblDateinput.setBounds(24, 114, 89, 14);
		lblDateinput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblDateinput);
		
		JLabel lblDateoutput = new JLabel("Date_output : ");
		lblDateoutput.setBounds(24, 139, 106, 14);
		lblDateoutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblDateoutput);
		
		JLabel lblPriceInput = new JLabel("Price input : ");
		lblPriceInput.setBounds(24, 164, 106, 14);
		lblPriceInput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblPriceInput);
		
		JLabel lblPriceOutput = new JLabel("Price output : ");
		lblPriceOutput.setBounds(24, 189, 106, 14);
		lblPriceOutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblPriceOutput);
		
		JLabel lblRace = new JLabel("Race :");
		lblRace.setBounds(24, 61, 65, 14);
		lblRace.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblRace);
		
		JLabel lblSex = new JLabel("Sex : ");
		lblSex.setBounds(24, 36, 65, 14);
		lblSex.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel.add(lblSex);
		
		txtCode = new JTextField();
		txtCode.setBounds(185, 10, 158, 20);
		panel.add(txtCode);
		txtCode.setColumns(10);
		
		JComboBox cbRace = new JComboBox();
		cbRace.setBounds(185, 60, 158, 20);
		cbRace.setModel(new DefaultComboBoxModel(new String[] {"Race 1 ", "Race 2", "Race 3", "..."}));
		panel.add(cbRace);
		
		JSpinner spInput = new JSpinner();
		spInput.setBounds(185, 163, 158, 20);
		panel.add(spInput);
		
		JSpinner spOutput = new JSpinner();
		spOutput.setBounds(185, 188, 158, 20);
		panel.add(spOutput);
		
		JComboBox cbSex = new JComboBox();
		cbSex.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		cbSex.setBounds(185, 35, 158, 20);
		panel.add(cbSex);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnAdd.setBounds(22, 348, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(532, 348, 89, 23);
		contentPane.add(btnCancel);
	}
}
