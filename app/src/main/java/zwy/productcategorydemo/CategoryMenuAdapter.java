package zwy.productcategorydemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/13
 * class description:请输入类描述
 */
public class CategoryMenuAdapter extends BaseAda<CategoryOneBean> {

    private int selectItem = 0;
    public CategoryMenuAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if (convertView==null) {
            convertView = mInflater.inflate(R.layout.item_category_menu, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        }
        else{
            vh= (ViewHolder) convertView.getTag();
        }
        CategoryOneBean bean = getItem(position);
        if (bean.getCategoryName().length()>6) {
            vh.tv.setText(String.format("%s...", bean.getCategoryName().substring(0, 6)));
        }else{
            vh.tv.setText(bean.getCategoryName());
        }
//		vh.layout.setTag(R.id.tag_first, position);
        if (selectItem==position) {
            convertView.setBackgroundResource(R.color.common_bg);
            vh.tv.setTextColor(mContext.getResources().getColor(R.color.color_e84515));
        }else{
            convertView.setBackgroundResource(R.color.white);
            vh.tv.setTextColor(mContext.getResources().getColor(R.color.color_323232));
        }
        return convertView;
    }

    public class ViewHolder{
        public TextView tv;
        public ViewHolder(View convertView){
            tv = (TextView) convertView.findViewById(R.id.tv_menu_icm);
        }
    }

    public  void setSelectItem(int selectItem) {
        this.selectItem = selectItem;
    }
}
