/**
 * Reference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class Reference  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.ebxml.www.namespaces.messageHeader.Schema[] schema;

    private org.ebxml.www.namespaces.messageHeader.Description[] description;

    private org.apache.axis.message.MessageElement [] _any;

    private org.apache.axis.types.Id id;  // attribute

    private org.w3.www._1999.xlink.Type type;  // attribute

    private org.apache.axis.types.URI href;  // attribute

    private org.apache.axis.types.URI role;  // attribute

    public Reference() {
    }

    public Reference(
           org.ebxml.www.namespaces.messageHeader.Schema[] schema,
           org.ebxml.www.namespaces.messageHeader.Description[] description,
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           org.w3.www._1999.xlink.Type type,
           org.apache.axis.types.URI href,
           org.apache.axis.types.URI role) {
           this.schema = schema;
           this.description = description;
           this._any = _any;
           this.id = id;
           this.type = type;
           this.href = href;
           this.role = role;
    }


    /**
     * Gets the schema value for this Reference.
     * 
     * @return schema
     */
    public org.ebxml.www.namespaces.messageHeader.Schema[] getSchema() {
        return schema;
    }


    /**
     * Sets the schema value for this Reference.
     * 
     * @param schema
     */
    public void setSchema(org.ebxml.www.namespaces.messageHeader.Schema[] schema) {
        this.schema = schema;
    }

    public org.ebxml.www.namespaces.messageHeader.Schema getSchema(int i) {
        return this.schema[i];
    }

    public void setSchema(int i, org.ebxml.www.namespaces.messageHeader.Schema _value) {
        this.schema[i] = _value;
    }


    /**
     * Gets the description value for this Reference.
     * 
     * @return description
     */
    public org.ebxml.www.namespaces.messageHeader.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Reference.
     * 
     * @param description
     */
    public void setDescription(org.ebxml.www.namespaces.messageHeader.Description[] description) {
        this.description = description;
    }

    public org.ebxml.www.namespaces.messageHeader.Description getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, org.ebxml.www.namespaces.messageHeader.Description _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the _any value for this Reference.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this Reference.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this Reference.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Reference.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the type value for this Reference.
     * 
     * @return type
     */
    public org.w3.www._1999.xlink.Type getType() {
        return type;
    }


    /**
     * Sets the type value for this Reference.
     * 
     * @param type
     */
    public void setType(org.w3.www._1999.xlink.Type type) {
        this.type = type;
    }


    /**
     * Gets the href value for this Reference.
     * 
     * @return href
     */
    public org.apache.axis.types.URI getHref() {
        return href;
    }


    /**
     * Sets the href value for this Reference.
     * 
     * @param href
     */
    public void setHref(org.apache.axis.types.URI href) {
        this.href = href;
    }


    /**
     * Gets the role value for this Reference.
     * 
     * @return role
     */
    public org.apache.axis.types.URI getRole() {
        return role;
    }


    /**
     * Sets the role value for this Reference.
     * 
     * @param role
     */
    public void setRole(org.apache.axis.types.URI role) {
        this.role = role;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reference)) return false;
        Reference other = (Reference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.schema==null && other.getSchema()==null) || 
             (this.schema!=null &&
              java.util.Arrays.equals(this.schema, other.getSchema()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.href==null && other.getHref()==null) || 
             (this.href!=null &&
              this.href.equals(other.getHref()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole())));
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
        if (getSchema() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchema());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchema(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getHref() != null) {
            _hashCode += getHref().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Reference"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ID"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", ">type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("href");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("role");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schema");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Schema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Schema"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
