package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/TestPage")
public class TestPage {
    @RequestMapping("/testStr")
    @ResponseBody
    public String testStr() {
        return "这是演示的页面返回数据。。。";
    }
}
