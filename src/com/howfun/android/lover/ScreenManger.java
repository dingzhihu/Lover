package com.howfun.android.lover;

import java.util.LinkedList;
import java.util.Queue;

import com.howfun.android.lover.view.Mask;

import android.graphics.Rect;

public class ScreenManger {

   public static final String TAG = "ScreenManager";

   public static final int MAX_STATIC_MASKS = 50;

   private ScreenView mScreenView;

   private Queue<Mask> mMaskQueue;

   public ScreenManger() {
      mMaskQueue = new LinkedList<Mask>();
   }

   public void setScreenView(ScreenView screenView) {
      this.mScreenView = screenView;
   }

   // Add one mask to screen
   public void addMask(Mask mask) {

      if (mask == null) {
         return;
      }

      if (mMaskQueue.size() == MAX_STATIC_MASKS) {
         Mask removeMask = mMaskQueue.remove();
         mScreenView.removeView(removeMask);
      }
      // add a mask
      mMaskQueue.add(mask);
      mScreenView.addView(mask);
      Rect rect = mask.getRect();
      mask.layout(rect.left, rect.top, rect.right, rect.bottom);
   }

   public void removeMasks() {
      mScreenView.removeAllViews();
      mMaskQueue.clear();
   }

   public void clear() {
      removeMasks();
   }

}
