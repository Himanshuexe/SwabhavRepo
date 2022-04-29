package com.monocept.presentation;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.monocept.model.User;
import com.monocept.dataaccess.UserRepository;

public class LoginUI {

	public LoginUI() {
		new LoginFrame();
	}

	class LoginFrame extends JFrame {

		private LoginFrame() {
			super("Login");
			createFrame();
		}

		private void createFrame() {

//			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			setLayout(new FlowLayout(FlowLayout.CENTER));
			JLabel usernameLabel = new JLabel("Enter username");
			JTextField usernameField = new JTextField(20);
			add(usernameLabel);
			add(usernameField);

			JLabel passwordLabel = new JLabel("Enter password");
			JTextField passwordField = new JTextField(20);
			add(passwordLabel);
			add(passwordField);

			JButton loginButton = new JButton("Login");
			usernameField.setBounds(600, 200, 140, 40);
			passwordField.setBounds(600, 400, 140, 40);
			loginButton.setBounds(600, 500, 140, 40);

			loginButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					String name = usernameField.getText();
					String password = passwordField.getText();
					User user = new UserRepository().authenticateUser(name, password);
					if (user != null) {
						detailsFrame(user);
					} else
						JOptionPane.showMessageDialog(null, "Login failed");

				}
			});

			add(loginButton);
			setSize(300, 200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}

		private void detailsFrame(User user) {
			JFrame detailFrame = new JFrame("User Details");
			JLabel userData = new JLabel(user.toString());
			detailFrame.add(userData);
			detailFrame.setSize(650, 100);
			detailFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
			detailFrame.setLocationRelativeTo(null);
			detailFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			detailFrame.setVisible(true);
		}
	}
}
