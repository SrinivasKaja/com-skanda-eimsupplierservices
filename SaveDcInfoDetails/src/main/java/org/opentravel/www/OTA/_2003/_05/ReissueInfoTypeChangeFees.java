/**
 * ReissueInfoTypeChangeFees.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ReissueInfoTypeChangeFees  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFeesChangeFee changeFee;

    public ReissueInfoTypeChangeFees() {
    }

    public ReissueInfoTypeChangeFees(
           org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFeesChangeFee changeFee) {
           this.changeFee = changeFee;
    }


    /**
     * Gets the changeFee value for this ReissueInfoTypeChangeFees.
     * 
     * @return changeFee
     */
    public org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFeesChangeFee getChangeFee() {
        return changeFee;
    }


    /**
     * Sets the changeFee value for this ReissueInfoTypeChangeFees.
     * 
     * @param changeFee
     */
    public void setChangeFee(org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFeesChangeFee changeFee) {
        this.changeFee = changeFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReissueInfoTypeChangeFees)) return false;
        ReissueInfoTypeChangeFees other = (ReissueInfoTypeChangeFees) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeFee==null && other.getChangeFee()==null) || 
             (this.changeFee!=null &&
              this.changeFee.equals(other.getChangeFee())));
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
        if (getChangeFee() != null) {
            _hashCode += getChangeFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReissueInfoTypeChangeFees.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ReissueInfoType>ChangeFees"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ChangeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>ReissueInfoType>ChangeFees>ChangeFee"));
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
