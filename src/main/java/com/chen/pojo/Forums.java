package com.chen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 28444
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Forums {

  private long fid;
  private String type;
  private String name;
  private long fup;
  private long status;

  private int topicNum;
  private int threadNum;
  private String addTime;

}
