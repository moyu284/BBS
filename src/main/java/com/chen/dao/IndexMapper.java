package com.chen.dao;

/**
 * @author 28444
 */
public interface IndexMapper {

    int getTopicNum(int fid);
    int getThreadNum(int fid);
    String getAddTime(int fid);
}
