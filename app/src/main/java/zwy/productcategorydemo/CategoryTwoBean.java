package zwy.productcategorydemo;

import java.util.ArrayList;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/13
 * class description:请输入类描述
 */
public class CategoryTwoBean {
    private String name;//       : 二级分类名称
    private ArrayList<CategoryThreeBean> categoryRs;//         : 子分类合集

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CategoryThreeBean> getCategoryRs() {
        return categoryRs;
    }

    public void setCategoryRs(ArrayList<CategoryThreeBean> categoryRs) {
        this.categoryRs = categoryRs;
    }
}
