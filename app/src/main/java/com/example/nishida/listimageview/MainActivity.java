package com.example.nishida.listimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        List<ListItem> list = new ArrayList<ListItem>();

        for (int i = 1; i < 6; i++) {
            ListItem item = new ListItem();
            item.setText("アイテム\n" + i);

            // TODO 画像ファイルをセット
            //item.setImageId(R.drawable.ic_launcher);
            list.add(item);
        }

        // adapterのインスタンスを作成
        ImageArrayAdapter adapter =
                new ImageArrayAdapter(this, R.layout.list_view_image_item, list);

        lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(adapter);

    }

}
