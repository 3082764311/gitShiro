package com.mr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 安晓 on 2018/5/25.
 */
@Controller
public class MainController {

    @RequestMapping("/main")
    public String mainPage()
    {
        return "main";
    }
}
