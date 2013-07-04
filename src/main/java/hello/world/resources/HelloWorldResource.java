package hello.world.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloWorldResource {
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		return "Hello, World";
	}
	
	@POST
	@Path("/aloha")
	public String alohaWorld(HelloRequest request) {
		return "Aloha, " + request.getName();
	}
	
	@POST
	@Path("/bonjour")
	public HelloResponse bonjourWorld(HelloRequest request) {
		HelloResponse response = new HelloResponse();
		
		response.setMessage(String.format("Bon jour, %s. Nice to meet you", request.getName()));
		response.setTemprature((int)(Math.random()*10+25));
		
		return response;
	}
}
