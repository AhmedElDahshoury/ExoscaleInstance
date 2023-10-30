package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

@ApplicationScoped
public class StartInstanceRequestHandler {

    public org.acme.StartInstanceRequest createRequest() throws Exception {
        String cloudInitScript = new String(Files.readAllBytes(Paths.get("cloud_init_script.yaml")), StandardCharsets.UTF_8);
        StartInstanceRequest request = new StartInstanceRequest();
        request.setCloudInit(cloudInitScript);
        return request;
    }

    public class StartInstanceRequest extends org.acme.StartInstanceRequest {
        private String cloudInit;

        public String getCloudInit() {
            return cloudInit;
        }

        public void setCloudInit(String cloudInit) {
            this.cloudInit = cloudInit;
        }
    }
}