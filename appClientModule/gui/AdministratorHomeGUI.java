package gui;

import gui.menu.FarmAdd;
import gui.menu.FarmModify;
import gui.messages.retypePassword;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import persistance.Admin;
import persistance.Farm;

import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import delegate.FarmServicesDelegate;

import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import javax.swing.border.LineBorder;
import java.awt.event.MouseMotionAdapter;

public class AdministratorHomeGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginField;
	private JTextField emailField;
	private JTextField path;
	private JPasswordField passwordField;
	private JTable table;
	private JButton btnApply;
	private JLabel image;
	private JScrollPane scrollPane ;
	
	 private ImageIcon format = null;
     String fileName = null;
     int s = 0;
     byte[] imageUser = null;
     private JTextField nomFarmField;
     private JTextField AdressFarmField;
     private JTextField phoneFarmField;
     private JTextField emailFarmField;
     private JLabel idFarmField ;
     private  Farm f = null;
     private List<Farm> list ;
     JFrame alert = new JFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Admin ad = new Admin();
				AdministratorHomeGUI a = new AdministratorHomeGUI(ad);
				a.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdministratorHomeGUI(final Admin admin) {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdministratorHomeGUI.class.getResource("/images/icon-sheep.png")));
		setTitle("AdministratorHomeGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1426, 733);
		setLocationRelativeTo(null);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnFarm = new JMenu("Farm");
		menuBar.add(mnFarm);
		
		JMenuItem mntmAddFarm = new JMenuItem("Add Farm");
		mntmAddFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FarmAdd m=new FarmAdd();
				m.setVisible(true);
			}
		});
		mntmAddFarm.addMouseListener(new MouseAdapter() {
			@Override
	
			public void mouseClicked(MouseEvent e) {
				FarmAdd m=new FarmAdd();
				m.setVisible(true);
				
			}
		});
		mnFarm.add(mntmAddFarm);
		
		JMenuItem mntmModifyFarm = new JMenuItem("Modify Farm");
		mntmModifyFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FarmModify m=new FarmModify();
				m.setVisible(true);
				
			}
		});
		mnFarm.add(mntmModifyFarm);
		
		JMenuItem mntmDeleteFarm = new JMenuItem("Delete Farm");
		mnFarm.add(mntmDeleteFarm);
		
		JMenu mnBatiment = new JMenu("Batiment");
		menuBar.add(mnBatiment);
		
		JMenuItem mntmAddBatiment = new JMenuItem("Add Batiment");
		mnBatiment.add(mntmAddBatiment);
		
		JMenuItem mntmModifyBatiment = new JMenuItem("Modify Batiment");
		mnBatiment.add(mntmModifyBatiment);
		
		JMenuItem mntmDeleteBatiment = new JMenuItem("Delete Batiment");
		mnBatiment.add(mntmDeleteBatiment);
		
		JMenu mnSheeps = new JMenu("Sheeps");
		menuBar.add(mnSheeps);
		
		JMenuItem mntmAddSheep = new JMenuItem("Add Sheep");
		mnSheeps.add(mntmAddSheep);
		
		JMenuItem mntmModifySheep = new JMenuItem("Modify Sheep");
		mnSheeps.add(mntmModifySheep);
		
		JMenuItem mntmDeleteSheep = new JMenuItem("Delete Sheep");
		mnSheeps.add(mntmDeleteSheep);
		
		JMenu mnEmployees = new JMenu("Employees");
		menuBar.add(mnEmployees);
		
		JMenuItem mntmAddEmployee = new JMenuItem("Add Employee");
		mnEmployees.add(mntmAddEmployee);
		
		JMenuItem mntmModifyEmployee = new JMenuItem("Modify Employee");
		mnEmployees.add(mntmModifyEmployee);
		
		JMenuItem mntmDeleteEmployee = new JMenuItem("Delete Employee");
		mnEmployees.add(mntmDeleteEmployee);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnHelp.add(mntmHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1362, 673);
		contentPane.add(tabbedPane);
		
		JPanel profilPanel = new JPanel();
		tabbedPane.addTab("           My Profil           ", null, profilPanel, null);
		profilPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(25, 11, 341, 390);
		profilPanel.add(panel_1);
		panel_1.setLayout(null);
		
		image = new JLabel();
		image.setBounds(24, 32, 285, 319);
		panel_1.add(image);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(447, 138, 782, 459);
		profilPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login        :");
		lblLogin.setBounds(93, 89, 111, 28);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password   :");
		lblPassword.setBounds(93, 168, 111, 28);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblPassword);
		
		JLabel lblEmail = new JLabel("E-mail       :");
		lblEmail.setBounds(93, 245, 111, 28);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblEmail);
		
		JLabel lblAvatar = new JLabel("Avatar       :");
		lblAvatar.setBounds(93, 321, 111, 28);
		lblAvatar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		panel.add(lblAvatar);
		
		loginField = new JTextField();
		loginField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				testApply();
			}
		});
		loginField.setBounds(408, 97, 219, 20);
		loginField.setText(admin.getLogin());
		panel.add(loginField);
		loginField.setColumns(10);
		
		emailField = new JTextField();
		emailField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				testApply();
			}
		});
		emailField.setColumns(10);
		emailField.setBounds(408, 253, 219, 20);
		loginField.setText(admin.getEmail());
		panel.add(emailField);
		
		path = new JTextField();
		path.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				testApply();
			}
		});
		path.setColumns(10);
		path.setBounds(408, 329, 219, 20);
		panel.add(path);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				testApply();
			}
		});
		passwordField.setBounds(408, 176, 219, 20);
		panel.add(passwordField);
		
		JButton btnBrowse = new JButton("Browse");
		
		btnBrowse.setBounds(637, 328, 89, 23);
		panel.add(btnBrowse);
		
		btnApply = new JButton("Apply");
		btnApply.setEnabled(false);
		
		
		btnApply.setBounds(352, 399, 89, 23);
		panel.add(btnApply);
		
		JLabel lblWelcomeAdmin = new JLabel("WELCOME ADMIN");
		lblWelcomeAdmin.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 44));
		lblWelcomeAdmin.setBounds(684, 45, 245, 43);
		profilPanel.add(lblWelcomeAdmin);
		
		JPanel farmPanel = new JPanel();
		tabbedPane.addTab("           Farms           ", null, farmPanel, null);
		farmPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(24, 49, 566, 546);
		farmPanel.add(panel_2);
		panel_2.setLayout(null);
		/*************/
		
		table = new JTable();
		list = FarmServicesDelegate.getFarms();
	    String[] s = {"Id","Name","Address","E-mail","Phone"};
		Object[][] o = new String[list.size()][5];
		//DefaultTableModel m = new DefaultTableModel();
		
		
		for(int i=0;i<list.size();i++){
			
			o[i][0]=String.valueOf(list.get(i).getIdFarm());
			o[i][1]=list.get(i).getNomFarm();
			o[i][2]=list.get(i).getAdress();
			o[i][3]=list.get(i).getMail();
			o[i][4]=list.get(i).getTelephone();
			System.out.println(i);
		}

		table.setBackground(SystemColor.activeCaption);
		
	     table.setModel(new DefaultTableModel(o,s));
	     table.getColumnModel().getColumn(0).setPreferredWidth(5);
	     table.getColumnModel().getColumn(3).setPreferredWidth(150);

	     DefaultTableModel model = (DefaultTableModel)table.getModel();
	     model.fireTableDataChanged();
	/*	*/
		
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(false);
		table.setBounds(59, 47, 459, 309);
		
		 scrollPane = new JScrollPane(table);
		 table.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mouseClicked(MouseEvent e) {
			 		viewSelectedFarm();
			 		
			 	}
			 });
		 scrollPane.setBounds(53, 54, 459, 438);
		panel_2.add(scrollPane);
		/******/
		
		
		
		
		/************/
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(705, 49, 625, 546);
		farmPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_4.setBounds(74, 99, 477, 380);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblIdFarm = new JLabel("Id Farm       :");
		lblIdFarm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIdFarm.setBounds(48, 44, 85, 23);
		panel_4.add(lblIdFarm);
		
		JLabel lblNomFarm = new JLabel("Nom Farm    :");
		lblNomFarm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomFarm.setBounds(48, 111, 85, 23);
		panel_4.add(lblNomFarm);
		
		JLabel lblAdressFarm = new JLabel("Adress Farm :");
		lblAdressFarm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAdressFarm.setBounds(48, 178, 85, 23);
		panel_4.add(lblAdressFarm);
		
		JLabel lblPhoneFarm = new JLabel("Phone Farm  :");
		lblPhoneFarm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPhoneFarm.setBounds(48, 245, 85, 23);
		panel_4.add(lblPhoneFarm);
		
		JLabel lblFarm = new JLabel(" E-mail Farm :");
		lblFarm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFarm.setBounds(48, 312, 85, 23);
		panel_4.add(lblFarm);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBounds(198, 11, 247, 358);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		idFarmField = new JLabel("");
		idFarmField.setBounds(72, 30, 96, 21);
		panel_5.add(idFarmField);
		
		nomFarmField = new JTextField();
		nomFarmField.setBounds(10, 95, 227, 20);
		panel_5.add(nomFarmField);
		nomFarmField.setColumns(10);
		
		AdressFarmField = new JTextField();
		AdressFarmField.setColumns(10);
		AdressFarmField.setBounds(10, 167, 227, 20);
		panel_5.add(AdressFarmField);
		
		phoneFarmField = new JTextField();
		phoneFarmField.setColumns(10);
		phoneFarmField.setBounds(10, 233, 227, 20);
		panel_5.add(phoneFarmField);
		
		emailFarmField = new JTextField();
		emailFarmField.setColumns(10);
		emailFarmField.setBounds(10, 298, 227, 20);
		panel_5.add(emailFarmField);
		
		JLabel lblFarmDetails = new JLabel("Farm Details");
		lblFarmDetails.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblFarmDetails.setBounds(239, 31, 146, 26);
		panel_3.add(lblFarmDetails);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.setAdress(AdressFarmField.getText());
				f.setMail(emailFarmField.getText());
				f.setTelephone(phoneFarmField.getText());
				f.setNomFarm(nomFarmField.getText());
				FarmServicesDelegate.updateFarm(f);
				list = FarmServicesDelegate.getFarms();
				 
				
				 JOptionPane.showMessageDialog(alert, "Update Done !");
				 viewSelectedFarm();
				 
			}
		});
		btnUpdate.setBounds(89, 512, 89, 23);
		panel_3.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setAdress(AdressFarmField.getText());
				f.setMail(emailFarmField.getText());
				f.setTelephone(phoneFarmField.getText());
				f.setNomFarm(nomFarmField.getText());
				FarmServicesDelegate.deleteFarm(f);
				list = FarmServicesDelegate.getFarms();
				
				 viewSelectedFarm();
				 JOptionPane.showMessageDialog(alert, "Delete Done !");
			}
		});
		btnDelete.setBounds(267, 512, 89, 23);
		panel_3.add(btnDelete);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Farm newfarm = new Farm();
				newfarm.setAdress(AdressFarmField.getText());
				newfarm.setMail(emailFarmField.getText());
				newfarm.setTelephone(phoneFarmField.getText());
				newfarm.setNomFarm(nomFarmField.getText());
				FarmServicesDelegate.createFarm(newfarm);
				list = FarmServicesDelegate.getFarms();
				
				 viewSelectedFarm();
				 JOptionPane.showMessageDialog(alert, "Add Done !");
			}
		});
		btnAdd.setBounds(445, 512, 89, 23);
		panel_3.add(btnAdd);
		
		JPanel batimentPanel = new JPanel();
		tabbedPane.addTab("           Batiments           ", null, batimentPanel, null);
		
		JPanel employeePanel = new JPanel();
		tabbedPane.addTab("           Employees           ", null, employeePanel, null);
		
		JPanel sheepPanel = new JPanel();
		tabbedPane.addTab("           Sheeps           ", null, sheepPanel, null);
		
		
		byte[] img = admin.getPhoto();
		
		if(img != null){
			
		format=new ImageIcon(img);
        image.setIcon(format);
		}
		
		btnBrowse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser ch = new JFileChooser();
		        ch.showOpenDialog(null);
		        File f = ch.getSelectedFile();
		        fileName = f.getAbsolutePath();
		        path.setText(fileName);
                ImageHandler imgg = new ImageHandler(path.getText());
                BufferedImage v = imgg.resizeImage();
                imageUser = imgg.getImageBytes(v);
				format=new ImageIcon(v);
                image.setIcon(format);
                testApply();
			
			}
		});
		btnApply.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
							
				retypePassword r = new retypePassword(admin ,loginField.getText(), passwordField.getText(), emailField.getText(), imageUser);
				r.setVisible(true);
				
			}
		});
	}
	protected void viewSelectedFarm() {
		int id =  Integer.parseInt(table.getValueAt(table.getSelectedRow(),0).toString());
 		
 		for(Farm m : list){
 			if(m.getIdFarm()==id){
 				 f = m ;
 			}
 		}
 		idFarmField.setText(String.valueOf(f.getIdFarm()));
 		nomFarmField.setText(f.getNomFarm());
 		AdressFarmField.setText(f.getAdress());
 		phoneFarmField.setText(f.getTelephone());
 		emailFarmField.setText(f.getMail());
		
	}

	@SuppressWarnings("deprecation")
	public void testApply(){
		if(loginField.getText().isEmpty()== false){
			if(passwordField.getText().isEmpty()== false){
				if(emailField.getText().isEmpty()== false){
					if(path.getText().isEmpty()== false){
						btnApply.setEnabled(true);
					}
					
				}
			}
		}
	}
}
