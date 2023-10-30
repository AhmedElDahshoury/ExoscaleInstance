package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class InstanceStarter {

    @Inject
    @RestClient
    ExoscaleApi exoscaleApi;

    @Inject
    StartInstanceRequestHandler requestHandler;

    public void startExoscaleInstance(String instanceId, String rescueProfile) throws Exception {
        StartInstanceRequest request = requestHandler.createRequest();
        InstanceResponse response = exoscaleApi.startInstance(instanceId, request);
    }
}

