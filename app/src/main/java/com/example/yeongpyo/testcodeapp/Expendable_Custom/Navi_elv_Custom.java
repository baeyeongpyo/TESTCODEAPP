package com.example.yeongpyo.testcodeapp.Expendable_Custom;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.yeongpyo.testcodeapp.R;

/**
 * Created by yeongpyo on 2018-03-22.
 */

public class Navi_elv_Custom extends BaseExpandableListAdapter {

    private final int Grouplayout = R.layout.navi_itemlayout;
    private final int Childlayout = R.layout.navi_itemlayout;

    @Override
    public int getGroupCount() {
        Log.i("testDebug group", "Count " + Category.values().length);
        return Category.values().length;
    }

    @Override
    public int getChildrenCount(int i) {
        Log.i("testDebug child", "Count " + Category.values()[i].getCategoryData().length);
        return Category.values()[i].getCategoryData().length;
    }

    @Override
    public Object getGroup(int i) {
        return i;
    }

    @Override
    public Object getChild(int i, int i1) {
        return i;
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(Grouplayout, viewGroup, false);
        GroupHolder holder = new GroupHolder(view);
        holder.getButton().setText(Category.values()[i].getCategoryName());
        holder.getButton().setCompoundDrawablesWithIntrinsicBounds(viewGroup.getResources().getDrawable(Category.values()[i].CategoryDrawable), null, null, null);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(Childlayout, viewGroup, false);
        ChildHolder holder = new ChildHolder(view);
        holder.getButton().setText(Category.values()[i].getCategoryData()[i1].getSubname());
        return view;
    }

    private class GroupHolder{
        TextView button;
        private GroupHolder(View view) {
            button = view.findViewById(R.id.itemButton);
        }
        private TextView getButton() {
            return button;
        }
    }

    private class ChildHolder{
        TextView button;
        private ChildHolder(View view) {
            button = view.findViewById(R.id.itemButton);
        }
        private TextView getButton() {
            return button;
        }
    }


}
