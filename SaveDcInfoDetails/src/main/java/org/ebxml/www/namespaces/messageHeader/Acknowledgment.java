/**
 * Acknowledgment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class Acknowledgment  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private java.lang.String timestamp;

    private java.lang.String refToMessageId;

    private org.ebxml.www.namespaces.messageHeader.From from;

    private org.ebxml.www.namespaces.messageHeader.Reference[] reference;

    private org.apache.axis.message.MessageElement [] _any;

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String version;  // attribute

    private org.apache.axis.types.URI actor;  // attribute

    public Acknowledgment() {
    }

    public Acknowledgment(
           java.lang.String timestamp,
           java.lang.String refToMessageId,
           org.ebxml.www.namespaces.messageHeader.From from,
           org.ebxml.www.namespaces.messageHeader.Reference[] reference,
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           java.lang.String version,
           org.apache.axis.types.URI actor) {
           this.timestamp = timestamp;
           this.refToMessageId = refToMessageId;
           this.from = from;
           this.reference = reference;
           this._any = _any;
           this.id = id;
           this.version = version;
           this.actor = actor;
    }


    /**
     * Gets the timestamp value for this Acknowledgment.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this Acknowledgment.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the refToMessageId value for this Acknowledgment.
     * 
     * @return refToMessageId
     */
    public java.lang.String getRefToMessageId() {
        return refToMessageId;
    }


    /**
     * Sets the refToMessageId value for this Acknowledgment.
     * 
     * @param refToMessageId
     */
    public void setRefToMessageId(java.lang.String refToMessageId) {
        this.refToMessageId = refToMessageId;
    }


    /**
     * Gets the from value for this Acknowledgment.
     * 
     * @return from
     */
    public org.ebxml.www.namespaces.messageHeader.From getFrom() {
        return from;
    }


    /**
     * Sets the from value for this Acknowledgment.
     * 
     * @param from
     */
    public void setFrom(org.ebxml.www.namespaces.messageHeader.From from) {
        this.from = from;
    }


    /**
     * Gets the reference value for this Acknowledgment.
     * 
     * @return reference
     */
    public org.ebxml.www.namespaces.messageHeader.Reference[] getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this Acknowledgment.
     * 
     * @param reference
     */
    public void setReference(org.ebxml.www.namespaces.messageHeader.Reference[] reference) {
        this.reference = reference;
    }

    public org.ebxml.www.namespaces.messageHeader.Reference getReference(int i) {
        return this.reference[i];
    }

    public void setReference(int i, org.ebxml.www.namespaces.messageHeader.Reference _value) {
        this.reference[i] = _value;
    }


    /**
     * Gets the _any value for this Acknowledgment.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this Acknowledgment.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this Acknowledgment.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this Acknowledgment.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the version value for this Acknowledgment.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Acknowledgment.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the actor value for this Acknowledgment.
     * 
     * @return actor
     */
    public org.apache.axis.types.URI getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this Acknowledgment.
     * 
     * @param actor
     */
    public void setActor(org.apache.axis.types.URI actor) {
        this.actor = actor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Acknowledgment)) return false;
        Acknowledgment other = (Acknowledgment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.refToMessageId==null && other.getRefToMessageId()==null) || 
             (this.refToMessageId!=null &&
              this.refToMessageId.equals(other.getRefToMessageId()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              java.util.Arrays.equals(this.reference, other.getReference()))) &&
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
              this.actor.equals(other.getActor())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getRefToMessageId() != null) {
            _hashCode += getRefToMessageId().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReference(), i);
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getActor() != null) {
            _hashCode += getActor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Acknowledgment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Acknowledgment"));
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
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refToMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "RefToMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">From"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Reference"));
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
