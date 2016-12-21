/**
 * ErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Standard way to indicate that an error occurred during the processing
 * of an OTA message
 */
public class ErrorType  extends org.opentravel.www.OTA._2003._05.FreeTextType  implements java.io.Serializable {
    private java.lang.String type;  // attribute

    private java.lang.String shortText;  // attribute

    private java.lang.String code;  // attribute

    private org.apache.axis.types.URI docURL;  // attribute

    private java.lang.String status;  // attribute

    private java.lang.String tag;  // attribute

    private java.lang.String recordID;  // attribute

    private org.opentravel.www.OTA._2003._05.MessageClassType messageClass;  // attribute

    private java.lang.String nodeList;  // attribute

    public ErrorType() {
    }

    // Simple Types must have a String constructor
    public ErrorType(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the type value for this ErrorType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ErrorType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the shortText value for this ErrorType.
     * 
     * @return shortText
     */
    public java.lang.String getShortText() {
        return shortText;
    }


    /**
     * Sets the shortText value for this ErrorType.
     * 
     * @param shortText
     */
    public void setShortText(java.lang.String shortText) {
        this.shortText = shortText;
    }


    /**
     * Gets the code value for this ErrorType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ErrorType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the docURL value for this ErrorType.
     * 
     * @return docURL
     */
    public org.apache.axis.types.URI getDocURL() {
        return docURL;
    }


    /**
     * Sets the docURL value for this ErrorType.
     * 
     * @param docURL
     */
    public void setDocURL(org.apache.axis.types.URI docURL) {
        this.docURL = docURL;
    }


    /**
     * Gets the status value for this ErrorType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ErrorType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the tag value for this ErrorType.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this ErrorType.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }


    /**
     * Gets the recordID value for this ErrorType.
     * 
     * @return recordID
     */
    public java.lang.String getRecordID() {
        return recordID;
    }


    /**
     * Sets the recordID value for this ErrorType.
     * 
     * @param recordID
     */
    public void setRecordID(java.lang.String recordID) {
        this.recordID = recordID;
    }


    /**
     * Gets the messageClass value for this ErrorType.
     * 
     * @return messageClass
     */
    public org.opentravel.www.OTA._2003._05.MessageClassType getMessageClass() {
        return messageClass;
    }


    /**
     * Sets the messageClass value for this ErrorType.
     * 
     * @param messageClass
     */
    public void setMessageClass(org.opentravel.www.OTA._2003._05.MessageClassType messageClass) {
        this.messageClass = messageClass;
    }


    /**
     * Gets the nodeList value for this ErrorType.
     * 
     * @return nodeList
     */
    public java.lang.String getNodeList() {
        return nodeList;
    }


    /**
     * Sets the nodeList value for this ErrorType.
     * 
     * @param nodeList
     */
    public void setNodeList(java.lang.String nodeList) {
        this.nodeList = nodeList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorType)) return false;
        ErrorType other = (ErrorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.shortText==null && other.getShortText()==null) || 
             (this.shortText!=null &&
              this.shortText.equals(other.getShortText()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.docURL==null && other.getDocURL()==null) || 
             (this.docURL!=null &&
              this.docURL.equals(other.getDocURL()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag()))) &&
            ((this.recordID==null && other.getRecordID()==null) || 
             (this.recordID!=null &&
              this.recordID.equals(other.getRecordID()))) &&
            ((this.messageClass==null && other.getMessageClass()==null) || 
             (this.messageClass!=null &&
              this.messageClass.equals(other.getMessageClass()))) &&
            ((this.nodeList==null && other.getNodeList()==null) || 
             (this.nodeList!=null &&
              this.nodeList.equals(other.getNodeList())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getShortText() != null) {
            _hashCode += getShortText().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDocURL() != null) {
            _hashCode += getDocURL().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getRecordID() != null) {
            _hashCode += getRecordID().hashCode();
        }
        if (getMessageClass() != null) {
            _hashCode += getMessageClass().hashCode();
        }
        if (getNodeList() != null) {
            _hashCode += getNodeList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ErrorType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shortText");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShortText"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("docURL");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DocURL"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tag");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Tag"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recordID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RecordID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("messageClass");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MessageClass"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MessageClassType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nodeList");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NodeList"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
