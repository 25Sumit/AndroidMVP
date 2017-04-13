package com.ttn.mvp;

public interface LoginView {
  String getUsername();

  void showUsernameError(int resId);

  String getPassword();

  void showPasswordError(int resId);

  void startMainActivity();

  void showLoginError(int resId);
}
