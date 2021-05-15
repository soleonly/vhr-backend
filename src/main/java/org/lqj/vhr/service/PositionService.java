package org.lqj.vhr.service;

import org.lqj.vhr.mapper.PositionMapper;
import org.lqj.vhr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Classname PositionService
 * @Description
 * @Author liuqiangjian
 * @Date 2021/4/16 22:09
 * @Version 1.0
 **/
@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> queryAll() {
        return positionMapper.queryAll();
    }

    public boolean save(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        if(positionMapper.insertSelective(position)==1){
            return true;
        }
        return false;
    }

    public boolean update(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position)==1;
    }

    public boolean delete(Integer id) {
        return positionMapper.deleteByPrimaryKey(id)==1;
    }

    public boolean deleteBatch(Integer[] ids) {
        return positionMapper.deleteBatchByPrimaryKey(ids)==ids.length;
    }
}
