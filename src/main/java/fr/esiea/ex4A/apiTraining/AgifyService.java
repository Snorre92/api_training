package fr.esiea.ex4A.apiTraining;

import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

@Service
public class AgifyService {
    private final AgifyClient agifyClient;

    public AgifyService(AgifyClient agifyClient){
        this.agifyClient = agifyClient;
    }

    public int getUserAge(String userName, String country_id){
        int age = 0;
        Call<AgifyResponse> agifyResponseCall = agifyClient.agifyRequest(userName,country_id);
        try {
            Response<AgifyResponse> reponse = agifyResponseCall.execute();
            if(reponse.isSuccessful()){
                age = reponse.body().getAge();
            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
        return age;
    }
}
