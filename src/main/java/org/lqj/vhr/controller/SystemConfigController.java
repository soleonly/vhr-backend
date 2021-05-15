package org.lqj.vhr.controller;

import org.lqj.vhr.model.Menu;
import org.lqj.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname SystemConfigCOntroller
 * @Description
 * @Author liuqiangjian
 * @Date 2021/4/11 08:25
 * @Version 1.0
 **/
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenusByHrId(){
        return menuService.getMenusByHrId();
    }
}
