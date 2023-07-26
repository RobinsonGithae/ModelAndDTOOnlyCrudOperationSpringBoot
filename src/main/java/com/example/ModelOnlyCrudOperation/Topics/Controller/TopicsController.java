package com.example.ModelOnlyCrudOperation.Topics.Controller;


import com.example.ModelOnlyCrudOperation.Topics.Dto.TopicDto;
import com.example.ModelOnlyCrudOperation.Topics.Model.Topic;
import com.example.ModelOnlyCrudOperation.Topics.Service.Impl.TopicsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//annotate as RestController to mark the class as a restful resource that can avail its members for API CALLS
@Slf4j
@RestController
@RequestMapping()
public class TopicsController {
    // A controller is a resource. Coresponding mappings/url path are defined here for API calls.
    //create a private variable of topicService instance.
    // Add the auto wired annotation since the controller will depend on the topic service -- in the variable
    // (Inject the dependency with @auto wired - spring boot manages dependency injection aka Inversion Of Control)
    @Autowired
    private TopicsServiceImpl topicservvice;


    @GetMapping("/topic")
    //Map all get requests to the above path and perform all functionlity in the method mapped/matched below
    public List getTopicList(){
        return topicservvice.readAll();
    }


    @GetMapping("/topic/{topicId}")
    public Optional<Topic> getTopicWithId(@PathVariable Long topicId){
        return topicservvice.readSpecificTopic(topicId);


    }

//    @GetMapping("/topic/{topicid}")
//    //add curly braces to accept parameters from the user.
//    public Topic getTopicById(@PathVariable("topicid") String Id) {
//
//        return topicservvice.filterTopicById(Id);
//    }

    @PostMapping("/topic")
    public Topic createTopic(@RequestBody TopicDto topic){
        System.out.println("controller");
       return topicservvice.create(topic);
      //  return "Topic Created successfully";
    }

    @PutMapping("/topic/{topicId}")
    public String updateTopic(@RequestBody Topic topic, @PathVariable Long topicId){
        topic.setId(topicId);
        topicservvice.update(topic);
        return "Updated Topic "+ topic;
    }

    @DeleteMapping("/topic/{topicId}")
    public Boolean deleteTopic(@PathVariable Long topicId){
        topicservvice.delete(topicId);
        return true;
    }

    @DeleteMapping("/topic")
    public Boolean deleteAllTopics(){
        topicservvice.deleteAllTopics();
        return true;
    }




}
