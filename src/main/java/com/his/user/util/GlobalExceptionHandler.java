package com.his.user.util;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.web.bind.annotation.*;

//@ControllerAdvice 方法体需要加 @ResponseBody
@RestControllerAdvice(annotations = {RestController.class}) //Controller.class
public class GlobalExceptionHandler {
    /**
     * 异常处理
     * @return
     */
    @ExceptionHandler()//（异常类。class）
    public M exceptionHandler(){
        //条件构造器
        LambdaQueryWrapper queryWrapper = new LambdaQueryWrapper();
//        queryWrapper.like();
//        queryWrapper.orderByDesc();
        return  null;
    }
}

