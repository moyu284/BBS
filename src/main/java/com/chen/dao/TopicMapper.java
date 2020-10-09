package com.chen.dao;

import com.chen.pojo.Topic;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author 28444
 */
public interface TopicMapper {

    int addTopic(Topic topic);

    int deleteTopic(int pid);

    int updateTopic(Topic topic);

    int updateTopicAddTime(@Param("pid")int pid, @Param("addtime")Timestamp addtime);

    int updateTopicView(int pid);

    Topic queryTopicByPid(int pid);

    List<Topic> queryAllTopic();

    List<Topic> queryTopicByFid(int fid);

}
