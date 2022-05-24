package com.monocept.repository;

import com.monocept.model.BaseEntity;

public class StudentRepository implements BaseRepository {
	private StorageRepository repository;

	public StudentRepository(StorageRepository repository) {
		this.repository = repository;
	}

	@Override
	public StorageRepository getRepository() {
		return repository;
	}

	@Override
	public void save(BaseEntity entity) {
		if (entity == null) {
			return;
		}
		repository.store(entity);
	}

}
