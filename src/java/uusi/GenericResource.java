/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uusi;

import checkpoints.Checkpoints;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.OPTIONS;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import test.NewEntity;

/**
 * REST Web Service
 *
 * @author antto
 */
class Test1 {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of uusi.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET

    public String getJson() {
        //TODO return proper representation object
        System.out.println("Jes");

        return "Tappara";
    }

    
    @PUT
  @Consumes("application/json")
    public String getJson2(Checkpoints test) {
        //TODO return proper representation object
        System.out.println("Jes");
        new NewEntity();
        

        return "Tappa1ra=" + test.getName();
    }
    
    
       @OPTIONS
         @Consumes("application/json")
    public String putJso2n(Test1 test) {
        System.out.println("Jes");
        return "aa";
    }

}
