package org.unreal.dagger.function.main.presenter;

import android.content.SharedPreferences;

import org.unreal.dagger.data.http.local.service.UserService;
import org.unreal.dagger.data.http.taobao.service.TaobaoIPLocationService;
import org.unreal.dagger.data.http.taobao.vo.TaobaoIPLocationInfo;
import org.unreal.dagger.function.main.contract.MainContract;

import javax.inject.Inject;
import javax.inject.Named;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainPresenter implements MainContract.presenter {

    private final MainContract.View view;
    private final SharedPreferences sharedPreferences;
    private final TaobaoIPLocationService locationService;
    private final UserService userService;

    @Inject
    public MainPresenter(MainContract.View view,
                         @Named("default") SharedPreferences sharedPreferences,
                         TaobaoIPLocationService locationService,
                         UserService userService) {
        this.view = view;
        this.sharedPreferences = sharedPreferences;
        this.locationService = locationService;
        this.userService = userService;
    }

    public void main() {
        locationService.getIPInfo("myip")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<TaobaoIPLocationInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        view.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(TaobaoIPLocationInfo taobaoIPLocationInfo) {
                        view.showLocationInfo(taobaoIPLocationInfo);
                    }
                });

    }
}
