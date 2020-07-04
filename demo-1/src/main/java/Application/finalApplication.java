package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"Controller","Service"})
public class finalApplication {
    //Main
    public static void main(String[] args) {
        SpringApplication.run(finalApplication.class, args);
    }
}
