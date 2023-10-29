package org.acme;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.ext.Provider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Provider
public class ExoscaleRequestFilter implements ClientRequestFilter {


    @ConfigProperty(name = "exoscale.api.key")
    String apiKey;

    @ConfigProperty(name = "exoscale.api.secret")
    String apiSecret;
    @Override
    public void filter(ClientRequestContext requestContext) {
        try {
            String method = requestContext.getMethod();
            String urlPath = requestContext.getUri().getPath();
            String requestBody = "";
            String queryString = "";
            String headers = "";
            long expiration = 1599140767;

            String signature = ExoscaleAuth.generateSignature(method, urlPath, requestBody, queryString, headers, expiration, apiSecret);
            String authorizationHeader = ExoscaleAuth.getAuthorizationHeader(apiKey, expiration, signature);

            requestContext.getHeaders().add("Authorization", authorizationHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}