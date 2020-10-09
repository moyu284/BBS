package com.chen.service;

import com.chen.pojo.Threads;
import com.chen.pojo.Topic;

import java.sql.Timestamp;
import java.util.List;

public interface TopicService {
    List<Topic> getTopicListByFid(int fid);

    int saveTopic(Topic topic, Threads threads);

}
