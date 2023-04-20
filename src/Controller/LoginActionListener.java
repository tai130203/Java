package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vew.LoginView;
import Vew.SinhvienHomePageView;

public class LoginActionListener implements ActionListener{
	private LoginView loginview;

	public LoginActionListener(LoginView logview) {
		super();
		this.loginview = logview;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("Xac nhan"))
		{
			if(this.loginview.KiemTraThongTin() == true)
			{
				System.out.println("Thong tin dung, dang nhap thanh cong");
				
				JOptionPane.showMessageDialog(this.loginview, "Đăng nhập thành công, nhấn Ok để tiếp tục", "Thông báo", JOptionPane.DEFAULT_OPTION);
				new SinhvienHomePageView("Tran Hoang Phuc");
				this.loginview.dispose();
			}
			else
			{
				System.out.println("Sai");
				JOptionPane.showMessageDialog(this.loginview, "Username hoặc mật khẩu không đúng\n Vui lòng nhập lại", "Đăng nhập không thành công", JOptionPane.YES_NO_OPTION);
			}
		}
		
	}
	
	
}
