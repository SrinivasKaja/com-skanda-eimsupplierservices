/**
 * PTCFareBreakdownTypeEndorsements.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PTCFareBreakdownTypeEndorsements  implements java.io.Serializable {
    /* Specifies ticket endorsement information. */
    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsementsEndorsement[] endorsement;

    private java.lang.String TPA_Extensions;

    private java.lang.Boolean nonRefundableIndicator;  // attribute

    private java.lang.Boolean nonEndorsableIndicator;  // attribute

    public PTCFareBreakdownTypeEndorsements() {
    }

    public PTCFareBreakdownTypeEndorsements(
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsementsEndorsement[] endorsement,
           java.lang.String TPA_Extensions,
           java.lang.Boolean nonRefundableIndicator,
           java.lang.Boolean nonEndorsableIndicator) {
           this.endorsement = endorsement;
           this.TPA_Extensions = TPA_Extensions;
           this.nonRefundableIndicator = nonRefundableIndicator;
           this.nonEndorsableIndicator = nonEndorsableIndicator;
    }


    /**
     * Gets the endorsement value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @return endorsement   * Specifies ticket endorsement information.
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsementsEndorsement[] getEndorsement() {
        return endorsement;
    }


    /**
     * Sets the endorsement value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @param endorsement   * Specifies ticket endorsement information.
     */
    public void setEndorsement(org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsementsEndorsement[] endorsement) {
        this.endorsement = endorsement;
    }

    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsementsEndorsement getEndorsement(int i) {
        return this.endorsement[i];
    }

    public void setEndorsement(int i, org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsementsEndorsement _value) {
        this.endorsement[i] = _value;
    }


    /**
     * Gets the TPA_Extensions value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @return TPA_Extensions
     */
    public java.lang.String getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @param TPA_Extensions
     */
    public void setTPA_Extensions(java.lang.String TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the nonRefundableIndicator value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @return nonRefundableIndicator
     */
    public java.lang.Boolean getNonRefundableIndicator() {
        return nonRefundableIndicator;
    }


    /**
     * Sets the nonRefundableIndicator value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @param nonRefundableIndicator
     */
    public void setNonRefundableIndicator(java.lang.Boolean nonRefundableIndicator) {
        this.nonRefundableIndicator = nonRefundableIndicator;
    }


    /**
     * Gets the nonEndorsableIndicator value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @return nonEndorsableIndicator
     */
    public java.lang.Boolean getNonEndorsableIndicator() {
        return nonEndorsableIndicator;
    }


    /**
     * Sets the nonEndorsableIndicator value for this PTCFareBreakdownTypeEndorsements.
     * 
     * @param nonEndorsableIndicator
     */
    public void setNonEndorsableIndicator(java.lang.Boolean nonEndorsableIndicator) {
        this.nonEndorsableIndicator = nonEndorsableIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PTCFareBreakdownTypeEndorsements)) return false;
        PTCFareBreakdownTypeEndorsements other = (PTCFareBreakdownTypeEndorsements) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endorsement==null && other.getEndorsement()==null) || 
             (this.endorsement!=null &&
              java.util.Arrays.equals(this.endorsement, other.getEndorsement()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.nonRefundableIndicator==null && other.getNonRefundableIndicator()==null) || 
             (this.nonRefundableIndicator!=null &&
              this.nonRefundableIndicator.equals(other.getNonRefundableIndicator()))) &&
            ((this.nonEndorsableIndicator==null && other.getNonEndorsableIndicator()==null) || 
             (this.nonEndorsableIndicator!=null &&
              this.nonEndorsableIndicator.equals(other.getNonEndorsableIndicator())));
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
        if (getEndorsement() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndorsement());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndorsement(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getNonRefundableIndicator() != null) {
            _hashCode += getNonRefundableIndicator().hashCode();
        }
        if (getNonEndorsableIndicator() != null) {
            _hashCode += getNonEndorsableIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PTCFareBreakdownTypeEndorsements.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>Endorsements"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nonRefundableIndicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NonRefundableIndicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nonEndorsableIndicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NonEndorsableIndicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endorsement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Endorsement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>Endorsements>Endorsement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
