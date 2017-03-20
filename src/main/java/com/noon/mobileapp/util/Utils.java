package com.noon.mobileapp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getDateTime() {
//        SimpleDateFormat a = new SimpleDateFormat("yyyy_MM_dd_HHmm");
        SimpleDateFormat a = new SimpleDateFormat("yyyyMMddHHmm");
        return a.format(new Date());
    }
}
