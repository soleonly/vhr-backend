package org.lqj.vhr.mapper;

import org.apache.ibatis.annotations.Param;
import org.lqj.vhr.model.Position;

import java.util.List;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> queryAll();

    int deleteBatchByPrimaryKey(@Param("ids") Integer[] ids);
}