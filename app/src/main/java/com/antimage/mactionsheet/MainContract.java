package com.antimage.mactionsheet;

import com.antimage.BasePresenter;
import com.antimage.BaseView;

/**
 * Created by xuyuming on 2018/4/18.
 */

public interface MainContract {

    interface MainView extends BaseView<Presenter> {

        void showActionSheet(int[] itemArray);

        void dismissActionSheet();
    }

    interface Presenter extends BasePresenter {

        void onMenuItemClick(int resId);
    }
}
