package edu.nju.booklend.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.springframework.context.support.GenericXmlApplicationContext;

import edu.nju.booklend.data.service.BookService;
import edu.nju.booklend.data.service.BorrowRecordService;
import edu.nju.booklend.data.service.BorrowerService;
import edu.nju.booklend.data.service.LoginService;

public class BorrowerLoginView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame jFrame;
	JPanel jPanel;
	Container container;
	ImageIcon backIcon,centerIcon,loginIcon,cancelIcon;
	JLabel backJLabel,headJLabel,nameJLabel,passwordJLabel;
	JTextField nameJTextField;
	JPasswordField passwordField;
	JButton loginJButton,cencelJButton;
	
	static GenericXmlApplicationContext ctx;	
	static BorrowerService borrowerService;
	static LoginService loginService;
	static BookService bookService;
	static BorrowRecordService borrowRecordService;

	public void init(){
		
		String path=System.getProperty("user.dir");
		
		jPanel=new LoginBackgroundJPanel2();
		
		nameJLabel=new JLabel("用户名");
		nameJLabel.setFont(new Font("", 0, 15));
		passwordJLabel=new JLabel("密   码");
		passwordJLabel.setFont(new Font("",0,15));
		
		nameJTextField=new JTextField();
		passwordField=new JPasswordField();
		
		loginJButton=new JButton("登录");
		loginJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //登录验证
				String username=nameJTextField.getText();
				char[] values = passwordField.getPassword();
				String password = new String(values); 
				if(loginService.checkBorrower(username, password)){
					new BorrowerView(username);
					dispose();
				}else{
					//提示用户名或密码错误，请重新输入！
					JOptionPane.showMessageDialog(null, "用户名或密码错误，请重新输入！", "提示",JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		
		cencelJButton=new JButton("退出");
		cencelJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				dispose();
			}
		});
	}
	
	public BorrowerLoginView(){
		init();
		this.setSize(470, 310);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("");
	    int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
	    int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
	    this.setBounds((screenWidth-470)/2, (screenHeight-300)/3, 470, 300);
	    this.setLayout(null);
   
	    jPanel.setBounds(0, 0, 470, 300);	    
	    jPanel.setLayout(null);
	    
	    nameJLabel.setBounds(120, 140, 50, 40);
	    nameJTextField.setBounds(200, 150, 150, 20);
	    passwordJLabel.setBounds(120,180,110,40);
	    passwordField.setBounds(200, 190, 150, 20);
	    
	    loginJButton.setBounds(140, 240, 70, 20);
	    cencelJButton.setBounds(260, 240, 70, 20);
	    
	    jPanel.add(cencelJButton);
	    jPanel.add(loginJButton);
	    jPanel.add(nameJLabel);
	    jPanel.add(passwordJLabel);
	    jPanel.add(nameJTextField);
	    jPanel.add(passwordField);

	    
	    this.add(jPanel);	    
	    this.setUndecorated(true);
	    this.setBackground(new Color(0,0,0,0));
	    this.setVisible(true);

	}
	
	public static void main(String[] args){
		//初始化
		ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:datasource-tx-jpa.xml");
		ctx.refresh();
		loginService=ctx.getBean(
				"loginService", LoginService.class);
		borrowerService=ctx.getBean(
				"borrowerService", BorrowerService.class);
		bookService=ctx.getBean(
				"bookService", BookService.class);
		borrowRecordService=ctx.getBean("borrowRecordService", BorrowRecordService.class);
		new BorrowerLoginView();
	}
	
}


class LoginBackgroundJPanel2 extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image backgroundIcon;
	MediaTracker tracker;
	
	public void init(){
		String path=System.getProperty("user.dir");
		tracker=new MediaTracker(this);
		backgroundIcon=Toolkit.getDefaultToolkit().getImage(path+"//images//loginBack.png");
		tracker.addImage(backgroundIcon, 1);
		try {
			tracker.waitForAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		init();
		g.clearRect(0, 0, 470, 300);
		g.drawImage(backgroundIcon, 0, 0, 470, 300, this);
	}

}
