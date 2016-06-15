package com.roy.test;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.roy.test.view.ViewPagerTest;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.iv_icon)
    ImageView ivIcon;
    @Bind(R.id.tv)
    TextView tv;
    @Bind(R.id.btn_view)
    Button btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Drawable drawable = ivIcon.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @OnClick(R.id.btn_view)
    public void onClickView() {
        Intent intent = new Intent(this, ViewPagerTest.class);
        startActivity(intent);
    }
}
