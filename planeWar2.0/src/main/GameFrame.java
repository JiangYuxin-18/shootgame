package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
/*
 * 游戏窗体类
 */
public class GameFrame extends JFrame {
	
	public GameFrame() {
		setTitle("飞机大战");//设置标题
		setSize(526, 685);//设定尺寸
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击关闭按钮是关闭程序
        setLocationRelativeTo(null);   //设置居中
    	setResizable(false); //不允许修改界面大小
	}
}
