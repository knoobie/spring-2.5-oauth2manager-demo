package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.stereotype.Service;

@Service
public class MyBean {

  private final OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager;

  @Autowired
  public MyBean(OAuth2AuthorizedClientManager oAuth2AuthorizedClientManager) {
    this.oAuth2AuthorizedClientManager = oAuth2AuthorizedClientManager;
  }
}
