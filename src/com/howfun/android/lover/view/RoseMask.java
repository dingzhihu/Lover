package com.howfun.android.lover.view;

import android.content.Context;

import com.howfun.android.lover.R;

public class RoseMask extends Mask {

   public static final int RECT_WIDTH = 128;
   public static final int RECT_HEIGHT = 128;

   private int mHeartIds[] = { R.drawable.rose0, R.drawable.rose1,
         R.drawable.rose2, R.drawable.rose3, R.drawable.rose4,
         R.drawable.rose5, R.drawable.rose6, R.drawable.rose7,
         R.drawable.rose8, R.drawable.rose9, R.drawable.rose10 };

   public RoseMask(Context context, int x, int y) {
      super(context);
      init(x, y);
   }

   protected void init(int x, int y) {
      mCenterX = x;
      mCenterY = y;
      mRectWidth = RECT_WIDTH;
      mRectHeight = RECT_HEIGHT;
      setRect();
      setClickable(false);
      int random = (int) (Math.random() * mHeartIds.length);
      setBackgroundResource(mHeartIds[random]);
   }
}
