package com.howfun.android.lover.view;

import android.content.Context;

import com.howfun.android.lover.R;

public class ChocolateMask extends Mask {

   public static final int RECT_WIDTH = 128;
   public static final int RECT_HEIGHT = 128;

   private int mHeartIds[] = { R.drawable.chocolate0, R.drawable.chocolate1,
         R.drawable.chocolate2, R.drawable.chocolate3, R.drawable.chocolate4,
         R.drawable.chocolate5, R.drawable.chocolate6, R.drawable.chocolate7,
         R.drawable.chocolate8 };

   public ChocolateMask(Context context, int x, int y) {
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
