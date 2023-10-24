package org.exo;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.openapi.quarkus.source_json.api.InstanceApi;
import org.openapi.quarkus.source_json.model.CreateInstanceRequest;

import jakarta.enterprise.context.ApplicationScoped;
import org.openapi.quarkus.source_json.model.Operation;

@ApplicationScoped
@Path("/exoscale")
public class ExoscaleResource {

    @RestClient
    @Inject
    InstanceApi instanceApi;

    @POST
    @Path("/create-instance")
    public Operation createExoscaleInstance() {
        CreateInstanceRequest request = new CreateInstanceRequest();
        request.setName("VM-a14d47ec-5e1c-4254-aa7d-033977fd0d30");

        return instanceApi.createInstance(request);
    }
}
