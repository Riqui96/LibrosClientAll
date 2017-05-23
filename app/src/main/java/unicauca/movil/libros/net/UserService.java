package unicauca.movil.libros.net;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import unicauca.movil.libros.models.SimpleResponse;
import unicauca.movil.libros.models.User;

/**
 * Created by T on 23/05/2017.
 */

public interface UserService {

    @POST("users/login")
    Call<SimpleResponse> login(@Body User user);

    @POST("users/registro")
    Call<SimpleResponse> registro(@Body User user);

}
