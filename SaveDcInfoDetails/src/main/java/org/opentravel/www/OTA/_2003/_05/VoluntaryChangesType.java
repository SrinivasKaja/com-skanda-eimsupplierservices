/**
 * VoluntaryChangesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Specifies charges and/or penalties associated with making ticket
 * changes after purchase.
 */
public class VoluntaryChangesType  implements java.io.Serializable {
    /* Specifies penalty charges as either a currency amount or a
     * percentage of the fare. */
    private org.opentravel.www.OTA._2003._05.VoluntaryChangesTypePenalty penalty;

    private java.lang.Boolean volChangeInd;  // attribute

    public VoluntaryChangesType() {
    }

    public VoluntaryChangesType(
           org.opentravel.www.OTA._2003._05.VoluntaryChangesTypePenalty penalty,
           java.lang.Boolean volChangeInd) {
           this.penalty = penalty;
           this.volChangeInd = volChangeInd;
    }


    /**
     * Gets the penalty value for this VoluntaryChangesType.
     * 
     * @return penalty   * Specifies penalty charges as either a currency amount or a
     * percentage of the fare.
     */
    public org.opentravel.www.OTA._2003._05.VoluntaryChangesTypePenalty getPenalty() {
        return penalty;
    }


    /**
     * Sets the penalty value for this VoluntaryChangesType.
     * 
     * @param penalty   * Specifies penalty charges as either a currency amount or a
     * percentage of the fare.
     */
    public void setPenalty(org.opentravel.www.OTA._2003._05.VoluntaryChangesTypePenalty penalty) {
        this.penalty = penalty;
    }


    /**
     * Gets the volChangeInd value for this VoluntaryChangesType.
     * 
     * @return volChangeInd
     */
    public java.lang.Boolean getVolChangeInd() {
        return volChangeInd;
    }


    /**
     * Sets the volChangeInd value for this VoluntaryChangesType.
     * 
     * @param volChangeInd
     */
    public void setVolChangeInd(java.lang.Boolean volChangeInd) {
        this.volChangeInd = volChangeInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoluntaryChangesType)) return false;
        VoluntaryChangesType other = (VoluntaryChangesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.penalty==null && other.getPenalty()==null) || 
             (this.penalty!=null &&
              this.penalty.equals(other.getPenalty()))) &&
            ((this.volChangeInd==null && other.getVolChangeInd()==null) || 
             (this.volChangeInd!=null &&
              this.volChangeInd.equals(other.getVolChangeInd())));
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
        if (getPenalty() != null) {
            _hashCode += getPenalty().hashCode();
        }
        if (getVolChangeInd() != null) {
            _hashCode += getVolChangeInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoluntaryChangesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VoluntaryChangesType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("volChangeInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VolChangeInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Penalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">VoluntaryChangesType>Penalty"));
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
