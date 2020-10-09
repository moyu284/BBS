package com.chen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author 28444
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

  private long pid;
  private long fid;
  private String author;
  private long authorid;
  private String subject;
  private long view;
  private long replies;
  private Timestamp addtime;

}
