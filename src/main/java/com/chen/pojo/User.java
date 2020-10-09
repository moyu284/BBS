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
public class User {

  private long id;
  private String userName;
  private String userPw;
  private String phone;
  private String email;
  private long userType;
  private long isDel;

}
