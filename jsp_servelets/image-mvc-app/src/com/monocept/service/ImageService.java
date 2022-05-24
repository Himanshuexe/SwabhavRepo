package com.monocept.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.Part;

import com.monocept.model.Image;
import com.monocept.repository.ImageRepository;

public class ImageService {
	private static ImageService instance;
	private static Object mutex = new Object();
	private ImageRepository imageRepository;

	public ImageService() {
		System.out.println("Image Service Started");
		imageRepository = new ImageRepository();
	}

	public static ImageService getInstance() {
		ImageService result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new ImageService();
			}
		}
		return instance;
	}

	public int addImage(Part image) {
		int result = 0;
		try {
			result = imageRepository.addImage(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public Image getImage(int id) {
		return imageRepository.getImage(id);
	}
}
