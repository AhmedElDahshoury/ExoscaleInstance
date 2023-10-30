package org.acme;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class ExoscaleAuth {
    public static String getAuthorizationHeader(String method, String urlPath, String queryString,
                                                String apiKey, String apiSecret, long expiration) throws Exception {
        String message = method + " " + urlPath + "\n\n" + queryString.replace("&", "") + "\n\n" + expiration;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(apiSecret.getBytes(), "HmacSHA256"));
        byte[] signatureBytes = mac.doFinal(message.getBytes());
        String signature = Base64.getEncoder().encodeToString(signatureBytes);
        return "EXO2-HMAC-SHA256 "
                + "credential=" + apiKey + ","
                + "signed-query-args=" + queryString.replace("=", "").replace("&", ";") + ","
                + "expires=" + expiration + ","
                + "signature=" + signature;
    }
}