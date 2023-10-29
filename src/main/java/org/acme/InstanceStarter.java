package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;


@ApplicationScoped
public class InstanceStarter {

    @Inject
    @RestClient
    ExoscaleApi exoscaleApi;

    public void startExoscaleInstance(String instanceId, String rescueProfile) {
        StartInstanceRequest request = new StartInstanceRequest();
        request.rescueProfile = rescueProfile;

        InstanceResponse response = exoscaleApi.startInstance(instanceId, request);
    }
}