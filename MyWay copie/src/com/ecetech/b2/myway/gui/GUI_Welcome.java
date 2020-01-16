package com.ecetech.b2.myway.gui;

import com.ecetech.b2.myway.gui.MapView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Component;
import com.ecetech.b2.myway.eventprocessing.WelcomePageProcessing;

import java.awt.Image;
import javax.swing.JTextArea;
import javax.swing.JComboBox;


public class GUI_Welcome {
	private JFrame frame;
	private JLabel lblNewLabel;
	public int cmboitem;
	public int cmboitem1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Welcome wdw = new GUI_Welcome();
					wdw.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Welcome() {

		/**
		 * Array list storing each site
		 */
		String[] destList = {"Metro Bir-Hakeim", "Campus Eiffel 1", "Campus Eiffel 2", "Campus Eiffel 3", "Campus Eiffel 4", "Campus Eiffel 5"};
		
		frame = new JFrame("MyWAY");
		frame.setMaximumSize(new Dimension(1100, 600));
		frame.setMinimumSize(new Dimension(1100, 600));
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setTitle("MyWay");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 1100, 600);
		JPanel contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.setContentPane(contentPane);
		
		JButton btnCampusE = new JButton("");
		btnCampusE.setBounds(977, 72, 117, 83);
		btnCampusE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				WelcomePageProcessing.processBtnCampusClick();
				WelcomePageProcessing wpp = new WelcomePageProcessing();
				wpp.processBtnCampusClick();
			}
		});
		contentPane.setLayout(null);
		
		
		//JcomboBox of the "From"
		JComboBox<?> comboBox_1 = new JComboBox<Object>(destList);
		comboBox_1.setBounds(432, 289, 199, 28);
		comboBox_1.setSelectedItem("Metro Bir-Hakeim");
    	cmboitem = comboBox_1.getSelectedIndex();
		comboBox_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	cmboitem = comboBox_1.getSelectedIndex();
            }
        });
		contentPane.add(comboBox_1);
		
		
		//JcomboBox of the "To"
		JComboBox<?> comboBox = new JComboBox<Object>(destList);
		comboBox.setBounds(432, 328, 199, 28);
		comboBox.setSelectedItem("Campus Eiffel 4");
	    cmboitem1 = comboBox.getSelectedIndex();
		// Adding Listener to the comboBox so each time value changes, the map is reloaded
		comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        	    cmboitem1 = comboBox.getSelectedIndex();
            }
        });
		contentPane.add(comboBox);
		
		
		btnCampusE.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(btnCampusE);
		ImageIcon but1 = new ImageIcon("/Users/sethmigan/Desktop/Button1.png");
		Image imgbut1 =  but1.getImage();
		Image newImgbut1 = imgbut1.getScaledInstance(btnCampusE.getWidth(), btnCampusE.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut1 = new ImageIcon(newImgbut1);
		btnCampusE.setIcon(imagebut1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(977, 167, 117, 83);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(btnNewButton);
		ImageIcon but2 = new ImageIcon("/Users/sethmigan/Desktop/Button2.png");
		Image imgbut2 =  but2.getImage();
		Image newImgbut2 = imgbut2.getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut2 = new ImageIcon(newImgbut2);
		btnNewButton.setIcon(imagebut2);
		
		JButton btnCampusE_1 = new JButton("");
		btnCampusE_1.setBounds(977, 262, 117, 83);
		btnCampusE_1.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(btnCampusE_1);
		ImageIcon but3 = new ImageIcon("/Users/sethmigan/Desktop/Button3.png");
		Image imgbut3 =  but3.getImage();
		Image newImgbut3 = imgbut3.getScaledInstance(btnCampusE_1.getWidth(), btnCampusE_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut3 = new ImageIcon(newImgbut3);
		btnCampusE_1.setIcon(imagebut3);
		
		
		JButton btnCampusE_2 = new JButton("");
		btnCampusE_2.setBounds(977, 358, 117, 83);
		btnCampusE_2.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(btnCampusE_2);
		ImageIcon but4 = new ImageIcon("/Users/sethmigan/Desktop/Button4.png");
		Image imgbut4 =  but4.getImage();
		Image newImgbut4 = imgbut4.getScaledInstance(btnCampusE_2.getWidth(), btnCampusE_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut4 = new ImageIcon(newImgbut4);
		btnCampusE_2.setIcon(imagebut4);
		
		JButton btnCampusE_3 = new JButton("");
		btnCampusE_3.setBounds(977, 459, 117, 83);
		btnCampusE_3.setMargin(new Insets(0, 0, 0, 0));
		contentPane.add(btnCampusE_3);
		ImageIcon but5 = new ImageIcon("/Users/sethmigan/Desktop/Button5.png");
		Image imgbut5 =  but5.getImage();
		Image newImgbut5 = imgbut5.getScaledInstance(btnCampusE_3.getWidth(), btnCampusE_3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut5 = new ImageIcon(newImgbut5);
		btnCampusE_3.setIcon(imagebut5);
		
		JButton btnA = new JButton("");
		btnA.setBounds(631, 328, 26, 28);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				cmboitem = comboBox_1.getSelectedIndex();
				cmboitem1 = comboBox.getSelectedIndex();
				MapView.main(cmboitem, cmboitem1);
			}
		});
		contentPane.add(btnA);
		ImageIcon MyImage = new ImageIcon("/Users/sethmigan/Desktop/location.png");
		Image img =  MyImage.getImage();
		Image newImage = img.getScaledInstance(btnA.getWidth(), btnA.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImage);
		btnA.setIcon(image);
		
		JTextArea txtrWelcomeToMyway = new JTextArea();
		txtrWelcomeToMyway.setBounds(390, 222, 190, 28);
		txtrWelcomeToMyway.setEditable(false);
		txtrWelcomeToMyway.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtrWelcomeToMyway.setOpaque(false);
		txtrWelcomeToMyway.setText("Welcome to MyWay");
		contentPane.add(txtrWelcomeToMyway);
		
		JTextArea txtrWhereDoYou = new JTextArea();
		txtrWhereDoYou.setBounds(390, 249, 241, 28);
		txtrWhereDoYou.setEditable(false);
		txtrWhereDoYou.setText("Where do you want to go?");
		txtrWhereDoYou.setOpaque(false);
		txtrWhereDoYou.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		contentPane.add(txtrWhereDoYou);
		
		JTextArea txtrNearYou = new JTextArea();
		txtrNearYou.setBounds(977, 39, 94, 28);
		txtrNearYou.setOpaque(false);
		txtrNearYou.setEditable(false);
		txtrNearYou.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtrNearYou.setText("Near you:");
		contentPane.add(txtrNearYou);
		
		JTextArea txtrFrom = new JTextArea();
		txtrFrom.setText("From");
		txtrFrom.setOpaque(false);
		txtrFrom.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtrFrom.setEditable(false);
		txtrFrom.setBounds(390, 292, 38, 19);
		contentPane.add(txtrFrom);
		
		JTextArea txtrTo = new JTextArea();
		txtrTo.setText("To");
		txtrTo.setOpaque(false);
		txtrTo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtrTo.setEditable(false);
		txtrTo.setBounds(390, 333, 38, 19);
		contentPane.add(txtrTo);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(-79, -66, 1179, 644);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(lblNewLabel); 
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon MyImage1 = new ImageIcon("/Users/sethmigan/Desktop/img_plan.png");
		Image img1 =  MyImage1.getImage();
		Image newImage1 = img1.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image1 = new ImageIcon(newImage1);
		lblNewLabel.setIcon(image1);
	}
}
