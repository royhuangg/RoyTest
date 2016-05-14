package com.roy.test.view.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.roy.test.R;

import butterknife.ButterKnife;

/**
 * Created by ROY on 2016/5/14.
 */
public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    String[] data = new String[]{"first data", "second data", "third data", "fore data"};
    ImageView currentImg;

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main, null);
        currentImg = ((ImageView) view.findViewById(R.id.iv_icon));
        view.setTag("myview" + position);
        ((TextView) view.findViewById(R.id.tv)).setText(data[position] + "  " + position);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public ImageView getCurrentImg() {
        return currentImg == null ? new ImageView(context) : currentImg;
    }
}
