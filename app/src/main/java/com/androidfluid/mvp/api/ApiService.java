/*
 * Copyright (c) 2017. Nandan.
 */

package com.androidfluid.mvp.api;

import com.androidfluid.mvp.model.Gank;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Nandan on 2016/10/30.
 */

public interface ApiService {

    String BASE_URL="http://gank.io/";

    @GET("api/data/Android/10/{page}")
    Observable<Gank> getGank(@Path("page") String page);

}
