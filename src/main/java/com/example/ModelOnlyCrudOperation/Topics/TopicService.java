package com.example.ModelOnlyCrudOperation.Topics;


import com.example.ModelOnlyCrudOperation.Topics.Dto.TopicDto;
import com.example.ModelOnlyCrudOperation.Topics.Model.Topic;

import java.util.List;
import java.util.Optional;

public interface TopicService {


    Topic create(TopicDto topic);

//    Topic read(Long id);

    Optional<Topic> readSpecificTopic(Long id);

    List<Topic> readAll();

    Topic update(Topic topic);


    Boolean delete(Long topicId);

    Boolean deleteAllTopics();

}

