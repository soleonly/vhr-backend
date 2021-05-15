package org.lqj.vhr.service;

import org.lqj.vhr.mapper.MenuMapper;
import org.lqj.vhr.model.Hr;
import org.lqj.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname MenuService
 * @Description
 * @Author liuqiangjian
 * @Date 2021/4/11 09:31
 * @Version 1.0
 **/
@Service
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    //@Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }
}
