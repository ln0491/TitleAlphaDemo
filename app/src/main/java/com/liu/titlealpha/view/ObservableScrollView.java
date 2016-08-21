package com.liu.titlealpha.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by 刘楠 on 2016/8/21 0021.17:23
 */
public class ObservableScrollView extends ScrollView {


    private ScrollViewListener mScrollViewListener=null;

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        mScrollViewListener = scrollViewListener;
    }

    public ObservableScrollView(Context context) {
        super(context);
    }

    public ObservableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ObservableScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
        if (mScrollViewListener != null) {
            mScrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }
    }
}
