package zwy.productcategorydemo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;


public class CategoryContentAdapter extends BaseAda<CategoryTwoBean> implements OnItemClickListener{

	public CategoryContentAdapter(Context context) {
		super(context);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder vh = null;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item_classify_content, parent, false);
			vh = new ViewHolder(convertView);
			convertView.setTag(vh);
		} else {
			vh = (ViewHolder) convertView.getTag();
		}
		CategoryTwoBean bean = getItem(position);
		String str = bean.getName();
		if (str.length()>6) {
			vh.tv.setText(String.format("%s...", str.substring(0, 6)));
		}else{
			vh.tv.setText(str);
		}
		CategoryContentGvAdapter adapter = new CategoryContentGvAdapter(mContext);
		vh.gv.setAdapter(adapter);
		adapter.setGroup(bean.getCategoryRs());
		vh.gv.setOnItemClickListener(this);
		return convertView;
	}

	class ViewHolder {
		public TextView tv;
		public GridView gv;

		public ViewHolder(View convertView) {
			tv = (TextView) convertView.findViewById(R.id.tv_title_icm);
			gv = (GridView) convertView.findViewById(R.id.gv_content_icm);
		}
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		CategoryThreeBean item= (CategoryThreeBean) parent.getAdapter().getItem(position);
		//Toast.makeText(mContext, position+" "+item.getClassifyName(), Toast.LENGTH_SHORT).show();
		if(item!=null&&!TextUtils.isEmpty(item.getCategoryName())){
			 Bundle bundle = new Bundle();
			 bundle.putString("categoryId", item.getCategoryId());
			 bundle.putString("categoryName", item.getCategoryName());

			// ((BaseAct)mContext).showActivity((BaseAct)mContext, ProductSearchAndListActivity.class,bundle);
		}
	}

}
