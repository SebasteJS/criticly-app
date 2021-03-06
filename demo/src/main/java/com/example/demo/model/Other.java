package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Other")
public class Other {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long otherId;
}
