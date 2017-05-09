package activity;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.asdf.traffic.R;

public class MainActivity extends FragmentActivity {
    private SlidingPaneLayout sl_content;
    private ListView lv_left;
    private FrameLayout fl_content;
    private String[]left_items={"小车速度控制","公交站台","停车场","环境","红绿灯查询"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        //添加各个fragment
//        addfragment();
        //替换fragment
//        setFragment();

    }

    private void initview() {
        sl_content=(SlidingPaneLayout)findViewById(R.id.sl_content);
        lv_left=(ListView)findViewById(R.id.lv_left);
        fl_content=(FrameLayout)findViewById(R.id.fl_content);
        sl_content=new SlidingPaneLayout(getApplicationContext());
        lv_left.setAdapter(new Myadapter());
    }
    class Myadapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View inflate = View.inflate(getApplicationContext(), R.layout.left_item, null);
            TextView tv= (TextView) inflate.findViewById(R.id.tv_left);
            tv.setText(left_items[position]);
            return inflate;
        }
    }
}
