package com.antimage.mactionsheet;

import android.view.View;
import android.widget.Toast;

/**
 * Created by xuyuming on 2018/4/18.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainActivity activity;
    private MainContract.MainView mView;

    public MainPresenter(MainActivity activity, MainContract.MainView view) {
        this.activity = activity;
        this.mView = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void destroy() {
        activity = null;
        mView = null;
    }

    public void oneItemMenuShow(View view) {
        int[] itemArray = {R.string.first_item};
        mView.showActionSheet(itemArray);
    }

    public void twoItemMenuShow(View view) {
        int[] itemArray = {R.string.first_item, R.string.second_item};
        mView.showActionSheet(itemArray);
    }

    public void threeItemMenuShow(View view) {
        int[] itemArray = {R.string.first_item, R.string.second_item, R.string.third_item};
        mView.showActionSheet(itemArray);
    }

    public void fourItemMenuShow(View view) {
        int[] itemArray = {R.string.first_item, R.string.second_item, R.string.third_item, R.string.fourth_item};
        mView.showActionSheet(itemArray);
    }

    @Override
    public void onMenuItemClick(int resId) {
        switch (resId) {
            case R.string.first_item:
                Toast.makeText(activity, "i'm first item", Toast.LENGTH_SHORT).show();
                break;
            case R.string.second_item:
                Toast.makeText(activity, "i'm second item", Toast.LENGTH_SHORT).show();
                break;
            case R.string.third_item:
                Toast.makeText(activity, "i'm third item", Toast.LENGTH_SHORT).show();
                break;
            case R.string.fourth_item:
                Toast.makeText(activity, "i'm fourth item", Toast.LENGTH_SHORT).show();
                break;
        }
        mView.dismissActionSheet();
    }
}
