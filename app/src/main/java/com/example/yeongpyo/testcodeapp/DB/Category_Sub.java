package com.example.yeongpyo.testcodeapp.DB;

/**
 * Created by yeongpyo on 2018-03-22.
 */

public enum Category_Sub {
    Fashion_sub1("상의"),
    Fashion_sub2("하의"),
    Fashion_sub3("코트"),
    Beauty1("스킨케어"),
    Beauty2("메이크업"),
    Beauty3("선케어"),
    Beauty4("향수"),
    Household1("침실가구"),
    Household2("거실가구"),
    Household3("서재"),
    Household4("수납가구"),
    Electronics1("TV"),
    Electronics2("계절가전"),
    Electronics3("냉장고"),
    Electronics4("세탁기");

    String Subname;
    Category_Sub(String Subname) {
        this.Subname = Subname;
    }

    public String getSubname() {
        return Subname;
    }
}
