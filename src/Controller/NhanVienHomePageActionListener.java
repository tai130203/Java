package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vew.LoginView;
import Vew.NhanVienHomePageView;

public class NhanVienHomePageActionListener implements ActionListener {
	private NhanVienHomePageView nvhpView;
	public NhanVienHomePageActionListener(NhanVienHomePageView nvhp_view)
	{
		super();
		this.nvhpView = nvhp_view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Dang xuat tai khoan"))
		{
			new LoginView();
			this.nvhpView.dispose();
		}
		
	}

}
