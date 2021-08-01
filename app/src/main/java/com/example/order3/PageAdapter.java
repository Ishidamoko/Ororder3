package com.example.order3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 * PageAdapterを作成し、Fragmentのページを管理する
 */
public class PageAdapter extends FragmentPagerAdapter {

    //ページ数
    private final int PAGE_COUNT = 3;

    //ページのタイトル
    private String[] pages = new String[]{"寿司","飲み物","サイドメニュー"};

    //PageAdapterのコンストラクター
    PageAdapter(FragmentManager fm){
        super(fm);
    }

    //ページの個数を取得
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    //ページのタイトルを取得
    @Override
    public CharSequence getPageTitle(int position) {
        return this.pages[position];
    }

    //インデックス番号に応じてページ（フラグメント）を習得
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new item1_Fragment();
            case 2:
                return new item2_Fragment();
            default:
                return new item3_Fragment();
        }

    }


}

