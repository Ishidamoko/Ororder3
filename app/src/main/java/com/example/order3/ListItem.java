package com.example.order3;

import android.widget.Button;
import android.widget.NumberPicker;

/**
 *リスト項目を表すデータオブジェクトクラス
 */
public class ListItem {
    private long id = 0;
    private int sushiMenu = 0;
    private String title = null;
    private String price = null;
    private String calorie = null;
    private Button btn;
    private NumberPicker Number;


    long getId(){return id; }
    int getSushiMenu(){return  sushiMenu;}
    String getTitle(){return title;}
    String getPrice(){return price;}
    String getCalorie(){return calorie;}
    Button getBtn(){return btn;}
    NumberPicker getNumber(){return  Number;}

    void setId(long id){this.id= id;}
    void setSushiMenu(int sushiMenu){this.sushiMenu = sushiMenu;}
    void setTitle(String title){this.title = title;}
    void setPrice(String price){this.price = price;}
    void setCalorie(String calorie){this.calorie = calorie;}
    void setNumber(NumberPicker Number){this.Number = Number;}
    void setBtn(Button btn){this.btn = btn;}


}

