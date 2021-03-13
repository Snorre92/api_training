package fr.esiea.ex4A.hello;

import org.springframework.http.ResponseEntity;
import retrofit2.Response;
import retrofit2.http.POST;


public interface AgigyService {
    @POST("/api/inscription")
    Response<ResponseEntity>
}
