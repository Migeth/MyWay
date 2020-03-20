package com.ecetech.b2.myway.gui;
import com.ecetech.b2.myway.gui.GUI_Welcome;

import static com.teamdev.jxbrowser.engine.RenderingMode.*;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.view.swing.BrowserView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;

import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;


public class MapView {
	
	public JFrame framebis;
	private JPanel contentPane;
	private static Browser browser;
	private static BrowserView view;
	public int cmboitem;
	public int cmboitem1;


	/**
	 * Launch the application.
	 * @param cmboitem12 
	 * @param cmboitem2
	 */
	public static void main(int combo_item, int combo_item1) {
		
		EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                .licenseKey("1BNDHFSC1FUA4QL4YSMMVPA78J2FCY4IP0VUWG40FYC062XP91KGBCO6XV98K69O5KLA64")
                .build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        
        SwingUtilities.invokeLater(() -> {
            // Creating Swing component for rendering web content
            // loaded in the given Browser instance.
            view = BrowserView.newInstance(browser);
    		//browser.navigation().loadUrl("http://localhost:8888/GoogleMap/mapfile.html?_ijt=smjkmol7bafr50d5s8kl4fu89");
    		
        });
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					MapView window = new MapView(combo_item, combo_item1);
					window.framebis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 * @param combo_item1 
	 * @param combo_item 
	 */
	public MapView(int combo_item, int combo_item1) {
		
		/**
		 * Array list with two entries storing the coordinates(Latitude, Longitude) of each site in the destList
		 */
		double coordonnees [][] = {{48.853830, 2.289402}, {48.851126, 2.288573}, {48.851698, 2.287074}, {48.852005, 2.286121}, {48.851394, 2.286625}, {48.849651, 2.285734}};
		String[] destList = {"Metro Bir-Hakeim", "Campus E1 - ECE PARIS", "Campus E2 - ECE PARIS", "Campus Eiffel 3", "Campus E4 - ECE TECH", "Campus E5 - HEIP"};
		

		//Initialization of the index at the selected item 
		cmboitem = combo_item;
		cmboitem1 = combo_item1;
		
		/**
		 * Creation of each element present in the main frame
		 */
		
		framebis = new JFrame("MyWAY");
		framebis.setMinimumSize(new Dimension(1100, 600));
		framebis.setMaximumSize(new Dimension(1100, 600));
		framebis.setResizable(false);
		framebis.setBounds(new Rectangle(0, 0, 1100, 600));
		framebis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(0, 0));
		contentPane.setBackground(new Color(255, 255, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		framebis.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel map_panel = new JPanel();
		map_panel.setBounds(0, 0, 1100, 578);
		map_panel.setBackground(new Color(153, 204, 255));
		map_panel.setMaximumSize(new Dimension(0, 0));
		contentPane.add(map_panel);
		map_panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 40, 233, 28);
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBorder(null);
		map_panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" From");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 41, 28);
		panel_1.add(lblNewLabel);
		
		JComboBox<?> comboBox = new JComboBox<Object>(destList);
		comboBox.setSelectedItem(destList[cmboitem]);
		// Adding Listener to the comboBox so each time value changes, the map is reloaded
		comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        	    cmboitem = comboBox.getSelectedIndex();
        		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");

            }
        });
		comboBox.setBounds(41, 2, 186, 27);
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 77, 233, 28);
		panel_2.setBackground(new Color(153, 204, 255));
		panel_2.setLayout(null);
		panel_2.setBorder(null);
		map_panel.add(panel_2);
		
		JLabel lblTo = new JLabel(" To");
		lblTo.setEnabled(false);
		lblTo.setBackground(Color.GRAY);
		lblTo.setBounds(0, -1, 27, 28);
		panel_2.add(lblTo);
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(destList);
		comboBox_1.setBounds(40, 1, 187, 27);
		comboBox_1.setSelectedItem(destList[cmboitem1]);
		// Adding Listener to the comboBox so each time value changes, the map is reloaded
	    comboBox_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        	    cmboitem1 = comboBox_1.getSelectedIndex();
        		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");
            }
        });
	    panel_2.add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(245, 0, 855, 578);
		map_panel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(view, BorderLayout.CENTER);
		
		JButton button = new JButton("");
		button.setBounds(6, 157, 117, 71);
		button.setMargin(new Insets(0, 0, 0, 0));
		map_panel.add(button);
		ImageIcon but1 = new ImageIcon("/Users/sethmigan/Desktop/Button1.png");
		Image imgbut1 =  but1.getImage();
		Image newImgbut1 = imgbut1.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut1 = new ImageIcon(newImgbut1);
		button.setIcon(imagebut1);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmboitem1 = 1;
				comboBox_1.setSelectedItem(destList[cmboitem1]);
        		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");
			}
		});
		
		JButton button_1 = new JButton("");
		button_1.setBounds(6, 240, 117, 71);
		button_1.setMargin(new Insets(0, 0, 0, 0));
		map_panel.add(button_1);
		ImageIcon but2 = new ImageIcon("/Users/sethmigan/Desktop/Button2.png");
		Image imgbut2 =  but2.getImage();
		Image newImgbut2 = imgbut2.getScaledInstance(button_1.getWidth(), button_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut2 = new ImageIcon(newImgbut2);
		button_1.setIcon(imagebut2);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmboitem1 = 2;
				comboBox_1.setSelectedItem(destList[cmboitem1]);
        		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");
			}
		});
		
		JButton button_2 = new JButton("");
		button_2.setBounds(6, 323, 117, 71);
		button_2.setMargin(new Insets(0, 0, 0, 0));
		map_panel.add(button_2);
		ImageIcon but3 = new ImageIcon("/Users/sethmigan/Desktop/Button3.png");
		Image imgbut3 =  but3.getImage();
		Image newImgbut3 = imgbut3.getScaledInstance(button_2.getWidth(), button_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut3 = new ImageIcon(newImgbut3);
		button_2.setIcon(imagebut3);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmboitem1 = 3;
				comboBox_1.setSelectedItem(destList[cmboitem1]);
        		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");
			}
		});
		
		JButton button_3 = new JButton("");
		button_3.setBounds(6, 406, 117, 71);
		button_3.setMargin(new Insets(0, 0, 0, 0));
		map_panel.add(button_3);
		ImageIcon but4 = new ImageIcon("/Users/sethmigan/Desktop/Button4.png");
		Image imgbut4 =  but4.getImage();
		Image newImgbut4 = imgbut4.getScaledInstance(button_3.getWidth(), button_3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut4 = new ImageIcon(newImgbut4);
		button_3.setIcon(imagebut4);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmboitem1 = 4;
				comboBox_1.setSelectedItem(destList[cmboitem1]);
        		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");
			}
		});
		
		JButton button_4 = new JButton("");
		button_4.setBounds(6, 489, 117, 71);
		button_4.setMargin(new Insets(0, 0, 0, 0));
		map_panel.add(button_4);
		ImageIcon but5 = new ImageIcon("/Users/sethmigan/Desktop/Button5.png");
		Image imgbut5 =  but5.getImage();
		Image newImgbut5 = imgbut5.getScaledInstance(button_4.getWidth(), button_4.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut5 = new ImageIcon(newImgbut5);
		button_4.setIcon(imagebut5);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmboitem1 = 5;
				comboBox_1.setSelectedItem(destList[cmboitem1]);
        		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 128, 94, 28);
		textArea.setText("Near you:");
		textArea.setOpaque(false);
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		textArea.setEditable(false);
		map_panel.add(textArea);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framebis.dispose();
				GUI_Welcome.main(null);
			}
		});
		btnReturn.setBackground(new Color(0, 102, 204));
		btnReturn.setBounds(6, 6, 73, 29);
		map_panel.add(btnReturn);
		
		JButton btnAllCampus = new JButton("All Campus");
		btnAllCampus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				browser.navigation().loadUrl("http://localhost:8888/GoogleMap/mapfile.html?_ijt=smjkmol7bafr50d5s8kl4fu89");
			}
		});
		btnAllCampus.setBounds(0, 105, 117, 29);
		map_panel.add(btnAllCampus);
		browser.navigation().loadUrl("https://www.google.com/maps/dir/"+coordonnees[cmboitem][0]+","+coordonnees[cmboitem][1]+"/"+coordonnees[cmboitem1][0]+","+coordonnees[cmboitem1][1]+"/@48.8513564,2.2853482,17z/data=!3m1!4b1?hl=fr");

	}
}
