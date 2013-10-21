package gui.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Toolkit;

public class MonitoringAdd extends JFrame {

	private JPanel contentPane;
	private JSpinner sp;
	private JTextField textLast;
	private JTextField txtCurrent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonitoringAdd frame = new MonitoringAdd();
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
	public MonitoringAdd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MonitoringAdd.class.getResource("/images/icon-sheep.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddMonitoring = new JLabel("Add Monitoring");
		lblAddMonitoring.setBounds(247, 40, 145, 39);
		lblAddMonitoring.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblAddMonitoring);
		
		JList list = new JList();
		list.setBounds(10, 100, 135, 225);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Sheep 1 ", "Sheep 2", "Sheep 3", "Sheep 4", "Sheep 5", "..."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		list.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		panel.setBounds(155, 100, 475, 242);
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPregnancy = new JLabel("Pregnancy : ");
		lblPregnancy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPregnancy.setBounds(57, 39, 134, 29);
		panel.add(lblPregnancy);
		
		JLabel lblLastWeighingDate = new JLabel("Last weighing date  :");
		lblLastWeighingDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLastWeighingDate.setBounds(10, 115, 149, 29);
		panel.add(lblLastWeighingDate);
		
		JLabel lblLastWeight = new JLabel("Last weight : ");
		lblLastWeight.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLastWeight.setBounds(281, 115, 101, 29);
		panel.add(lblLastWeight);
		
		JLabel lblCurrentWeight = new JLabel("Current weight : ");
		lblCurrentWeight.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCurrentWeight.setBounds(281, 155, 112, 29);
		panel.add(lblCurrentWeight);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panel_1.setBounds(201, 25, 192, 68);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdYes = new JRadioButton("Yes");
		rdYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				sp.setEnabled(true);
			}
		});
		rdYes.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdYes.setBounds(26, 7, 55, 23);
	
		panel_1.add(rdYes);
		
		JRadioButton rdNo = new JRadioButton("No");
		rdNo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdNo.setBounds(26, 38, 55, 23);
		panel_1.add(rdNo);
		
		sp = new JSpinner();
		sp.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		sp.setBounds(112, 9, 29, 20);
		sp.setEnabled(false);
		panel_1.add(sp);
		
		JLabel lblCurrentWeighingDate = new JLabel("Current weighing date  :");
		lblCurrentWeighingDate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCurrentWeighingDate.setBounds(10, 155, 166, 29);
		panel.add(lblCurrentWeighingDate);
		
		textLast = new JTextField();
		textLast.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textLast.setBounds(398, 120, 67, 20);
		panel.add(textLast);
		textLast.setColumns(10);
		
		txtCurrent = new JTextField();
		txtCurrent.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtCurrent.setColumns(10);
		txtCurrent.setBounds(398, 160, 67, 20);
		panel.add(txtCurrent);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnApply.setBounds(10, 206, 89, 23);
		panel.add(btnApply);
		
		JLabel lblAverrageDailyGain = new JLabel("Averrage daily gain  :");
		lblAverrageDailyGain.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAverrageDailyGain.setBounds(128, 202, 166, 29);
		panel.add(lblAverrageDailyGain);
		
		JLabel gain = new JLabel("");
		gain.setBounds(304, 206, 101, 23);
		panel.add(gain);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnAdd.setBounds(155, 353, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBounds(541, 353, 89, 23);
		contentPane.add(btnCancel);
	}
}
