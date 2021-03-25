package com.example.buttonapp325;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
       this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTextView1.setText("You clicked 이현호의 버튼!");
    }
}
