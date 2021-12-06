package com.sliit.msc.restmicroservice.utils;

/**
 * @author ashan on 2021-12-06
 */
public enum ExecType {
    NEW("NEW","NEW order, acknowledged by system"),
    PND("PENDING","PENDING order, unacknowledged by system"),
    CNC("CANCELLED", "order CANCELLED by user"),
    EXP("EXPIRED", "order EXPIRED by system"),
    REJ("REJECTED", "order REJECTED by system"),
    FIL("FILLED", "order completely FILLED/TRADED"),
    PFL("PARTIAL FILLED", "order PARTIALLY FILLED/TRADED"),
    TRG("TRIGGERED", "Price Trigger"),
    TRD("TRADE","Trade"),
    BST("BUSTED","execution busted"),
    CRT("CORRECTED","execution corrected"),
    CRJ("CANCEL REJECTED","order cancel request rejected"),
    RT_PND("ROUTED PENDING","Pending routed order"),
    RT_NEW("ROUTED NEW","NEW routed order, acknowledged by system"),
    RT_CNC("ROUTED CANCELLED", "routed order CANCELLED by user");

    private final String name;
    private final String fullName;

    ExecType(String s, String fullName)
    {
        name = s;
        this.fullName = fullName;
    }

    public String getName()
    {
        return name;
    }

    public String fullName()
    {
        return fullName;
    }
}
