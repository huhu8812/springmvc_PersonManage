package com.huhu.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 */
public class CeshiController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request,
                                                 javax.servlet.http.HttpServletResponse response) throws Exception {
        System.out.println(request.getRequestURI());  //获取controller的名称

        return new ModelAndView("index");  //逻辑名
    }
}
