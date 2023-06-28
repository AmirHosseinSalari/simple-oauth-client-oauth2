package ir.amirhosseinsalari.authclient.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/err")
    public String err(){
        return "err";
    }

    @GetMapping("/")
    public String home(){
        return "hello home";
    }
}
