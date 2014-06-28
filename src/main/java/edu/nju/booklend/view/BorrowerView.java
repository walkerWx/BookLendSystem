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
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import edu.nju.booklend.data.domain.Book;
import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.domain.Borrower;





public class BorrowerView extends JFrame implements MouseListener{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private JPanel mainpanel,choiceJPanel,centerJPanel,searchBookJPanel,borroweredBookJPanel,messageJPanel;
	private JLabel headbackJLabel,centerbackJLabel,choicebackJLabel,moveLabel,searchBookJLabel,
	               borroweredBookJLabel,messageJLabel,borroweredheadJLabel,label1,nameJLabel;
	private JTextField bookSearchTextField;
	private JComboBox bookSearchComboBox;
	private JButton bookSearchButton,borrowBookButton;
	private JTextArea bookSearchTextArea;
	private JScrollPane bookSearchScrollPane;
	private JTable bookJTable;
	private TableModel bookModel;
	private ImageIcon headIcon,choicebackIcon,centerbackIcon;
	private CardLayout card;
	private String username;
	private Borrower borrower;
	private List<BorrowRecord> borrowRecordList;
	private List<BorrowRecord> borrowRecordByBorrowerList;

	
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
		searchBookJLabel.setBounds(80, 180, 350, 60);
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
		
		//检索到的图书列表
		bookSearchTextArea=new JTextArea();
		bookSearchScrollPane=new JScrollPane(bookSearchTextArea);
		bookSearchScrollPane.setBounds(80,100,470,200);
		bookSearchScrollPane.setVisible(false);
		bookSearchTextArea.setEditable(false);
		bookSearchTextArea.setFont(new Font("宋体",Font.PLAIN,15));
		
    	label1=new JLabel("没有找到您要找的图书，请您检查是否输入了正确的信息！");
    	label1.setFont(new Font("宋体",Font.PLAIN,20));
    	label1.setBounds(50, 200, 550, 40);
    	label1.setVisible(false);
    	searchBookJPanel.add(label1);
		
		bookSearchButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String searchtype=(String)bookSearchComboBox.getSelectedItem();
				List<Book> bookList = new ArrayList<Book>();
                if(searchtype.equals("ISBN")){
                	bookList=BorrowerLoginView.bookService.findByIsbn(bookSearchTextField.getText());               	
               	
                }else if(searchtype.equals("书名")){
                	bookList=BorrowerLoginView.bookService.findByBookName(bookSearchTextField.getText());
                }else if(searchtype.equals("作者")){
                	bookList=BorrowerLoginView.bookService.findByAuthor(bookSearchTextField.getText());
                }else if(searchtype.equals("出版社")){
                	bookList=BorrowerLoginView.bookService.findByPublisher(bookSearchTextField.getText());
                }
                
                if(bookList.size()==0){

                	borrowBookButton.setVisible(false);
                	bookSearchScrollPane.setVisible(false);
                	label1.setVisible(true);
                	
            	}else{
            		label1.setVisible(false);
            		bookSearchScrollPane.setVisible(true);
            		borrowBookButton.setVisible(true);
            		String[] bookheaders = { "图书ISBN","图书名称", "作者", "出版社","出版年份","类别" };
            		Object[][] bookcell = new Object[bookList.size()][6];
            		for(int i=0;i<bookList.size();i++){
            			bookcell[i][0]=bookList.get(i).getIsbn();
            	    	bookcell[i][1]=bookList.get(i).getBookName();
            	    	bookcell[i][2]=bookList.get(i).getAuthor();
            	    	bookcell[i][3]=bookList.get(i).getPublisher();
            	    	bookcell[i][4]=bookList.get(i).getYear();
            	    	bookcell[i][5]=bookList.get(i).getType();
            	    }
            		bookJTable = new JTable(){

						private static final long serialVersionUID = 1L;

						public boolean isCellEditable(int a,int b){
            				return false;
            			}
            		};
            		bookModel=new DefaultTableModel(bookcell,bookheaders);
            		bookJTable.setModel(bookModel);
            		bookJTable.setRowHeight(25);
            		bookJTable.setFont(new Font("宋体",Font.PLAIN,10));
            		bookSearchScrollPane.setViewportView(bookJTable);
            		
            		
            	}
				
			}
		});
		
        //借阅
		borrowBookButton=new JButton("借阅");
		borrowBookButton.setFont(new Font("宋体",Font.PLAIN,20));
		borrowBookButton.setBounds(450, 320, 100, 40);
		borrowBookButton.setVisible(false);
		searchBookJPanel.add(borrowBookButton);
		borrowBookButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int[] rows=bookJTable.getSelectedRows();
				//得到借阅人身份，看借阅权限够不
				borrower=BorrowerLoginView.borrowerService.findById(username);
				borrowRecordList=BorrowerLoginView.borrowRecordService.findAll();
				String isbn;
				for (int i = 0; i < rows.length; i++) {					
					
					isbn=bookJTable.getValueAt(rows[i], 0).toString();	
					
					//借阅记录为0，直接借阅
					if(borrowRecordList.size()==0){
						System.out.println("0");
					}else{
					    //看借阅记录里面有没有这本书,且有没有归还
					   for (BorrowRecord r:borrowRecordList) {
						   if((r.getBook().getIsbn().equals(isbn))&&(r.getBorrower().getId().equals(username))&&(!r.isReturnStatus())){
							   JOptionPane.showMessageDialog(null, "您已经借阅过"+r.getBook().getBookName()+"这本书了！", "提示",JOptionPane.ERROR_MESSAGE);
						   }
					   }
				       //本科生不能借阅珍本图书
					   if((borrower.getIdentity().equals("undergraduate"))&&(bookJTable.getValueAt(rows[i], 5).toString().equals("rare"))){
						   JOptionPane.showMessageDialog(null, "您的权限不足以借阅这本书", "提示",JOptionPane.ERROR_MESSAGE);
					   }else{
						 //借阅数量够不
						   borrowRecordByBorrowerList=new ArrayList<BorrowRecord>();
						   for(BorrowRecord b:BorrowerLoginView.borrowRecordService.findByBorrower(borrower)){
									   if(!b.isReturnStatus()){
										   borrowRecordByBorrowerList.add(b);
									   }
						   }
						   int size=borrowRecordByBorrowerList.size();
						   if(borrower.getIdentity().equals("undergraduate")) {
							   if(size>4){
								   JOptionPane.showMessageDialog(null, "您最多只能借阅5本书，请您先归还之前借阅的书再借阅！", "提示",JOptionPane.ERROR_MESSAGE);
							   }
						   }else if(borrower.getIdentity().equals("postgraduate")){
							   if(size>9){
								   JOptionPane.showMessageDialog(null, "您最多只能借阅10本书，请您先归还之前借阅的书再借阅！", "提示",JOptionPane.ERROR_MESSAGE);
							   }
							   
						   }else{
							   if(size>19){
								   JOptionPane.showMessageDialog(null, "您最多只能借阅20本书，请您先归还之前借阅的书再借阅！", "提示",JOptionPane.ERROR_MESSAGE);
							   }
						   }
						   //借阅

					   }
					   
					}
					
				}
				
			}
		});
		
		searchBookJPanel.add(bookSearchTextField);
		searchBookJPanel.add(bookSearchComboBox);
		searchBookJPanel.add(bookSearchButton);
		searchBookJPanel.add(bookSearchScrollPane);
		searchBookJPanel.setLayout(null);
		
		//借阅记录
		borroweredBookJPanel= new JPanel();
		borroweredBookJPanel.setBounds(255, 230, 600, 350);
		borroweredBookJPanel.setBackground(Color.WHITE);
		borroweredBookJLabel=new JLabel("借阅记录");
		borroweredBookJLabel.setBounds(80, 210, 350, 60);
		borroweredBookJLabel.setFont(new Font("宋体",Font.PLAIN,20));
		borroweredBookJLabel.addMouseListener(this);
		
		borroweredheadJLabel=new JLabel();
		borroweredheadJLabel.setText("您已经借阅了以下图书：");
		borroweredheadJLabel.setFont(new Font("宋体",Font.PLAIN,20));
		borroweredheadJLabel.setBounds(0,0,300,60);
		borroweredBookJPanel.add(borroweredheadJLabel);
		borroweredBookJPanel.setLayout(null);
	
		//查看消息
		messageJPanel=new JPanel();
		messageJPanel.setBounds(255, 230, 600, 350);
		messageJPanel.setBackground(Color.WHITE);
		messageJLabel=new JLabel("查看消息");
		messageJLabel.setBounds(80, 240, 350, 60);
		messageJLabel.setFont(new Font("宋体",Font.PLAIN,20));
		messageJLabel.addMouseListener(this);
		
		card = new CardLayout();
		centerJPanel = new JPanel();
		centerJPanel.setLayout(card);
		centerJPanel.setBounds(265, 230, 600, 380);
		centerJPanel.add(searchBookJPanel, "searchBook");
		centerJPanel.add(borroweredBookJPanel, "borroweredBook");
		centerJPanel.add(messageJPanel, "message");
		
		//
		nameJLabel=new JLabel("用户"+username);
		nameJLabel.setFont(new Font("宋体",Font.PLAIN,20));
		nameJLabel.setBounds(10, 50, 200, 40);
		
		choiceJPanel = new JPanel();
		choiceJPanel.setBounds(0, 168, 225, 575);
		choiceJPanel.add(searchBookJLabel);
		choiceJPanel.add(borroweredBookJLabel);
		choiceJPanel.add(messageJLabel);
		choiceJPanel.add(nameJLabel);
		choicebackJLabel = new JLabel();
		choicebackJLabel.setIcon(choicebackIcon);
		choicebackJLabel.setBounds(0, 0, 1000, 540);
		//choiceJPanel.add(choicebackJLabel);
		choiceJPanel.setLayout(null);

		
		
	}
	
	public BorrowerView(String username){
		
		this.username=username;
		
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
		//mainpanel.add(moveLabel);
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
			borroweredBookJLabel.setForeground(Color.BLACK);
			messageJLabel.setForeground(Color.BLACK);
			searchBookJLabel.setForeground(Color.blue);
			setCursor(Cursor.HAND_CURSOR);
		}
		if(e.getSource()==borroweredBookJLabel){
			card.show(centerJPanel, "borroweredBook");	
			borroweredBookJLabel.setForeground(Color.blue);
			messageJLabel.setForeground(Color.BLACK);
			searchBookJLabel.setForeground(Color.BLACK);
			//判断有没有借阅记录
			
		}
		if(e.getSource()==messageJLabel){
			card.show(centerJPanel, "message");		
			borroweredBookJLabel.setForeground(Color.BLACK);
			messageJLabel.setForeground(Color.blue);
			searchBookJLabel.setForeground(Color.BLACK);
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
		if(e.getSource()==messageJLabel){
			messageJLabel.setForeground(Color.RED);
			setCursor(Cursor.HAND_CURSOR);
		}
	}
	//鼠标离开
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==searchBookJLabel){
			if(searchBookJLabel.getForeground().equals(Color.blue)){
				searchBookJLabel.setForeground(Color.blue);
			}else{
			    searchBookJLabel.setForeground(Color.BLACK);
			    setCursor(Cursor.getDefaultCursor());
			}
		}
		if(e.getSource()==borroweredBookJLabel){
			if(borroweredBookJLabel.getForeground().equals(Color.blue)){
				
			}else{
			   borroweredBookJLabel.setForeground(Color.BLACK);
			   setCursor(Cursor.getDefaultCursor());
			}
		}
		if(e.getSource()==messageJLabel){
			if(messageJLabel.getForeground().equals(Color.blue)){
				
			}else{
			   messageJLabel.setForeground(Color.BLACK);
			   setCursor(Cursor.getDefaultCursor());
			}
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
