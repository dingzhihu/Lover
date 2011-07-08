package com.howfun.android.lover.view;

import android.content.Context;

import com.howfun.android.lover.R;

public class DiamondMask extends Mask{

   public static final int RECT_WIDTH = 72;
   public static final int RECT_HEIGHT = 72;

   private int mHeartIds[] = { R.drawable.menu_diamond};

   public DiamondMask(Context context, int x, int y) {
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
