package com.example.yeongpyo.testcodeapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

class VIewPAgerAdapter extends PagerAdapter {

    private int[] images = new int[]{android.R.drawable.btn_plus, android.R.drawable.btn_plus, android.R.drawable.btn_plus, android.R.drawable.btn_plus, android.R.drawable.btn_plus, android.R.drawable.btn_plus};

    @Override
    public int getCount() {
        return images.length-1;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View viewitem = LayoutInflater.from(container.getContext()).inflate(R.layout.img_item, container, false);
        ImageView imageView = viewitem.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);
        ((ViewPager) container).addView(viewitem);
        return viewitem;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}
