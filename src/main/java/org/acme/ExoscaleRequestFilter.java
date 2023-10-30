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
            String queryString = requestContext.getUri().getQuery() == null ? "" : requestContext.getUri().getQuery();
            long expiration = System.currentTimeMillis() / 1000 + 3600;  // 1 hour from now

            String authorizationHeader = ExoscaleAuth.getAuthorizationHeader(method, urlPath, queryString, apiKey, apiSecret, expiration);
            requestContext.getHeaders().add("Authorization", authorizationHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}