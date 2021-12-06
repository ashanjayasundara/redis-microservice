package com.sliit.msc.restmicroservice.utils;

/**
 * @author ashan on 2021-12-06
 */
public interface MultiComparable<T>{
    default boolean in(T val1, T val2, T val3, T val4, T val5, T val6, T val7, T val8) {
        return MultiCompareUtils.in(this, val1, val2, val3, val4, val5, val6, val7, val8);
    }

    default boolean in(T val1, T val2, T val3, T val4, T val5, T val6, T val7) {
        return MultiCompareUtils.in(this, val1, val2, val3, val4, val5, val6, val7);
    }

    default boolean in(T val1, T val2, T val3, T val4, T val5, T val6) {
        return MultiCompareUtils.in(this, val1, val2, val3, val4, val5, val6);
    }

    default boolean in(T val1, T val2, T val3, T val4, T val5) {
        return MultiCompareUtils.in(this, val1, val2, val3, val4, val5);
    }

    default boolean in(T val1, T val2, T val3, T val4) {
        return MultiCompareUtils.in(this, val1, val2, val3, val4);
    }

    default boolean in(T val1, T val2, T val3) {
        return MultiCompareUtils.in(this, val1, val2, val3);
    }

    default boolean in(T val1, T val2) {
        return MultiCompareUtils.in(this, val1, val2);
    }

    default boolean in(T val1) {
        return MultiCompareUtils.in(this, val1);
    }

    default boolean notIn(T val1, T val2, T val3, T val4, T val5, T val6, T val7, T val8) {
        return MultiCompareUtils.notIn(this, val1, val2, val3, val4, val5, val6, val7, val8);
    }

    default boolean notIn(T val1, T val2, T val3, T val4, T val5, T val6, T val7) {
        return MultiCompareUtils.notIn(this, val1, val2, val3, val4, val5, val6, val7);
    }

    default boolean notIn(T val1, T val2, T val3, T val4, T val5, T val6) {
        return MultiCompareUtils.notIn(this, val1, val2, val3, val4, val5, val6);
    }

    default boolean notIn(T val1, T val2, T val3, T val4, T val5) {
        return MultiCompareUtils.notIn(this, val1, val2, val3, val4, val5);
    }

    default boolean notIn(T val1, T val2, T val3, T val4) {
        return MultiCompareUtils.notIn(this, val1, val2, val3, val4);
    }

    default boolean notIn(T val1, T val2, T val3) {
        return MultiCompareUtils.notIn(this, val1, val2, val3);
    }

    default boolean notIn(T val1, T val2) {
        return MultiCompareUtils.notIn(this, val1, val2);
    }

    default boolean notIn(T val1) {
        return MultiCompareUtils.notIn(this, val1);
    }
}
