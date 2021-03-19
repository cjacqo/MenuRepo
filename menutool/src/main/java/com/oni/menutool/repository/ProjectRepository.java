package com.oni.menutool.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oni.menutool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	

	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);
}
