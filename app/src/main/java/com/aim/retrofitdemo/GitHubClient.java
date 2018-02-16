package com.aim.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Ildi Xhaferri on 2/11/2018.
 */

public interface GitHubClient {

    @GET("/repos/{owner}/{repo}/contributors")
    Call<List<GitHubRepo>> reposForUser(
            @Path("owner") String owner,
             @Path("repo") String repo

    );


}
