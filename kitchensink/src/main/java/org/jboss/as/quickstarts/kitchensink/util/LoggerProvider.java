package org.jboss.as.quickstarts.kitchensink.util;

import java.util.logging.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.InjectionPoint;

@Configuration
public class LoggerProvider {

    @Bean
    public Logger logger(InjectionPoint injectionPoint) {
        //return Logger.getLogger("foobar.whatever");
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }
}
