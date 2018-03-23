package com.example.yeongpyo.testcodeapp.Expendable_Custom;

/**
 * Created by yeongpyo on 2018-03-20.
 */

public enum Category {

    Fashion("패션", android.R.drawable.sym_def_app_icon, new Category_Sub[]{Category_Sub.Fashion_sub1, Category_Sub.Fashion_sub2, Category_Sub.Fashion_sub3}),
    Beauty("뷰티", android.R.drawable.sym_def_app_icon, new Category_Sub[]{Category_Sub.Beauty1,Category_Sub.Beauty2, Category_Sub.Beauty3, Category_Sub.Beauty4 }),
    Household("가구", android.R.drawable.sym_def_app_icon, new Category_Sub[]{Category_Sub.Household1, Category_Sub.Household2, Category_Sub.Household3, Category_Sub.Household4}),
    Electronics("가전", android.R.drawable.sym_def_app_icon, new Category_Sub[]{Category_Sub.Electronics1, Category_Sub.Electronics2, Category_Sub.Electronics3, Category_Sub.Electronics4});

    String CategoryName;
    int CategoryDrawable;
    Category_Sub[] CategoryData;

    Category(String CategoryName, int CategoryDrawable, Category_Sub[] CategoryData) {
        this.CategoryName = CategoryName;
        this.CategoryDrawable = CategoryDrawable;
        this.CategoryData = CategoryData;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public int getCategoryDrawable() {
        return CategoryDrawable;
    }

    public Category_Sub[] getCategoryData() {
        return CategoryData;
    }
}
