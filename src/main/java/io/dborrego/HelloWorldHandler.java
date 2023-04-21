package io.dborrego;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.dborrego.domain.HelloWorldDTO;

@Path("/")
public class HelloWorldHandler {

    @ConfigProperty(name = "hello.msg")
    String msg;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public HelloWorldDTO hello() {
        return new HelloWorldDTO(msg);
    }

}