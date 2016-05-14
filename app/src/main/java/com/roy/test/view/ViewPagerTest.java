package com.roy.test.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.roy.test.Config;
import com.roy.test.R;
import com.roy.test.common.EventPoster;
import com.roy.test.view.adapter.ViewPagerAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by ROY on 2016/5/14.
 */
public class ViewPagerTest extends Activity {
    @Bind(R.id.linearlayout)
    LinearLayout linearlayout;
    @Bind(R.id.viewpager1)
    ViewPager viewpager1;
    @Bind(R.id.viewpager2)
    ViewPager viewpager2;
    ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        ButterKnife.bind(this);

        adapter = new ViewPagerAdapter(this);
        viewpager1.setAdapter(adapter);
        viewpager2.setAdapter(adapter);

        viewpager2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                viewpager1.onTouchEvent(event);
                return false;
            }
        });


        linearlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                viewpager1.onTouchEvent(event);
                return false;
            }
        });

        scaleImageInViewPager();
    }

    private void scaleImageInViewPager() {
        View view = (View) viewpager1.findViewWithTag("myview" + viewpager1.getCurrentItem());
        ImageView iv = ((ViewPagerAdapter) viewpager1.getAdapter()).getCurrentImg();
        Config.logd("find?" + (view == null));
    }

}


