/**
 * PriceRequestInformationTypeTPA_ExtensionsPriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsPriority  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityPrice price;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityDirectFlights directFlights;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityTime time;

    private org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityVendor vendor;

    public PriceRequestInformationTypeTPA_ExtensionsPriority() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsPriority(
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityPrice price,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityDirectFlights directFlights,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityTime time,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityVendor vendor) {
           this.price = price;
           this.directFlights = directFlights;
           this.time = time;
           this.vendor = vendor;
    }


    /**
     * Gets the price value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @return price
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityPrice getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @param price
     */
    public void setPrice(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityPrice price) {
        this.price = price;
    }


    /**
     * Gets the directFlights value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @return directFlights
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityDirectFlights getDirectFlights() {
        return directFlights;
    }


    /**
     * Sets the directFlights value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @param directFlights
     */
    public void setDirectFlights(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityDirectFlights directFlights) {
        this.directFlights = directFlights;
    }


    /**
     * Gets the time value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @return time
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityTime getTime() {
        return time;
    }


    /**
     * Sets the time value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @param time
     */
    public void setTime(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityTime time) {
        this.time = time;
    }


    /**
     * Gets the vendor value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @return vendor
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityVendor getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this PriceRequestInformationTypeTPA_ExtensionsPriority.
     * 
     * @param vendor
     */
    public void setVendor(org.opentravel.www.OTA._2003._05.PriceRequestInformationTypeTPA_ExtensionsPriorityVendor vendor) {
        this.vendor = vendor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsPriority)) return false;
        PriceRequestInformationTypeTPA_ExtensionsPriority other = (PriceRequestInformationTypeTPA_ExtensionsPriority) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.directFlights==null && other.getDirectFlights()==null) || 
             (this.directFlights!=null &&
              this.directFlights.equals(other.getDirectFlights()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor())));
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
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getDirectFlights() != null) {
            _hashCode += getDirectFlights().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsPriority.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Priority"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directFlights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DirectFlights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>DirectFlights"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>Time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>Vendor"));
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
