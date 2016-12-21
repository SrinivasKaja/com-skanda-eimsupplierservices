/**
 * ItinTotalFareType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ItinTotalFareType  extends org.opentravel.www.OTA._2003._05.FareType  implements java.io.Serializable {
    /* Air Extras total summary amount */
    private org.opentravel.www.OTA._2003._05.ItinTotalFareTypeExtras extras;

    /* Total price with Air Extras */
    private org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalWithExtras totalWithExtras;

    private org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalMileage totalMileage;

    private org.opentravel.www.OTA._2003._05.ItinTotalFareTypeServiceFee serviceFee;

    public ItinTotalFareType() {
    }

    public ItinTotalFareType(
           java.lang.Boolean negotiatedFare,
           java.lang.String negotiatedFareCode,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType baseFare,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType nonRefundableBaseFare,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType fareConstruction,
           org.opentravel.www.OTA._2003._05.FareTypeEquivFare equivFare,
           org.opentravel.www.OTA._2003._05.FareTypeTaxes taxes,
           org.opentravel.www.OTA._2003._05.AirFeeType[] fees,
           org.opentravel.www.OTA._2003._05.OBFeeType[] OBFees,
           org.opentravel.www.OTA._2003._05.RateOfExchangeType rateOfExchange,
           org.opentravel.www.OTA._2003._05.CurrencyConversionsType currencyConversions,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType totalFare,
           org.opentravel.www.OTA._2003._05.ReissueInfoType[] reissueInfoList,
           org.opentravel.www.OTA._2003._05.FareTypePenaltiesInfoPenaltyCat16TextOnly[][] penaltiesInfo,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_Extensions TPA_Extensions,
           org.opentravel.www.OTA._2003._05.ItinTotalFareTypeExtras extras,
           org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalWithExtras totalWithExtras,
           org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalMileage totalMileage,
           org.opentravel.www.OTA._2003._05.ItinTotalFareTypeServiceFee serviceFee) {
        super(
            negotiatedFare,
            negotiatedFareCode,
            baseFare,
            nonRefundableBaseFare,
            fareConstruction,
            equivFare,
            taxes,
            fees,
            OBFees,
            rateOfExchange,
            currencyConversions,
            totalFare,
            reissueInfoList,
            penaltiesInfo,
            TPA_Extensions);
        this.extras = extras;
        this.totalWithExtras = totalWithExtras;
        this.totalMileage = totalMileage;
        this.serviceFee = serviceFee;
    }


    /**
     * Gets the extras value for this ItinTotalFareType.
     * 
     * @return extras   * Air Extras total summary amount
     */
    public org.opentravel.www.OTA._2003._05.ItinTotalFareTypeExtras getExtras() {
        return extras;
    }


    /**
     * Sets the extras value for this ItinTotalFareType.
     * 
     * @param extras   * Air Extras total summary amount
     */
    public void setExtras(org.opentravel.www.OTA._2003._05.ItinTotalFareTypeExtras extras) {
        this.extras = extras;
    }


    /**
     * Gets the totalWithExtras value for this ItinTotalFareType.
     * 
     * @return totalWithExtras   * Total price with Air Extras
     */
    public org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalWithExtras getTotalWithExtras() {
        return totalWithExtras;
    }


    /**
     * Sets the totalWithExtras value for this ItinTotalFareType.
     * 
     * @param totalWithExtras   * Total price with Air Extras
     */
    public void setTotalWithExtras(org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalWithExtras totalWithExtras) {
        this.totalWithExtras = totalWithExtras;
    }


    /**
     * Gets the totalMileage value for this ItinTotalFareType.
     * 
     * @return totalMileage
     */
    public org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalMileage getTotalMileage() {
        return totalMileage;
    }


    /**
     * Sets the totalMileage value for this ItinTotalFareType.
     * 
     * @param totalMileage
     */
    public void setTotalMileage(org.opentravel.www.OTA._2003._05.ItinTotalFareTypeTotalMileage totalMileage) {
        this.totalMileage = totalMileage;
    }


    /**
     * Gets the serviceFee value for this ItinTotalFareType.
     * 
     * @return serviceFee
     */
    public org.opentravel.www.OTA._2003._05.ItinTotalFareTypeServiceFee getServiceFee() {
        return serviceFee;
    }


    /**
     * Sets the serviceFee value for this ItinTotalFareType.
     * 
     * @param serviceFee
     */
    public void setServiceFee(org.opentravel.www.OTA._2003._05.ItinTotalFareTypeServiceFee serviceFee) {
        this.serviceFee = serviceFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItinTotalFareType)) return false;
        ItinTotalFareType other = (ItinTotalFareType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extras==null && other.getExtras()==null) || 
             (this.extras!=null &&
              this.extras.equals(other.getExtras()))) &&
            ((this.totalWithExtras==null && other.getTotalWithExtras()==null) || 
             (this.totalWithExtras!=null &&
              this.totalWithExtras.equals(other.getTotalWithExtras()))) &&
            ((this.totalMileage==null && other.getTotalMileage()==null) || 
             (this.totalMileage!=null &&
              this.totalMileage.equals(other.getTotalMileage()))) &&
            ((this.serviceFee==null && other.getServiceFee()==null) || 
             (this.serviceFee!=null &&
              this.serviceFee.equals(other.getServiceFee())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getExtras() != null) {
            _hashCode += getExtras().hashCode();
        }
        if (getTotalWithExtras() != null) {
            _hashCode += getTotalWithExtras().hashCode();
        }
        if (getTotalMileage() != null) {
            _hashCode += getTotalMileage().hashCode();
        }
        if (getServiceFee() != null) {
            _hashCode += getServiceFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItinTotalFareType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItinTotalFareType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Extras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>Extras"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWithExtras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalWithExtras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>TotalWithExtras"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMileage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TotalMileage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>TotalMileage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ServiceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ItinTotalFareType>ServiceFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
