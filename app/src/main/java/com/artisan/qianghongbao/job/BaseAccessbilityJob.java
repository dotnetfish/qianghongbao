package com.artisan.qianghongbao.job;

import android.content.Context;

import com.artisan.qianghongbao.Config;
import com.artisan.qianghongbao.QiangHongBaoService;

/**
 * <p>Created 16/1/16 上午12:38.</p>
 * <p><a href="mailto:artisan2013@gmail.com">Email:artisan2013@gmail.com</a></p>
 * <p><a href="http://www.happyartisan.com">LeonLee Blog</a></p>
 *
 * @author LeonLee
 */
public abstract class BaseAccessbilityJob implements AccessbilityJob {

    private QiangHongBaoService service;

    @Override
    public void onCreateJob(QiangHongBaoService service) {
        this.service = service;
    }

    public Context getContext() {
        return service.getApplicationContext();
    }

    public Config getConfig() {
        return service.getConfig();
    }

    public QiangHongBaoService getService() {
        return service;
    }
}
