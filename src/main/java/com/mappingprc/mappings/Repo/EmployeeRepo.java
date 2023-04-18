package com.mappingprc.mappings.Repo;

import com.mappingprc.mappings.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    public Employee findById(int id);
}
