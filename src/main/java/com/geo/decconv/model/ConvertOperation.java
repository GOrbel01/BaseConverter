package com.geo.decconv.model;

/**
 * Created by Tidus on 03/10/2017.
 */
public class ConvertOperation {
    private final String binaryString;
    private final String hexString;
    private final long decimalValue;

    public ConvertOperation(String binaryString, String hexString, long decimalValue) {
        this.binaryString = binaryString;
        this.hexString = hexString;
        this.decimalValue = decimalValue;
    }

    public String getBinaryString() {
        return binaryString;
    }

    public String getHexString() {
        return hexString;
    }

    public long getDecimalValue() {
        return decimalValue;
    }
}
