package com.chen.service;

import com.chen.dao.ThreadsMapper;
import com.chen.dao.TopicMapper;
import com.chen.pojo.Threads;
import com.chen.pojo.Topic;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author 28444
 */
public class TopicServiceImpl implements TopicService{

    private TopicMapper topicMapper;
    public void setTopicMapper(TopicMapper topicMapper) {
        this.topicMapper = topicMapper;
    }

    private ThreadsMapper threadsMapper;
    public void setThreadsMapper(ThreadsMapper threadsMapper) {
        this.threadsMapper = threadsMapper;
    }

    public List<Topic> getTopicListByFid(int fid) {
        return topicMapper.queryTopicByFid(fid);
    }

    public int saveTopic(Topic topic, Threads threads) {
        Timestamp timestamp = getTime();

        topic.setAddtime(timestamp);
        int result = topicMapper.addTopic(topic);
        int result2 = 0;

        if (result > 0){
            threads.setAddtime(timestamp);
            threads.setPid(topic.getPid());
            result2 = threadsMapper.addThread(threads);
        }

        return result+result2;
    }

    private Timestamp getTime(){
        java.util.Date date = new Date();
        return new Timestamp(date.getTime());
    }
}
