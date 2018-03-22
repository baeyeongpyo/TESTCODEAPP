package com.example.yeongpyo.testcodeapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;

import com.example.yeongpyo.testcodeapp.DB.Category;
import com.example.yeongpyo.testcodeapp.R;

/**
 * Created by yeongpyo on 2018-03-22.
 */

public class Navi_elv_Custom extends BaseExpandableListAdapter {

    @Override
    public int getGroupCount() {
        return Category.values().length;
    }

    @Override
    public int getChildrenCount(int i) {
        return Category.values()[i].getCategoryData().length;
    }

    @Override
    public Object getGroup(int i) {
        return i;
    }
    @Override
    public Object getChild(int i, int i1) {
        return i1;
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.navi_itemlayout, viewGroup, false);
        GroupHolder holder = new GroupHolder(view);
        holder.getButton().setText(Category.values()[i].getCategoryName());
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.navi_itemlayout, viewGroup, false);
        ChildHolder holder = new ChildHolder(view);
        holder.getButton().setText(Category.values()[i].getCategoryData()[i1].getSubname());
        return view;
    }

    private class GroupHolder{
        Button button;
        private GroupHolder(View view) {
            button = view.findViewById(R.id.itemButton);
        }
        private Button getButton() {
            return button;
        }
    }

    private class ChildHolder{
        Button button;
        private ChildHolder(View view) {
            button = view.findViewById(R.id.itemButton);
        }
        private Button getButton() {
            return button;
        }
    }


}
