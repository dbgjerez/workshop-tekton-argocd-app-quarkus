package io.dborrego;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.dborrego.domain.InfoDTO;

@Path("/q/info")
public class GreetingResource {

    @ConfigProperty(name = "info.version", defaultValue=EMPTY_STRING)
    String version;

    @ConfigProperty(name = "info.name", defaultValue=EMPTY_STRING)
    String name;

    private static final String EMPTY_STRING = "Empty var";

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public InfoDTO hello() {
        return new InfoDTO(
            Optional.ofNullable(name).orElse(EMPTY_STRING), 
            Optional.ofNullable(version).orElse(EMPTY_STRING)
            );
    }
}