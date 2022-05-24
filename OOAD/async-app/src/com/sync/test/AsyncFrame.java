package com.sync.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AsyncFrame extends JFrame {

	public AsyncFrame() {
		super("Async Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLayout(new FlowLayout());
		JButton printButton = new JButton("Print");
		JButton helloButton = new JButton("Hello");
		add(printButton);
		printButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread thread = new Thread() {
					public void run() {
						print();
					}
				};
				thread.start();
			}
		});

		add(helloButton);
		helloButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				hello();
			}
		});
		setVisible(true);
	}

	private Runnable print() {
		while (true) {
			String pattern = "HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String currentTime = sdf.format(new Date());
			System.out.println(currentTime);
		}
	}

	private void hello() {
		JOptionPane pane = new JOptionPane();
		JOptionPane.showConfirmDialog(pane, "Programmer says Hello!", "Hello!", JOptionPane.OK_CANCEL_OPTION);
	}
}
