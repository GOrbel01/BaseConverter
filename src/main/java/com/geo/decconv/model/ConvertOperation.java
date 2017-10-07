package com.geo.decconv.model;

import com.geo.decconv.converters.ConversionType;

/**
 * Created by Tidus on 03/10/2017.
 */
public class ConvertOperation {
    private final String binaryString;
    private final String hexString;
    private final long decimalValue;
    private ConversionType conversionType;

    public ConvertOperation(String binaryString, String hexString, long decimalValue, ConversionType type) {
        this.binaryString = binaryString;
        this.hexString = hexString;
        this.decimalValue = decimalValue;
        this.conversionType = type;
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

    public ConversionType getConversionType() {
        return conversionType;
    }

    @Override
    public int hashCode() {
        int result = binaryString != null ? binaryString.hashCode() : 0;
        result = 31 * result + (hexString != null ? hexString.hashCode() : 0);
        result = 31 * result + (int) (decimalValue ^ (decimalValue >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ConvertOperation)) {
            return false;
        }
        ConvertOperation operation = (ConvertOperation) obj;
        return operation.binaryString.equalsIgnoreCase(this.binaryString)
                && operation.decimalValue == this.decimalValue && operation.hexString.equalsIgnoreCase(this.hexString);
    }
}
