package com.github.bilak.poc.embeddedredisissue;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CachedService {

  @Cacheable(value = "testcache")
  public String cachedGet() {
    return "cache me";
  }
}
