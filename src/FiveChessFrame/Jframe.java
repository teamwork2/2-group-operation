package FiveChessFrame;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jframe extends JFrame implements MouseListener{
	JPanel jp1,jp2;
	JButton st1,st2;
	JLabel jb1,jb2,jb3,jb4,jb;	
	
	public Jframe(){
		jb=new JLabel("请选择背景并开始游戏");
		jb.setBounds(220,0, 200, 40);
		jb1=new JLabel("背景一");
		jb1.setBounds(100, 50, 50, 50);
		jb3=new JLabel("背景二");
		jb3.setBounds(100, 350, 100, 50);
		jb2=new JLabel(new ImageIcon("image/004.jpg"));
		jb2.setBounds(150, 50, 200, 200);
		jb4=new JLabel(new ImageIcon("image/005.jpg"));
		jb4.setBounds(150, 300, 200, 200);
		st1=new JButton("开始游戏");
		st1.setBounds(450, 50, 100, 100);
		st1.addMouseListener(this);
		st2=new JButton("开始游戏");
		st2.setBounds(450, 350, 100, 100);
		st2.addMouseListener(this);		
		jp1=new JPanel();
		jp1.setLayout(null);
		jp1.add(jb);
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(st1);
		jp1.add(jb3);
		jp1.add(jb4);
		jp1.add(st2);
		this.add(jp1);
		this.setVisible(true);
		this.setSize(600,600);	
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jframe();		
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==st1){
			new FiveChessGame();			
		}
		if(e.getSource()==st2){
			new FiveChessFrame();			
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub		
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}