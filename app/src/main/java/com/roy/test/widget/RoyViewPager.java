package com.roy.test.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.roy.test.common.EventPoster;

/**
 * Created by ROY on 2016/5/14.
 */
public class RoyViewPager extends ViewPager {
    EventPoster poster;
    public RoyViewPager(Context context) {
        super(context);
    }

    public RoyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        poster.ontouch(ev);
        return super.onInterceptTouchEvent(ev);
    }

    public void setPoster(EventPoster poster){
        this.poster=poster;
    }
}
