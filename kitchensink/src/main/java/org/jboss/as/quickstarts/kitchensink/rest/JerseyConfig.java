package org.jboss.as.quickstarts.kitchensink.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

    @PostConstruct
    public void init() {
        register(MemberResourceRESTService.class);
        //register(GenericExceptionMapper.class);
        
    }
}
