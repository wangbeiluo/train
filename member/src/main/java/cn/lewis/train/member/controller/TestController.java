package cn.lewis.train.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/12
 * @Copyright:
 */
@RestController
@RequestMapping("/test")
public class TestController
{
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello, World";
    }
}
