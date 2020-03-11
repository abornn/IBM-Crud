package com.CrudTeamX.ibmcrud.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloWorld")
public class CrudRouter {
    @GET
    public String helloWorld(){
        return "Hello World";
    }

}
