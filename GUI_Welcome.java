package com.ecetech.b2.myway.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dimension;
import javax.swing.SpringLayout;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

import com.ecetech.b2.myway.eventprocessing.WelcomePageProcessing;

import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Image;
import javax.swing.JTextArea;

public class GUI_Welcome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Welcome frame = new GUI_Welcome();
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
	public GUI_Welcome() {
		setMinimumSize(new Dimension(1100, 600));
		setBackground(Color.LIGHT_GRAY);
		setTitle("MyWay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 489);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCampusE = new JButton("");
		btnCampusE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				WelcomePageProcessing.processBtnCampusClick();
				WelcomePageProcessing wpp = new WelcomePageProcessing();
				wpp.processBtnCampusClick();
			}
		});
		btnCampusE.setMargin(new Insets(0, 0, 0, 0));
		btnCampusE.setBounds(977, 72, 117, 83);
		contentPane.add(btnCampusE);
		ImageIcon but1 = new ImageIcon("/Users/sethmigan/Desktop/Button1.png");
		Image imgbut1 =  but1.getImage();
		Image newImgbut1 = imgbut1.getScaledInstance(btnCampusE.getWidth(), btnCampusE.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut1 = new ImageIcon(newImgbut1);
		btnCampusE.setIcon(imagebut1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setBounds(977, 167, 117, 83);
		contentPane.add(btnNewButton);
		ImageIcon but2 = new ImageIcon("/Users/sethmigan/Desktop/Button2.png");
		Image imgbut2 =  but2.getImage();
		Image newImgbut2 = imgbut2.getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut2 = new ImageIcon(newImgbut2);
		btnNewButton.setIcon(imagebut2);
		
		JButton btnCampusE_1 = new JButton("");
		btnCampusE_1.setMargin(new Insets(0, 0, 0, 0));
		btnCampusE_1.setBounds(977, 262, 117, 83);
		contentPane.add(btnCampusE_1);
		ImageIcon but3 = new ImageIcon("/Users/sethmigan/Desktop/Button3.png");
		Image imgbut3 =  but3.getImage();
		Image newImgbut3 = imgbut3.getScaledInstance(btnCampusE_1.getWidth(), btnCampusE_1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut3 = new ImageIcon(newImgbut3);
		btnCampusE_1.setIcon(imagebut3);
		
		
		JButton btnCampusE_2 = new JButton("");
		btnCampusE_2.setMargin(new Insets(0, 0, 0, 0));
		btnCampusE_2.setBounds(977, 358, 117, 83);
		contentPane.add(btnCampusE_2);
		ImageIcon but4 = new ImageIcon("/Users/sethmigan/Desktop/Button4.png");
		Image imgbut4 =  but4.getImage();
		Image newImgbut4 = imgbut4.getScaledInstance(btnCampusE_2.getWidth(), btnCampusE_2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut4 = new ImageIcon(newImgbut4);
		btnCampusE_2.setIcon(imagebut4);
		
		JButton btnCampusE_3 = new JButton("");
		btnCampusE_3.setMargin(new Insets(0, 0, 0, 0));
		btnCampusE_3.setBounds(977, 459, 117, 83);
		contentPane.add(btnCampusE_3);
		ImageIcon but5 = new ImageIcon("/Users/sethmigan/Desktop/Button5.png");
		Image imgbut5 =  but5.getImage();
		Image newImgbut5 = imgbut5.getScaledInstance(btnCampusE_3.getWidth(), btnCampusE_3.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon imagebut5 = new ImageIcon(newImgbut5);
		btnCampusE_3.setIcon(imagebut5);
		
		textField = new JTextField();
		textField.setOpaque(true);
		textField.setBackground(SystemColor.text);
		textField.setBounds(390, 283, 241, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnA = new JButton("");
		btnA.setBounds(634, 283, 38, 38);
		contentPane.add(btnA);
		ImageIcon MyImage = new ImageIcon("/Users/sethmigan/Desktop/location.png");
		Image img =  MyImage.getImage();
		Image newImage = img.getScaledInstance(btnA.getWidth(), btnA.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImage);
		btnA.setIcon(image);
		
		JTextArea txtrWelcomeToMyway = new JTextArea();
		txtrWelcomeToMyway.setEditable(false);
		txtrWelcomeToMyway.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtrWelcomeToMyway.setOpaque(false);
		txtrWelcomeToMyway.setText("Welcome to MyWay");
		txtrWelcomeToMyway.setBounds(390, 222, 190, 28);
		contentPane.add(txtrWelcomeToMyway);
		
		JTextArea txtrWhereDoYou = new JTextArea();
		txtrWhereDoYou.setEditable(false);
		txtrWhereDoYou.setText("Where do you want to go?");
		txtrWhereDoYou.setOpaque(false);
		txtrWhereDoYou.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		txtrWhereDoYou.setBounds(390, 249, 241, 28);
		contentPane.add(txtrWhereDoYou);
		
		JTextArea txtrNearYou = new JTextArea();
		txtrNearYou.setOpaque(false);
		txtrNearYou.setEditable(false);
		txtrNearYou.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtrNearYou.setText("Near you:");
		txtrNearYou.setBounds(977, 39, 94, 28);
		contentPane.add(txtrNearYou);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(-73, -60, 1173, 638);
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
