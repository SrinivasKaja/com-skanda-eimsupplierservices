/**
 * StayRestrictionsTypeMinimumStay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class StayRestrictionsTypeMinimumStay  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType returnTimeOfDay;  // attribute

    private java.math.BigInteger minStay;  // attribute

    private org.opentravel.www.OTA._2003._05.StayUnitType stayUnit;  // attribute

    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType minStayDate;  // attribute

    public StayRestrictionsTypeMinimumStay() {
    }

    public StayRestrictionsTypeMinimumStay(
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType returnTimeOfDay,
           java.math.BigInteger minStay,
           org.opentravel.www.OTA._2003._05.StayUnitType stayUnit,
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType minStayDate) {
           this.returnTimeOfDay = returnTimeOfDay;
           this.minStay = minStay;
           this.stayUnit = stayUnit;
           this.minStayDate = minStayDate;
    }


    /**
     * Gets the returnTimeOfDay value for this StayRestrictionsTypeMinimumStay.
     * 
     * @return returnTimeOfDay
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getReturnTimeOfDay() {
        return returnTimeOfDay;
    }


    /**
     * Sets the returnTimeOfDay value for this StayRestrictionsTypeMinimumStay.
     * 
     * @param returnTimeOfDay
     */
    public void setReturnTimeOfDay(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType returnTimeOfDay) {
        this.returnTimeOfDay = returnTimeOfDay;
    }


    /**
     * Gets the minStay value for this StayRestrictionsTypeMinimumStay.
     * 
     * @return minStay
     */
    public java.math.BigInteger getMinStay() {
        return minStay;
    }


    /**
     * Sets the minStay value for this StayRestrictionsTypeMinimumStay.
     * 
     * @param minStay
     */
    public void setMinStay(java.math.BigInteger minStay) {
        this.minStay = minStay;
    }


    /**
     * Gets the stayUnit value for this StayRestrictionsTypeMinimumStay.
     * 
     * @return stayUnit
     */
    public org.opentravel.www.OTA._2003._05.StayUnitType getStayUnit() {
        return stayUnit;
    }


    /**
     * Sets the stayUnit value for this StayRestrictionsTypeMinimumStay.
     * 
     * @param stayUnit
     */
    public void setStayUnit(org.opentravel.www.OTA._2003._05.StayUnitType stayUnit) {
        this.stayUnit = stayUnit;
    }


    /**
     * Gets the minStayDate value for this StayRestrictionsTypeMinimumStay.
     * 
     * @return minStayDate
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getMinStayDate() {
        return minStayDate;
    }


    /**
     * Sets the minStayDate value for this StayRestrictionsTypeMinimumStay.
     * 
     * @param minStayDate
     */
    public void setMinStayDate(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType minStayDate) {
        this.minStayDate = minStayDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StayRestrictionsTypeMinimumStay)) return false;
        StayRestrictionsTypeMinimumStay other = (StayRestrictionsTypeMinimumStay) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnTimeOfDay==null && other.getReturnTimeOfDay()==null) || 
             (this.returnTimeOfDay!=null &&
              this.returnTimeOfDay.equals(other.getReturnTimeOfDay()))) &&
            ((this.minStay==null && other.getMinStay()==null) || 
             (this.minStay!=null &&
              this.minStay.equals(other.getMinStay()))) &&
            ((this.stayUnit==null && other.getStayUnit()==null) || 
             (this.stayUnit!=null &&
              this.stayUnit.equals(other.getStayUnit()))) &&
            ((this.minStayDate==null && other.getMinStayDate()==null) || 
             (this.minStayDate!=null &&
              this.minStayDate.equals(other.getMinStayDate())));
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
        if (getReturnTimeOfDay() != null) {
            _hashCode += getReturnTimeOfDay().hashCode();
        }
        if (getMinStay() != null) {
            _hashCode += getMinStay().hashCode();
        }
        if (getStayUnit() != null) {
            _hashCode += getStayUnit().hashCode();
        }
        if (getMinStayDate() != null) {
            _hashCode += getMinStayDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StayRestrictionsTypeMinimumStay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">StayRestrictionsType>MinimumStay"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnTimeOfDay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReturnTimeOfDay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minStay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinStay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric1to99"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stayUnit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StayUnit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayUnitType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minStayDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinStayDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
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
