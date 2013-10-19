package gui;

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
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

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
	
	 private ImageIcon format = null;
     String fileName = null;
     int s = 0;
     byte[] imageUser = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
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
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		mnFile.add(menuItem);
		
		JMenu mnFarm = new JMenu("Farm");
		menuBar.add(mnFarm);
		
		JMenuItem mntmAddFarm = new JMenuItem("Add Farm");
		mnFarm.add(mntmAddFarm);
		
		JMenuItem mntmModifyFarm = new JMenuItem("Modify Farm");
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
		panel_2.setBounds(24, 49, 607, 546);
		farmPanel.add(panel_2);
		panel_2.setLayout(null);
		/*************/
		table = new JTable();
		List<Farm> list = FarmServicesDelegate.getFarms();
		String[] s = {"Id","Name","Address"};
		Object[][] o = new String[list.size()][3];
		//DefaultTableModel m = new DefaultTableModel();
		
		
		for(int i=0;i<list.size();i++){
			
			o[i][0]=String.valueOf(list.get(i).getIdFarm());
			o[i][1]=list.get(i).getNomFarm();
			o[i][2]=list.get(i).getAdress();
			
		}
		table.setBackground(SystemColor.activeCaption);
	     table.setModel(new DefaultTableModel(o,s));
	/*	*/
		
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(59, 47, 459, 309);
		panel_2.add(table);
		/******/
		
		
		
		
		/************/
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(723, 49, 607, 546);
		farmPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel batimentPanel = new JPanel();
		tabbedPane.addTab("           Batiments           ", null, batimentPanel, null);
		
		JPanel employeePanel = new JPanel();
		tabbedPane.addTab("           Employees           ", null, employeePanel, null);
		
		JPanel sheepPanel = new JPanel();
		tabbedPane.addTab("           Sheeps           ", null, sheepPanel, null);
		
		
		byte[] img = admin.getPhoto();
		System.out.println(img);
		if(img != null){
			System.out.println("image not null");
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
                
		   /*     try{

		            File file = new File(fileName);
		            FileInputStream fs = new FileInputStream(file);
		            ByteArrayOutputStream bos = new ByteArrayOutputStream();
		            byte[] buf = new byte[1024];
		            for (int readNum; (readNum=fs.read(buf))!=-1;) {

		                bos.write(buf, 0, readNum);

		            }
		            imageUser=bos.toByteArray();

		        }catch(Exception e1){
		            JOptionPane.showMessageDialog(null, e1);
		        } 
		        */
                imageUser = imgg.getImageBytes(v);
				format=new ImageIcon(v);
                image.setIcon(format);
                testApply();
			
			}
		});
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				retypePassword r = new retypePassword(admin ,loginField.getText(), passwordField.getText(), emailField.getText(), imageUser);
				r.setVisible(true);
				
			}
		});
	}
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
