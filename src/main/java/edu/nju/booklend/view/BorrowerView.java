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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.springframework.context.support.GenericXmlApplicationContext;

import edu.nju.booklend.data.service.BorrowerService;
import edu.nju.booklend.data.service.LoginService;



public class BorrowerView extends JFrame implements MouseListener{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private JPanel mainpanel,choiceJPanel,centerJPanel,searchBookJPanel,borroweredBookJPanel;
	private JLabel headbackJLabel,centerbackJLabel,choicebackJLabel,moveLabel,searchBookJLabel,borroweredBookJLabel;
	private JTextField bookSearchTextField;
	private JComboBox bookSearchComboBox;
	private JButton bookSearchButton;
	private JTextArea bookSearchTextArea;
	private JScrollPane bookSearchScrollPane;
	private ImageIcon headIcon,choicebackIcon,centerbackIcon;
	private CardLayout card;
	GenericXmlApplicationContext ctx;
	BorrowerService borrowerService;
	
	public void init() {
		
		//背景图片
		String path = System.getProperty("user.dir");
		headIcon = new ImageIcon(path + "//images//Adhead.jpg");
		headIcon.setImage(headIcon.getImage().getScaledInstance(1000, 168,
				Image.SCALE_DEFAULT));
		choicebackIcon = new ImageIcon(path + "//images//Adback.JPG");
		choicebackIcon.setImage(choicebackIcon.getImage().getScaledInstance(1000, 540,
				Image.SCALE_DEFAULT));
		centerbackIcon = new ImageIcon(path + "//images//Adback.JPG");
		centerbackIcon.setImage(centerbackIcon.getImage().getScaledInstance(1000, 540,
				Image.SCALE_DEFAULT));
		//
		
		//查询图书
		searchBookJPanel= new JPanel();
		searchBookJPanel.setBounds(255, 230, 600, 350);
		searchBookJPanel.setBackground(Color.WHITE);
		searchBookJLabel=new JLabel("查询图书");
		searchBookJLabel.setBounds(80, 80, 350, 60);
		searchBookJLabel.setFont(new Font("宋体",Font.PLAIN,20));
		searchBookJLabel.addMouseListener(this);
		
		bookSearchTextField=new JTextField();
		bookSearchTextField.setFont(new Font("宋体",Font.PLAIN,20));
		bookSearchTextField.setBounds(80, 30, 220, 40);
		bookSearchTextField.setText("请输入书名或作者等");
		bookSearchTextField.addMouseListener(this);
		String[] searchType={"ISBN","书名","作者","出版社"};
		bookSearchComboBox=new JComboBox(searchType);	
		bookSearchComboBox.setFont(new Font("宋体",Font.PLAIN,20));
		bookSearchComboBox.setBounds(300, 30, 100, 40);
		bookSearchButton=new JButton("检索");		
		bookSearchButton.setFont(new Font("宋体",Font.PLAIN,20));
		bookSearchButton.setBounds(450, 30, 100, 40);
		bookSearchButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String searchtype=(String)bookSearchComboBox.getSelectedItem();
				
				
			}
		});
		
		//检索到队图书列表
		bookSearchTextArea=new JTextArea();
		bookSearchScrollPane=new JScrollPane(bookSearchTextArea);
		bookSearchScrollPane.setBounds(80,100,470,270);
		
		searchBookJPanel.add(bookSearchTextField);
		searchBookJPanel.add(bookSearchComboBox);
		searchBookJPanel.add(bookSearchButton);
		searchBookJPanel.add(bookSearchScrollPane);
		searchBookJPanel.setLayout(null);
		
		//已借图书
		borroweredBookJPanel= new JPanel();
		borroweredBookJPanel.setBounds(255, 230, 600, 350);
		borroweredBookJPanel.setBackground(Color.WHITE);
		borroweredBookJLabel=new JLabel("已借图书");
		borroweredBookJLabel.setBounds(80, 110, 350, 60);
		borroweredBookJLabel.setFont(new Font("宋体",Font.PLAIN,20));
		borroweredBookJLabel.addMouseListener(this);
	
		card = new CardLayout();
		centerJPanel = new JPanel();
		centerJPanel.setLayout(card);
		centerJPanel.setBounds(265, 230, 600, 380);
		centerJPanel.add(searchBookJPanel, "searchBook");
		centerJPanel.add(borroweredBookJPanel, "borroweredBook");
		
		choiceJPanel = new JPanel();
		choiceJPanel.setBounds(0, 168, 225, 575);
		choiceJPanel.add(searchBookJLabel);
		choiceJPanel.add(borroweredBookJLabel);
		choicebackJLabel = new JLabel();
		choicebackJLabel.setIcon(choicebackIcon);
		choicebackJLabel.setBounds(0, 0, 1000, 540);
		//choiceJPanel.add(choicebackJLabel);
		choiceJPanel.setLayout(null);

		
		
	}
	
	public BorrowerView(String username){
		
		ctx=BorrowerLoginView.ctx;
		borrowerService=ctx.getBean(
				"borrowerService", BorrowerService.class);
		
		init();
		this.setSize(800, 675);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("图书借阅系统--借阅人");
	    int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
	    int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
	    this.setBounds((screenWidth-1000)/2, (screenHeight-680)/3, 1000, 675);
	    
	    
	    
	    headbackJLabel = new JLabel();
		headbackJLabel.setIcon(headIcon);
		headbackJLabel.setBounds(0, 0, 1000, 168);
		
		centerbackJLabel = new JLabel();
		centerbackJLabel.setIcon(centerbackIcon);
		centerbackJLabel.setBounds(0, 168, 1000, 540);
		
		String string = "lalalalalalalalalalala";
		moveLabel = new MoveLabel(string);
		moveLabel.setFont(new Font("", 0, 25));
		moveLabel.setForeground(new Color(255, 20, 147));
		
		// 主panel
		mainpanel = new JPanel();
		mainpanel.setLayout(null);
		
		mainpanel.add(choiceJPanel);
		mainpanel.add(centerJPanel);
		mainpanel.add(moveLabel);
		moveLabel.setBounds(275, 80, 450, 30);
		mainpanel.add(headbackJLabel);
		//mainpanel.add(centerbackJLabel);
		
		this.add(mainpanel);
		this.setVisible(true);
		


	}
	
	//鼠标监听
	//鼠标点击
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==searchBookJLabel){
			card.show(centerJPanel, "searchBook");		
		}
		if(e.getSource()==borroweredBookJLabel){
			card.show(centerJPanel, "borroweredBook");		
		}
		if(e.getSource()==bookSearchTextField){
			bookSearchTextField.setText("");
		}

	}
	//鼠标按下
	public void mousePressed(MouseEvent e) {

	}
	//鼠标释放
	public void mouseReleased(MouseEvent e) {
	
	}
	//鼠标进入
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==searchBookJLabel){
			searchBookJLabel.setForeground(Color.RED);
			setCursor(Cursor.HAND_CURSOR);
		}
		if(e.getSource()==borroweredBookJLabel){
			borroweredBookJLabel.setForeground(Color.RED);
			setCursor(Cursor.HAND_CURSOR);
		}
	}
	//鼠标离开
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==searchBookJLabel){
			searchBookJLabel.setForeground(Color.BLACK);
			setCursor(Cursor.getDefaultCursor());
		}
		if(e.getSource()==borroweredBookJLabel){
			borroweredBookJLabel.setForeground(Color.BLACK);
			setCursor(Cursor.getDefaultCursor());
		}
		if(e.getSource()==bookSearchTextField){
			bookSearchTextField.setText("请输入书名或作者等");
		}
	}
	
	
	
	// 滚动条
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
	
	public static void main(String[] args) {
		new BorrowerView("");
		
	}






}
