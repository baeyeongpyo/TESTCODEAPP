package com.example.yeongpyo.testcodeapp.Expendable_Custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ExpandableListView;

public class CustomExpendeble_ListView extends ExpandableListView {

    public CustomExpendeble_ListView(Context context) {
        super(context);
        BasicSetting();
    }

    public CustomExpendeble_ListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        BasicSetting();
    }

    public CustomExpendeble_ListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        BasicSetting();
    }

    public CustomExpendeble_ListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        BasicSetting();
    }

    public void BasicSetting(){
        super.setAdapter(new Navi_elv_Custom());
    }
}
