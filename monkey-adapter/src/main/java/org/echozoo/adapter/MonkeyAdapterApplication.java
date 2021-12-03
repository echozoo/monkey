package org.echozoo.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author dujf
 */
@SpringBootApplication(scanBasePackages = "org.echozoo")
@EnableOpenApi
public class MonkeyAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonkeyAdapterApplication.class, args);
    }

}
