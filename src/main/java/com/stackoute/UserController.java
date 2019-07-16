package com.stackoute;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    User user=new User("Satchida");
   @RequestMapping("/")
    public ModelAndView welcome() {

       ModelAndView mv=new ModelAndView("index");
       mv.addObject("name",user.getName());
      return mv;
    }
}
