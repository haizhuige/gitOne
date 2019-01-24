package com.forezp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	  @RequestMapping(value="/hello")
      public  String helloWorld() {
    	  return "hello docker!";
      }
}
