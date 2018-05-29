package com.mr.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 安晓 on 2018/5/28.
 */
@Controller
@RequestMapping("employee")
public class EmployeeController {

    @RequiresPermissions("employee:list")
    @RequestMapping("list")
    public String list()
    {
        System.out.println("进入员工：list");
        return "emp";
    }

    @RequiresPermissions("employee:save")
    @RequestMapping("save")
    public String save()
    {
        System.out.println("进入员工：save");
        return "emp";
    }

    @RequiresPermissions("employee:delete")
    @RequestMapping("delete")
    public String delete()
    {
        System.out.println("进入员工：delete");
        return "emp";
    }

    @RequiresPermissions("employee:update")
    @RequestMapping("update")
    public String update()
    {
        System.out.println("进入员工：update");
        return "emp";
    }
}
