package chart.muke.com.mukechart.utils;

import android.content.res.Resources;
import android.util.TypedValue;

/**
 * ------------------------------------------------
 * Copyright © 2014-2017 CLife. All Rights Reserved.
 * Shenzhen H&T Intelligent Control Co.,Ltd.
 * -----------------------------------------------
 *
 * @Author sunny
 * @Date 2017/9/27  15:10
 * @Version v1.0.0
 * @Annotation 常用工具类：
 *            1.单位换算（比如，dp2px,sp2px,px2dp,px2sp等等）
 *            2.其他
 */
public class MukeUtils {

   public static int dp2px(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                Resources.getSystem().getDisplayMetrics());
    }

   public static int sp2px(int sp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp,
                Resources.getSystem().getDisplayMetrics());
    }
}