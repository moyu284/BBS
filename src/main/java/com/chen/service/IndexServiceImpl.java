package com.chen.service;

import com.chen.dao.ForumsMapper;
import com.chen.dao.IndexMapper;
import com.chen.dao.TopicMapper;
import com.chen.pojo.Forums;
import com.chen.pojo.Index;
import com.chen.pojo.Topic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 28444
 */
public class IndexServiceImpl implements IndexService{

    private ForumsMapper forumsMapper;
    private IndexMapper indexMapper;

    public void setForumsMapper(ForumsMapper forumsMapper) {
        this.forumsMapper = forumsMapper;
    }

    public void setIndexMapper(IndexMapper indexMapper) {
        this.indexMapper = indexMapper;
    }

    public List<Index> getIndex() {
        List<Index> list = new ArrayList<Index>();
        List<Forums> forumsList = forumsMapper.queryAllForums();


        List<Forums> groupsList = new ArrayList<Forums>();
        List<Forums> forumList = new ArrayList<Forums>();
        List<Forums> subList = new ArrayList<Forums>();

        for (Forums f:forumsList) {
            if ("group".equals(f.getType())){
                groupsList.add(f);
            }else if ("forum".equals(f.getType())){
                forumList.add(f);
            }else if ("sub".equals(f.getType())){
                subList.add(f);
            }
        }

        for (Forums group : groupsList) {
            Index index = new Index();
            index.setGroup(group);
            List<Forums> indexForums = new ArrayList<Forums>();
            List<Forums> indexSub = new ArrayList<Forums>();
            for (Forums forum : forumList) {
                if (forum.getFup() == group.getFid()){
                    indexForums.add(forum);
                    for (Forums sub : subList) {
                        if (sub.getFup() == forum.getFid()){
                            indexSub.add(sub);
                        }
                    }
                    forum.setTopicNum(indexMapper.getTopicNum((int) forum.getFid()));
                    forum.setThreadNum(indexMapper.getThreadNum((int) forum.getFid()));
                    forum.setAddTime(indexMapper.getAddTime((int) forum.getFid()));
                    index.setSubList(indexSub);
                }
            }
            index.setForumList(indexForums);
            list.add(index);
        }
        return list;
    }
}
