package com.example.ModelOnlyCrudOperation.Topics.Repository;


import com.example.ModelOnlyCrudOperation.Topics.Model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Long> {
}
