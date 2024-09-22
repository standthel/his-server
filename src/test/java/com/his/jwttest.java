package com.his;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class jwttest {
    private String signkey="jwttst";
    private long ddl= 1000L*60*2;

    public String getjwt(Map map){
        String body= Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,signkey)
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis()+ddl))
                .compact();
        return body;
    }
    public Claims parsejwt(String sign){
        Claims body=Jwts.parser()
                .setSigningKey(signkey)
                .parseClaimsJws(sign)
                .getBody();
        return body;
    }
}
