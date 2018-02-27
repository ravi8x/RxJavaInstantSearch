package info.androidhive.rxjavasearch.network;

import java.util.List;

import info.androidhive.rxjavasearch.network.model.Contact;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ravi on 31/01/18.
 */

public interface ApiService {

    @GET("contacts.php")
    Single<List<Contact>> getContacts(@Query("source") String source, @Query("search") String query);
}
