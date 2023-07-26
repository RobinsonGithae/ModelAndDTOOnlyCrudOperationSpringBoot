package com.example.ModelOnlyCrudOperation.Topics.Dto;
//DATA TRANSFER OJECT
//CONTAINS FIELDS,GETTERS AND SETTERS


import lombok.Data;

@Data

//annotated with data will create getters and setter automatically.
public class TopicDto {
  private String Description;
    private String Name;
    private Long id;

    //intended to have less attributes than Models(entities)
    //when retrieving data from a database using JPA or Hibernate,
    // the entities might have additional fields or complex relationships that you don't want to expose directly to the frontend.
    // In such cases, you can create DTOs to represent a simplified view of the data and
    // send only the necessary information to the frontend.

}
