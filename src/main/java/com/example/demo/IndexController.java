package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


/**
 * Created by mingle. Time 2019-05-09 14:23 Desc 文件描述
 */
@RestController
@Slf4j
public class IndexController {
    
    @RequestMapping("index")
    @ResponseBody
    public Result index() {
        log.info("index");
        Result result = new Result();
        result.setCode(1);
        result.setMsg("index");
        log.info("result {}", result);
        return result;
    }
}
