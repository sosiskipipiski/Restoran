package servise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class KitchenServise {
    private final RestTemplate restTemplate;
    private final String KitchenServiseUrl;

    public KitchenServise(RestTemplate restTemplate, @Value("${kitchen.service.url}") String KitchenServiseUrl){
        this.restTemplate=restTemplate;
        this.KitchenServiseUrl = KitchenServiseUrl;

    }

    public String sendOrderToKitchen(String orderDetails) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(orderDetails, headers);
        return restTemplate.postForObject(KitchenServiseUrl + "/orders", request, String.class);
    }



}
