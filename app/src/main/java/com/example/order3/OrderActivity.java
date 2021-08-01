package com.example.order3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * 注文ボタンを押した商品をデータベースで管理し、注文履歴にListとして表示させるクラス
 * 今後実装させたいと考えているが、現在時間と知識が足りず完成させることができなかった
 */
public class OrderActivity extends AppCompatActivity {
    private SimpleDateHelper helper = null;


    private TextView food = null;
    private TextView Quantity = null;
    private TextView Id = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_list);

        //ヘルパーを準備
        helper = new SimpleDateHelper(this);

        food = findViewById(R.id.food);
        Quantity = findViewById(R.id.Quantity);
        Id = findViewById(R.id.Id);

        //データをListViewで表示
        ArrayList<ListItem> data = new ArrayList<>();



    }

    //メインメニューで注文した商品のデータを追加







    //追加したデータを取り出す






    //戻るボタンを押したときの処理
    public void onBackClick(View view){
        finish();
    }



}
