package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class DemoController {
    
    @RequestMapping("/recomm/abc")
    @ResponseBody
    public Result recomm() {
        log.info("recomm");
        /*try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Result result = new Result();
        result.setCode(1);
        result.setMsg("this is recomm");
        log.info("recomm result: {}", result);
        return result;
    }
    
    @RequestMapping("/etl/abc")
    @ResponseBody
    public Result etl(String name) {
        if (name != null) {
            log.info("etl length: {}", name.length());
        }
        /*try {
            Thread.sleep(3500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Result result = new Result();
        result.setCode(1);
        result.setMsg("this is etl");
        return result;
    }
    
    @RequestMapping("/etl/timeout")
    @ResponseBody
    public Result etlTimeout(String name) {
        if (name != null) {
            log.info("etl length: {}", name.length());
        }
        try {
            Thread.sleep(3500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Result result = new Result();
        result.setCode(1);
        result.setMsg("this is timeout");
        return result;
    }
}