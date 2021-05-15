package org.lqj.vhr.controller.system.basic;

import org.lqj.vhr.model.Position;
import org.lqj.vhr.model.RespBean;
import org.lqj.vhr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname PositionController
 * @Description
 * @Author liuqiangjian
 * @Date 2021/4/16 22:07
 * @Version 1.0
 **/
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Autowired
    PositionService positionService;

    @GetMapping("/")
    public List<Position> queryAll(){
        return positionService.queryAll();
    }

    @PostMapping("/")
    public RespBean add(@RequestBody Position position){
        if(positionService.save(position)){
            return RespBean.ok("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @PutMapping("/")
    public RespBean update(@RequestBody Position position){
        if(positionService.update(position)){
            return RespBean.ok("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean delete(@PathVariable Integer id){
        if(positionService.delete(id)){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @DeleteMapping("/batch")
    public RespBean deleteBatch(Integer[] ids){
        if(positionService.deleteBatch(ids)){
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }

}
