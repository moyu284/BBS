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
public class ThreadsServiceImpl implements ThreadsService{

    private ThreadsMapper threadsMapper;
    public void setThreadsMapper(ThreadsMapper threadsMapper) {
        this.threadsMapper = threadsMapper;
    }

    private TopicMapper topicMapper;
    public void setTopicMapper(TopicMapper topicMapper) {
        this.topicMapper = topicMapper;
    }

    public List<Threads> getThreadsList(int pid) {
        topicMapper.updateTopicView(pid);
        return threadsMapper.queryThreadsByPid(pid);
    }

    public int saveThread(Threads threads) {
        Timestamp timestamp = getTime();
        threads.setAddtime(timestamp);
        topicMapper.updateTopicAddTime((int) threads.getPid(),timestamp);
        return threadsMapper.addThread(threads);
    }

    private Timestamp getTime(){
        java.util.Date date = new Date();
        return new Timestamp(date.getTime());
    }

}
