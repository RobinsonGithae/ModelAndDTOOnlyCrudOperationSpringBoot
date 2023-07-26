package com.example.ModelOnlyCrudOperation.Topics.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//hint can replace Getter and setter with @Data
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String name;
    private String  description;
  //  private LocalDate timeLocal;

}
