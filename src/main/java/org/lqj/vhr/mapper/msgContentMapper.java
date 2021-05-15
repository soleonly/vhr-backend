package org.lqj.vhr.mapper;

import org.lqj.vhr.model.msgContent;

public interface msgContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(msgContent record);

    int insertSelective(msgContent record);

    msgContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(msgContent record);

    int updateByPrimaryKey(msgContent record);
}