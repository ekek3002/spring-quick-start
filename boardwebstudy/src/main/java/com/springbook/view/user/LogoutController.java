package com.springbook.view.user;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
        //1. 브라우저와 연결된 세션 객체를 강제 종료 시킨다
        HttpSession session = request.getSession();
        session.invalidate();

        //2. 세션 종료 후, 메인 화면으로 이동한다.
//        return "login";
        ModelAndView mav = new ModelAndView();
//        mav.setViewName("login.jsp");
        mav.setViewName("redirect:login.jsp");
        return mav;
    }
}
