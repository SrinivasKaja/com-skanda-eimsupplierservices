/**
 * StayRestrictionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Type defining Min and Max Stay Restrictions.
 */
public class StayRestrictionsType  implements java.io.Serializable {
    /* Specifies restrictions for the shortest length/period of time
     * or earliest day return travel can commence or be completed. */
    private org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMinimumStay minimumStay;

    /* Specifies restrictions for the  longest length/period of time
     * or last day to begin or complete the return. */
    private org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStay maximumStay;

    private java.lang.Boolean stayRestrictionsInd;  // attribute

    public StayRestrictionsType() {
    }

    public StayRestrictionsType(
           org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMinimumStay minimumStay,
           org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStay maximumStay,
           java.lang.Boolean stayRestrictionsInd) {
           this.minimumStay = minimumStay;
           this.maximumStay = maximumStay;
           this.stayRestrictionsInd = stayRestrictionsInd;
    }


    /**
     * Gets the minimumStay value for this StayRestrictionsType.
     * 
     * @return minimumStay   * Specifies restrictions for the shortest length/period of time
     * or earliest day return travel can commence or be completed.
     */
    public org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMinimumStay getMinimumStay() {
        return minimumStay;
    }


    /**
     * Sets the minimumStay value for this StayRestrictionsType.
     * 
     * @param minimumStay   * Specifies restrictions for the shortest length/period of time
     * or earliest day return travel can commence or be completed.
     */
    public void setMinimumStay(org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMinimumStay minimumStay) {
        this.minimumStay = minimumStay;
    }


    /**
     * Gets the maximumStay value for this StayRestrictionsType.
     * 
     * @return maximumStay   * Specifies restrictions for the  longest length/period of time
     * or last day to begin or complete the return.
     */
    public org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStay getMaximumStay() {
        return maximumStay;
    }


    /**
     * Sets the maximumStay value for this StayRestrictionsType.
     * 
     * @param maximumStay   * Specifies restrictions for the  longest length/period of time
     * or last day to begin or complete the return.
     */
    public void setMaximumStay(org.opentravel.www.OTA._2003._05.StayRestrictionsTypeMaximumStay maximumStay) {
        this.maximumStay = maximumStay;
    }


    /**
     * Gets the stayRestrictionsInd value for this StayRestrictionsType.
     * 
     * @return stayRestrictionsInd
     */
    public java.lang.Boolean getStayRestrictionsInd() {
        return stayRestrictionsInd;
    }


    /**
     * Sets the stayRestrictionsInd value for this StayRestrictionsType.
     * 
     * @param stayRestrictionsInd
     */
    public void setStayRestrictionsInd(java.lang.Boolean stayRestrictionsInd) {
        this.stayRestrictionsInd = stayRestrictionsInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StayRestrictionsType)) return false;
        StayRestrictionsType other = (StayRestrictionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minimumStay==null && other.getMinimumStay()==null) || 
             (this.minimumStay!=null &&
              this.minimumStay.equals(other.getMinimumStay()))) &&
            ((this.maximumStay==null && other.getMaximumStay()==null) || 
             (this.maximumStay!=null &&
              this.maximumStay.equals(other.getMaximumStay()))) &&
            ((this.stayRestrictionsInd==null && other.getStayRestrictionsInd()==null) || 
             (this.stayRestrictionsInd!=null &&
              this.stayRestrictionsInd.equals(other.getStayRestrictionsInd())));
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
        if (getMinimumStay() != null) {
            _hashCode += getMinimumStay().hashCode();
        }
        if (getMaximumStay() != null) {
            _hashCode += getMaximumStay().hashCode();
        }
        if (getStayRestrictionsInd() != null) {
            _hashCode += getStayRestrictionsInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StayRestrictionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayRestrictionsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("stayRestrictionsInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StayRestrictionsInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumStay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MinimumStay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">StayRestrictionsType>MinimumStay"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumStay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MaximumStay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">StayRestrictionsType>MaximumStay"));
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
