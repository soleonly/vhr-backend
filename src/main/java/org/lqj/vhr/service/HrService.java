package org.lqj.vhr.service;

import org.lqj.vhr.mapper.HrMapper;
import org.lqj.vhr.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Classname hrService
 * @Description
 * @Author liuqiangjian
 * @Date 2021/3/17 上午6:37
 * @Version 1.0
 **/
@Service
public class HrService implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if(hr == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        hr.setRoles(hrMapper.getHrRolesById(hr.getId()));
        return hr;
    }
}
