package org.jboss.as.quickstarts.kitchensink.rest;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10)
          .mapToObj(i -> "Hello number " + i)
          .collect(Collectors.toList());
    }
}