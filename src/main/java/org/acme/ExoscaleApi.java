package org.acme;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey="exoscale.api")
public interface ExoscaleApi {

    @PUT
    @Path("/instance/{id}:start")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    InstanceResponse startInstance(@PathParam("id") String id, StartInstanceRequest request);
}