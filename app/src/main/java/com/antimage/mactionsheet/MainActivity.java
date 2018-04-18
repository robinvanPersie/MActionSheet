package com.antimage.mactionsheet;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.antimage.entity.ViewInfo;
import com.antimage.mactionsheet.databinding.ActivityMainBinding;
import com.antimage.view.MIActionSheet;
import com.antimage.view.MenuItemClickListener;

public class MainActivity extends AppCompatActivity implements MainContract.MainView, MenuItemClickListener {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainPresenter = new MainPresenter(this, this);
        binding.setPresenter(mainPresenter);
        binding.setViewInfo(new ViewInfo());
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mainPresenter = (MainPresenter) presenter;
    }

    private MIActionSheet actionSheet;

    @Override
    public void showActionSheet(int[] itemArray) {
        if (actionSheet == null) {
            actionSheet = new MIActionSheet(this);
            actionSheet.setMenuItemClickListener(this);
        }
        actionSheet.setItemArray(itemArray)
        .setTextColor(R.color.colorPrimary, 0);
        int length = itemArray.length;
        switch (length) {
            case 1:
                // do nothing
                break;
            case 2:
                actionSheet.setTextColor(R.color.colorAccent, 0)
                        .setCancelButtonTitle(R.string.dismiss);
                break;
            case 3:
                actionSheet.setText("i'm set text", 1)
                        .setTextColor(android.R.color.holo_blue_bright, 1);
                break;
            case 4:
                // do nothing
                break;
            default:
                break;
        }
        actionSheet.show();
    }

    @Override
    public void onItemClick(int resId) {
       mainPresenter.onMenuItemClick(resId);
    }

    @Override
    public void dismissActionSheet() {
        actionSheet.dismissMenu();
    }
}
