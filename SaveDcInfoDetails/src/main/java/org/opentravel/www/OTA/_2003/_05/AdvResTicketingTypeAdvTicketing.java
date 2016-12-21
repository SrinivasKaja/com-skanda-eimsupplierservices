/**
 * AdvResTicketingTypeAdvTicketing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AdvResTicketingTypeAdvTicketing  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType fromResTimeOfDay;  // attribute

    private java.lang.String fromResPeriod;  // attribute

    private org.opentravel.www.OTA._2003._05.StayUnitType fromResUnit;  // attribute

    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType fromDepartTimeOfDay;  // attribute

    private java.lang.String fromDepartPeriod;  // attribute

    private org.opentravel.www.OTA._2003._05.StayUnitType fromDepartUnit;  // attribute

    public AdvResTicketingTypeAdvTicketing() {
    }

    public AdvResTicketingTypeAdvTicketing(
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType fromResTimeOfDay,
           java.lang.String fromResPeriod,
           org.opentravel.www.OTA._2003._05.StayUnitType fromResUnit,
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType fromDepartTimeOfDay,
           java.lang.String fromDepartPeriod,
           org.opentravel.www.OTA._2003._05.StayUnitType fromDepartUnit) {
           this.fromResTimeOfDay = fromResTimeOfDay;
           this.fromResPeriod = fromResPeriod;
           this.fromResUnit = fromResUnit;
           this.fromDepartTimeOfDay = fromDepartTimeOfDay;
           this.fromDepartPeriod = fromDepartPeriod;
           this.fromDepartUnit = fromDepartUnit;
    }


    /**
     * Gets the fromResTimeOfDay value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @return fromResTimeOfDay
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getFromResTimeOfDay() {
        return fromResTimeOfDay;
    }


    /**
     * Sets the fromResTimeOfDay value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @param fromResTimeOfDay
     */
    public void setFromResTimeOfDay(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType fromResTimeOfDay) {
        this.fromResTimeOfDay = fromResTimeOfDay;
    }


    /**
     * Gets the fromResPeriod value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @return fromResPeriod
     */
    public java.lang.String getFromResPeriod() {
        return fromResPeriod;
    }


    /**
     * Sets the fromResPeriod value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @param fromResPeriod
     */
    public void setFromResPeriod(java.lang.String fromResPeriod) {
        this.fromResPeriod = fromResPeriod;
    }


    /**
     * Gets the fromResUnit value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @return fromResUnit
     */
    public org.opentravel.www.OTA._2003._05.StayUnitType getFromResUnit() {
        return fromResUnit;
    }


    /**
     * Sets the fromResUnit value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @param fromResUnit
     */
    public void setFromResUnit(org.opentravel.www.OTA._2003._05.StayUnitType fromResUnit) {
        this.fromResUnit = fromResUnit;
    }


    /**
     * Gets the fromDepartTimeOfDay value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @return fromDepartTimeOfDay
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getFromDepartTimeOfDay() {
        return fromDepartTimeOfDay;
    }


    /**
     * Sets the fromDepartTimeOfDay value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @param fromDepartTimeOfDay
     */
    public void setFromDepartTimeOfDay(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType fromDepartTimeOfDay) {
        this.fromDepartTimeOfDay = fromDepartTimeOfDay;
    }


    /**
     * Gets the fromDepartPeriod value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @return fromDepartPeriod
     */
    public java.lang.String getFromDepartPeriod() {
        return fromDepartPeriod;
    }


    /**
     * Sets the fromDepartPeriod value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @param fromDepartPeriod
     */
    public void setFromDepartPeriod(java.lang.String fromDepartPeriod) {
        this.fromDepartPeriod = fromDepartPeriod;
    }


    /**
     * Gets the fromDepartUnit value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @return fromDepartUnit
     */
    public org.opentravel.www.OTA._2003._05.StayUnitType getFromDepartUnit() {
        return fromDepartUnit;
    }


    /**
     * Sets the fromDepartUnit value for this AdvResTicketingTypeAdvTicketing.
     * 
     * @param fromDepartUnit
     */
    public void setFromDepartUnit(org.opentravel.www.OTA._2003._05.StayUnitType fromDepartUnit) {
        this.fromDepartUnit = fromDepartUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvResTicketingTypeAdvTicketing)) return false;
        AdvResTicketingTypeAdvTicketing other = (AdvResTicketingTypeAdvTicketing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromResTimeOfDay==null && other.getFromResTimeOfDay()==null) || 
             (this.fromResTimeOfDay!=null &&
              this.fromResTimeOfDay.equals(other.getFromResTimeOfDay()))) &&
            ((this.fromResPeriod==null && other.getFromResPeriod()==null) || 
             (this.fromResPeriod!=null &&
              this.fromResPeriod.equals(other.getFromResPeriod()))) &&
            ((this.fromResUnit==null && other.getFromResUnit()==null) || 
             (this.fromResUnit!=null &&
              this.fromResUnit.equals(other.getFromResUnit()))) &&
            ((this.fromDepartTimeOfDay==null && other.getFromDepartTimeOfDay()==null) || 
             (this.fromDepartTimeOfDay!=null &&
              this.fromDepartTimeOfDay.equals(other.getFromDepartTimeOfDay()))) &&
            ((this.fromDepartPeriod==null && other.getFromDepartPeriod()==null) || 
             (this.fromDepartPeriod!=null &&
              this.fromDepartPeriod.equals(other.getFromDepartPeriod()))) &&
            ((this.fromDepartUnit==null && other.getFromDepartUnit()==null) || 
             (this.fromDepartUnit!=null &&
              this.fromDepartUnit.equals(other.getFromDepartUnit())));
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
        if (getFromResTimeOfDay() != null) {
            _hashCode += getFromResTimeOfDay().hashCode();
        }
        if (getFromResPeriod() != null) {
            _hashCode += getFromResPeriod().hashCode();
        }
        if (getFromResUnit() != null) {
            _hashCode += getFromResUnit().hashCode();
        }
        if (getFromDepartTimeOfDay() != null) {
            _hashCode += getFromDepartTimeOfDay().hashCode();
        }
        if (getFromDepartPeriod() != null) {
            _hashCode += getFromDepartPeriod().hashCode();
        }
        if (getFromDepartUnit() != null) {
            _hashCode += getFromDepartUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvResTicketingTypeAdvTicketing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AdvResTicketingType>AdvTicketing"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromResTimeOfDay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromResTimeOfDay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromResPeriod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromResPeriod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromResUnit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromResUnit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayUnitType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromDepartTimeOfDay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromDepartTimeOfDay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromDepartPeriod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromDepartPeriod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromDepartUnit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromDepartUnit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayUnitType"));
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
