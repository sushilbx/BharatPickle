package com.bharatpickle;

public class Utils {
    public static final String URL = "http://ottego.com/pickle/pickle/";


    public final static boolean myEmailValid(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public final static boolean myMobileValid(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.PHONE.matcher(target).matches();
        }
    }
}