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
 *ドリンクメニューを表示するためのFragmentクラス
 */
public class item3_Fragment extends Fragment {

    //リストに表示するデータを準備
    private int [] drink={R.drawable.biru,R.drawable.kora,R.drawable.nonaru};
    private String [] titles3 ={"生ビール", "コカ・コーラ","アサヒドライゼロ(ノンアルビール)"};
    private String [] prices3 ={"450円", "160円", "330円"};
    private String[] calories3 ={"126kcal", "87kcal", "0kcal"};

    ListView list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //ListViewを表示させるレイアウトの設定
        list=(ListView)inflater.inflate(R.layout.subactivity,container,false);

        //配列の内容をListItemオブジェクトに詰め替える
        ArrayList<ListItem> data = new ArrayList<>();
        for (int i = 0; i < titles3.length; i++) {
            ListItem item = new ListItem();
            item.setSushiMenu(drink[i]);
            item.setTitle(titles3[i]);
            item.setPrice(prices3[i]);
            item.setCalorie(calories3[i]);
            data.add(item);
        }

        //ListItemの配列と表示するレイアウトとを関連付け
        MyListAdapter adapter = new MyListAdapter(getContext(),data,R.layout.list_item3);
        list.setAdapter(adapter);


        return list;


    }


}
