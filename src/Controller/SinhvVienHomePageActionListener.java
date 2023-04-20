package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vew.LoginView;
import Vew.SinhvienHomePageView;
import Vew.ThongTinSinhVienView;

public class SinhvVienHomePageActionListener implements ActionListener {
	private SinhvienHomePageView svhpview;
	public SinhvVienHomePageActionListener(SinhvienHomePageView svhp_view)
	{
		super();
		this.svhpview = svhp_view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Thong tin muon sach"))
		{
			new LoginView();
			this.svhpview.dispose();
		}
		if(src.equals("Thong tin sinh vien"))
		{
			new ThongTinSinhVienView();
			this.svhpview.dispose();
		}
		
	}

}
