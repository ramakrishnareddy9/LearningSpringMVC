package com.springmvc.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springmvc")
public class AppConfig {
    // Only component scanning, no web or db logic here
}
