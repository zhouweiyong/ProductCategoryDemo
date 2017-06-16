package zwy.productcategorydemo;

import java.util.ArrayList;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/6/23
 * class description:请输入类描述
 */
public class TestDataUtils {


    public ArrayList<CategoryOneBean> GetCategoryListV1() {
        ArrayList<CategoryOneBean> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            CategoryOneBean categoryOneBean = new CategoryOneBean();
            categoryOneBean.setCategoryId("" + i);
            categoryOneBean.setCategoryName("智能家居"+i);
            list.add(categoryOneBean);
        }
        return list;
    }

    public ArrayList<CategoryTwoBean> GetCategoryListV2() {

        ArrayList<CategoryTwoBean> categoryTwoBeans = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CategoryTwoBean categoryTwoBean = new CategoryTwoBean();
            categoryTwoBean.setName("智能家居");
            ArrayList<CategoryThreeBean> categoryThreeBeans = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                CategoryThreeBean categoryThreeBean = new CategoryThreeBean();
                categoryThreeBean.setCategoryId("" + i);
                categoryThreeBean.setCategoryName("小米手机系列");
                categoryThreeBean.setImageUrl("http://img0.imgtn.bdimg.com/it/u=997769260,2943986204&fm=21&gp=0.jpg");
                categoryThreeBeans.add(categoryThreeBean);
            }
            categoryTwoBean.setCategoryRs(categoryThreeBeans);
            categoryTwoBeans.add(categoryTwoBean);
        }
        return categoryTwoBeans;
    }
}
