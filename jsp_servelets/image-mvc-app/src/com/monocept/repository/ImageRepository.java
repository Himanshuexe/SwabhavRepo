package com.monocept.repository;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Part;

import com.monocept.model.Image;
import com.mysql.cj.jdbc.Blob;

public class ImageRepository {

	private List<Image> images = new ArrayList<Image>();

	public ImageRepository() {
		System.out.println("Image Repository created");
	}

	public Connection getConnection() {
		Connection con = null;
		String dbDriver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(dbDriver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:4040/jdbc_app", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public int addImage(Part image) throws IOException {
		int result = 0;
		try {
			Connection con = getConnection();
			String query = "INSERT INTO images(image) VALUES(?)";
			PreparedStatement statement = con.prepareStatement(query);
			InputStream input = image.getInputStream();
			statement.setBlob(1, input);
			result = statement.executeUpdate();
			System.out.println("Record Inserted");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	public Image getImage(int id) {
		Image image = null;
		try {
			Connection con = getConnection();
			String query = "Select * from images WHERE i_id=?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getBlob(2));
					int imageId = rs.getInt(1);
					Blob blob = (Blob) rs.getBlob(2);
					image = new Image(id, blob);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return image;
	}
}
