package com.sunhacks.security;

import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
// handle 403 page
@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler {


    @Override
    public void handle(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse,
                       AccessDeniedException e) throws IOException, ServletException {
        Authentication auth
                = SecurityContextHolder.getContext().getAuthentication();
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/home");

    }
}*/
public class MyAccessDeniedHandler {}