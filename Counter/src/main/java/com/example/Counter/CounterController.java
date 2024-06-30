package com.example.Counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
    @RequestMapping("/")

    public String index(HttpSession session) {

        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        } else {
            Integer cookie = (Integer) session.getAttribute("count");
            session.setAttribute("count", cookie + 1);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter() {
        return "index2.jsp";
    }
}
