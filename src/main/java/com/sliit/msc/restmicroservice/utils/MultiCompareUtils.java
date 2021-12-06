package com.sliit.msc.restmicroservice.utils;

/**
 * @author ashan on 2021-12-06
 */
public class MultiCompareUtils {
    public static <T> boolean notIn(T object, T val1, T val2, T val3, T val4, T val5, T val6, T val7, T val8) {
        return !in(object, val1, val2, val3, val4, val5, val6, val7, val8);
    }

    public static <T> boolean in(T object, T val1, T val2, T val3, T val4, T val5, T val6, T val7, T val8) {
        return object.equals(val1)
                || object.equals(val2)
                || object.equals(val3)
                || object.equals(val4)
                || object.equals(val5)
                || object.equals(val6)
                || object.equals(val7)
                || object.equals(val8);
    }

    public static <T> boolean notIn(T object, T val1, T val2, T val3, T val4, T val5, T val6, T val7) {
        return !in(object, val1, val2, val3, val4, val5, val6, val7);
    }

    public static <T> boolean in(T object, T val1, T val2, T val3, T val4, T val5, T val6, T val7) {
        return object.equals(val1)
                || object.equals(val2)
                || object.equals(val3)
                || object.equals(val4)
                || object.equals(val5)
                || object.equals(val6)
                || object.equals(val7);
    }

    public static <T> boolean notIn(T object, T val1, T val2, T val3, T val4, T val5, T val6) {
        return !in(object, val1, val2, val3, val4, val5, val6);
    }

    public static <T> boolean in(T object, T val1, T val2, T val3, T val4, T val5, T val6) {
        return object.equals(val1)
                || object.equals(val2)
                || object.equals(val3)
                || object.equals(val4)
                || object.equals(val5)
                || object.equals(val6);
    }

    public static <T> boolean notIn(T object, T val1, T val2, T val3, T val4, T val5) {
        return !in(object, val1, val2, val3, val4, val5);
    }

    public static <T> boolean in(T object, T val1, T val2, T val3, T val4, T val5) {
        return object.equals(val1)
                || object.equals(val2)
                || object.equals(val3)
                || object.equals(val4)
                || object.equals(val5);
    }

    public static <T> boolean notIn(T object, T val1, T val2, T val3, T val4) {
        return !in(object, val1, val2, val3, val4);
    }

    public static <T> boolean in(T object, T val1, T val2, T val3, T val4) {
        return object.equals(val1)
                || object.equals(val2)
                || object.equals(val3)
                || object.equals(val4);
    }

    public static <T> boolean notIn(T object, T val1, T val2, T val3) {
        return !in(object, val1, val2, val3);
    }

    public static <T> boolean in(T object, T val1, T val2, T val3) {
        return object.equals(val1)
                || object.equals(val2)
                || object.equals(val3);
    }

    public static <T> boolean notIn(T object, T val1, T val2) {
        return !in(object, val1, val2);
    }

    public static <T> boolean in(T object, T val1, T val2) {
        return object.equals(val1)
                || object.equals(val2);
    }

    public static <T> boolean notIn(T object, T val1) {
        return !in(object, val1);
    }

    public static <T> boolean in(T object, T val1) {
        return object.equals(val1);
    }
}
