package com.example.order3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *データとレイアウトを関連付けするためのAdapterクラス
 */
public class MyListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListItem> data;
    private int resource;

    //コンストラクター（コンテキスト、データソース、レイアウトファイルを設定）
    MyListAdapter(Context context, ArrayList<ListItem> data, int resource){
        this.context = context;
        this.data = data;
        this.resource = resource;
    }

    //データ項目の個数を取得
    @Override
    public int getCount() {
        return data.size();
    }

    //指定された項目を取得
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    //指定された項目を識別するためのid値を取得
    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    //リスト項目を表示するためのViewを取得
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Activity activity = (Activity) context;
        ListItem item =(ListItem)getItem(position);
        if(convertView == null){
            convertView = activity.getLayoutInflater().inflate(resource,null);
        }
        ((TextView) convertView.findViewById(R.id.title)).setText(item.getTitle());
        ((ImageView) convertView.findViewById(R.id.sushiMenu)).setImageResource(item.getSushiMenu());
        ((TextView) convertView.findViewById(R.id.price)).setText(item.getPrice());
        ((TextView) convertView.findViewById(R.id.calorie)).setText(item.getCalorie());
        ((NumberPicker) convertView.findViewById(R.id.NumberQuantity)).setValue(1);
        ((NumberPicker) convertView.findViewById(R.id.NumberQuantity)).setMaxValue(10);
        ((NumberPicker) convertView.findViewById(R.id.NumberQuantity)).setMinValue(0);
        return convertView;

    }

}
