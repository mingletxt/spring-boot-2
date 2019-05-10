package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;


/**
 * Created by mingle. Time 2019-05-10 10:32 Desc 文件描述
 */
@RestController
public class LatencyCtrl {
    
    @RequestMapping("/hello/{latency}")
    public String hello(@PathVariable long latency) {
        if (latency > 0) {
            try {
                TimeUnit.MILLISECONDS.sleep(latency);   // 1
            } catch (InterruptedException e) {
                return "Error during thread sleep";
            }
        }
        
        return "Welcome to boot 2 world ~ latency: " + latency;
    }
    
}
