package com.mumu.customercenter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        logger.info("调用了helloController"+this.hello);
        logger.info("调用了helloController: {}",this.hello);
        log.info("slf4j:{}",this.hello);
        return this.hello;
    }
}
