package gui;

import gui.menu.FarmAdd;
import gui.menu.FarmModify;
import gui.messages.retypePassword;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import persistance.Admin;
import persistance.Batiment;
import persistance.Employee;
import persistance.Farm;
import persistance.Sheep;

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

import delegate.BatimentServiceDelegate;
import delegate.EmployeeServiceDelegate;
import delegate.FarmServicesDelegate;
import delegate.SheepServicesDelegate;

import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.border.LineBorder;


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
	private JTable tableFarm;
	private JButton btnApply;
	private JLabel image;
	private JScrollPane scrollPaneFarms ;
	
	 private ImageIcon format = null;
     String fileName = null;
     int s = 0;
     byte[] imageUser = null;
     private JTextField nomFarmField;
     private JTextField AdressFarmField;
     private JTextField phoneFarmField;
     private JTextField emailFarmField;
     private JLabel idFarmField ;
     private  Farm f = new Farm();
     private  List<Farm> listFarm = new ArrayList<Farm>() ;
     JFrame alert = new JFrame();
	private JLabel farmNote;
	private JTable tableBatiment;
	private JTable tableSheepB;
	private JTable tableEmployeeB;
	private JTextField capacityBatimentField;
	private JTextField FarmBatimentField;
	private List<Batiment> listBatiment= new ArrayList<Batiment>();
	private JScrollPane scrollPaneBatiments;
	private Batiment b = new Batiment() ;
	private List<Employee> listEmployeeB;
	private JScrollPane scrollPaneEmployeeB;
	private List<Sheep> listSheepB = new ArrayList<Sheep>();
	private Sheep n;
	private JLabel idBatiementField;
	private JLabel numberEmpBatiementField;
	private JLabel numberSheepBatiementField;
	private int idbatiments;
	private JTextField NameBatimentField;
	private JTable tableEmployeeE;
	private JTextField idemployeef;
	private JTextField firstnameemployeef;
	private JTextField lastNameEmployeef;
	private JTextField loginemployeef;
	private JTextField pwdemployeef;
	private JTextField addressemployeef;
	private JTextField emailemployeef;
	private JTextField cinemployeef;
	private JTextField posteemployeef;
	private JTextField batimentemployeef;
	private Employee emp;
	private JTextField phoneemployeef;
	private JScrollPane scrollPaneEmployeeA;
	private int idemp;
	private JTable tableSheeps;
	private JTextField idsheeps;
	private JTextField codesheep;
	private JTextField race;
	private JTextField sex;
	private JTextField batimentSheep;
	private JTextField datebirth;
	private JTextField dateinput;
	private JTextField dateoutput;
	private JTextField priceinput;
	private JTextField priceoutput;
	private List<Sheep> listSheeps;
	private int idsheep;
	private Sheep sheepp = new Sheep();;

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
		/************************************************************/
		tableFarm = new JTable();
		 refreshTableFarms();
		
		tableFarm.setColumnSelectionAllowed(true);
		tableFarm.setCellSelectionEnabled(false);
		tableFarm.setBounds(59, 47, 459, 309);
		
		 scrollPaneFarms = new JScrollPane(tableFarm);
		 tableFarm.addMouseListener(new MouseAdapter() {
			 	@Override
			 	public void mouseClicked(MouseEvent e) {
			 		viewSelectedFarm();
			 		
			 	}
			 });
		 scrollPaneFarms.setBounds(53, 54, 459, 438);
		panel_2.add(scrollPaneFarms);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshTableFarms();
			}
		});
		btnRefresh.setBounds(485, 11, 71, 23);
		panel_2.add(btnRefresh);
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
		
		 farmNote = new JLabel("");
		farmNote.setForeground(new Color(220, 20, 60));
		farmNote.setBounds(10, 355, 143, 14);
		panel_4.add(farmNote);
		
		JLabel lblFarmDetails = new JLabel("Farm Details");
		lblFarmDetails.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblFarmDetails.setBounds(239, 31, 146, 26);
		panel_3.add(lblFarmDetails);
		
		JButton btnUpdate = new JButton("Update");
		
		btnUpdate.setBounds(89, 512, 89, 23);
		panel_3.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		
		btnDelete.setBounds(267, 512, 89, 23);
		panel_3.add(btnDelete);
		
		JButton btnAdd = new JButton("Add");
		
		btnAdd.setBounds(445, 512, 89, 23);
		panel_3.add(btnAdd);
		
		JPanel batimentPanel = new JPanel();
		tabbedPane.addTab("           Batiments           ", null, batimentPanel, null);
		batimentPanel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(29, 67, 470, 498);
		panel_6.setBackground(new Color(255, 255, 255));
		batimentPanel.add(panel_6);
		panel_6.setLayout(null);
		
		
		/**********************Batiment *************************/
		tableBatiment = new JTable();
		refreshTableBatiements();
	/*	*/
	     tableBatiment.setColumnSelectionAllowed(true);
	     tableBatiment.setCellSelectionEnabled(false);
	     tableBatiment.setBounds(59, 47, 459, 309);
		
		scrollPaneBatiments = new JScrollPane(tableBatiment);
		
		
		scrollPaneBatiments.setBounds(19, 30, 432, 438);
		panel_6.add(scrollPaneBatiments);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(510, 67, 442, 228);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBackground(new Color(255, 255, 255));
		batimentPanel.add(panel_7);
		panel_7.setLayout(null);
		
		JScrollPane scrollPaneSheepB = new JScrollPane(tableSheepB);
		scrollPaneSheepB.setBounds(10, 11, 422, 206);
		panel_7.add(scrollPaneSheepB);
		
		tableSheepB = new JTable();
		tableSheepB.setColumnSelectionAllowed(true);
		scrollPaneSheepB.setViewportView(tableSheepB);
		tableSheepB.setBackground(new Color(192, 192, 192));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(510, 329, 442, 236);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBackground(new Color(255, 255, 255));
		batimentPanel.add(panel_8);
		panel_8.setLayout(null);
		
		tableEmployeeB = new JTable();
		tableEmployeeB.setColumnSelectionAllowed(true);
		tableEmployeeB.setBackground(new Color(192, 192, 192));
		tableEmployeeB.setCellSelectionEnabled(false);
		tableEmployeeB.setBounds(59, 47, 459, 309);
		
		
		scrollPaneEmployeeB = new JScrollPane(tableEmployeeB);
		scrollPaneEmployeeB.setBounds(10, 11, 422, 214);
		panel_8.add(scrollPaneEmployeeB);
		
		tableBatiment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				viewSelectedBatiment();
				System.out.println("clickeeeeeeeeeeeeeeeed");
			}
		});

		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(1000, 67, 328, 498);
		panel_9.setBackground(new Color(255, 255, 255));
		batimentPanel.add(panel_9);
		panel_9.setLayout(null);
		
		idBatiementField = new JLabel("");
		idBatiementField.setBackground(new Color(47, 79, 79));
		idBatiementField.setBounds(188, 91, 87, 14);
		panel_9.add(idBatiementField);
		
		JLabel lblDetails = new JLabel("DETAILS");
		lblDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDetails.setBounds(120, 11, 87, 32);
		panel_9.add(lblDetails);
		
		JLabel lblIdBatiement = new JLabel("Id  Building           :");
		lblIdBatiement.setBounds(48, 91, 94, 14);
		panel_9.add(lblIdBatiement);
		
		JLabel lblCapasity = new JLabel("Capacity               :");
		lblCapasity.setBounds(48, 196, 94, 14);
		panel_9.add(lblCapasity);
		
		JLabel lblFarm_1 = new JLabel("Farm                     :");
		lblFarm_1.setBounds(48, 257, 94, 14);
		panel_9.add(lblFarm_1);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number :");
		lblEmployeeNumber.setBounds(48, 321, 94, 14);
		panel_9.add(lblEmployeeNumber);
		
		JLabel lblSheepNumber = new JLabel("Sheep Number      :");
		lblSheepNumber.setBounds(48, 381, 94, 14);
		panel_9.add(lblSheepNumber);
		
		capacityBatimentField = new JTextField();
		capacityBatimentField.setBounds(188, 193, 86, 20);
		panel_9.add(capacityBatimentField);
		capacityBatimentField.setColumns(10);
		
		FarmBatimentField = new JTextField();
		FarmBatimentField.setBounds(188, 254, 86, 20);
		panel_9.add(FarmBatimentField);
		FarmBatimentField.setColumns(10);
		
		numberEmpBatiementField = new JLabel("");
		numberEmpBatiementField.setBackground(new Color(47, 79, 79));
		numberEmpBatiementField.setBounds(188, 321, 87, 14);
		panel_9.add(numberEmpBatiementField);
		
		numberSheepBatiementField = new JLabel("");
		numberSheepBatiementField.setBackground(new Color(47, 79, 79));
		numberSheepBatiementField.setBounds(188, 381, 87, 14);
		panel_9.add(numberSheepBatiementField);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Batiment b = BatimentServiceDelegate.findBatimentById(idbatiments);
				 b.setName_batiment(NameBatimentField.getText());
				 b.setCapacity(Integer.parseInt(capacityBatimentField.getText()));
				 BatimentServiceDelegate.updateBatiment(b);
				 JOptionPane.showMessageDialog(alert, "Update Done !");
				 refreshTableBatiements();
			}
		});
		btnUpdate_1.setBounds(10, 448, 89, 23);
		panel_9.add(btnUpdate_1);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Batiment b = BatimentServiceDelegate.findBatimentById(idbatiments);
				BatimentServiceDelegate.deleteBatiment(b);
				JOptionPane.showMessageDialog(alert, "Delete Done !");
				refreshTableBatiements();
			}
		});
		btnDelete_1.setBounds(118, 448, 89, 23);
		panel_9.add(btnDelete_1);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Batiment b = new Batiment();
				 b.setName_batiment(NameBatimentField.getText());
				 b.setCapacity(Integer.parseInt(capacityBatimentField.getText()));
				 
				 
				 int i = 0 ;
				 List<Farm> f = FarmServicesDelegate.getFarms();
				 Object[] possibilities = new String[f.size()] ;
				 for (Farm ff : f){
				 possibilities[i] = ff.getNomFarm();
				 i++;
				 }
				 String s = (String)JOptionPane.showInputDialog(
				                     alert,
				                     "Complete the sentence:\n"
				                     + "\"Green eggs and...\"",
				                     "Customized Dialog",
				                     JOptionPane.PLAIN_MESSAGE,
				                     null,
				                     possibilities,
				                     "ham");

				 //If a string was returned, say so.
				 if ((s == null) && (s.length() < 0)) {
					 JOptionPane.showMessageDialog(alert, "Not found!");
				     return;
				 }
				 else{Farm h = new Farm();
					 for (Farm fff : f){
						 if(s == fff.getNomFarm()){
							  h = fff ;
						 }
						 
						 }
					 
				 b.setFarm(h);
				 BatimentServiceDelegate.createBatiment(b);
				 JOptionPane.showMessageDialog(alert, "Add Done !");
				 refreshTableBatiements();
				 }
			}
		});
		btnAdd_1.setBounds(229, 448, 89, 23);
		panel_9.add(btnAdd_1);
		
		JLabel lblName = new JLabel("Name                   :");
		lblName.setBounds(48, 146, 94, 14);
		panel_9.add(lblName);
		
		NameBatimentField = new JTextField();
		NameBatimentField.setBounds(188, 143, 86, 20);
		panel_9.add(NameBatimentField);
		NameBatimentField.setColumns(10);
		
		JPanel employeePanel = new JPanel();
		tabbedPane.addTab("           Employees           ", null, employeePanel, null);
		employeePanel.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		panel_10.setBounds(744, 67, 549, 534);
		employeePanel.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id Employee");
		lblNewLabel.setBounds(48, 118, 66, 21);
		panel_10.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setBounds(48, 171, 66, 21);
		panel_10.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setBounds(48, 226, 66, 21);
		panel_10.add(lblLastname);
		
		JLabel lblLogin_1 = new JLabel("Login");
		lblLogin_1.setBounds(48, 277, 66, 21);
		panel_10.add(lblLogin_1);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setBounds(48, 332, 66, 21);
		panel_10.add(lblPassword_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(320, 121, 54, 21);
		panel_10.add(lblAddress);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(320, 165, 54, 21);
		panel_10.add(lblEmail_1);
		
		JLabel lblCin = new JLabel("Cin");
		lblCin.setBounds(320, 212, 54, 21);
		panel_10.add(lblCin);
		
		JLabel lblPoste = new JLabel("Poste");
		lblPoste.setBounds(320, 257, 54, 21);
		panel_10.add(lblPoste);
		
		JLabel lblBatiment = new JLabel("Batiment");
		lblBatiment.setBounds(320, 304, 54, 21);
		panel_10.add(lblBatiment);
		
		idemployeef = new JTextField();
		idemployeef.setBounds(160, 118, 86, 20);
		panel_10.add(idemployeef);
		idemployeef.setColumns(10);
		
		firstnameemployeef = new JTextField();
		firstnameemployeef.setBounds(160, 171, 86, 20);
		panel_10.add(firstnameemployeef);
		firstnameemployeef.setColumns(10);
		
		lastNameEmployeef = new JTextField();
		lastNameEmployeef.setBounds(160, 226, 86, 20);
		panel_10.add(lastNameEmployeef);
		lastNameEmployeef.setColumns(10);
		
		loginemployeef = new JTextField();
		loginemployeef.setColumns(10);
		loginemployeef.setBounds(160, 277, 86, 20);
		panel_10.add(loginemployeef);
		
		pwdemployeef = new JTextField();
		pwdemployeef.setColumns(10);
		pwdemployeef.setBounds(160, 332, 86, 20);
		panel_10.add(pwdemployeef);
		
		addressemployeef = new JTextField();
		addressemployeef.setColumns(10);
		addressemployeef.setBounds(412, 118, 86, 20);
		panel_10.add(addressemployeef);
		
		emailemployeef = new JTextField();
		emailemployeef.setColumns(10);
		emailemployeef.setBounds(412, 165, 86, 20);
		panel_10.add(emailemployeef);
		
		cinemployeef = new JTextField();
		cinemployeef.setColumns(10);
		cinemployeef.setBounds(412, 212, 86, 20);
		panel_10.add(cinemployeef);
		
		posteemployeef = new JTextField();
		posteemployeef.setColumns(10);
		posteemployeef.setBounds(412, 257, 86, 20);
		panel_10.add(posteemployeef);
		
		batimentemployeef = new JTextField();
		batimentemployeef.setColumns(10);
		batimentemployeef.setBounds(412, 301, 86, 20);
		panel_10.add(batimentemployeef);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(48, 390, 46, 14);
		panel_10.add(lblPhone);
		
		phoneemployeef = new JTextField();
		phoneemployeef.setBounds(160, 387, 86, 20);
		panel_10.add(phoneemployeef);
		phoneemployeef.setColumns(10);
		
		JLabel lblEmployeeDetails = new JLabel("EMPLOYEE DETAILS");
		lblEmployeeDetails.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblEmployeeDetails.setBounds(188, 36, 173, 34);
		panel_10.add(lblEmployeeDetails);
		
		JButton btnUpdate_2 = new JButton("Update");
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						 Employee emp = EmployeeServiceDelegate.findEmployeeById(idemp);
						    emp.setIdUser(Integer.parseInt(idemployeef.getText()));
					 		emp.setFirstName(firstnameemployeef.getText());
					 		emp.setLastName(lastNameEmployeef.getText());
					 		emp.setLogin(loginemployeef.getText());
					 		emp.setPwd(pwdemployeef.getText());
					 		emp.setAdress(addressemployeef.getText());
					 		emp.setEmail(emailemployeef.getText());
					 		emp.setCin(cinemployeef.getText());
					 		emp.setPoste(posteemployeef.getText());
					 		emp.setPhone(phoneemployeef.getText());
					 		EmployeeServiceDelegate.updateEmployee(emp);
					 		JOptionPane.showMessageDialog(alert, "Update Done !");
					 		refreshTableEmployeef();
			}
		});
		btnUpdate_2.setBounds(70, 466, 89, 23);
		panel_10.add(btnUpdate_2);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee ee = EmployeeServiceDelegate.findEmployeeById(idemp);
				EmployeeServiceDelegate.deleteEmployee(ee);
				JOptionPane.showMessageDialog(alert, "Delete Done !");
				refreshTableEmployeef();
			}
		});
		btnDelete_2.setBounds(229, 466, 89, 23);
		panel_10.add(btnDelete_2);
		
		JButton btnAdd_2 = new JButton("Add");
		btnAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Employee b = new Employee();

				
				 b.setFirstName(firstnameemployeef.getText());
				 b.setLastName(lastNameEmployeef.getText());
				 b.setLogin(loginemployeef.getText());
				 b.setPwd(pwdemployeef.getText());
				 b.setPhone(phoneemployeef.getText());
				 b.setAdress(addressemployeef.getText());
				 b.setEmail(emailemployeef.getText());
				 b.setPoste(posteemployeef.getText());
				 b.setCin(cinemployeef.getText());
				 
				 
				 int i = 0 ;
				 List<Batiment> f = BatimentServiceDelegate.getBatiment();
				 Object[] possibilities = new String[f.size()] ;
				 for (Batiment ff : f){
				 possibilities[i] = ff.getName_batiment();
				 i++;
				 }
				 String s = (String)JOptionPane.showInputDialog(
				                     alert,
				                     "Choose:\n"
				                     + "\"Batiment...\"",
				                     "Customized Dialog",
				                     JOptionPane.PLAIN_MESSAGE,
				                     null,
				                     possibilities,
				                     "ham");

				 //If a string was returned, say so.
				 if ((s == null) && (s.length() < 0)) {
					 JOptionPane.showMessageDialog(alert, "Not found!");
				     return;
				 }
				 else{Batiment h = new Batiment();
					 for (Batiment fff : f){
						 if(s == fff.getName_batiment()){
							  h = fff ;
						 }
						 
						 }
					 
				// b.setFarm(h);
					 List<Employee> bb = new ArrayList<Employee>();
					 bb.add(b);
				     BatimentServiceDelegate.EmployeeToBatiment(h, bb);
				     JOptionPane.showMessageDialog(alert, "Add Done !");
				     refreshTableEmployeef();
				 }
			}
		});
		btnAdd_2.setBounds(388, 466, 89, 23);
		panel_10.add(btnAdd_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(62, 67, 620, 534);
		employeePanel.add(panel_11);
		panel_11.setLayout(null);
		
		scrollPaneEmployeeA = new JScrollPane();
		
		tableEmployeeE = new JTable();
		tableEmployeeE.setColumnSelectionAllowed(true);
		tableEmployeeE.setBackground(new Color(192, 192, 192));
		tableEmployeeE.setCellSelectionEnabled(false);
		tableEmployeeE.setBounds(59, 47, 459, 309);
		refreshTableEmployeef();
		scrollPaneEmployeeA.setViewportView(tableEmployeeE);
		scrollPaneEmployeeA.setBounds(61, 34, 501, 466);
		panel_11.add(scrollPaneEmployeeA);
		refreshTableEmployeef();
		tableEmployeeE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				viewSelectedEmployeeE();

			}
		});
		JPanel sheepPanel = new JPanel();
		tabbedPane.addTab("           Sheeps           ", null, sheepPanel, null);
		sheepPanel.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel_12.setBounds(41, 60, 717, 505);
		sheepPanel.add(panel_12);
		panel_12.setLayout(null);
		
		JScrollPane scrollPaneSheeps = new JScrollPane();
		scrollPaneSheeps.setBounds(10, 33, 697, 438);
		panel_12.add(scrollPaneSheeps);
		
		tableSheeps = new JTable();
		tableSheeps.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				viewSelectedSheeps();
			}
		});
		scrollPaneSheeps.setViewportView(tableSheeps);
		refreshTableSheeps();
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(813, 60, 520, 505);
		sheepPanel.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblSheepDetails = new JLabel("SHEEP DETAILS");
		lblSheepDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSheepDetails.setBounds(239, 37, 129, 38);
		panel_13.add(lblSheepDetails);
		
		JLabel lblIdSheep = new JLabel("Id Sheep");
		lblIdSheep.setBounds(72, 121, 70, 14);
		panel_13.add(lblIdSheep);
		
		JLabel lblCodeSheep = new JLabel("Code Sheep");
		lblCodeSheep.setBounds(72, 181, 70, 14);
		panel_13.add(lblCodeSheep);
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setBounds(72, 246, 70, 14);
		panel_13.add(lblRace);
		
		JLabel lblSex = new JLabel("sex");
		lblSex.setBounds(72, 303, 70, 14);
		panel_13.add(lblSex);
		
		JLabel lblBatiment_1 = new JLabel("batiment");
		lblBatiment_1.setBounds(72, 366, 70, 14);
		panel_13.add(lblBatiment_1);
		
		JLabel lblDateBirth = new JLabel("Date Birth");
		lblDateBirth.setBounds(297, 121, 70, 14);
		panel_13.add(lblDateBirth);
		
		JLabel lblDateInput = new JLabel("Date input");
		lblDateInput.setBounds(297, 181, 70, 14);
		panel_13.add(lblDateInput);
		
		JLabel lblDateOutput = new JLabel("Date output");
		lblDateOutput.setBounds(297, 246, 70, 14);
		panel_13.add(lblDateOutput);
		
		JLabel lblPriceInput = new JLabel("Price input");
		lblPriceInput.setBounds(297, 303, 70, 14);
		panel_13.add(lblPriceInput);
		
		JLabel lblPriceOutput = new JLabel("Price output");
		lblPriceOutput.setBounds(297, 366, 70, 14);
		panel_13.add(lblPriceOutput);
		
		idsheeps = new JTextField();
		idsheeps.setBounds(163, 118, 86, 20);
		panel_13.add(idsheeps);
		idsheeps.setColumns(10);
		
		codesheep = new JTextField();
		codesheep.setColumns(10);
		codesheep.setBounds(163, 178, 86, 20);
		panel_13.add(codesheep);
		
		race = new JTextField();
		race.setColumns(10);
		race.setBounds(163, 243, 86, 20);
		panel_13.add(race);
		
		sex = new JTextField();
		sex.setColumns(10);
		sex.setBounds(163, 300, 86, 20);
		panel_13.add(sex);
		
		batimentSheep = new JTextField();
		batimentSheep.setColumns(10);
		batimentSheep.setBounds(163, 363, 86, 20);
		panel_13.add(batimentSheep);
		
		datebirth = new JTextField();
		datebirth.setColumns(10);
		datebirth.setBounds(393, 118, 86, 20);
		panel_13.add(datebirth);
		
		dateinput = new JTextField();
		dateinput.setColumns(10);
		dateinput.setBounds(393, 178, 86, 20);
		panel_13.add(dateinput);
		
		dateoutput = new JTextField();
		dateoutput.setColumns(10);
		dateoutput.setBounds(393, 243, 86, 20);
		panel_13.add(dateoutput);
		
		priceinput = new JTextField();
		priceinput.setColumns(10);
		priceinput.setBounds(393, 300, 86, 20);
		panel_13.add(priceinput);
		
		priceoutput = new JTextField();
		priceoutput.setColumns(10);
		priceoutput.setBounds(393, 363, 86, 20);
		panel_13.add(priceoutput);
		
		JButton btnUpdate_3 = new JButton("Update");
		btnUpdate_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sheep sheep = SheepServicesDelegate.findSheepById(idsheep);
				sheep.setCode_sheep(Integer.parseInt(codesheep.getText()));
				sheep.setRace_sheep(race.getText());
				sheep.setSexe_sheep(sex.getText());
				sheep.setPrice_input(Float.parseFloat(priceinput.getText()));
				sheep.setPrice_output(Float.parseFloat(priceoutput.getText()));
				DateFormat birth = new SimpleDateFormat("yyy/MM/dd");
				try {
					sheep.setDate_birth(birth.parse(datebirth.getText()));
					sheep.setDate_date_input(birth.parse(dateinput.getText()));
					sheep.setDate_output(birth.parse(dateoutput.getText()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				SheepServicesDelegate.updateSheep(sheep);
				JOptionPane.showMessageDialog(alert,"Update done");
				refreshTableSheeps();
				
			}
		});
		btnUpdate_3.setBounds(53, 447, 89, 23);
		panel_13.add(btnUpdate_3);
		
		JButton btnDelete_3 = new JButton("Delete");
		btnDelete_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sheep sheep = SheepServicesDelegate.findSheepById(idsheep);
				SheepServicesDelegate.deleteSheep(sheep);
				JOptionPane.showMessageDialog(alert, "Delete Done !");
				refreshTableSheeps();
			}
		});
		btnDelete_3.setBounds(215, 447, 89, 23);
		panel_13.add(btnDelete_3);
		
		JButton btnAdd_3 = new JButton("Add");
		btnAdd_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sheep sheep = new Sheep();

				
				sheep.setCode_sheep(Integer.parseInt(codesheep.getText()));
				sheep.setRace_sheep(race.getText());
				sheep.setSexe_sheep(sex.getText());
				sheep.setPrice_input(Float.parseFloat(priceinput.getText()));
				sheep.setPrice_output(Float.parseFloat(priceoutput.getText()));
				DateFormat birth = new SimpleDateFormat("yyy/MM/dd");
				try {
					sheep.setDate_birth(birth.parse(datebirth.getText()));
					sheep.setDate_date_input(birth.parse(dateinput.getText()));
					sheep.setDate_output(birth.parse(dateoutput.getText()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				 
				 int i = 0 ;
				 List<Batiment> f = BatimentServiceDelegate.getBatiment();
				 Object[] possibilities = new String[f.size()] ;
				 for (Batiment ff : f){
				 possibilities[i] = ff.getName_batiment();
				 i++;
				 }
				 String s = (String)JOptionPane.showInputDialog(
				                     alert,
				                     "Choose:\n"
				                     + "\"Batiment...\"",
				                     "Customized Dialog",
				                     JOptionPane.PLAIN_MESSAGE,
				                     null,
				                     possibilities,
				                     "ham");

				 //If a string was returned, say so.
				 if ((s == null) && (s.length() < 0)) {
					 JOptionPane.showMessageDialog(alert, "Not found!");
				     return;
				 }
				 else{Batiment h = new Batiment();
					 for (Batiment fff : f){
						 if(s == fff.getName_batiment()){
							  h = fff ;
						 }
						 
						 }
					 
				// b.setFarm(h);
					 List<Sheep> bb = new ArrayList<Sheep>();
					 bb.add(sheep);
				     BatimentServiceDelegate.SheepToBatiment(h, bb);
				     JOptionPane.showMessageDialog(alert, "Add Done !");
				     refreshTableSheeps();
				 }
			}
		});
		btnAdd_3.setBounds(382, 447, 89, 23);
		panel_13.add(btnAdd_3);
		
		
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
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(f.getIdFarm());
				viewSelectedFarm();
				
				 FarmServicesDelegate.deleteFarm(f);
				 JOptionPane.showMessageDialog(alert, "Delete Done !");
				 refreshTableFarms();
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Farm newfarm = new Farm();
				if(verifyEmail(emailFarmField.getText())&&verifyPhone(phoneFarmField.getText())){
				newfarm.setAdress(AdressFarmField.getText());
				newfarm.setMail(emailFarmField.getText());
				newfarm.setTelephone(phoneFarmField.getText());
				newfarm.setNomFarm(nomFarmField.getText());
				FarmServicesDelegate.createFarm(newfarm);			
				JOptionPane.showMessageDialog(alert, "Add Done !");
				refreshTableFarms();
				}else{farmNote.setText("*E-mail or Phone not valide...");}
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifyEmail(emailFarmField.getText())&&verifyPhone(phoneFarmField.getText())){
				f.setAdress(AdressFarmField.getText());
				f.setMail(emailFarmField.getText());
				f.setTelephone(phoneFarmField.getText());
				f.setNomFarm(nomFarmField.getText());
				FarmServicesDelegate.updateFarm(f);				
				JOptionPane.showMessageDialog(alert, "Update Done !");	 
				refreshTableFarms();
				}else{farmNote.setText("*E-mail or Phone not valide...");}
			}
		});
	}
	
	/*******/
	protected boolean verifyPhone(String phone) {
		if(phone.matches("[0-9]*")){
			return true ;
		}else{return false;}
	}

	protected boolean verifyEmail(String email) {
			if ((email.contains(" ") == false) && (email.matches(".+@.+\\.[a-z]+")))
			{return true;
		}else{	return false;}
	}
	// refresh tableFarm Farms in farm profil
	protected void refreshTableFarms() {
		listFarm = FarmServicesDelegate.getFarms();
		 String[] s = {"Id","Name","Address","E-mail","Phone"};
			Object[][] o = new String[listFarm.size()][5];	
			for(int i=0;i<listFarm.size();i++){
				o[i][0]=String.valueOf(listFarm.get(i).getIdFarm());
				o[i][1]=listFarm.get(i).getNomFarm();
				o[i][2]=listFarm.get(i).getAdress();
				o[i][3]=listFarm.get(i).getMail();
				o[i][4]=listFarm.get(i).getTelephone();
				System.out.println(i);
			}
		     tableFarm.setModel(new DefaultTableModel(o,s));
		     tableFarm.setBackground(SystemColor.activeCaption);
		     tableFarm.getColumnModel().getColumn(0).setPreferredWidth(5);
		     tableFarm.getColumnModel().getColumn(3).setPreferredWidth(150);

		     DefaultTableModel model = (DefaultTableModel)tableFarm.getModel();
		     model.fireTableDataChanged();
		
	}
	protected void refreshTableBatiements(){
		listBatiment = BatimentServiceDelegate.getBatiment();
	    String[] s1 = {"Id","Name","Farm"};
		Object[][] o1 = new String[listBatiment.size()][3];
		for(int i=0;i<listBatiment.size();i++){	
			//System.out.println(listBatiment.get(i).getFarm().getNomFarm());
			o1[i][0]=String.valueOf(listBatiment.get(i).getId_batiment());
			o1[i][1]=listBatiment.get(i).getName_batiment();
			o1[i][2]=listBatiment.get(i).getFarm().getNomFarm();
			
		}
		tableBatiment.setModel(new DefaultTableModel(o1,s1));
		tableBatiment.setBackground(SystemColor.activeCaption);
		tableBatiment.getColumnModel().getColumn(0).setPreferredWidth(5);
		tableBatiment.getColumnModel().getColumn(1).setPreferredWidth(150);
	     DefaultTableModel model1 = (DefaultTableModel)tableBatiment.getModel();
	     model1.fireTableDataChanged();
	}
	/**********************************/
	protected void refreshTableEmployeeBatiment(){
		listEmployeeB = EmployeeServiceDelegate.getEmployee();
	    String[] s1 = {"Id","First Name","Last Name","E-Mail","Cin","Poste","Batiment"};
		Object[][] o1 = new String[listEmployeeB.size()][8];
		for(int i=0;i<listEmployeeB.size();i++){	
			System.out.println(listEmployeeB.get(i).getAdress());
			o1[i][0]=String.valueOf(listEmployeeB.get(i).getIdUser());
			o1[i][1]=listEmployeeB.get(i).getFirstName();
			o1[i][3]=listEmployeeB.get(i).getLastName();
			o1[i][4]=listEmployeeB.get(i).getEmail();
			o1[i][5]=listEmployeeB.get(i).getCin();
			o1[i][6]=listEmployeeB.get(i).getPoste();
			o1[i][7]=listEmployeeB.get(i).getBatiment().getName_batiment();
			
		}
		tableEmployeeB.setModel(new DefaultTableModel(o1,s1));
		tableEmployeeB.setBackground(SystemColor.activeCaption);
		DefaultTableModel model1 = (DefaultTableModel)tableEmployeeB.getModel();
	     model1.fireTableDataChanged();
	}

	/*********************refresh SHeep batiement ************/
	
	protected void refreshTableSheepBatiment(){
		listSheepB = SheepServicesDelegate.getSheeps();
	    String[] s1 = {"Id","Code","Race","Remarque"};
		Object[][] o1 = new String[listEmployeeB.size()][4];
		for(int i=0;i<listEmployeeB.size();i++){	
			System.out.println(listSheepB.get(i).getRace_sheep());
			o1[i][0]=String.valueOf(listSheepB.get(i).getId());
			o1[i][1]=String.valueOf(listSheepB.get(i).getCode_sheep());
			o1[i][2]=String.valueOf(listSheepB.get(i).getRace_sheep());
			o1[i][3]=String.valueOf(listSheepB.get(i).getRemarque());			
		}
		tableSheepB.setModel(new DefaultTableModel(o1,s1));
		tableSheepB.setBackground(SystemColor.activeCaption);
		DefaultTableModel model1 = (DefaultTableModel)tableSheepB.getModel();
	     model1.fireTableDataChanged();
	     System.out.println("sheep table");
	}
	
/*********************refresh employee profil table ************/
	
	protected void refreshTableEmployeef(){
		listEmployeeB = EmployeeServiceDelegate.getEmployee();
	    String[] s1 = {"Id","FirstName","LasteName","Login","Password","Email","Adress","Poste","Batiment"};
		Object[][] o1 = new String[listEmployeeB.size()][9];
		for(int i=0;i<listEmployeeB.size();i++){	
			
			o1[i][0]=String.valueOf(listEmployeeB.get(i).getIdUser());
			o1[i][1]=String.valueOf(listEmployeeB.get(i).getFirstName());
			o1[i][2]=String.valueOf(listEmployeeB.get(i).getLastName());
			o1[i][3]=String.valueOf(listEmployeeB.get(i).getLogin());
			o1[i][4]=String.valueOf(listEmployeeB.get(i).getPwd());
			o1[i][5]=String.valueOf(listEmployeeB.get(i).getEmail());
			o1[i][6]=String.valueOf(listEmployeeB.get(i).getAdress());
			o1[i][7]=String.valueOf(listEmployeeB.get(i).getPoste());
			o1[i][8]=String.valueOf(listEmployeeB.get(i).getBatiment().getName_batiment());
		}
		tableEmployeeE.setModel(new DefaultTableModel(o1,s1));
		tableEmployeeE.setBackground(SystemColor.activeCaption);
		DefaultTableModel model1 = (DefaultTableModel)tableEmployeeE.getModel();
	     model1.fireTableDataChanged();
	     System.out.println("Employeeees table");
	}
	
	protected void viewSelectedEmployeeE() {
		
		idemp = Integer.parseInt(tableEmployeeE.getValueAt(tableEmployeeE.getSelectedRow(),0).toString());
		System.out.println(idemp);
		listEmployeeB = EmployeeServiceDelegate.getEmployee();
 		for(Employee m : listEmployeeB){
 			if(m.getIdUser()==idemp){
 				emp = m;
 			}
 		}
 		
 		idemployeef.setText(String.valueOf(emp.getIdUser()));
 		firstnameemployeef.setText(emp.getFirstName());
 		lastNameEmployeef.setText(emp.getLastName());
 		loginemployeef.setText(emp.getLogin());
 		pwdemployeef.setText(emp.getPwd());
 		addressemployeef.setText(emp.getAdress());
 		emailemployeef.setText(emp.getEmail());
 		cinemployeef.setText(emp.getCin());
 		posteemployeef.setText(emp.getPoste());
 		phoneemployeef.setText(emp.getPhone());
 		batimentemployeef.setText(emp.getBatiment().getName_batiment());
 		refreshTableEmployeef();
	}
	
	
	protected void refreshTableSheeps(){
		listSheeps = SheepServicesDelegate.getSheeps();
	    String[] s1 = {"Id","Code Sheep","Sex","Race","Price input","Price output","Date input","Date output","Batiment"};
		Object[][] o1 = new String[listSheeps.size()][9];
		for(int i=0;i<listSheeps.size();i++){	
			
			o1[i][0]=String.valueOf(listSheeps.get(i).getId());
			o1[i][1]=String.valueOf(listSheeps.get(i).getCode_sheep());
			o1[i][2]=String.valueOf(listSheeps.get(i).getSexe_sheep());
			o1[i][3]=String.valueOf(listSheeps.get(i).getRace_sheep());
			o1[i][4]=String.valueOf(listSheeps.get(i).getPrice_input());
			o1[i][5]=String.valueOf(listSheeps.get(i).getPrice_output());
			o1[i][6]=String.valueOf(listSheeps.get(i).getDate_date_input());
			o1[i][7]=String.valueOf(listSheeps.get(i).getDate_output());
			o1[i][8]=String.valueOf(listSheeps.get(i).getBatiment().getName_batiment());
		}
		tableSheeps.setModel(new DefaultTableModel(o1,s1));
		tableSheeps.setBackground(SystemColor.activeCaption);
		DefaultTableModel model1 = (DefaultTableModel)tableSheeps.getModel();
	     model1.fireTableDataChanged();
	     System.out.println("Sheep refresh table");
	}
	
protected void viewSelectedSheeps() {
		
		idsheep = Integer.parseInt(tableSheeps.getValueAt(tableSheeps.getSelectedRow(),0).toString());
		System.out.println(idsheep);
		listSheeps = SheepServicesDelegate.getSheeps();
 		for(Sheep m : listSheeps){
 			if(m.getId()==idsheep){
 				sheepp = m;
 			}
 		}
 		
 		idsheeps.setText(String.valueOf(sheepp.getId()));
 		codesheep.setText(String.valueOf(sheepp.getCode_sheep()));
 		race.setText(sheepp.getRace_sheep());
 		sex.setText(sheepp.getSexe_sheep());
 		dateinput.setText(String.valueOf(sheepp.getDate_date_input()));
 		dateoutput.setText(String.valueOf(sheepp.getDate_output()));
 		priceinput.setText(String.valueOf(sheepp.getPrice_input()));
 		priceoutput.setText(String.valueOf(sheepp.getPrice_output()));
 		datebirth.setText(String.valueOf(sheepp.getDate_birth()));
 	//	remarquesheep.setText(sheepp.getRemarque());
 		batimentSheep.setText(sheepp.getBatiment().getName_batiment());
 		refreshTableSheeps();
	}
	
	protected void viewSelectedFarm() {
		int id =  Integer.parseInt(tableFarm.getValueAt(tableFarm.getSelectedRow(),0).toString());
 		
 		for(Farm m : listFarm){
 			if(m.getIdFarm()==id){
 				 f = m ;
 			}
 			idFarmField.setText(String.valueOf(f.getIdFarm()));
 			nomFarmField.setText(f.getNomFarm());
 			AdressFarmField.setText(f.getAdress());
 			phoneFarmField.setText(f.getTelephone());
 			emailFarmField.setText(f.getMail());
 			
 		}
 		
		
	}
	
	protected void viewSelectedBatiment() {
		idbatiments = Integer.parseInt(tableBatiment.getValueAt(tableBatiment.getSelectedRow(),0).toString());
		System.out.println(idbatiments);
		listBatiment = BatimentServiceDelegate.getBatiment();
 		for(Batiment m : listBatiment){
 			if(m.getId_batiment()==idbatiments){b = m;}
 			
 			refreshTableEmployeeBatiment();
 	 	    refreshTableSheepBatiment();
 	 	  idBatiementField.setText(String.valueOf(b.getId_batiment()));
 	 	  capacityBatimentField.setText(String.valueOf(b.getCapacity()));
 	 	  NameBatimentField.setText(b.getName_batiment());
 	 	  FarmBatimentField.setText(b.getFarm().getNomFarm());
 	 	//  System.out.println(m.getEmployee().size());
 	 	  numberEmpBatiementField.setText(String.valueOf(tableEmployeeB.getRowCount()));
 	 	  numberSheepBatiementField.setText(String.valueOf(tableSheepB.getRowCount()));
 		}		
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
