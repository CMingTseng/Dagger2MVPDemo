package org.unreal.dagger.data.http.local.service;

import org.unreal.dagger.data.http.local.vo.User;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface UserService {

    @GET("/users")
    Observable<Response<List<User>>> getUser();

    @GET("/users/{id}")
    Observable<Response<User>> getUserById(@Path("id") String id);
}
