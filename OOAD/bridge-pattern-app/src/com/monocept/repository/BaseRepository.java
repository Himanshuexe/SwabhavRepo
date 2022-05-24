package com.monocept.repository;

import com.monocept.model.BaseEntity;

public interface BaseRepository {
	public void save(BaseEntity entity);

	public StorageRepository getRepository();
}
