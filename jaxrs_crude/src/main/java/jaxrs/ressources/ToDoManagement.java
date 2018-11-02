package jaxrs.ressources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jaxrs.entitites.ToDo;

@Path("entreprise")
public class ToDoManagement {
	static List<ToDo> toDoo= new ArrayList<ToDo>();
	//ToDo toDovvo= new ToDo("ok", "kikk", false);

	@POST
	@Path("toDoo")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addToDo(ToDo t){
		if (toDoo.add(t))
			return"added succesful";
		else return "add rejected";
			
		
	}
	
	@POST
	@Path("toDooR/{title}")
	@Produces(MediaType.APPLICATION_JSON)
	public Boolean deleteEmploye (@PathParam("title") String title) {
		
		
	
		for (ToDo toD : toDoo) {
			if(toD.getTitle().equals(title))
			{
				toDoo.remove(toD);
				return true;
			}
		}
		
		
		 return false;
	}
	@PUT
	@Path("toDooU")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateToDo( ToDo t) {
		for (ToDo toD : toDoo) {
			if(toD.getTitle().equals(t.getTitle()))
			{
				toD.setCompleted(t.isCompleted());
				toD.setDue(t.getDue());
				toD.setDescription(t.getDescription());
				toD.setCreatedAt(t.getCreatedAt());
				toD.setUpdatedAt(t.getUpdatedAt());
				return "update successful";
			}
		}
		
		 return "update failed";
	}
	@GET
	@Path("toDooS")
	@Produces(MediaType.APPLICATION_JSON)
	public Response displayToDO () {
	
		
		
			if(!toDoo.isEmpty())
			{
				return Response.ok(toDoo).build();
			}
			return Response.status(Response.Status.NOT_FOUND).build();
		  
	}

}
