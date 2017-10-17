package com.geo.decconv.model;

import com.geo.decconv.converters.ConversionType;
import javafx.beans.property.SimpleStringProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Tidus on 03/10/2017.
 */
public class ConvertOperation {
    private String binaryString;
    private String hexString;
    private long decimalValue;
    private Date dateCreated;
    private ConversionType conversionType;

    private SimpleStringProperty histColumnText;

    public ConvertOperation() {

    }

    public ConvertOperation(String binaryString, String hexString, long decimalValue, ConversionType type) {
        this.binaryString = binaryString;
        this.hexString = hexString;
        this.decimalValue = decimalValue;
        this.conversionType = type;
        this.dateCreated = new Date();
        histColumnText = new SimpleStringProperty(getDisplayString());
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setBinaryString(String binaryString) {
        this.binaryString = binaryString;
    }

    public void setHexString(String hexString) {
        this.hexString = hexString;
    }

    public void setDecimalValue(long decimalValue) {
        this.decimalValue = decimalValue;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setConversionType(ConversionType conversionType) {
        this.conversionType = conversionType;
    }

    public String getDisplayString() {
        return getConvTypeString() + "-" + getDateString();
    }


    public String getHistColumnText() {
        return histColumnText.get();
    }

    public SimpleStringProperty histColumnTextProperty() {
        return histColumnText;
    }

    public void setHistColumnText(String histColumnText) {
        this.histColumnText.set(histColumnText);
    }

    private String getConvTypeString() {
        switch (conversionType) {
            case BINARY:
                return "Binary";
            case HEX:
                return "Hexadecimal";
            case DECIMAL:
                return "Decimal";
            default:
                return "Unknown";
        }
    }

    private String getDateString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy h:mm.ss.SSS a", Locale.getDefault());
        return sdf.format(dateCreated);
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

    @Override
    public String toString() {
        return "ConvertOperation{" +
                "binaryString='" + binaryString + '\'' +
                ", hexString='" + hexString + '\'' +
                ", decimalValue=" + decimalValue +
                ", conversionType=" + conversionType +
                '}';
    }
}
