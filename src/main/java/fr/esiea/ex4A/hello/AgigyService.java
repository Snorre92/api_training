package fr.esiea.ex4A.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.Map;


public interface AgigyService {
    @POST("/api/inscription")
    Response<ResponseEntity<Object>> responseEntity(@RequestBody Map<String, String> body);

    @GET("/api/matches")
    Response<ResponseEntity<Object>> match(@RequestParam(name = "userName") String userName, @RequestParam(name = "userCountry") String userCountry);

}
