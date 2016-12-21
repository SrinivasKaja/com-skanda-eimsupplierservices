/**
 * PassengerTypeQuantityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Specifies a PTC (Passenger Type Code) and the associated number
 * of PTC's - for use in specifying passenger lists.
 */
public class PassengerTypeQuantityType  extends org.opentravel.www.OTA._2003._05.TravelerCountType  implements java.io.Serializable {
    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_Extensions TPA_Extensions;

    private java.lang.Boolean changeable;  // attribute

    private int index;  // attribute

    public PassengerTypeQuantityType() {
    }

    public PassengerTypeQuantityType(
           java.math.BigInteger age,
           org.opentravel.www.OTA._2003._05.TravelerCountTypeCode code,
           java.lang.String codeContext,
           org.apache.axis.types.URI URI,
           java.math.BigInteger quantity,
           java.lang.Boolean changeable,
           int index,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_Extensions TPA_Extensions) {
        super(
            age,
            code,
            codeContext,
            URI,
            quantity);
        this.changeable = changeable;
        this.index = index;
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the TPA_Extensions value for this PassengerTypeQuantityType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this PassengerTypeQuantityType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the changeable value for this PassengerTypeQuantityType.
     * 
     * @return changeable
     */
    public java.lang.Boolean getChangeable() {
        return changeable;
    }


    /**
     * Sets the changeable value for this PassengerTypeQuantityType.
     * 
     * @param changeable
     */
    public void setChangeable(java.lang.Boolean changeable) {
        this.changeable = changeable;
    }


    /**
     * Gets the index value for this PassengerTypeQuantityType.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this PassengerTypeQuantityType.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassengerTypeQuantityType)) return false;
        PassengerTypeQuantityType other = (PassengerTypeQuantityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.changeable==null && other.getChangeable()==null) || 
             (this.changeable!=null &&
              this.changeable.equals(other.getChangeable()))) &&
            this.index == other.getIndex();
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
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getChangeable() != null) {
            _hashCode += getChangeable().hashCode();
        }
        _hashCode += getIndex();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PassengerTypeQuantityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantityType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Changeable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PassengerTypeQuantityType>TPA_Extensions"));
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
