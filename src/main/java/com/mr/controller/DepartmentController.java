package com.mr.controller;

import org.apache.poi.util.SystemOutLogger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 安晓 on 2018/5/28.
 */
@Controller
@RequestMapping("department")
public class DepartmentController {

    @RequiresPermissions("department:list")
    @RequestMapping("list")
    public String list()
    {
        System.out.println("进入部门：list");
        return "dept";
    }

    @RequiresPermissions("department:save")
    @RequestMapping("save")
    public String save()
    {
        System.out.println("进入部门：save");
        return "dept";
    }

    @RequiresPermissions("department:delete")
    @RequestMapping("delete")
    public String delete()
    {
        System.out.println("进入部门：delete");
        return "dept";
    }

    @RequiresPermissions("department:update")
    @RequestMapping("update")
    public String update()
    {
        System.out.println("进入部门：update");
        return "dept";
    }
}
