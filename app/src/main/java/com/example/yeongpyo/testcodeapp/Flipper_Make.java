package com.example.yeongpyo.testcodeapp;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Flipper_Make {
    private Context context;
    private ViewFlipper flipper;
    public Flipper_Make(Context context, ViewFlipper flipper) {
        this.context = context;
        this.flipper = flipper;
    }

    public void setImage(int... Images){
        for ( int image : Images){
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(image);
            flipper.addView(imageView);
        }
    }

    public void setAutoFipper(boolean b){
        flipper.setAutoStart(b);
    }

    public void setFlipperTime(int Time){
        flipper.setFlipInterval(Time);
    }

}
