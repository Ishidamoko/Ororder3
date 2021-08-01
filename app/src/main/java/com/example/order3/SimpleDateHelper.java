package com.example.order3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *SQLiteデータベースを開く、生成するためのヘルパークラス
 */
public class SimpleDateHelper extends SQLiteOpenHelper {

    static final private String DBNAME ="Order.db";
    static final private int DB_VERSION = 1;

    //コンストラクター
    public SimpleDateHelper(Context context){
        super(context,DBNAME,null,DB_VERSION );

    }

    //データベース作成時にてテーブルを作成
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE orderDate("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "orderMenu TEXT NOT NULL,"+
                "number INTEGER NOT NULL);");
    }

    //データベースをバージョンアップしたとき、テーブルを再作成
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS orderDate");
        onCreate(db);

    }
}
