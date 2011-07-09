package com.howfun.android.lover;

import java.util.Random;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MusicService extends Service {

   private static final String TAG = "MusicService";

   private static final int[] MUSIC_RES = { R.raw.music0, R.raw.music1 };

   private static final Random RNG = new Random();
   Sound mSound = null;

   @Override
   public IBinder onBind(Intent intent) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void onCreate() {
      mSound = new Sound(this);
   }

   @Override
   public void onStart(Intent intent, int startId) {
      int which = RNG.nextInt(MUSIC_RES.length);
      int res = MUSIC_RES[which];
      mSound.play(res, true);
   }

   @Override
   public void onDestroy() {
      mSound.stop();
   }

}
