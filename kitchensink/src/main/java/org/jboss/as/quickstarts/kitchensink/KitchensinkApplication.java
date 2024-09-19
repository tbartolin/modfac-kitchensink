package org.jboss.as.quickstarts.kitchensink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class KitchensinkApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(KitchensinkApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KitchensinkApplication.class);
    }
	

}
