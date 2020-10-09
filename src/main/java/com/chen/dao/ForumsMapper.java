package com.chen.dao;

import com.chen.pojo.Forums;

import java.util.List;

public interface ForumsMapper {

    int addForums(Forums forums);

    int deleteForums(int fid);

    int updateForums(Forums forums);

    Forums queryForumsByFid(int fid);

    List<Forums> queryAllForums();

}
