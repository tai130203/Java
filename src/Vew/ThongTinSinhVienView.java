package Vew;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Model.ThongTInSinhVienModel;

public class ThongTinSinhVienView extends JFrame {
	private ThongTInSinhVienModel ttSinhVienModel;
	protected JPanel jpanImage;
	protected JPanel jpanThongTin;
	
	public ThongTinSinhVienView()
	{
		this.ttSinhVienModel = new ThongTInSinhVienModel();
		
		this.init();
		this.setVisible(true);
	}
	public ThongTinSinhVienView(String username)
	{
		this.ttSinhVienModel = new ThongTInSinhVienModel(username);
		
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Thong Tin Sinh Vien");
		this.setLayout(new GridLayout(1,2));
		this.setSize(700,400);
		
		this.jpanImage = new JPanel();
		this.jpanImage.setLayout(new BorderLayout());
		
		JButton jbut_image = new JButton("IMAGE");
		
		Font font = new Font("Arial", Font.BOLD, 25);
		
		this.jpanThongTin = new JPanel();
		this.jpanThongTin.setLayout(new BorderLayout());
		JTextArea jtexThongTin = new JTextArea("Ten: " + ttSinhVienModel.getName() +
											   "\nMa so sinh vien:  " + ttSinhVienModel.getMssv() +
											   "\nTen username: " + ttSinhVienModel.getTenUserName() +
											   "\nNgay Sinh: " + ttSinhVienModel.getNgaySinh() + 
											   "\nTruong: " + ttSinhVienModel.getTruong());
		jtexThongTin.setEditable(false);
		jtexThongTin.setForeground(Color.blue);
		jtexThongTin.setFont(font);
		jpanThongTin.add(jtexThongTin, BorderLayout.CENTER);
		
		JButton jbut_DoiMK = new JButton("Doi mat khau");
		jpanThongTin.add(jbut_DoiMK, BorderLayout.SOUTH);
		
		this.add(jpanImage);
		this.add(jpanThongTin);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
