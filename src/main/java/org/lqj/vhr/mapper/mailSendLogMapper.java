package org.lqj.vhr.mapper;

import org.lqj.vhr.model.mailSendLog;

public interface mailSendLogMapper {
    int insert(mailSendLog record);

    int insertSelective(mailSendLog record);
}