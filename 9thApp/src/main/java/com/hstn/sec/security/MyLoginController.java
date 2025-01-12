package com.hstn.sec.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyLoginController {

    @GetMapping("/myLoginPage")
    public String myLoginPage() {
        return "my-login-page";
    }
}
