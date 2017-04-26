package com.example.criminalintent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;

/**
 * Created by 鲍骞月 on 2017/4/26.
 */

public class PictureUtils {
    /**
     * 该方法先确认屏幕的尺寸，然后按此缩放图像。这样，就能保证载入的ImageView永远不会过大
     * @param path
     * @param activity
     * @return
     */

    public static Bitmap getScaleBitmap(String path, Activity activity) {
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay()
                .getSize(size);

        return getScaleBitmap(path, size.x, size.y);
    }

    public static Bitmap getScaleBitmap(String path, int destWidth, int destHeight) {

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);

        float srcWidth = options.outWidth;
        float srcHeight = options.outHeight;

        int inSampleSize = 1;
        if (srcHeight > destHeight || srcWidth > destWidth) {
            if (srcWidth > srcHeight) {
                inSampleSize = Math.round(srcHeight / destHeight);
            } else {
                inSampleSize = Math.round(srcWidth / destWidth);
            }
        }

        options = new BitmapFactory.Options();
        options.inSampleSize = inSampleSize;

        return BitmapFactory.decodeFile(path, options);
    }
}
