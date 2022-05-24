package com.monocept.model;

import com.mysql.cj.jdbc.Blob;

public class Image {
	private int id;
	private Blob data;

	public Image(int id, Blob data) {
		this.id = id;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public Blob getData() {
		return data;
	}
}
