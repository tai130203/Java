package Vew;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.LoginActionListener;
import Model.LoginModel;

public class LoginView extends JFrame{
	private LoginModel loginModel;
	private SinhvienHomePageView svHomepageView;
	private JTextField jtxtUser = new JTextField();
	private JPasswordField jtxtPass = new JPasswordField();
	
	public LoginView()
	{
		this.loginModel = new LoginModel();
		this.init();
		this.setVisible(true);
	}
	protected void init()
	{
		this.setLayout(new BorderLayout());
		this.setSize(500,300);
		this.setTitle("Thu vien Trung Tam DHQG-TPHCM");
		this.setForeground(Color.BLUE);
		
		Font font_panel = new Font("Arial", Font.BOLD, 30);
		
		
		JLabel jlabDangNhap = new JLabel("Nhap thong tin tai khoan", JLabel.CENTER);
		jlabDangNhap.setFont(font_panel);
		jlabDangNhap.setForeground(Color.BLUE);
		
		JPanel jpanLogin = new JPanel();
		jpanLogin.setLayout(new GridLayout(2,2, 20,10));
		jpanLogin.setForeground(Color.BLACK);
		jpanLogin.setFont(font_panel);
		
		JLabel jlab_User = new JLabel("Ten dang nhap");
		jlab_User.setFont(font_panel);
		JLabel jlab_Pass = new JLabel("Mat khau");
		jlab_Pass.setFont(font_panel);
		
		jtxtUser.setFont(font_panel);
		jtxtPass.setFont(font_panel);
		
		jpanLogin.add(jlab_User);
		jpanLogin.add(jtxtUser);
		jpanLogin.add(jlab_Pass);
		jpanLogin.add(jtxtPass);
		
		
		LoginActionListener loginAc = new LoginActionListener(this);
		JButton jbutXacNhan = new JButton("Xac nhan");
		jbutXacNhan.addActionListener(loginAc);
		
		this.add(jlabDangNhap,BorderLayout.NORTH);
		this.add(jpanLogin, BorderLayout.CENTER);
		this.add(jbutXacNhan,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	@SuppressWarnings("deprecation")
	public boolean KiemTraThongTin() {
		
		System.out.println("Dang kiem tra thong tin dang nhap");
		if(this.loginModel.CheckInfor(jtxtUser.getText(), jtxtPass.getText()) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
