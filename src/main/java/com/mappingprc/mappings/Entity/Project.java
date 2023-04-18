package com.mappingprc.mappings.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;
    private String projectName;
    private String startDate;
    private String endDate;
    @ManyToMany(mappedBy = "assignedProjects")
    private List<Employee> assignedEmployees;

}
