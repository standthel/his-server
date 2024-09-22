package com.his.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.his.user.entity.User;
import com.his.user.service.UserService;
import com.his.user.util.M;
import com.sun.prism.impl.BaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 手机短信验证
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
 private UserService userService;
    /**
     * 验证后登录
     * @param map
     * @param session
     * @return
     */
    @PostMapping("/login")
    public M login(@RequestBody Map map, HttpSession session){
        //获取手机号JSON
        String phone = map.get("phone").toString();
        //获取验证码
        String code = map.get("code").toString();

        //从session中取得保存的验证码
        Object codeIs = session.getAttribute(phone);

        //进行校验码比对
        if (codeIs != null && codeIs.equals(code)) {
            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
            queryWrapper.eq();
            User user = userService.getOne(queryWrapper);
            if (user ==null) {
                user=new User();
                userService.save(user);
            }
            session.setAttribute("user",user.getId());
            return M.ok();
        }
        AtomicInteger amount=new AtomicInteger(0);
        amount.addAndGet();
        return M.error()    ;
    }
}
