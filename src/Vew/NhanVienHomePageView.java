package Vew;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Controller.NhanVienHomePageActionListener;
import Controller.SinhvVienHomePageActionListener;
import Model.NhanVienHomePageModel;

public class NhanVienHomePageView extends JFrame{
		private NhanVienHomePageModel nvHomePageModel;
		
		public NhanVienHomePageView()
		{
			this.nvHomePageModel = new NhanVienHomePageModel();
			this.init();
			this.setVisible(true);
		}
		private void init()
		{
			this.setTitle("TRANG NHAN VIEN");
			this.setSize(700,700);
			this.setLayout(new BorderLayout());
			this.setBackground(Color.LIGHT_GRAY);
			
			NhanVienHomePageActionListener nvhpac = new NhanVienHomePageActionListener(this);
			
			JMenuBar jmenuBar = new JMenuBar();
			
			JMenu jmenu_file = new JMenu("File");
			JMenuItem jmenuitem_Change_password = new JMenuItem("Doi mat khau");
			jmenuitem_Change_password.addActionListener(nvhpac);
			JMenuItem jmennuitem_dangxuat = new JMenuItem("Dang xuat tai khoan");
			jmennuitem_dangxuat.addActionListener(nvhpac);
			jmenu_file.add(jmenuitem_Change_password);
			jmenu_file.add(jmennuitem_dangxuat);
			
			JMenu jmenu_help = new JMenu("Help");
			JMenuItem jmenuitem_about = new JMenuItem("About us");
			jmenuitem_about.addActionListener(nvhpac);
			JMenuItem jmenItem_morehelp = new JMenuItem("More help");
			jmenItem_morehelp.addActionListener(nvhpac);
			jmenu_help.add(jmenuitem_about);
			jmenu_help.add(jmenItem_morehelp);
			
			jmenuBar.add(jmenu_file);
			jmenuBar.add(jmenu_help);
			
			Font font_head = new Font("Arial", Font.BOLD, 25);
			Font font_center = new Font("Arial", Font.BOLD, 40);

			
			JPanel jpanHead_Intro = new JPanel();
			jpanHead_Intro.setLayout(new GridLayout(2,1));
			
			JLabel jlabTrangchu = new JLabel("Trang chủ", JLabel.CENTER);
			jlabTrangchu.setFont(font_head);
			jlabTrangchu.setForeground(Color.blue);
			JLabel jlabTenNV_manv = new JLabel("Tên Nhân Viên - " + "Mã Nhân Viên", JLabel.CENTER);
			jlabTenNV_manv.setFont(font_head);
			jlabTenNV_manv.setForeground(Color.blue);
			
			jpanHead_Intro.add(jlabTrangchu);
			jpanHead_Intro.add(jlabTenNV_manv);
			jpanHead_Intro.setBackground(Color.orange);
			jpanHead_Intro.setOpaque(true);
			
			JPanel jpanCenter = new JPanel();
			jpanCenter.setLayout(new GridLayout(4,1));
			
			JButton jbut_TTCaNhan = new JButton("Thông tin cá nhân");
			jbut_TTCaNhan.setFont(font_center);
			jbut_TTCaNhan.setBackground(Color.CYAN);
			JButton jbut_QlThanhVien = new JButton("Quản lí thành viên");
			jbut_QlThanhVien.setFont(font_center);
			jbut_QlThanhVien.setBackground(Color.YELLOW);
			JButton jbut_QlMTSach = new JButton("Quản lí mượn trả sách");
			jbut_QlMTSach.setFont(font_center);
			jbut_QlMTSach.setBackground(Color.GRAY);
			JButton jbut_BCTk = new JButton("Báo cáo thống kê");
			jbut_BCTk.setFont(font_center);
			jbut_BCTk.setBackground(Color.GREEN);
			
			jpanCenter.add(jbut_TTCaNhan);
			jpanCenter.add(jbut_QlThanhVien);
			jpanCenter.add(jbut_QlMTSach);
			jpanCenter.add(jbut_BCTk);
			
			
			this.setJMenuBar(jmenuBar);
			this.add(jpanHead_Intro,BorderLayout.NORTH);
			this.add(jpanCenter, BorderLayout.CENTER);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
		}
}
