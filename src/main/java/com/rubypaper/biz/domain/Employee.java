package com.rubypaper.biz.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "S_EMP")
@TableGenerator(name = "SEQ_GENERATOR",
                table = "SHOPPING_SEQUENCE",
                pkColumnName = "SEQ_NAME",
                pkColumnValue = "EMP_SEQ",
                valueColumnName = "NEXT_VALUE",
                allocationSize = 1)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
                    generator = "SEQ_GENERATOR")
    private Long id;

    private String name;
}
