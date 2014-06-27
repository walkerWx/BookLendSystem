package edu.nju.booklend.view;

import java.awt.CardLayout;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * ����ϵͳ����Ա�����Բ�ѯ����ӡ��޸ĺ�ɾ��ϵͳ����Ա��Ϣ��
 ��������ˣ����Բ�ѯ����ӡ��޸ĺ�ɾ����������Ϣ��
 ����ͼ�飺���Բ�ѯ����ӡ��޸ĺ�ɾ��ͼ����Ϣ
 */

public class AdminView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel, choiceJPanel, centerJPanel, findAdJPanel,
			addAdJPanel, updateAdJPanel, deleteAdJPanel, findBrJPanel,
			addBrJPanel, updateBrJPanel, deleteBrJPanel, findBkJPanel,
			addBkJPanel, updateBkJPanel, deleteBkJPanel, p1, p2, p3;
	private JLabel manageJLabel, adManageJLabel, brManageJLabel,
			bkManageJLabel, layoutJLabel, choicebackJLabel, headbackJLabel,
			centerbackJLabel, label2, findAdJLabel, addAdJLabel,
			updateAdJLabel, deleteAdJLabel, label, findBrJLabel, addBrJLabel,
			updateBrJLabel, deleteBrJLabel, findBkJLabel, addBkJLabel,
			updateBkJLabel, deleteBkJLabel;
	private JButton confirmJButton, cancelJButton, confirmJButton2,
			cancelJButton2, brconfirmJButton, brcancelJButton, confirmJButton3,
			cancelJButton3, confirmJButton4, cancelJButton4, brconfirmJButton2,
			brcancelJButton2, brconfirmJButton3, brcancelJButton3,
			brconfirmJButton4, brcancelJButton4, bkconfirmJButton,
			bkcancelJButton, bkconfirmJButton2, bkcancelJButton2,
			bkconfirmJButton3, bkcancelJButton3, bkconfirmJButton4,
			bkcancelJButton4;
	private JComboBox identityJCombobox, identityJCombobox3;
	private JTextField adIdField, adIdField2, adNameField, adPassField,
			adIdField3, adNameField3, adPassField3, adIdField4, brIdField,
			brPassField, brNameField, brIdField2, brIdField3, brNameField3,
			brPassField3, brIdField4, bkIdField, bkISBNField, bkNameField,
			bkAuthorField, bkPublishField, bkIdField3, bkISBNField3,
			bkNameField3, bkAuthorField3, bkPublishField3, bkyear, bkmonth,
			bkday, bkyear3, bkmonth3, bkday3, bkIdField2, bkIdField4;
	private JScrollPane detJScrollPane;
	private JTable detJTable;
	private DefaultTableModel detModel;
	private CardLayout card;
	private ImageIcon headIcon, backIcon1, backIcon2, icon;
	int count1 = 0, count2 = 0, count3 = 0;

	public void init() {

		addAdJPanel = new JPanel();
		addAdJPanel.setBounds(255, 230, 450, 300);
		addAdJPanel.setBackground(Color.WHITE);
		findAdJPanel = new JPanel();
		findAdJPanel.setBounds(255, 230, 500, 350);
		findAdJPanel.setBackground(Color.WHITE);
		updateAdJPanel = new JPanel();
		updateAdJPanel.setBounds(255, 230, 500, 350);
		updateAdJPanel.setBackground(Color.WHITE);
		deleteAdJPanel = new JPanel();
		deleteAdJPanel.setBounds(255, 230, 500, 350);
		deleteAdJPanel.setBackground(Color.WHITE);
		findBrJPanel = new JPanel();
		findBrJPanel.setBounds(255, 230, 500, 350);
		findBrJPanel.setBackground(Color.WHITE);
		addBrJPanel = new JPanel();
		addBrJPanel.setBounds(255, 230, 500, 350);
		addBrJPanel.setBackground(Color.WHITE);
		updateBrJPanel = new JPanel();
		updateBrJPanel.setBounds(255, 230, 500, 350);
		updateBrJPanel.setBackground(Color.WHITE);
		deleteBrJPanel = new JPanel();
		deleteBrJPanel.setBounds(255, 230, 500, 350);
		deleteBrJPanel.setBackground(Color.WHITE);
		findBkJPanel = new JPanel();
		findBkJPanel.setBounds(255, 230, 500, 350);
		findBkJPanel.setBackground(Color.WHITE);
		addBkJPanel = new JPanel();
		addBkJPanel.setBounds(255, 230, 500, 350);
		addBkJPanel.setBackground(Color.WHITE);
		updateBkJPanel = new JPanel();
		updateBkJPanel.setBounds(255, 230, 500, 350);
		updateBkJPanel.setBackground(Color.WHITE);
		deleteBkJPanel = new JPanel();
		deleteBkJPanel.setBounds(255, 230, 500, 350);
		deleteBkJPanel.setBackground(Color.WHITE);

		card = new CardLayout();
		centerJPanel = new JPanel();
		centerJPanel.setLayout(card);
		centerJPanel.setBounds(255, 230, 450, 300);

		centerJPanel.add(addAdJPanel, "addAd");
		centerJPanel.add(findAdJPanel, "findAd");
		centerJPanel.add(updateAdJPanel, "updateAd");
		centerJPanel.add(deleteAdJPanel, "deleteAd");
		centerJPanel.add(addBrJPanel, "addBr");
		centerJPanel.add(findBrJPanel, "findBr");
		centerJPanel.add(updateBrJPanel, "updateBr");
		centerJPanel.add(deleteBrJPanel, "deleteBr");
		centerJPanel.add(addBkJPanel, "addBk");
		centerJPanel.add(findBkJPanel, "findBk");
		centerJPanel.add(updateBkJPanel, "updateBk");
		centerJPanel.add(deleteBkJPanel, "deleteBk");

		manageJLabel = new JLabel("�������");
		adManageJLabel = new JLabel("����Ա����");
		brManageJLabel = new JLabel("�����˹���");
		bkManageJLabel = new JLabel("ͼ �� �� ��");

		layoutJLabel = new JLabel("ע   ��");

		p1 = new JPanel();
		p1.setBackground(Color.pink);
		p1.setBounds(110, 250, 40, 100);
		addAdJLabel = new JLabel("����");
		addAdJLabel.setFont(new Font("", Font.PLAIN, 15));
		deleteAdJLabel = new JLabel("ɾ��");
		deleteAdJLabel.setFont(new Font("", Font.PLAIN, 15));
		updateAdJLabel = new JLabel("�޸�");
		updateAdJLabel.setFont(new Font("", Font.PLAIN, 15));
		findAdJLabel = new JLabel("��ѯ");
		findAdJLabel.setFont(new Font("", Font.PLAIN, 15));
		p1.add(addAdJLabel);
		p1.add(deleteAdJLabel);
		p1.add(updateAdJLabel);
		p1.add(findAdJLabel);
		p1.setVisible(false);
		this.add(p1);

		p2 = new JPanel();
		p2.setBackground(Color.pink);
		p2.setBounds(110, 310, 40, 100);
		addBrJLabel = new JLabel("����");
		addBrJLabel.setFont(new Font("", Font.PLAIN, 15));
		deleteBrJLabel = new JLabel("ɾ��");
		deleteBrJLabel.setFont(new Font("", Font.PLAIN, 15));
		updateBrJLabel = new JLabel("�޸�");
		updateBrJLabel.setFont(new Font("", Font.PLAIN, 15));
		findBrJLabel = new JLabel("��ѯ");
		findBrJLabel.setFont(new Font("", Font.PLAIN, 15));
		p2.add(addBrJLabel);
		p2.add(deleteBrJLabel);
		p2.add(updateBrJLabel);
		p2.add(findBrJLabel);
		p2.setVisible(false);
		this.add(p2);

		p3 = new JPanel();
		p3.setBackground(Color.pink);
		p3.setBounds(110, 370, 40, 100);
		addBkJLabel = new JLabel("���");
		addBkJLabel.setFont(new Font("", Font.PLAIN, 15));
		deleteBkJLabel = new JLabel("ɾ��");
		deleteBkJLabel.setFont(new Font("", Font.PLAIN, 15));
		updateBkJLabel = new JLabel("�޸�");
		updateBkJLabel.setFont(new Font("", Font.PLAIN, 15));
		findBkJLabel = new JLabel("��ѯ");
		findBkJLabel.setFont(new Font("", Font.PLAIN, 15));
		p3.add(addBkJLabel);
		p3.add(deleteBkJLabel);
		p3.add(updateBkJLabel);
		p3.add(findBkJLabel);
		p3.setVisible(false);
		this.add(p3);

		String path = System.getProperty("user.dir");
		headIcon = new ImageIcon(path + "//images//Adhead.jpg");
		headIcon.setImage(headIcon.getImage().getScaledInstance(800, 135,
				Image.SCALE_DEFAULT));
		backIcon1 = new ImageIcon(path + "//images//Adback.JPG");
		backIcon1.setImage(backIcon1.getImage().getScaledInstance(800, 540,
				Image.SCALE_DEFAULT));
		backIcon2 = new ImageIcon(path + "//images//Adback.JPG");
		backIcon2.setImage(backIcon2.getImage().getScaledInstance(800, 540,
				Image.SCALE_DEFAULT));

		// icon=new ImageIcon("/Users/admin/Desktop/1.JPG");

		/*
		 * ���JLabel�ļ���
		 */
		adManageJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				adManageJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				adManageJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
			// card.show(centerJPanel, "inlist");
				if ((count1 % 2) == 0) {
					if ((count2 % 2) == 1)
						count2++;
					if ((count3 % 2) == 1)
						count3++;
					p2.setVisible(false);
					p3.setVisible(false);
					brManageJLabel.setBounds(50, 215, 140, 30);
					bkManageJLabel.setBounds(51, 275, 140, 30);
					layoutJLabel.setBounds(74, 335, 100, 30);
					p1.setVisible(true);
				} else {
					brManageJLabel.setBounds(50, 145, 140, 30);
					bkManageJLabel.setBounds(51, 205, 140, 30);
					layoutJLabel.setBounds(74, 265, 100, 30);
					p1.setVisible(false);
				}
				count1++;
			}
		});
		brManageJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				brManageJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				brManageJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
			// card.show(centerJPanel, "alllist");
				if ((count2 % 2) == 0) {
					if ((count1 % 2) == 1)
						count1++;
					if ((count3 % 2) == 1)
						count3++;
					p1.setVisible(false);
					p3.setVisible(false);
					brManageJLabel.setBounds(50, 145, 140, 30);
					bkManageJLabel.setBounds(51, 275, 140, 30);
					layoutJLabel.setBounds(74, 335, 100, 30);
					p2.setVisible(true);
				} else {
					bkManageJLabel.setBounds(51, 205, 140, 30);
					layoutJLabel.setBounds(74, 265, 100, 30);
					p2.setVisible(false);
				}
				count2++;
			}
		});
		bkManageJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				bkManageJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				bkManageJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
			// card.show(centerJPanel, "detlist");
				if ((count3 % 2) == 0) {
					if ((count1 % 2) == 1)
						count1++;
					if ((count2 % 2) == 1)
						count2++;
					p1.setVisible(false);
					p2.setVisible(false);
					brManageJLabel.setBounds(50, 145, 140, 30);
					bkManageJLabel.setBounds(51, 205, 140, 30);
					layoutJLabel.setBounds(74, 340, 100, 30);
					p3.setVisible(true);
				} else {
					layoutJLabel.setBounds(74, 265, 100, 30);
					p3.setVisible(false);
				}
				count3++;
			}
		});
		layoutJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				layoutJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				layoutJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				new AdminLoginView();
				dispose();
			}
		});

		addAdJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				addAdJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				addAdJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "addAd");
			}
		});
		deleteAdJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				deleteAdJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				deleteAdJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "deleteAd");
			}
		});
		updateAdJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				updateAdJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				updateAdJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "updateAd");
			}
		});
		findAdJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				findAdJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				findAdJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "findAd");
			}
		});
		addBrJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				addBrJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				addBrJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "addBr");
			}
		});
		deleteBrJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				deleteBrJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				deleteBrJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "deleteBr");
			}
		});
		updateBrJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				updateBrJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				updateBrJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "updateBr");
			}
		});
		findBrJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				findBrJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				findBrJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "findBr");
			}
		});
		addBkJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				addBkJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				addBkJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "addBk");
			}
		});
		deleteBkJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				deleteBkJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				deleteBkJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "deleteBk");
			}
		});
		updateBkJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				updateBkJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				updateBkJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "updateBk");
			}
		});
		findBkJLabel.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}// ����ͷ�

			public void mousePressed(MouseEvent e) {
			}// ��갴��

			public void mouseExited(MouseEvent e) { // ����뿪
				findBkJLabel.setForeground(Color.BLACK);
				setCursor(Cursor.getDefaultCursor());
			}

			public void mouseEntered(MouseEvent e) { // ������
				findBkJLabel.setForeground(Color.RED);
				setCursor(Cursor.HAND_CURSOR);
			}

			public void mouseClicked(MouseEvent e) { // �����
				card.show(centerJPanel, "findBk");
			}
		});

		/*
		 * addAdminJpanel
		 */
		JLabel title = new JLabel("��ӹ���Ա:");
		title.setFont(new Font("", Font.PLAIN, 20));
		JLabel adIdJLabel = new JLabel("����Ա���");
		adIdJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel adNameJLabel = new JLabel("��   ��   �� ");
		adNameJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel adPassJLabel = new JLabel("��   	      ��");
		adPassJLabel.setFont(new Font("", Font.PLAIN, 20));
		adIdField = new JTextField();
		adIdField.setFont(new Font("", Font.PLAIN, 15));
		adNameField = new JTextField();
		adNameField.setFont(new Font("", Font.PLAIN, 15));
		adPassField = new JTextField();
		adPassField.setFont(new Font("", Font.PLAIN, 15));
		confirmJButton = new JButton("���");
		cancelJButton = new JButton("ȡ��");

		addAdJPanel.setLayout(null);
		addAdJPanel.add(title);
		title.setBounds(0, 0, 110, 20);
		addAdJPanel.add(adIdJLabel);
		adIdJLabel.setBounds(110, 60, 120, 20);
		addAdJPanel.add(adNameJLabel);
		adNameJLabel.setBounds(110, 100, 120, 20);
		addAdJPanel.add(adPassJLabel);
		adPassJLabel.setBounds(110, 140, 120, 20);
		addAdJPanel.add(adIdField);
		adIdField.setBounds(250, 60, 100, 20);
		addAdJPanel.add(adNameField);
		adNameField.setBounds(250, 100, 100, 20);
		addAdJPanel.add(adPassField);
		adPassField.setBounds(250, 140, 100, 20);
		addAdJPanel.add(confirmJButton);
		confirmJButton.setBounds(140, 190, 70, 20);
		addAdJPanel.add(cancelJButton);
		cancelJButton.setBounds(250, 190, 70, 20);

		confirmJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		cancelJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * deleteAdminJpanel
		 */
		JLabel title2 = new JLabel("ɾ������Ա:");
		title2.setFont(new Font("", Font.PLAIN, 20));
		JLabel adIdJLabel2 = new JLabel("����Ա���");
		adIdJLabel2.setFont(new Font("", Font.PLAIN, 20));
		adIdField2 = new JTextField();
		adIdField2.setFont(new Font("", Font.PLAIN, 15));
		confirmJButton2 = new JButton("ɾ��");
		cancelJButton2 = new JButton("ȡ��");

		deleteAdJPanel.setLayout(null);
		deleteAdJPanel.add(title2);
		title2.setBounds(0, 0, 110, 20);
		deleteAdJPanel.add(adIdJLabel2);
		adIdJLabel2.setBounds(110, 100, 120, 20);
		deleteAdJPanel.add(adIdField2);
		adIdField2.setBounds(250, 100, 100, 20);
		deleteAdJPanel.add(confirmJButton2);
		confirmJButton2.setBounds(140, 170, 70, 20);
		deleteAdJPanel.add(cancelJButton2);
		cancelJButton2.setBounds(250, 170, 70, 20);

		confirmJButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		cancelJButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * updateAdminJpnael
		 */
		JLabel title3 = new JLabel("�޸Ĺ���Ա:");
		title3.setFont(new Font("", Font.PLAIN, 20));
		JLabel adIdJLabel3 = new JLabel("����Ա���");
		adIdJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel adNameJLabel3 = new JLabel("��   ��   �� ");
		adNameJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel adPassJLabel3 = new JLabel("��   	      ��");
		adPassJLabel3.setFont(new Font("", Font.PLAIN, 20));
		adIdField3 = new JTextField();
		adIdField3.setFont(new Font("", Font.PLAIN, 15));
		adNameField3 = new JTextField();
		adNameField3.setFont(new Font("", Font.PLAIN, 15));
		adPassField3 = new JTextField();
		adPassField3.setFont(new Font("", Font.PLAIN, 15));
		confirmJButton3 = new JButton("����");
		cancelJButton3 = new JButton("ȡ��");

		updateAdJPanel.setLayout(null);
		updateAdJPanel.add(title3);
		title3.setBounds(0, 0, 110, 20);
		updateAdJPanel.add(adIdJLabel3);
		adIdJLabel3.setBounds(110, 60, 120, 20);
		updateAdJPanel.add(adNameJLabel3);
		adNameJLabel3.setBounds(110, 100, 120, 20);
		updateAdJPanel.add(adPassJLabel3);
		adPassJLabel3.setBounds(110, 140, 120, 20);
		updateAdJPanel.add(adIdField3);
		adIdField3.setBounds(250, 60, 100, 20);
		updateAdJPanel.add(adNameField3);
		adNameField3.setBounds(250, 100, 100, 20);
		updateAdJPanel.add(adPassField3);
		adPassField3.setBounds(250, 140, 100, 20);
		updateAdJPanel.add(confirmJButton3);
		confirmJButton3.setBounds(140, 190, 70, 20);
		updateAdJPanel.add(cancelJButton3);
		cancelJButton3.setBounds(250, 190, 70, 20);

		confirmJButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		cancelJButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * findAdminJpanel
		 */
		JLabel title4 = new JLabel("��ѯ����Ա:");
		title4.setFont(new Font("", Font.PLAIN, 20));
		JLabel adIdJLabel4 = new JLabel("����Ա���");
		adIdJLabel4.setFont(new Font("", Font.PLAIN, 20));
		adIdField4 = new JTextField();
		adIdField4.setFont(new Font("", Font.PLAIN, 15));
		confirmJButton4 = new JButton("��ѯ");
		cancelJButton4 = new JButton("ȡ��");

		findAdJPanel.setLayout(null);
		findAdJPanel.add(title4);
		title4.setBounds(0, 0, 110, 20);
		findAdJPanel.add(adIdJLabel4);
		adIdJLabel4.setBounds(110, 100, 120, 20);
		findAdJPanel.add(adIdField4);
		adIdField4.setBounds(250, 100, 100, 20);
		findAdJPanel.add(confirmJButton4);
		confirmJButton4.setBounds(140, 170, 70, 20);
		findAdJPanel.add(cancelJButton4);
		cancelJButton4.setBounds(250, 170, 70, 20);

		confirmJButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		cancelJButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * addBrJpanel
		 */
		JLabel brtitle = new JLabel("��ӽ�����:");
		brtitle.setFont(new Font("", Font.PLAIN, 20));
		JLabel bradIdJLabel = new JLabel("�����˱��");
		bradIdJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bradNameJLabel = new JLabel("��   ��   �� ");
		bradNameJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bradPassJLabel = new JLabel("��   	      ��");
		bradPassJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bridentityJLabel = new JLabel("��          ��");
		bridentityJLabel.setFont(new Font("", Font.PLAIN, 20));
		brIdField = new JTextField();
		brIdField.setFont(new Font("", Font.PLAIN, 15));
		brNameField = new JTextField();
		brNameField.setFont(new Font("", Font.PLAIN, 15));
		brPassField = new JTextField();
		brPassField.setFont(new Font("", Font.PLAIN, 15));

		String string[] = { "������", "�о���", "��ʦ" };
		identityJCombobox = new JComboBox(string);
		identityJCombobox.setFont(new Font("", Font.PLAIN, 15));

		brconfirmJButton = new JButton("���");
		brcancelJButton = new JButton("ȡ��");

		addBrJPanel.setLayout(null);
		addBrJPanel.add(brtitle);
		brtitle.setBounds(0, 0, 110, 20);
		addBrJPanel.add(bradIdJLabel);
		bradIdJLabel.setBounds(110, 60, 120, 20);
		addBrJPanel.add(bradNameJLabel);
		bradNameJLabel.setBounds(110, 100, 120, 20);
		addBrJPanel.add(bradPassJLabel);
		bradPassJLabel.setBounds(110, 140, 120, 20);
		addBrJPanel.add(bridentityJLabel);
		bridentityJLabel.setBounds(110, 180, 120, 20);
		addBrJPanel.add(brIdField);
		brIdField.setBounds(250, 60, 100, 20);
		addBrJPanel.add(brNameField);
		brNameField.setBounds(250, 100, 100, 20);
		addBrJPanel.add(brPassField);
		brPassField.setBounds(250, 140, 100, 20);
		addBrJPanel.add(identityJCombobox);
		identityJCombobox.setBounds(250, 180, 100, 25);
		addBrJPanel.add(brconfirmJButton);
		brconfirmJButton.setBounds(140, 230, 70, 20);
		addBrJPanel.add(brcancelJButton);
		brcancelJButton.setBounds(250, 230, 70, 20);

		brconfirmJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		brcancelJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * deleteBrJpanel
		 */
		JLabel brtitle2 = new JLabel("ɾ��������:");
		brtitle2.setFont(new Font("", Font.PLAIN, 20));
		JLabel brIdJLabel2 = new JLabel("�����˱��");
		brIdJLabel2.setFont(new Font("", Font.PLAIN, 20));
		brIdField2 = new JTextField();
		brIdField2.setFont(new Font("", Font.PLAIN, 15));
		brconfirmJButton2 = new JButton("ɾ��");
		brcancelJButton2 = new JButton("ȡ��");

		deleteBrJPanel.setLayout(null);
		deleteBrJPanel.add(brtitle2);
		brtitle2.setBounds(0, 0, 110, 20);
		deleteBrJPanel.add(brIdJLabel2);
		brIdJLabel2.setBounds(110, 100, 120, 20);
		deleteBrJPanel.add(brIdField2);
		brIdField2.setBounds(250, 100, 100, 20);
		deleteBrJPanel.add(brconfirmJButton2);
		brconfirmJButton2.setBounds(140, 170, 70, 20);
		deleteBrJPanel.add(brcancelJButton2);
		brcancelJButton2.setBounds(250, 170, 70, 20);

		brconfirmJButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		brcancelJButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * updateAdminJpnael
		 */
		JLabel brtitle3 = new JLabel("�޸Ľ�����:");
		brtitle3.setFont(new Font("", Font.PLAIN, 20));
		JLabel brIdJLabel3 = new JLabel("�����˱��");
		brIdJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel brNameJLabel3 = new JLabel("��   ��   �� ");
		brNameJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel brPassJLabel3 = new JLabel("��   	      ��");
		brPassJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel brIdentityJLabel3 = new JLabel("��          ��");
		brIdentityJLabel3.setFont(new Font("", Font.PLAIN, 20));
		brIdField3 = new JTextField();
		brIdField3.setFont(new Font("", Font.PLAIN, 15));
		brNameField3 = new JTextField();
		brNameField3.setFont(new Font("", Font.PLAIN, 15));
		brPassField3 = new JTextField();
		brPassField3.setFont(new Font("", Font.PLAIN, 15));

		identityJCombobox3 = new JComboBox(string);
		identityJCombobox3.setFont(new Font("", Font.PLAIN, 15));

		brconfirmJButton3 = new JButton("����");
		brcancelJButton3 = new JButton("ȡ��");

		updateBrJPanel.setLayout(null);
		updateBrJPanel.add(brtitle3);
		brtitle3.setBounds(0, 0, 110, 20);
		updateBrJPanel.add(brIdJLabel3);
		brIdJLabel3.setBounds(110, 60, 120, 20);
		updateBrJPanel.add(brNameJLabel3);
		brNameJLabel3.setBounds(110, 100, 120, 20);
		updateBrJPanel.add(brPassJLabel3);
		brPassJLabel3.setBounds(110, 140, 120, 20);
		updateBrJPanel.add(brIdentityJLabel3);
		brIdentityJLabel3.setBounds(110, 180, 120, 20);
		updateBrJPanel.add(brIdField3);
		brIdField3.setBounds(250, 60, 100, 20);
		updateBrJPanel.add(brNameField3);
		brNameField3.setBounds(250, 100, 100, 20);
		updateBrJPanel.add(brPassField3);
		brPassField3.setBounds(250, 140, 100, 20);
		updateBrJPanel.add(identityJCombobox3);
		identityJCombobox3.setBounds(250, 180, 100, 25);
		updateBrJPanel.add(brconfirmJButton3);
		brconfirmJButton3.setBounds(140, 230, 70, 20);
		updateBrJPanel.add(brcancelJButton3);
		brcancelJButton3.setBounds(250, 230, 70, 20);

		brconfirmJButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		brcancelJButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * findBrJpanel
		 */
		JLabel brtitle4 = new JLabel("��ѯ������:");
		brtitle4.setFont(new Font("", Font.PLAIN, 20));
		JLabel brIdJLabel4 = new JLabel("�����˱��");
		brIdJLabel4.setFont(new Font("", Font.PLAIN, 20));
		brIdField4 = new JTextField();
		brIdField4.setFont(new Font("", Font.PLAIN, 15));
		brconfirmJButton4 = new JButton("��ѯ");
		brcancelJButton4 = new JButton("ȡ��");

		findBrJPanel.setLayout(null);
		findBrJPanel.add(brtitle4);
		brtitle4.setBounds(0, 0, 110, 20);
		findBrJPanel.add(brIdJLabel4);
		brIdJLabel4.setBounds(110, 100, 120, 20);
		findBrJPanel.add(brIdField4);
		brIdField4.setBounds(250, 100, 100, 20);
		findBrJPanel.add(brconfirmJButton4);
		brconfirmJButton4.setBounds(140, 170, 70, 20);
		findBrJPanel.add(brcancelJButton4);
		brcancelJButton4.setBounds(250, 170, 70, 20);

		brconfirmJButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		brcancelJButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * addBkJpanel
		 */
		JLabel bktitle = new JLabel("���ͼ��:");
		bktitle.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkIdJLabel = new JLabel("ͼ����");
		bkIdJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkISBNJLabel = new JLabel("ISBN");
		bkISBNJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkNameJLabel = new JLabel("ͼ������");
		bkNameJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkAuthorJLabel = new JLabel("ͼ������");
		bkAuthorJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkPublishJLabel = new JLabel("�� �� ��");
		bkPublishJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkYearJLabel = new JLabel("�������");
		bkYearJLabel.setFont(new Font("", Font.PLAIN, 20));
		JLabel year = new JLabel("��");
		year.setFont(new Font("", Font.PLAIN, 20));
		JLabel month = new JLabel("��");
		month.setFont(new Font("", Font.PLAIN, 20));
		JLabel day = new JLabel("��");
		day.setFont(new Font("", Font.PLAIN, 20));

		bkIdField = new JTextField();
		bkIdField.setFont(new Font("", Font.PLAIN, 15));
		bkISBNField = new JTextField();
		bkISBNField.setFont(new Font("", Font.PLAIN, 15));
		bkNameField = new JTextField();
		bkNameField.setFont(new Font("", Font.PLAIN, 15));
		bkAuthorField = new JTextField();
		bkAuthorField.setFont(new Font("", Font.PLAIN, 15));
		bkPublishField = new JTextField();
		bkPublishField.setFont(new Font("", Font.PLAIN, 15));

		bkyear = new JTextField();
		bkyear.setFont(new Font("", Font.PLAIN, 15));
		bkmonth = new JTextField();
		bkmonth.setFont(new Font("", Font.PLAIN, 15));
		bkday = new JTextField();
		bkday.setFont(new Font("", Font.PLAIN, 15));

		bkconfirmJButton = new JButton("���");
		bkcancelJButton = new JButton("ȡ��");

		addBkJPanel.setLayout(null);
		addBkJPanel.add(bktitle);
		bktitle.setBounds(0, 0, 110, 20);
		addBkJPanel.add(bkIdJLabel);
		bkIdJLabel.setBounds(110, 30, 120, 20);
		addBkJPanel.add(bkISBNJLabel);
		bkISBNJLabel.setBounds(110, 65, 120, 20);
		addBkJPanel.add(bkNameJLabel);
		bkNameJLabel.setBounds(110, 100, 120, 20);
		addBkJPanel.add(bkAuthorJLabel);
		bkAuthorJLabel.setBounds(110, 135, 120, 20);
		addBkJPanel.add(bkPublishJLabel);
		bkPublishJLabel.setBounds(110, 170, 120, 20);
		addBkJPanel.add(bkYearJLabel);
		bkYearJLabel.setBounds(110, 205, 120, 20);

		addBkJPanel.add(year);
		year.setBounds(300, 205, 20, 20);
		addBkJPanel.add(month);
		month.setBounds(350, 205, 20, 20);
		addBkJPanel.add(day);
		day.setBounds(400, 205, 70, 20);
		addBkJPanel.add(bkyear);
		bkyear.setBounds(250, 205, 50, 20);
		addBkJPanel.add(bkmonth);
		bkmonth.setBounds(320, 205, 30, 20);
		addBkJPanel.add(bkday);
		bkday.setBounds(370, 205, 30, 20);

		addBkJPanel.add(bkIdField);
		bkIdField.setBounds(250, 30, 100, 20);
		addBkJPanel.add(bkISBNField);
		bkISBNField.setBounds(250, 65, 100, 20);
		addBkJPanel.add(bkNameField);
		bkNameField.setBounds(250, 100, 100, 20);
		addBkJPanel.add(bkAuthorField);
		bkAuthorField.setBounds(250, 135, 100, 20);
		addBkJPanel.add(bkPublishField);
		bkPublishField.setBounds(250, 170, 100, 20);

		addBkJPanel.add(bkconfirmJButton);
		bkconfirmJButton.setBounds(140, 245, 70, 20);
		addBkJPanel.add(bkcancelJButton);
		bkcancelJButton.setBounds(250, 245, 70, 20);

		bkconfirmJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		bkcancelJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * deleteBkJpanel
		 */
		JLabel bktitle2 = new JLabel("ɾ��ͼ��:");
		bktitle2.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkIdJLabel2 = new JLabel("ͼ����");
		bkIdJLabel2.setFont(new Font("", Font.PLAIN, 20));
		bkIdField2 = new JTextField();
		bkIdField2.setFont(new Font("", Font.PLAIN, 15));
		bkconfirmJButton2 = new JButton("ɾ��");
		bkcancelJButton2 = new JButton("ȡ��");

		deleteBkJPanel.setLayout(null);
		deleteBkJPanel.add(bktitle2);
		bktitle2.setBounds(0, 0, 110, 20);
		deleteBkJPanel.add(bkIdJLabel2);
		bkIdJLabel2.setBounds(110, 100, 120, 20);
		deleteBkJPanel.add(bkIdField2);
		bkIdField2.setBounds(250, 100, 100, 20);
		deleteBkJPanel.add(bkconfirmJButton2);
		bkconfirmJButton2.setBounds(140, 170, 70, 20);
		deleteBkJPanel.add(bkcancelJButton2);
		bkcancelJButton2.setBounds(250, 170, 70, 20);

		bkconfirmJButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		bkcancelJButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * updateBkJpanel
		 */
		JLabel bktitle3 = new JLabel("�޸�ͼ��:");
		bktitle3.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkIdJLabel3 = new JLabel("ͼ����");
		bkIdJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkISBNJLabel3 = new JLabel("ISBN");
		bkISBNJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkNameJLabel3 = new JLabel("ͼ������");
		bkNameJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkAuthorJLabel3 = new JLabel("ͼ������");
		bkAuthorJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkPublishJLabel3 = new JLabel("�� �� ��");
		bkPublishJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkYearJLabel3 = new JLabel("�������");
		bkYearJLabel3.setFont(new Font("", Font.PLAIN, 20));
		JLabel year3 = new JLabel("��");
		year3.setFont(new Font("", Font.PLAIN, 20));
		JLabel month3 = new JLabel("��");
		month3.setFont(new Font("", Font.PLAIN, 20));
		JLabel day3 = new JLabel("��");
		day3.setFont(new Font("", Font.PLAIN, 20));

		bkIdField3 = new JTextField();
		bkIdField3.setFont(new Font("", Font.PLAIN, 15));
		bkISBNField3 = new JTextField();
		bkISBNField3.setFont(new Font("", Font.PLAIN, 15));
		bkNameField3 = new JTextField();
		bkNameField3.setFont(new Font("", Font.PLAIN, 15));
		bkAuthorField3 = new JTextField();
		bkAuthorField3.setFont(new Font("", Font.PLAIN, 15));
		bkPublishField3 = new JTextField();
		bkPublishField3.setFont(new Font("", Font.PLAIN, 15));

		bkyear3 = new JTextField();
		bkyear3.setFont(new Font("", Font.PLAIN, 15));
		bkmonth3 = new JTextField();
		bkmonth3.setFont(new Font("", Font.PLAIN, 15));
		bkday3 = new JTextField();
		bkday3.setFont(new Font("", Font.PLAIN, 15));

		bkconfirmJButton3 = new JButton("����");
		bkcancelJButton3 = new JButton("ȡ��");

		updateBkJPanel.setLayout(null);
		updateBkJPanel.add(bktitle3);
		bktitle3.setBounds(0, 0, 110, 20);
		updateBkJPanel.add(bkIdJLabel3);
		bkIdJLabel3.setBounds(110, 30, 120, 20);
		updateBkJPanel.add(bkISBNJLabel3);
		bkISBNJLabel3.setBounds(110, 65, 120, 20);
		updateBkJPanel.add(bkNameJLabel3);
		bkNameJLabel3.setBounds(110, 100, 120, 20);
		updateBkJPanel.add(bkAuthorJLabel3);
		bkAuthorJLabel3.setBounds(110, 135, 120, 20);
		updateBkJPanel.add(bkPublishJLabel3);
		bkPublishJLabel3.setBounds(110, 170, 120, 20);
		updateBkJPanel.add(bkYearJLabel3);
		bkYearJLabel3.setBounds(110, 205, 120, 20);

		updateBkJPanel.add(year3);
		year3.setBounds(300, 205, 20, 20);
		updateBkJPanel.add(month3);
		month3.setBounds(350, 205, 20, 20);
		updateBkJPanel.add(day3);
		day3.setBounds(400, 205, 70, 20);
		updateBkJPanel.add(bkyear3);
		bkyear3.setBounds(250, 205, 50, 20);
		updateBkJPanel.add(bkmonth3);
		bkmonth3.setBounds(320, 205, 30, 20);
		updateBkJPanel.add(bkday3);
		bkday3.setBounds(370, 205, 30, 20);

		updateBkJPanel.add(bkIdField3);
		bkIdField3.setBounds(250, 30, 100, 20);
		updateBkJPanel.add(bkISBNField3);
		bkISBNField3.setBounds(250, 65, 100, 20);
		updateBkJPanel.add(bkNameField3);
		bkNameField3.setBounds(250, 100, 100, 20);
		updateBkJPanel.add(bkAuthorField3);
		bkAuthorField3.setBounds(250, 135, 100, 20);
		updateBkJPanel.add(bkPublishField3);
		bkPublishField3.setBounds(250, 170, 100, 20);

		updateBkJPanel.add(bkconfirmJButton3);
		bkconfirmJButton3.setBounds(140, 245, 70, 20);
		updateBkJPanel.add(bkcancelJButton3);
		bkcancelJButton3.setBounds(250, 245, 70, 20);

		bkconfirmJButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		bkcancelJButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * findBkJpanel
		 */
		JLabel bktitle4 = new JLabel("��ѯͼ��:");
		bktitle4.setFont(new Font("", Font.PLAIN, 20));
		JLabel bkIdJLabel4 = new JLabel("ͼ����");
		bkIdJLabel4.setFont(new Font("", Font.PLAIN, 20));
		bkIdField4 = new JTextField();
		bkIdField4.setFont(new Font("", Font.PLAIN, 15));
		bkconfirmJButton4 = new JButton("��ѯ");
		bkcancelJButton4 = new JButton("ȡ��");

		findBkJPanel.setLayout(null);
		findBkJPanel.add(bktitle4);
		bktitle4.setBounds(0, 0, 110, 20);
		findBkJPanel.add(bkIdJLabel4);
		bkIdJLabel4.setBounds(110, 100, 120, 20);
		findBkJPanel.add(bkIdField4);
		bkIdField4.setBounds(250, 100, 100, 20);
		findBkJPanel.add(bkconfirmJButton4);
		bkconfirmJButton4.setBounds(140, 170, 70, 20);
		findBkJPanel.add(bkcancelJButton4);
		bkcancelJButton4.setBounds(250, 170, 70, 20);

		bkconfirmJButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		bkcancelJButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		/*
		 * choiceJPanel
		 */
		choiceJPanel = new JPanel();
		choiceJPanel.setBounds(0, 135, 225, 575);
		choiceJPanel.add(manageJLabel);
		manageJLabel.setBounds(40, 10, 215, 60);
		choiceJPanel.add(adManageJLabel);
		adManageJLabel.setBounds(50, 85, 140, 30);
		choiceJPanel.add(brManageJLabel);
		brManageJLabel.setBounds(50, 145, 140, 30);
		choiceJPanel.add(bkManageJLabel);
		bkManageJLabel.setBounds(51, 205, 140, 30);
		choiceJPanel.add(layoutJLabel);
		layoutJLabel.setBounds(74, 265, 100, 30);

		choicebackJLabel = new JLabel();
		choicebackJLabel.setIcon(backIcon1);
		choicebackJLabel.setBounds(0, 0, 800, 540);
		choiceJPanel.add(choicebackJLabel);

		choiceJPanel.setLayout(null);

		manageJLabel.setFont(new Font("", Font.PLAIN, 30));
		manageJLabel.setForeground(new Color(255, 20, 147));
		adManageJLabel.setFont(new Font("", Font.PLAIN, 20));
		adManageJLabel.setForeground(Color.BLACK);
		brManageJLabel.setFont(new Font("", Font.PLAIN, 20));
		brManageJLabel.setForeground(Color.BLACK);
		bkManageJLabel.setFont(new Font("", Font.PLAIN, 20));
		bkManageJLabel.setForeground(Color.BLACK);
		layoutJLabel.setFont(new Font("", Font.PLAIN, 20));
		layoutJLabel.setForeground(Color.BLACK);

	}

	public AdminView() {
		init();
		this.setSize(800, 675);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("ͼ�����ϵͳ--ϵͳ����Ա");
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setBounds((screenWidth - 800) / 2, (screenHeight - 680) / 3, 800,
				675);

		headbackJLabel = new JLabel();
		headbackJLabel.setIcon(headIcon);
		headbackJLabel.setBounds(0, 0, 800, 135);

		// label=new JLabel();
		// label.setIcon(icon);
		// label.setBounds(255, 230, 450, 300);

		centerbackJLabel = new JLabel();
		centerbackJLabel.setIcon(backIcon2);
		centerbackJLabel.setBounds(0, 135, 800, 540);

		String string = "��ӭ����ͼ�����ϵͳ������ҵҵ����������������lalalalalalalalalalala";
		// label2 = new JLabel("       ����ҵҵ����������������");
		label2 = new MoveLabel(string);
		label2.setFont(new Font("", 0, 25));
		label2.setForeground(new Color(255, 20, 147));

		// ���������Panel
		panel = new JPanel();
		panel.setLayout(null);

		panel.add(choiceJPanel);
		panel.add(centerJPanel);
		// panel.add(label);
		panel.add(label2);
		label2.setBounds(255, 155, 450, 30);
		// panel.add(scroll); scroll.setBounds(415, 145, 400, 60);
		panel.add(headbackJLabel);
		panel.add(centerbackJLabel);

		this.add(panel);
		this.setVisible(true);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdminView();

	}

	// ������
	private class MoveLabel extends JLabel implements Runnable {

		private static final long serialVersionUID = 1891684760189602720L;

		private String text = null;

		private Thread thread = null;

		private int x = 0;

		private int w = 0, h = 0;

		public MoveLabel(String text) {
			super(text);
			this.text = text;
			thread = new Thread(this);
			thread.start();
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			super.setText(text);
			this.text = text;
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// g.setColor(this.getBackground());
			g.setColor(Color.pink);
			g.fillRect(0, 0, w = this.getWidth(), h = this.getHeight());
			g.setColor(this.getForeground());
			g.setFont(this.getFont());
			g.drawString(text, x, h - 2);
		}

		public void run() {
			while (true) {
				x -= 2;
				if (x < -w) {
					x = w;
				}
				this.repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
