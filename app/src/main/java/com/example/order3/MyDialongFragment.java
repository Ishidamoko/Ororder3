package com.example.order3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

/**
 *ダイアログボックスを表示させるためのクラス
 */
public class MyDialongFragment extends DialogFragment {
    MediaPlayer mp;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        //音楽プレイヤーの準備
        mp = MediaPlayer.create(getActivity(),R.raw.sound);


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder.setTitle("注文確定画面")
                .setMessage("注文を追加してよろしいですか？")
                //「はい」ボタンの設定
                .setPositiveButton("はい", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int whitch) {
                                //はいボタンを押したら音楽が再生
                                mp.start();
                                Toast.makeText(getActivity(), "商品を追加いたしました",Toast.LENGTH_LONG)
                                        .show();
                            }

                        }
                )
                //いいえボタンの設定
                .setNegativeButton("いいえ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int whitch) {
                                Toast.makeText(getActivity(), "注文をキャンセルいたしました", Toast.LENGTH_LONG)
                                        .show();

                            }
                        }
                )
                .create();
    }
}







