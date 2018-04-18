package com.antimage.entity;

import java.io.Serializable;

/**
 * Created by xuyuming on 2018/4/18.
 */

public class ViewInfo implements Serializable {

    private String oneItemText = "1 item";
    private String twoItemText = "2 item";
    private String threeItemText = "3 item";
    private String fourItemText = "4 item";

    public String getOneItemText() {
        return oneItemText;
    }

    public void setOneItemText(String oneItemText) {
        this.oneItemText = oneItemText;
    }

    public String getTwoItemText() {
        return twoItemText;
    }

    public void setTwoItemText(String twoItemText) {
        this.twoItemText = twoItemText;
    }

    public String getThreeItemText() {
        return threeItemText;
    }

    public void setThreeItemText(String threeItemText) {
        this.threeItemText = threeItemText;
    }

    public String getFourItemText() {
        return fourItemText;
    }

    public void setFourItemText(String fourItemText) {
        this.fourItemText = fourItemText;
    }
}
