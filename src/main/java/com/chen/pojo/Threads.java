package com.chen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 28444
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Threads {

  private long tid;
  private long pid;
  private long fid;
  private long ftype;
  private String author;
  private long authorid;
  private String subject;
  private String content;
  private java.sql.Timestamp addtime;
  private long tnum;

}
