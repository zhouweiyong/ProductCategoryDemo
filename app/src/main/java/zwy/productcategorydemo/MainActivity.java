package zwy.productcategorydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView lvMenu;
    private ListView lvContent;
    private CategoryMenuAdapter menuAdapter;
    private CategoryContentAdapter contentAdapter;
    private TestDataUtils testDataUtils = new TestDataUtils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_category);
        showLvMenu();
        showLvContent();
    }

    private void showLvMenu() {
        lvMenu = (ListView) findViewById(R.id.lv_menu_apc);
        lvMenu.setOnItemClickListener(this);
        menuAdapter = new CategoryMenuAdapter(this);
        lvMenu.setAdapter(menuAdapter);
        menuAdapter.setGroup(testDataUtils.GetCategoryListV1());
    }

    private void showLvContent() {
        lvContent = (ListView) findViewById(R.id.lv_content_apc);
        contentAdapter = new CategoryContentAdapter(this);
        lvContent.setAdapter(contentAdapter);
        contentAdapter.setGroup(testDataUtils.GetCategoryListV2());
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        menuAdapter.setSelectItem(position);
        menuAdapter.notifyDataSetChanged();
//        lvMenu.setSelectionFromTop(position, 0);

        int totalH = lvMenu.getMeasuredHeight()-120;
        lvMenu.smoothScrollToPositionFromTop(position, totalH/2,50);
    }
}
