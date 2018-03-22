package com.example.yeongpyo.testcodeapp.Custom_Widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.yeongpyo.testcodeapp.Adapter.Navi_elv_Custom;

/**
 * Created by yeongpyo on 2018-03-22.
 */

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
        this.setAdapter(new Navi_elv_Custom());
        this.setOnGroupClickListener(new OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                Toast.makeText(getContext(), "aaa", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
