package ir.amirhosseinsalari.authclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ir.amirhosseinsalari","ir.amirhosseinsalari.simplelogger.*"})
public class AuthClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthClientApplication.class, args);
    }

}
