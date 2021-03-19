package com.oni.menutool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oni.menutool.domain.Project;
import com.oni.menutool.exceptions.ProjectIdException;
import com.oni.menutool.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		} catch (Exception e) {
			throw new ProjectIdException("Project ID '" +project.getProjectIdentifier().toUpperCase()+ "' already exists");
		}
	}
}
