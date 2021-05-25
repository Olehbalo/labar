package ua.lviv.iot.sport.service.controller;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public class ConectionJersey extends ResourceConfig {
    @PostConstruct
    public void init() {
        registerClasses(SportController.class);
    }
}
