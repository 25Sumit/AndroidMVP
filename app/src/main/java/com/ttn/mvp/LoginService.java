package com.ttn.mvp;

public class LoginService {


  public boolean login(String username, String password) {
    return "sumit".equals(username) && "sumit@123".equals(password);
  }
}
