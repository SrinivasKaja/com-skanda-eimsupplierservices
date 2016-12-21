/**
 * UniqueID_Type.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * An identifier used to uniquely reference an object in a system
 * (e.g. an airline reservation reference, customer profile reference,
 * booking confirmation number, or a reference to a previous availability
 * quote).
 */
public class UniqueID_Type  implements java.io.Serializable {
    /* Identifies the company that is associated with the UniqueID. */
    private org.opentravel.www.OTA._2003._05.CompanyNameType companyName;

    private org.apache.axis.types.URI URL;  // attribute

    private java.lang.String type;  // attribute

    private java.lang.String instance;  // attribute

    private java.lang.String ID;  // attribute

    private java.lang.String ID_Context;  // attribute

    public UniqueID_Type() {
    }

    public UniqueID_Type(
           org.opentravel.www.OTA._2003._05.CompanyNameType companyName,
           org.apache.axis.types.URI URL,
           java.lang.String type,
           java.lang.String instance,
           java.lang.String ID,
           java.lang.String ID_Context) {
           this.companyName = companyName;
           this.URL = URL;
           this.type = type;
           this.instance = instance;
           this.ID = ID;
           this.ID_Context = ID_Context;
    }


    /**
     * Gets the companyName value for this UniqueID_Type.
     * 
     * @return companyName   * Identifies the company that is associated with the UniqueID.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNameType getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this UniqueID_Type.
     * 
     * @param companyName   * Identifies the company that is associated with the UniqueID.
     */
    public void setCompanyName(org.opentravel.www.OTA._2003._05.CompanyNameType companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the URL value for this UniqueID_Type.
     * 
     * @return URL
     */
    public org.apache.axis.types.URI getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this UniqueID_Type.
     * 
     * @param URL
     */
    public void setURL(org.apache.axis.types.URI URL) {
        this.URL = URL;
    }


    /**
     * Gets the type value for this UniqueID_Type.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this UniqueID_Type.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the instance value for this UniqueID_Type.
     * 
     * @return instance
     */
    public java.lang.String getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this UniqueID_Type.
     * 
     * @param instance
     */
    public void setInstance(java.lang.String instance) {
        this.instance = instance;
    }


    /**
     * Gets the ID value for this UniqueID_Type.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this UniqueID_Type.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the ID_Context value for this UniqueID_Type.
     * 
     * @return ID_Context
     */
    public java.lang.String getID_Context() {
        return ID_Context;
    }


    /**
     * Sets the ID_Context value for this UniqueID_Type.
     * 
     * @param ID_Context
     */
    public void setID_Context(java.lang.String ID_Context) {
        this.ID_Context = ID_Context;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UniqueID_Type)) return false;
        UniqueID_Type other = (UniqueID_Type) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.instance==null && other.getInstance()==null) || 
             (this.instance!=null &&
              this.instance.equals(other.getInstance()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.ID_Context==null && other.getID_Context()==null) || 
             (this.ID_Context!=null &&
              this.ID_Context.equals(other.getID_Context())));
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
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getInstance() != null) {
            _hashCode += getInstance().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getID_Context() != null) {
            _hashCode += getID_Context().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UniqueID_Type.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UniqueID_Type"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("URL");
        attrField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("instance");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Instance"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID_Context");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID_Context"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
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
