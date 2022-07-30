package com.rubypaper.biz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "S_EMP")
public class Employee {

    @Id
    private EmployeeId empId;

    private String name;
}
