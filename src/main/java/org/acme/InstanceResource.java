package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/start-instance")
public class InstanceResource {
    @Inject
    InstanceStarter instanceStarter;

    @GET
    @Path("/{id}/{rescueProfile}")
    public String startInstance(@PathParam("id") String id, @PathParam("rescueProfile") String rescueProfile) {
        instanceStarter.startExoscaleInstance(id, rescueProfile);
        return "Instance start request sent.";
    }
}