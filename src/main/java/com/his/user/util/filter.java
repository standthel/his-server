package com.his.user.util;

import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.PathMatcher;

/**
 * 检查过滤器
 */
@WebFilter(filterName = "login",urlPatterns = "/*")
public class filter implements Filter  {
    public static final AntPathMatcher PATH_MATCHER=new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String[] urls=new String[]{
                "/dd",
                "/dsf"
        };
        request.getRequestURI();
        filterChain.doFilter(request,servletResponse);
    }
    public boolean check(String[] urls,String URI){
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, URI);

        }
        return false;
    }
}
