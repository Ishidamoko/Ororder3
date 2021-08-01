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
 *サイドメニューを表示するためのFragmentクラス
 */
public class item2_Fragment extends Fragment {

    //リストに表示するデータを準備
    private int [] side={R.drawable.edamame,R.drawable.tamagoyaki,R.drawable.udon, R.drawable.kitune};
    private String [] titles2={"枝豆", "厚焼き玉子", "かけうどん", "きつねうどん"};
    private String [] prices2={"110円","110円", "210円", "310円"};
    private String [] calories2={"121kcal", "80kcal", "173kcal", "228kcal"};

    ListView list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //ListViewを表示させるレイアウトの設定
        list=(ListView)inflater.inflate(R.layout.subactivity,container,false);

        //配列の内容をListItemオブジェクトに詰め替える
        ArrayList<ListItem> data = new ArrayList<>();
        for (int i = 0; i < titles2.length; i++) {
            ListItem item = new ListItem();
            item.setSushiMenu(side[i]);
            item.setTitle(titles2[i]);
            item.setPrice(prices2[i]);
            item.setCalorie(calories2[i]);
            data.add(item);
        }

        //ListItemの配列と表示するレイアウトとを関連付け
        MyListAdapter adapter = new MyListAdapter(getContext(),data,R.layout.list_item1);
        list.setAdapter(adapter);

        return list;

    }
}
