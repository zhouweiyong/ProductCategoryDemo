package zwy.productcategorydemo;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/13
 * class description:请输入类描述
 */
public class CategoryThreeBean {

    private String categoryId;//          : 三级分类ID
    private String categoryName;//              :三级分类名称
    private String imageUrl;//                          :三级分类图片

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
