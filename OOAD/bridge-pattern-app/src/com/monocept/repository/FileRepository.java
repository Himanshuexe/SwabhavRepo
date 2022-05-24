package com.monocept.repository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.monocept.model.BaseEntity;

public class FileRepository implements StorageRepository {

	@Override
	public void store(BaseEntity entity) {
		try {
			FileOutputStream fileOut = new FileOutputStream("resources/file.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(entity);
			objectOut.close();
			System.out.println("File saved\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
