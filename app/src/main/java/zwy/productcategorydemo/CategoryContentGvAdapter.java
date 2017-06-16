package zwy.productcategorydemo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class CategoryContentGvAdapter extends BaseAda<CategoryThreeBean> {

	public CategoryContentGvAdapter(Context context) {
		super(context);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder vh = null;
		if (convertView==null) {
			convertView = mInflater.inflate(R.layout.item_classify_content_gv,parent, false);
			vh = new ViewHolder(convertView);
			convertView.setTag(vh);
		}else{
			vh = (ViewHolder) convertView.getTag();
		}
		CategoryThreeBean bean = getItem(position);
//		if (bean.getImageUrl()!=null && !TextUtils.isEmpty(bean.getImageUrl())) {
//			ImageManager.loadImage(vh.iv,bean.getImageUrl());
//		}else{
//			vh.iv.setImageResource(R.mipmap.ic_launcher);
//		}
		String str = bean.getCategoryName();
		if (str.length()>6) {
			vh.tv.setText(String.format("%s...", str.substring(0, 6)));
		}else{
			vh.tv.setText(str);
		}
		return convertView;
	}
	
	class ViewHolder{
		public ImageView iv;
		public TextView tv;
		public ViewHolder(View convertView){
			iv = (ImageView) convertView.findViewById(R.id.iv_classify_iccg);
			tv = (TextView) convertView.findViewById(R.id.tv_classify_iccg);
		}
	}

}
