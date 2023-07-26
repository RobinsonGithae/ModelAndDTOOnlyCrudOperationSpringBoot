package com.example.ModelOnlyCrudOperation.Topics.Service.Impl;


import com.example.ModelOnlyCrudOperation.Topics.Dto.TopicDto;
import com.example.ModelOnlyCrudOperation.Topics.Model.Topic;
import com.example.ModelOnlyCrudOperation.Topics.Repository.TopicRepository;
import com.example.ModelOnlyCrudOperation.Topics.TopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//spring boot registers all services marked with the @service annotation

@Service("Topic service")
public class TopicsServiceImpl implements TopicService {
    private final Logger log = LoggerFactory.getLogger(TopicsServiceImpl.class);
    @Autowired
    private TopicRepository topicRepo;

    public TopicsServiceImpl(TopicRepository topicRepo) {
        //topic service //constructor
        this.topicRepo = topicRepo;
    }


    @Override
    public Topic create(TopicDto topicDto) {
        Topic topic1 = new Topic();
        topic1.setId(topicDto.getId());
        topic1.setDescription(topicDto.getDescription());
        topic1.setName(topicDto.getName());
        // topic1.setTimeLocal(LocalDate.now());


        return topicRepo.save(topic1);
    }


//    @Override
//    public Topic read(Long id) {
//        return topicRepo.findById(id).get();
//    }

    @Override
    public Optional<Topic> readSpecificTopic(Long id) {
        return topicRepo.findById(id);
    }

    @Override
    public List<Topic> readAll() {
        return topicRepo.findAll();
    }

    @Override
    public Topic update(Topic topic) {

        Topic topic1 = topicRepo.findById(topic.getId()).get();
        topic1.setName(topic.getName());
        topic1.setDescription(topic.getDescription());


        return topicRepo.save(topic1);

    }


//    @Override
//    public Topic update(TopicDto topic, Long topicID) {
//        Topic topicUpdate = topicRepo.findById(topicID).get();
//
//        return null;
//    }


//    @Override
//    public Topic update(Long topic) {
//
//      //  return topicRepo.save(topic);
//    }

    @Override
    public Boolean delete(Long topicId) {
        topicRepo.deleteById(topicId);
        //return true if operation successful
        return true;
    }

    @Override
    public Boolean deleteAllTopics() {
        topicRepo.deleteAll();
        return true;
    }

    //spring boot instanciates this service automatically
    //the service can have business logic
//spring services are singletons

//Add a dummy data variable


}
