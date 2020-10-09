package com.chen.service;

import com.chen.dao.ForumsMapper;
import com.chen.dao.ThreadsMapper;
import com.chen.dao.TopicMapper;
import com.chen.pojo.Threads;

/**
 * @author 28444
 */
public class AdminServiceImpl implements AdminService{

    private ForumsMapper forumsMapper;
    private TopicMapper topicMapper;
    private ThreadsMapper threadsMapper;
    public void setForumsMapper(ForumsMapper forumsMapper) {
        this.forumsMapper = forumsMapper;
    }
    public void setTopicMapper(TopicMapper topicMapper) {
        this.topicMapper = topicMapper;
    }
    public void setThreadsMapper(ThreadsMapper threadsMapper) {
        this.threadsMapper = threadsMapper;
    }


}
