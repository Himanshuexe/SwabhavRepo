package com.monocept.frame.test;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.monocept.frame.ObserverFrame;
import com.monocept.frame.WelcomeFrame;

public class WelcomeFrameTest {
	public static void main(String[] args) {
		ObserverFrame frame1 = new ObserverFrame();

		frame1.setSize(400, 300);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	}

	public static void case1() {
		WelcomeFrame frame = new WelcomeFrame("Hello says Himanshu");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton button = new JButton();
	}
}
