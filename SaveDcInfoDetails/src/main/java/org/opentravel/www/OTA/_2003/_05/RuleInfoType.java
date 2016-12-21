/**
 * RuleInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Contains summary fare rule information as well as detailed Rule
 * Information for Fare Basis Codes.  Information may be actual rules
 * data or the results returned from a rules-based inquiry.
 */
public class RuleInfoType  implements java.io.Serializable {
    /* General container for rules regarding fare reservation,  ticketing
     * and sale restrictions */
    private org.opentravel.www.OTA._2003._05.RuleInfoTypeResTicketingRules resTicketingRules;

    /* Rules providing minimum or maximum stay restrictions. */
    private org.opentravel.www.OTA._2003._05.StayRestrictionsType lengthOfStayRules;

    public RuleInfoType() {
    }

    public RuleInfoType(
           org.opentravel.www.OTA._2003._05.RuleInfoTypeResTicketingRules resTicketingRules,
           org.opentravel.www.OTA._2003._05.StayRestrictionsType lengthOfStayRules) {
           this.resTicketingRules = resTicketingRules;
           this.lengthOfStayRules = lengthOfStayRules;
    }


    /**
     * Gets the resTicketingRules value for this RuleInfoType.
     * 
     * @return resTicketingRules   * General container for rules regarding fare reservation,  ticketing
     * and sale restrictions
     */
    public org.opentravel.www.OTA._2003._05.RuleInfoTypeResTicketingRules getResTicketingRules() {
        return resTicketingRules;
    }


    /**
     * Sets the resTicketingRules value for this RuleInfoType.
     * 
     * @param resTicketingRules   * General container for rules regarding fare reservation,  ticketing
     * and sale restrictions
     */
    public void setResTicketingRules(org.opentravel.www.OTA._2003._05.RuleInfoTypeResTicketingRules resTicketingRules) {
        this.resTicketingRules = resTicketingRules;
    }


    /**
     * Gets the lengthOfStayRules value for this RuleInfoType.
     * 
     * @return lengthOfStayRules   * Rules providing minimum or maximum stay restrictions.
     */
    public org.opentravel.www.OTA._2003._05.StayRestrictionsType getLengthOfStayRules() {
        return lengthOfStayRules;
    }


    /**
     * Sets the lengthOfStayRules value for this RuleInfoType.
     * 
     * @param lengthOfStayRules   * Rules providing minimum or maximum stay restrictions.
     */
    public void setLengthOfStayRules(org.opentravel.www.OTA._2003._05.StayRestrictionsType lengthOfStayRules) {
        this.lengthOfStayRules = lengthOfStayRules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleInfoType)) return false;
        RuleInfoType other = (RuleInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resTicketingRules==null && other.getResTicketingRules()==null) || 
             (this.resTicketingRules!=null &&
              this.resTicketingRules.equals(other.getResTicketingRules()))) &&
            ((this.lengthOfStayRules==null && other.getLengthOfStayRules()==null) || 
             (this.lengthOfStayRules!=null &&
              this.lengthOfStayRules.equals(other.getLengthOfStayRules())));
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
        if (getResTicketingRules() != null) {
            _hashCode += getResTicketingRules().hashCode();
        }
        if (getLengthOfStayRules() != null) {
            _hashCode += getLengthOfStayRules().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RuleInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resTicketingRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResTicketingRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RuleInfoType>ResTicketingRules"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lengthOfStayRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LengthOfStayRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayRestrictionsType"));
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
