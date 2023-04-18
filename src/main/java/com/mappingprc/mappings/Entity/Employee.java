package com.mappingprc.mappings.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private  String empName;
    @ManyToMany
    @JsonBackReference
    @JoinTable(name = "project_teams",
    joinColumns = @JoinColumn(name = "employee_id") ,
    inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> assignedProjects;
}
