package com.monocept.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.monocept.subscribers.DevilListener;
import com.monocept.subscribers.GodListener;

public class ObserverFrame extends JFrame {

	public ObserverFrame() {
		super("Observer");
		setLayout(new FlowLayout());
		JButton button = new JButton("Hello");
		button.addActionListener(new GodListener());
		button.addActionListener(new DevilListener());
		add(button);
	}

}
