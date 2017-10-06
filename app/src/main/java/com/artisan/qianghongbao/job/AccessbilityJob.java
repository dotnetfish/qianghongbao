package com.artisan.qianghongbao.job;

import android.view.accessibility.AccessibilityEvent;

import com.artisan.qianghongbao.IStatusBarNotification;
import com.artisan.qianghongbao.QiangHongBaoService;

/**
 * <p>Created 16/1/16 上午12:32.</p>
 * <p><a href="mailto:artisan2013@gmail.com">Email:artisan2013@gmail.com</a></p>
 * <p><a href="http://www.happyartisan.com">LeonLee Blog</a></p>
 *
 * @author LeonLee
 */
public interface AccessbilityJob {
    String getTargetPackageName();
    void onCreateJob(QiangHongBaoService service);
    void onReceiveJob(AccessibilityEvent event);
    void onStopJob();
    void onNotificationPosted(IStatusBarNotification service);
    boolean isEnable();
}
