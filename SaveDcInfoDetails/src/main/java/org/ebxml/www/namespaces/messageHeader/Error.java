/**
 * Error.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class Error  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.ebxml.www.namespaces.messageHeader.Description description;

    private org.apache.axis.message.MessageElement [] _any;

    private org.apache.axis.types.Id id;  // attribute

    private org.apache.axis.types.URI codeContext;  // attribute

    private java.lang.String errorCode;  // attribute

    private org.ebxml.www.namespaces.messageHeader.SeverityType severity;  // attribute

    private java.lang.String location;  // attribute

    public Error() {
    }

    public Error(
           org.ebxml.www.namespaces.messageHeader.Description description,
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           org.apache.axis.types.URI codeContext,
           java.lang.String errorCode,
           org.ebxml.www.namespaces.messageHeader.SeverityType severity,
           java.lang.String location) {
           this.description = description;
           this._any = _any;
           this.id = id;
           this.codeContext = codeContext;
           this.errorCode = errorCode;
           this.severity = severity;
           this.location = location;
    }


    /**
     * Gets the description value for this Error.
     * 
     * @return description
     */
    public org.ebxml.www.namespaces.messageHeader.Description getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Error.
     * 
     * @param description
     */
    public void setDescription(org.ebxml.www.namespaces.messageHeader.Description description) {
        this.description = description;
    }


    /**
     * Gets the _any value for this Error.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this Error.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this Error.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Error.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the codeContext value for this Error.
     * 
     * @return codeContext
     */
    public org.apache.axis.types.URI getCodeContext() {
        return codeContext;
    }


    /**
     * Sets the codeContext value for this Error.
     * 
     * @param codeContext
     */
    public void setCodeContext(org.apache.axis.types.URI codeContext) {
        this.codeContext = codeContext;
    }


    /**
     * Gets the errorCode value for this Error.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this Error.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the severity value for this Error.
     * 
     * @return severity
     */
    public org.ebxml.www.namespaces.messageHeader.SeverityType getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Error.
     * 
     * @param severity
     */
    public void setSeverity(org.ebxml.www.namespaces.messageHeader.SeverityType severity) {
        this.severity = severity;
    }


    /**
     * Gets the location value for this Error.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Error.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Error)) return false;
        Error other = (Error) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.codeContext==null && other.getCodeContext()==null) || 
             (this.codeContext!=null &&
              this.codeContext.equals(other.getCodeContext()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
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
        if (getCodeContext() != null) {
            _hashCode += getCodeContext().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Error.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Error"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codeContext");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "codeContext"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("errorCode");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "errorCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("severity");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "severity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "severity.type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("location");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "location"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Description"));
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
