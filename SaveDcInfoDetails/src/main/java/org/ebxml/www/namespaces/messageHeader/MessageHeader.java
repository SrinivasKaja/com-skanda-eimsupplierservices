/**
 * MessageHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class MessageHeader  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.ebxml.www.namespaces.messageHeader.From from;

    private org.ebxml.www.namespaces.messageHeader.To to;

    private java.lang.String CPAId;

    private java.lang.String conversationId;

    private org.ebxml.www.namespaces.messageHeader.Service service;

    private java.lang.String action;

    private org.ebxml.www.namespaces.messageHeader.MessageData messageData;

    private java.lang.Object duplicateElimination;

    private org.ebxml.www.namespaces.messageHeader.Description[] description;

    private org.apache.axis.message.MessageElement [] _any;

    private org.apache.axis.types.Id id;  // attribute

    private java.lang.String version;  // attribute

    public MessageHeader() {
    }

    public MessageHeader(
           org.ebxml.www.namespaces.messageHeader.From from,
           org.ebxml.www.namespaces.messageHeader.To to,
           java.lang.String CPAId,
           java.lang.String conversationId,
           org.ebxml.www.namespaces.messageHeader.Service service,
           java.lang.String action,
           org.ebxml.www.namespaces.messageHeader.MessageData messageData,
           java.lang.Object duplicateElimination,
           org.ebxml.www.namespaces.messageHeader.Description[] description,
           org.apache.axis.message.MessageElement [] _any,
           org.apache.axis.types.Id id,
           java.lang.String version) {
           this.from = from;
           this.to = to;
           this.CPAId = CPAId;
           this.conversationId = conversationId;
           this.service = service;
           this.action = action;
           this.messageData = messageData;
           this.duplicateElimination = duplicateElimination;
           this.description = description;
           this._any = _any;
           this.id = id;
           this.version = version;
    }


    /**
     * Gets the from value for this MessageHeader.
     * 
     * @return from
     */
    public org.ebxml.www.namespaces.messageHeader.From getFrom() {
        return from;
    }


    /**
     * Sets the from value for this MessageHeader.
     * 
     * @param from
     */
    public void setFrom(org.ebxml.www.namespaces.messageHeader.From from) {
        this.from = from;
    }


    /**
     * Gets the to value for this MessageHeader.
     * 
     * @return to
     */
    public org.ebxml.www.namespaces.messageHeader.To getTo() {
        return to;
    }


    /**
     * Sets the to value for this MessageHeader.
     * 
     * @param to
     */
    public void setTo(org.ebxml.www.namespaces.messageHeader.To to) {
        this.to = to;
    }


    /**
     * Gets the CPAId value for this MessageHeader.
     * 
     * @return CPAId
     */
    public java.lang.String getCPAId() {
        return CPAId;
    }


    /**
     * Sets the CPAId value for this MessageHeader.
     * 
     * @param CPAId
     */
    public void setCPAId(java.lang.String CPAId) {
        this.CPAId = CPAId;
    }


    /**
     * Gets the conversationId value for this MessageHeader.
     * 
     * @return conversationId
     */
    public java.lang.String getConversationId() {
        return conversationId;
    }


    /**
     * Sets the conversationId value for this MessageHeader.
     * 
     * @param conversationId
     */
    public void setConversationId(java.lang.String conversationId) {
        this.conversationId = conversationId;
    }


    /**
     * Gets the service value for this MessageHeader.
     * 
     * @return service
     */
    public org.ebxml.www.namespaces.messageHeader.Service getService() {
        return service;
    }


    /**
     * Sets the service value for this MessageHeader.
     * 
     * @param service
     */
    public void setService(org.ebxml.www.namespaces.messageHeader.Service service) {
        this.service = service;
    }


    /**
     * Gets the action value for this MessageHeader.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this MessageHeader.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the messageData value for this MessageHeader.
     * 
     * @return messageData
     */
    public org.ebxml.www.namespaces.messageHeader.MessageData getMessageData() {
        return messageData;
    }


    /**
     * Sets the messageData value for this MessageHeader.
     * 
     * @param messageData
     */
    public void setMessageData(org.ebxml.www.namespaces.messageHeader.MessageData messageData) {
        this.messageData = messageData;
    }


    /**
     * Gets the duplicateElimination value for this MessageHeader.
     * 
     * @return duplicateElimination
     */
    public java.lang.Object getDuplicateElimination() {
        return duplicateElimination;
    }


    /**
     * Sets the duplicateElimination value for this MessageHeader.
     * 
     * @param duplicateElimination
     */
    public void setDuplicateElimination(java.lang.Object duplicateElimination) {
        this.duplicateElimination = duplicateElimination;
    }


    /**
     * Gets the description value for this MessageHeader.
     * 
     * @return description
     */
    public org.ebxml.www.namespaces.messageHeader.Description[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MessageHeader.
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
     * Gets the _any value for this MessageHeader.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this MessageHeader.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the id value for this MessageHeader.
     * 
     * @return id
     */
    public org.apache.axis.types.Id getId() {
        return id;
    }


    /**
     * Sets the id value for this MessageHeader.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.Id id) {
        this.id = id;
    }


    /**
     * Gets the version value for this MessageHeader.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this MessageHeader.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageHeader)) return false;
        MessageHeader other = (MessageHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.CPAId==null && other.getCPAId()==null) || 
             (this.CPAId!=null &&
              this.CPAId.equals(other.getCPAId()))) &&
            ((this.conversationId==null && other.getConversationId()==null) || 
             (this.conversationId!=null &&
              this.conversationId.equals(other.getConversationId()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.messageData==null && other.getMessageData()==null) || 
             (this.messageData!=null &&
              this.messageData.equals(other.getMessageData()))) &&
            ((this.duplicateElimination==null && other.getDuplicateElimination()==null) || 
             (this.duplicateElimination!=null &&
              this.duplicateElimination.equals(other.getDuplicateElimination()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getCPAId() != null) {
            _hashCode += getCPAId().hashCode();
        }
        if (getConversationId() != null) {
            _hashCode += getConversationId().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getMessageData() != null) {
            _hashCode += getMessageData().hashCode();
        }
        if (getDuplicateElimination() != null) {
            _hashCode += getDuplicateElimination().hashCode();
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">MessageHeader"));
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
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">From"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "To"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">To"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPAId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "CPAId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "ConversationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">Service"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "non-empty-string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "MessageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", ">MessageData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateElimination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "DuplicateElimination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
