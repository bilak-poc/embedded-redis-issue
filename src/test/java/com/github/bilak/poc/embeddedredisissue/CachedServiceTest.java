package com.github.bilak.poc.embeddedredisissue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CachedServiceTest {

  @Autowired
  private CachedService cachedService;

  @Test
  void testCaching() {
    cachedService.cachedGet();
  }
}
