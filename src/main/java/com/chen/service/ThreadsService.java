package com.chen.service;

import com.chen.pojo.Threads;

import java.util.List;

/**
 * @author 28444
 */
public interface ThreadsService {

    List<Threads> getThreadsList(int pid);

    int saveThread(Threads threads);
}
