/**
 * RuleInfoTypeResTicketingRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class RuleInfoTypeResTicketingRules  implements java.io.Serializable {
    /* Container for holding rules regarding advance reservation or
     * ticketing restrictions. */
    private org.opentravel.www.OTA._2003._05.AdvResTicketingType advResTicketing;

    public RuleInfoTypeResTicketingRules() {
    }

    public RuleInfoTypeResTicketingRules(
           org.opentravel.www.OTA._2003._05.AdvResTicketingType advResTicketing) {
           this.advResTicketing = advResTicketing;
    }


    /**
     * Gets the advResTicketing value for this RuleInfoTypeResTicketingRules.
     * 
     * @return advResTicketing   * Container for holding rules regarding advance reservation or
     * ticketing restrictions.
     */
    public org.opentravel.www.OTA._2003._05.AdvResTicketingType getAdvResTicketing() {
        return advResTicketing;
    }


    /**
     * Sets the advResTicketing value for this RuleInfoTypeResTicketingRules.
     * 
     * @param advResTicketing   * Container for holding rules regarding advance reservation or
     * ticketing restrictions.
     */
    public void setAdvResTicketing(org.opentravel.www.OTA._2003._05.AdvResTicketingType advResTicketing) {
        this.advResTicketing = advResTicketing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleInfoTypeResTicketingRules)) return false;
        RuleInfoTypeResTicketingRules other = (RuleInfoTypeResTicketingRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advResTicketing==null && other.getAdvResTicketing()==null) || 
             (this.advResTicketing!=null &&
              this.advResTicketing.equals(other.getAdvResTicketing())));
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
        if (getAdvResTicketing() != null) {
            _hashCode += getAdvResTicketing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleInfoTypeResTicketingRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RuleInfoType>ResTicketingRules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advResTicketing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvResTicketing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvResTicketingType"));
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
