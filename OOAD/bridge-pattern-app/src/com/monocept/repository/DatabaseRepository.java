package com.monocept.repository;

import com.monocept.model.BaseEntity;

public class DatabaseRepository implements StorageRepository {

	@Override
	public void store(BaseEntity entity) {
		System.out.println("Data stored in DataBase Repository");
	}

}
