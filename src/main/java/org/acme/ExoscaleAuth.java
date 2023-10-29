package org.acme;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class ExoscaleAuth {

    public static String generateSignature(String method, String urlPath, String requestBody,
                                           String queryString, String headers, long expiration,
                                           String apiSecret) throws Exception {
        String message = method + " " + urlPath + "\n" + requestBody + "\n" + queryString + "\n" +
                headers + "\n" + expiration;
        Mac sha256Hmac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKey = new SecretKeySpec(apiSecret.getBytes("UTF-8"), "HmacSHA256");
        sha256Hmac.init(secretKey);
        byte[] hash = sha256Hmac.doFinal(message.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(hash);
    }

    public static String getAuthorizationHeader(String apiKey, long expiration, String signature) {
        return "EXO2-HMAC-SHA256 credential=" + apiKey + ",expires=" + expiration + ",signature=" + signature;
    }
}
