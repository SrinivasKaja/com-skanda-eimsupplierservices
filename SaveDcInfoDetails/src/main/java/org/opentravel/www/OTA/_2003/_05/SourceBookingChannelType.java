/**
 * SourceBookingChannelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Specifies the booking channel type and whether it is the primary
 * means of connectivity of the source.
 */
public class SourceBookingChannelType  extends org.opentravel.www.OTA._2003._05.BookingChannelType  implements java.io.Serializable {
    /* Identifies the company that is associated with the booking
     * channel. */
    private org.opentravel.www.OTA._2003._05.CompanyNameType companyName;

    public SourceBookingChannelType() {
    }

    public SourceBookingChannelType(
           java.lang.String type,
           java.lang.Boolean primary,
           org.opentravel.www.OTA._2003._05.CompanyNameType companyName) {
        super(
            type,
            primary);
        this.companyName = companyName;
    }


    /**
     * Gets the companyName value for this SourceBookingChannelType.
     * 
     * @return companyName   * Identifies the company that is associated with the booking
     * channel.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNameType getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this SourceBookingChannelType.
     * 
     * @param companyName   * Identifies the company that is associated with the booking
     * channel.
     */
    public void setCompanyName(org.opentravel.www.OTA._2003._05.CompanyNameType companyName) {
        this.companyName = companyName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SourceBookingChannelType)) return false;
        SourceBookingChannelType other = (SourceBookingChannelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SourceBookingChannelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SourceBookingChannelType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType"));
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
