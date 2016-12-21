/**
 * StayRestrictionsTypeMaximumStay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class StayRestrictionsTypeMaximumStay  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStayReturnType returnType;  // attribute

    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType returnTimeOfDay;  // attribute

    private java.math.BigInteger maxStay;  // attribute

    private org.opentravel.www.OTA._2003._05.StayUnitType stayUnit;  // attribute

    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType maxStayDate;  // attribute

    public StayRestrictionsTypeMaximumStay() {
    }

    public StayRestrictionsTypeMaximumStay(
           org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStayReturnType returnType,
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType returnTimeOfDay,
           java.math.BigInteger maxStay,
           org.opentravel.www.OTA._2003._05.StayUnitType stayUnit,
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType maxStayDate) {
           this.returnType = returnType;
           this.returnTimeOfDay = returnTimeOfDay;
           this.maxStay = maxStay;
           this.stayUnit = stayUnit;
           this.maxStayDate = maxStayDate;
    }


    /**
     * Gets the returnType value for this StayRestrictionsTypeMaximumStay.
     * 
     * @return returnType
     */
    public org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStayReturnType getReturnType() {
        return returnType;
    }


    /**
     * Sets the returnType value for this StayRestrictionsTypeMaximumStay.
     * 
     * @param returnType
     */
    public void setReturnType(org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStayReturnType returnType) {
        this.returnType = returnType;
    }


    /**
     * Gets the returnTimeOfDay value for this StayRestrictionsTypeMaximumStay.
     * 
     * @return returnTimeOfDay
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getReturnTimeOfDay() {
        return returnTimeOfDay;
    }


    /**
     * Sets the returnTimeOfDay value for this StayRestrictionsTypeMaximumStay.
     * 
     * @param returnTimeOfDay
     */
    public void setReturnTimeOfDay(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType returnTimeOfDay) {
        this.returnTimeOfDay = returnTimeOfDay;
    }


    /**
     * Gets the maxStay value for this StayRestrictionsTypeMaximumStay.
     * 
     * @return maxStay
     */
    public java.math.BigInteger getMaxStay() {
        return maxStay;
    }


    /**
     * Sets the maxStay value for this StayRestrictionsTypeMaximumStay.
     * 
     * @param maxStay
     */
    public void setMaxStay(java.math.BigInteger maxStay) {
        this.maxStay = maxStay;
    }


    /**
     * Gets the stayUnit value for this StayRestrictionsTypeMaximumStay.
     * 
     * @return stayUnit
     */
    public org.opentravel.www.OTA._2003._05.StayUnitType getStayUnit() {
        return stayUnit;
    }


    /**
     * Sets the stayUnit value for this StayRestrictionsTypeMaximumStay.
     * 
     * @param stayUnit
     */
    public void setStayUnit(org.opentravel.www.OTA._2003._05.StayUnitType stayUnit) {
        this.stayUnit = stayUnit;
    }


    /**
     * Gets the maxStayDate value for this StayRestrictionsTypeMaximumStay.
     * 
     * @return maxStayDate
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getMaxStayDate() {
        return maxStayDate;
    }


    /**
     * Sets the maxStayDate value for this StayRestrictionsTypeMaximumStay.
     * 
     * @param maxStayDate
     */
    public void setMaxStayDate(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType maxStayDate) {
        this.maxStayDate = maxStayDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StayRestrictionsTypeMaximumStay)) return false;
        StayRestrictionsTypeMaximumStay other = (StayRestrictionsTypeMaximumStay) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnType==null && other.getReturnType()==null) || 
             (this.returnType!=null &&
              this.returnType.equals(other.getReturnType()))) &&
            ((this.returnTimeOfDay==null && other.getReturnTimeOfDay()==null) || 
             (this.returnTimeOfDay!=null &&
              this.returnTimeOfDay.equals(other.getReturnTimeOfDay()))) &&
            ((this.maxStay==null && other.getMaxStay()==null) || 
             (this.maxStay!=null &&
              this.maxStay.equals(other.getMaxStay()))) &&
            ((this.stayUnit==null && other.getStayUnit()==null) || 
             (this.stayUnit!=null &&
              this.stayUnit.equals(other.getStayUnit()))) &&
            ((this.maxStayDate==null && other.getMaxStayDate()==null) || 
             (this.maxStayDate!=null &&
              this.maxStayDate.equals(other.getMaxStayDate())));
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
        if (getReturnType() != null) {
            _hashCode += getReturnType().hashCode();
        }
        if (getReturnTimeOfDay() != null) {
            _hashCode += getReturnTimeOfDay().hashCode();
        }
        if (getMaxStay() != null) {
            _hashCode += getMaxStay().hashCode();
        }
        if (getStayUnit() != null) {
            _hashCode += getStayUnit().hashCode();
        }
        if (getMaxStayDate() != null) {
            _hashCode += getMaxStayDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StayRestrictionsTypeMaximumStay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">StayRestrictionsType>MaximumStay"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReturnType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>StayRestrictionsType>MaximumStay>ReturnType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("returnTimeOfDay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReturnTimeOfDay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxStay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxStay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric1to99"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stayUnit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StayUnit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayUnitType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxStayDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxStayDate"));
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
