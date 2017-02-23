package com.example.zlc.listviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String objecter[] = {"哈哈","一","二","三"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.lv);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.item1,objecter);

        lv.setAdapter(adapter);



        //lv.setAdapter(new MyAdapter());
    }

    /*
    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 6;
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

            View view;
            if (convertView == null){
                view = View.inflate(getApplicationContext(),R.layout.item,null);
            }else {
                view = convertView;
            }
            return view;
        }
    }
    */
}
