package com.hts.webfluxplayground.sec02.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("customer")

public class Customer {

    @Id
    private Integer id;

    @Column("name")
    private String name;
    private String email;

}
