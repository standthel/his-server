package com.his;

import com.sun.org.apache.xpath.internal.objects.XObject;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class JWT {
    //token的使用
    @Test
    public void getJWT(){

        Map<String , Object> map = new HashMap<>();
        map.put("id",1);

        Date data=new Date(System.currentTimeMillis()+1000L*60*3);
        Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"logloading")//加密方式及密钥
                .setClaims(map)//数据
                .setExpiration(data)//令牌有效期
                .compact();//生成令牌
    }
    //解析令牌
    @Test
    public void parseJWT(){
    Claims body=Jwts.parser()
            .setSigningKey("logloading")
            .parseClaimsJws("")
            .getBody();
    }

}
