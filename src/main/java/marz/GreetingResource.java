package marz;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    private static final String HELLO_JAVA = "Hello, java";
    @Inject
    @ConfigProperty(name = "msg", defaultValue = HELLO_JAVA)
    String msg;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.msg;
    }
}