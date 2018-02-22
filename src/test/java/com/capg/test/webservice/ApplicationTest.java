package com.capg.test.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;


 		@SuppressWarnings("deprecation")
		@ContextConfiguration(
 				classes = SpringApplication.class, 
 				loader = SpringApplicationContextLoader.class)
		@WebAppConfiguration
		@IntegrationTest
		public class ApplicationTest {
		 
		}

