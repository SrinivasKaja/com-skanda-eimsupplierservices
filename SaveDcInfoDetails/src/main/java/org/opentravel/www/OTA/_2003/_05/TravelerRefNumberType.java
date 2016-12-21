/**
 * TravelerRefNumberType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * A reference place holder used as a pointer to link back to the
 * traveler.
 */
public class TravelerRefNumberType  implements java.io.Serializable {
    private java.lang.String RPH;  // attribute

    public TravelerRefNumberType() {
    }

    public TravelerRefNumberType(
           java.lang.String RPH) {
           this.RPH = RPH;
    }


    /**
     * Gets the RPH value for this TravelerRefNumberType.
     * 
     * @return RPH
     */
    public java.lang.String getRPH() {
        return RPH;
    }


    /**
     * Sets the RPH value for this TravelerRefNumberType.
     * 
     * @param RPH
     */
    public void setRPH(java.lang.String RPH) {
        this.RPH = RPH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerRefNumberType)) return false;
        TravelerRefNumberType other = (TravelerRefNumberType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.RPH==null && other.getRPH()==null) || 
             (this.RPH!=null &&
              this.RPH.equals(other.getRPH())));
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
        if (getRPH() != null) {
            _hashCode += getRPH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerRefNumberType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerRefNumberType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("RPH");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RPH"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
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
