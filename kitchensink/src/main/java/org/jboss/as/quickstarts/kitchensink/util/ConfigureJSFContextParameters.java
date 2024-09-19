package org.jboss.as.quickstarts.kitchensink.util;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

@Configuration
public class ConfigureJSFContextParameters implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        servletContext.setInitParameter("javax.faces.WEBAPP_RESOURCES_DIRECTORY", "/WEB-INF");

    }

}