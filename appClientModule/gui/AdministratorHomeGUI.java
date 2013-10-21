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
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

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
				 Object[] possibilities = {""} ;
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
