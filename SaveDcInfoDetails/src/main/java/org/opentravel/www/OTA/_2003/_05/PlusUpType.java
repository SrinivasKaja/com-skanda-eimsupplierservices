/**
 * PlusUpType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PlusUpType  implements java.io.Serializable {
    private java.math.BigDecimal amount;  // attribute

    private java.lang.String originCity;  // attribute

    private java.lang.String destinationCity;  // attribute

    private java.lang.String fareOriginCity;  // attribute

    private java.lang.String fareDestinationCity;  // attribute

    private java.lang.String viaCity;  // attribute

    private java.lang.String message;  // attribute

    private java.lang.String countryOfPayment;  // attribute

    public PlusUpType() {
    }

    public PlusUpType(
           java.math.BigDecimal amount,
           java.lang.String originCity,
           java.lang.String destinationCity,
           java.lang.String fareOriginCity,
           java.lang.String fareDestinationCity,
           java.lang.String viaCity,
           java.lang.String message,
           java.lang.String countryOfPayment) {
           this.amount = amount;
           this.originCity = originCity;
           this.destinationCity = destinationCity;
           this.fareOriginCity = fareOriginCity;
           this.fareDestinationCity = fareDestinationCity;
           this.viaCity = viaCity;
           this.message = message;
           this.countryOfPayment = countryOfPayment;
    }


    /**
     * Gets the amount value for this PlusUpType.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PlusUpType.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the originCity value for this PlusUpType.
     * 
     * @return originCity
     */
    public java.lang.String getOriginCity() {
        return originCity;
    }


    /**
     * Sets the originCity value for this PlusUpType.
     * 
     * @param originCity
     */
    public void setOriginCity(java.lang.String originCity) {
        this.originCity = originCity;
    }


    /**
     * Gets the destinationCity value for this PlusUpType.
     * 
     * @return destinationCity
     */
    public java.lang.String getDestinationCity() {
        return destinationCity;
    }


    /**
     * Sets the destinationCity value for this PlusUpType.
     * 
     * @param destinationCity
     */
    public void setDestinationCity(java.lang.String destinationCity) {
        this.destinationCity = destinationCity;
    }


    /**
     * Gets the fareOriginCity value for this PlusUpType.
     * 
     * @return fareOriginCity
     */
    public java.lang.String getFareOriginCity() {
        return fareOriginCity;
    }


    /**
     * Sets the fareOriginCity value for this PlusUpType.
     * 
     * @param fareOriginCity
     */
    public void setFareOriginCity(java.lang.String fareOriginCity) {
        this.fareOriginCity = fareOriginCity;
    }


    /**
     * Gets the fareDestinationCity value for this PlusUpType.
     * 
     * @return fareDestinationCity
     */
    public java.lang.String getFareDestinationCity() {
        return fareDestinationCity;
    }


    /**
     * Sets the fareDestinationCity value for this PlusUpType.
     * 
     * @param fareDestinationCity
     */
    public void setFareDestinationCity(java.lang.String fareDestinationCity) {
        this.fareDestinationCity = fareDestinationCity;
    }


    /**
     * Gets the viaCity value for this PlusUpType.
     * 
     * @return viaCity
     */
    public java.lang.String getViaCity() {
        return viaCity;
    }


    /**
     * Sets the viaCity value for this PlusUpType.
     * 
     * @param viaCity
     */
    public void setViaCity(java.lang.String viaCity) {
        this.viaCity = viaCity;
    }


    /**
     * Gets the message value for this PlusUpType.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this PlusUpType.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the countryOfPayment value for this PlusUpType.
     * 
     * @return countryOfPayment
     */
    public java.lang.String getCountryOfPayment() {
        return countryOfPayment;
    }


    /**
     * Sets the countryOfPayment value for this PlusUpType.
     * 
     * @param countryOfPayment
     */
    public void setCountryOfPayment(java.lang.String countryOfPayment) {
        this.countryOfPayment = countryOfPayment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlusUpType)) return false;
        PlusUpType other = (PlusUpType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.originCity==null && other.getOriginCity()==null) || 
             (this.originCity!=null &&
              this.originCity.equals(other.getOriginCity()))) &&
            ((this.destinationCity==null && other.getDestinationCity()==null) || 
             (this.destinationCity!=null &&
              this.destinationCity.equals(other.getDestinationCity()))) &&
            ((this.fareOriginCity==null && other.getFareOriginCity()==null) || 
             (this.fareOriginCity!=null &&
              this.fareOriginCity.equals(other.getFareOriginCity()))) &&
            ((this.fareDestinationCity==null && other.getFareDestinationCity()==null) || 
             (this.fareDestinationCity!=null &&
              this.fareDestinationCity.equals(other.getFareDestinationCity()))) &&
            ((this.viaCity==null && other.getViaCity()==null) || 
             (this.viaCity!=null &&
              this.viaCity.equals(other.getViaCity()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.countryOfPayment==null && other.getCountryOfPayment()==null) || 
             (this.countryOfPayment!=null &&
              this.countryOfPayment.equals(other.getCountryOfPayment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getOriginCity() != null) {
            _hashCode += getOriginCity().hashCode();
        }
        if (getDestinationCity() != null) {
            _hashCode += getDestinationCity().hashCode();
        }
        if (getFareOriginCity() != null) {
            _hashCode += getFareOriginCity().hashCode();
        }
        if (getFareDestinationCity() != null) {
            _hashCode += getFareDestinationCity().hashCode();
        }
        if (getViaCity() != null) {
            _hashCode += getViaCity().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getCountryOfPayment() != null) {
            _hashCode += getCountryOfPayment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlusUpType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PlusUpType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("amount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originCity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginCity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("destinationCity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DestinationCity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareOriginCity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareOriginCity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareDestinationCity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareDestinationCity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("viaCity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ViaCity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("countryOfPayment");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CountryOfPayment"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISO3166"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
