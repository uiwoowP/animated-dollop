package pjc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Order_B1 extends JFrame {
	
	Order_B1() {
		 setTitle("Order_B1");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new GridBagLayout());
		 
		 JButton backButton = new JButton("뒤로가기");
		 backButton.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		 backButton.setSize(new Dimension(80, 40));
		 
		 JLabel head = new JLabel("발주신청");
		 JPanel headPanel = new JPanel();
		 
		 head.setFont(new Font("나눔글꼴", Font.PLAIN, 15));
		 headPanel.add(head);
		 
		 headPanel.setAlignmentY(CENTER_ALIGNMENT);
		 headPanel.setPreferredSize(new Dimension(200, 35));
		 headPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 
		 JButton date = new JButton();
		 date.setPreferredSize(new Dimension(200, 35));
		 date.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 Date today = new Date();
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		 date.setText(dateFormat.format(today));
		 date.setFont(new Font("나눔글꼴", Font.PLAIN, 15));
		 
		 JTextField name = new JTextField();
		 name.setPreferredSize(new Dimension(200, 35));
		 name.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 JTextField qty = new JTextField();
		 qty.setPreferredSize(new Dimension(200, 35));
		 qty.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 JTextField cId = new JTextField();
		 cId.setPreferredSize(new Dimension(200, 35));
		 cId.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		 
		 JLabel nameLabel = new JLabel("상품명");
		 nameLabel.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		 JLabel qtyLabel = new JLabel("수량");
		 qtyLabel.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		 JLabel cIdLabel = new JLabel("업체코드");
		 cIdLabel.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		 
		 JButton submit = new JButton("신청하기");
		 submit.setFont(new Font("나눔글꼴", Font.PLAIN, 14));
		 submit.setSize(new Dimension(80, 40));
		 
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.weightx = 0.5;
	        gbc.weighty = 0.5;
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
	        gbc.insets = new Insets(20, 20, 0, 0);
	        add(backButton, gbc);
	        
	        gbc.weighty = 0.5;
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.PAGE_START;
	        gbc.insets = new Insets(100, 0, 0, 0); 
	        add(headPanel, gbc);
	        
	        gbc.weighty = 0.5;
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        gbc.anchor = GridBagConstraints.PAGE_START;
	        gbc.insets = new Insets(200, 0, 0, 0);
	        add(date, gbc);
	        
	        gbc.insets = new Insets(255, -300, 0, 0);
	        add(nameLabel, gbc);
	        
	        gbc.insets = new Insets(250, 0, 0, 0);
	        add(name, gbc);
	        
	        gbc.insets = new Insets(305, -300, 0, 0);
	        add(qtyLabel, gbc);
	        
	        gbc.insets = new Insets(300, 0, 0, 0);
	        add(qty, gbc);
	        
	        gbc.insets = new Insets(355, -300, 0, 0);
	        add(cIdLabel, gbc);
	        
	        gbc.insets = new Insets(350, 0, 0, 0);
	        add(cId, gbc);
	        
	        gbc.anchor = GridBagConstraints.PAGE_START;
	        gbc.insets = new Insets(400, 0, 0, 0);
	        add(submit, gbc);

	        setSize(450, 800);
	        setVisible(true);

	}
	
	public static void main(String[] args) {
		new Order_B1();
	}
	
}