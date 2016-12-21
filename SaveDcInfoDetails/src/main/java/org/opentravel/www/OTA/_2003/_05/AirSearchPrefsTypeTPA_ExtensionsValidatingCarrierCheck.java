/**
 * AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation settlementValidation;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckIETValidation IETValidation;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCarrier[] carrier;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCountry[] country;

    public AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck(
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation settlementValidation,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckIETValidation IETValidation,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCarrier[] carrier,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCountry[] country) {
           this.settlementValidation = settlementValidation;
           this.IETValidation = IETValidation;
           this.carrier = carrier;
           this.country = country;
    }


    /**
     * Gets the settlementValidation value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @return settlementValidation
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation getSettlementValidation() {
        return settlementValidation;
    }


    /**
     * Sets the settlementValidation value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @param settlementValidation
     */
    public void setSettlementValidation(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation settlementValidation) {
        this.settlementValidation = settlementValidation;
    }


    /**
     * Gets the IETValidation value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @return IETValidation
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckIETValidation getIETValidation() {
        return IETValidation;
    }


    /**
     * Sets the IETValidation value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @param IETValidation
     */
    public void setIETValidation(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckIETValidation IETValidation) {
        this.IETValidation = IETValidation;
    }


    /**
     * Gets the carrier value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @return carrier
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCarrier[] getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @param carrier
     */
    public void setCarrier(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCarrier[] carrier) {
        this.carrier = carrier;
    }

    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCarrier getCarrier(int i) {
        return this.carrier[i];
    }

    public void setCarrier(int i, org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCarrier _value) {
        this.carrier[i] = _value;
    }


    /**
     * Gets the country value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @return country
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCountry[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.
     * 
     * @param country
     */
    public void setCountry(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCountry[] country) {
        this.country = country;
    }

    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCountry getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckCountry _value) {
        this.country[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck)) return false;
        AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck other = (AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.settlementValidation==null && other.getSettlementValidation()==null) || 
             (this.settlementValidation!=null &&
              this.settlementValidation.equals(other.getSettlementValidation()))) &&
            ((this.IETValidation==null && other.getIETValidation()==null) || 
             (this.IETValidation!=null &&
              this.IETValidation.equals(other.getIETValidation()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              java.util.Arrays.equals(this.carrier, other.getCarrier()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry())));
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
        if (getSettlementValidation() != null) {
            _hashCode += getSettlementValidation().hashCode();
        }
        if (getIETValidation() != null) {
            _hashCode += getIETValidation().hashCode();
        }
        if (getCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SettlementValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>SettlementValidation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IETValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IETValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>IETValidation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>Carrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
