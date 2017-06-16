package zwy.productcategorydemo;

import android.widget.GridView;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/14
 * class description:请输入类描述
 */
public class GridViewForListView extends GridView {

    public GridViewForListView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 设置不滚动
     */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer. MAX_VALUE >> 2, MeasureSpec.AT_MOST );
        super.onMeasure(widthMeasureSpec, expandSpec);

    }
}

