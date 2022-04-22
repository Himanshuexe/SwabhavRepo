package com.monocept.model.test;

import com.monocept.model.Image;
import com.monocept.model.ProxyImage;

public class ProxyImageTest {
	public static void main(String[] args) {
		Image img1 = new ProxyImage("One.jpg");
		Image img2 = new ProxyImage("Two.jpg");
		Image img3 = new ProxyImage("Three.jpg");

		img3.display();
	}
}
