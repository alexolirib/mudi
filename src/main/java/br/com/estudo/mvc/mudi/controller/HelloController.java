package br.com.estudo.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    //cada método é um action
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("nome", "mundoasssswaw");
        //retornar essa view (que seja hello.html)
        return "hello";
    }
}
