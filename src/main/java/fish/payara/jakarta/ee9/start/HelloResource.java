package fish.payara.jakarta.ee9.start;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloResource {

    @GET
    public String sayHello() {
        return "Hello World";
    }
}