package com.chen.dao;

import com.chen.pojo.Threads;

import java.util.List;

/**
 * @author 28444
 */
public interface ThreadsMapper {

    int addThread(Threads threads);

    int deleteThread(int tid);

    int updateThread(Threads threads);

    Threads queryThreadByTid(int tid);

    List<Threads> queryAllThread();
    
    List<Threads> queryThreadsByPid(int pid);

}
