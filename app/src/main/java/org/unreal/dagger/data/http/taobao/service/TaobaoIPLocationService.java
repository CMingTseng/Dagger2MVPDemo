package org.unreal.dagger.data.http.taobao.service;


import org.unreal.dagger.data.http.taobao.vo.TaobaoIPLocationInfo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface TaobaoIPLocationService {

    @GET("/service/getIpInfo2.php")
    Observable<TaobaoIPLocationInfo> getIPInfo(@Query("ip") String ip);
}
