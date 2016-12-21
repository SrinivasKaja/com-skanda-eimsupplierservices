/**
 * MessageData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class MessageData  implements java.io.Serializable {
    private java.lang.String messageId;

    private java.lang.String timestamp;

    private java.lang.String refToMessageId;

    private java.util.Calendar timeToLive;

    private org.apache.axis.types.NonNegativeInteger timeout;

    public MessageData() {
    }

    public MessageData(
           java.lang.String messageId,
           java.lang.String timestamp,
           java.lang.String refToMessageId,
           java.util.Calendar timeToLive,
           org.apache.axis.types.NonNegativeInteger timeout) {
           this.messageId = messageId;
           this.timestamp = timestamp;
           this.refToMessageId = refToMessageId;
           this.timeToLive = timeToLive;
           this.timeout = timeout;
    }


    /**
     * Gets the messageId value for this MessageData.
     * 
     * @return messageId
     */
    public java.lang.String getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this MessageData.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.String messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the timestamp value for this MessageData.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this MessageData.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the refToMessageId value for this MessageData.
     * 
     * @return refToMessageId
     */
    public java.lang.String getRefToMessageId() {
        return refToMessageId;
    }


    /**
     * Sets the refToMessageId value for this MessageData.
     * 
     * @param refToMessageId
     */
    public void setRefToMessageId(java.lang.String refToMessageId) {
        this.refToMessageId = refToMessageId;
    }


    /**
     * Gets the timeToLive value for this MessageData.
     * 
     * @return timeToLive
     */
    public java.util.Calendar getTimeToLive() {
        return timeToLive;
    }


    /**
     * Sets the timeToLive value for this MessageData.
     * 
     * @param timeToLive
     */
    public void setTimeToLive(java.util.Calendar timeToLive) {
        this.timeToLive = timeToLive;
    }


    /**
     * Gets the timeout value for this MessageData.
     * 
     * @return timeout
     */
    public org.apache.axis.types.NonNegativeInteger getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this MessageData.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.NonNegativeInteger timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageData)) return false;
        MessageData other = (MessageData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.refToMessageId==null && other.getRefToMessageId()==null) || 
             (this.refToMessageId!=null &&
              this.refToMessageId.equals(other.getRefToMessageId()))) &&
            ((this.timeToLive==null && other.getTimeToLive()==null) || 
             (this.timeToLive!=null &&
              this.timeToLive.equals(other.getTimeToLive()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout())));
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
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getRefToMessageId() != null) {
            _hashCode += getRefToMessageId().hashCode();
        }
        if (getTimeToLive() != null) {
            _hashCode += getTimeToLive().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">MessageData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "MessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refToMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "RefToMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToLive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "TimeToLive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
