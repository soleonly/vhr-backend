package org.lqj.vhr.exception.global;

import org.lqj.vhr.model.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @Classname GlobalExceptionHandler
 * @Description
 * @Author liuqiangjian
 * @Date 2021/4/16 23:44
 * @Version 1.0
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLException.class)
    public RespBean sqlException(SQLException e){
        if(e instanceof SQLIntegrityConstraintViolationException){
            return RespBean.error("该数据有关联错误，操作失败");
        }

        return RespBean.error("数据库错误，操作失败");
    }
}
