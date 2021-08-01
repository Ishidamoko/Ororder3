package com.example.order3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 *寿司のメニューを表示するためのFragmentクラス
 */
public class item1_Fragment extends Fragment {

    //リストに表示するデータを準備
    private int[] sushi = {R.drawable.ebi, R.drawable.ika, R.drawable.hotate, R.drawable.maguro,
            R.drawable.inari, R.drawable.tamago, R.drawable.tekkamaki, R.drawable.kaxtupamaki};
    private String[] titles1 = {"エビ", "イカ", "ほたて", "まぐろ", "いなり寿司", "玉子", "鉄火巻き", "かっぱ巻き"};
    private String[] prices1= {"110円", "110円", "110円", "110円", "110円", "110円", "110円", "110円"};
    private String[] calories1 = {"78kcal", "70kcal", "73kcal", "75kcal", "156kcal", "119kcal", "149kcal", "130kcal"};

    ListView list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //ListViewを表示させるレイアウトの設定
        list=(ListView)inflater.inflate(R.layout.subactivity,container,false);

        //配列の内容をListItemオブジェクトに詰め替える
        ArrayList<ListItem> data = new ArrayList<>();
        for (int i = 0; i < titles1.length; i++) {
            ListItem item = new ListItem();
            item.setSushiMenu(sushi[i]);
            item.setTitle(titles1[i]);
            item.setPrice(prices1[i]);
            item.setCalorie(calories1[i]);
            data.add(item);
        }

        //ListItemの配列と表示するレイアウトとを関連付け
        MyListAdapter adapter = new MyListAdapter(getContext(),data,R.layout.list_item);
        list.setAdapter(adapter);

        return list;
    }


}
