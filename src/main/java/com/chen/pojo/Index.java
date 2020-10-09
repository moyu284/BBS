package com.chen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 28444
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Index {

    private Forums group;
    private List<Forums> forumList;
    private List<Forums> subList;


}
