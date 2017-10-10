package org.unreal.dagger.function.main.contract;

import org.unreal.dagger.data.http.taobao.vo.TaobaoIPLocationInfo;


public interface MainContract {
    interface View {

        void showLocationInfo(TaobaoIPLocationInfo taobaoIPLocationInfo);

        void showError(String message);
    }

    interface presenter {

    }
}
