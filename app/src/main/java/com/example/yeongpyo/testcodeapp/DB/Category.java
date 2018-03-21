package com.example.yeongpyo.testcodeapp.DB;

/**
 * Created by yeongpyo on 2018-03-20.
 */

public enum Category {

    Fashion("패션", android.R.drawable.sym_def_app_icon, new String[]{"상의", "하의", "코트"}),
    Beauty("뷰티", android.R.drawable.sym_def_app_icon, new String[]{"스킨케어","메이크업", "선케어", "향수" }),
    Household("가구", android.R.drawable.sym_def_app_icon, new String[]{"침실가구", "거실가구", "서재", "수납가구"}),
    Electronics("가전", android.R.drawable.sym_def_app_icon, new String[]{"TV", "계절가전", "냉장고", "세탁기"});

    String CategoryName;
    int CategoryDrawable;
    String[] CategoryData;

    Category(String CategoryName, int CategoryDrawable, String[] CategoryData) {
        this.CategoryName = CategoryName;
        this.CategoryDrawable = CategoryDrawable;
        this.CategoryData = CategoryData;
    }
}
