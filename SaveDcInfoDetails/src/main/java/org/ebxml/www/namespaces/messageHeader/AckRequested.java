/**
 * AckRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class AckRequested  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.apache.axis.message.MessageElement [] _any;

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String version;  // attribute

    private org.apache.axis.types.URI actor;  // attribute

    private boolean signed;  // attribute

    public AckRequested() {
    }

    public AckRequested(
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           java.lang.String version,
           org.apache.axis.types.URI actor,
           boolean signed) {
           this._any = _any;
           this.id = id;
           this.version = version;
           this.actor = actor;
           this.signed = signed;
    }


    /**
     * Gets the _any value for this AckRequested.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AckRequested.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this AckRequested.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this AckRequested.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the version value for this AckRequested.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AckRequested.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the actor value for this AckRequested.
     * 
     * @return actor
     */
    public org.apache.axis.types.URI getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this AckRequested.
     * 
     * @param actor
     */
    public void setActor(org.apache.axis.types.URI actor) {
        this.actor = actor;
    }


    /**
     * Gets the signed value for this AckRequested.
     * 
     * @return signed
     */
    public boolean isSigned() {
        return signed;
    }


    /**
     * Sets the signed value for this AckRequested.
     * 
     * @param signed
     */
    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AckRequested)) return false;
        AckRequested other = (AckRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.actor==null && other.getActor()==null) || 
             (this.actor!=null &&
              this.actor.equals(other.getActor()))) &&
            this.signed == other.isSigned();
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getActor() != null) {
            _hashCode += getActor().hashCode();
        }
        _hashCode += (isSigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AckRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">AckRequested"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actor");
        attrField.setXmlName(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", "actor"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("signed");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "signed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
