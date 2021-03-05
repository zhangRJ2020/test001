package com.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Administrator
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public @ResponseBody String user(){

        return "测试项目";
    }
}
