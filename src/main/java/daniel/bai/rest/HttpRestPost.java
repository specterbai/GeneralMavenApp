package daniel.bai.rest;

import org.springframework.web.client.RestTemplate;

/**
 * Created by sisuser on 12/1/16.
 */
public class HttpRestPost {
    public static void main(String args[]){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(, , Object.class);
    }
}
