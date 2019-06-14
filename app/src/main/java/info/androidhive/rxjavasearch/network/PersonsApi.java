package info.androidhive.rxjavasearch.network;

import java.util.List;

import info.androidhive.rxjavasearch.network.model.Person;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PersonsApi {

	@Headers("Content-Type: application/json")
	@GET("persons")
	Single<List<Person>> getPersons(
			@Query("uid[]") Integer[] uid,
			@Query("limit") Integer limit,
			@Query("like") String like
	);

	@GET("persons/{uid}")
	Call<List<Person>> getPersonById(@Path("uid") int uid);

	@GET("persons/generate/{no_of_persons}")
	Call<List<Person>> generatePersons(
			@Path("no_of_persons") int no_of_persons,
			@Query("with_confirm") boolean with_confirm
	);

	@Headers("Content-Type: application/json")
	@POST("persons")
	Call<List<Person>> getPersonsUnlimited(
			@Body String body,
			@Query("limit") Integer limit
	);

	@Headers("Content-Type: application/json")
	@POST("persons/insert")
	Call<List<Person>> insertPersons(
			@Body String body
	);
}