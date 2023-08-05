package ir.amirhosseinsalari.authclient.config;

import ir.amirhosseinsalari.simplelogger.config.LoggableApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    @LoggableApi
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("hello");
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
