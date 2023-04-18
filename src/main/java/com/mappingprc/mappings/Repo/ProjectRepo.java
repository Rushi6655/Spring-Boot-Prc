package com.mappingprc.mappings.Repo;

import com.mappingprc.mappings.Entity.Employee;
import com.mappingprc.mappings.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer> {
    public Project findById(int id);
}
