/**
 * AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote  implements java.io.Serializable {
    private java.lang.String fareTypeName;  // attribute

    private int priorityLevel;  // attribute

    private java.lang.String contentID;  // attribute

    public AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote() {
    }

    public AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote(
           java.lang.String fareTypeName,
           int priorityLevel,
           java.lang.String contentID) {
           this.fareTypeName = fareTypeName;
           this.priorityLevel = priorityLevel;
           this.contentID = contentID;
    }


    /**
     * Gets the fareTypeName value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.
     * 
     * @return fareTypeName
     */
    public java.lang.String getFareTypeName() {
        return fareTypeName;
    }


    /**
     * Sets the fareTypeName value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.
     * 
     * @param fareTypeName
     */
    public void setFareTypeName(java.lang.String fareTypeName) {
        this.fareTypeName = fareTypeName;
    }


    /**
     * Gets the priorityLevel value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.
     * 
     * @return priorityLevel
     */
    public int getPriorityLevel() {
        return priorityLevel;
    }


    /**
     * Sets the priorityLevel value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.
     * 
     * @param priorityLevel
     */
    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }


    /**
     * Gets the contentID value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.
     * 
     * @return contentID
     */
    public java.lang.String getContentID() {
        return contentID;
    }


    /**
     * Sets the contentID value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.
     * 
     * @param contentID
     */
    public void setContentID(java.lang.String contentID) {
        this.contentID = contentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote)) return false;
        AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote other = (AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fareTypeName==null && other.getFareTypeName()==null) || 
             (this.fareTypeName!=null &&
              this.fareTypeName.equals(other.getFareTypeName()))) &&
            this.priorityLevel == other.getPriorityLevel() &&
            ((this.contentID==null && other.getContentID()==null) || 
             (this.contentID!=null &&
              this.contentID.equals(other.getContentID())));
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
        if (getFareTypeName() != null) {
            _hashCode += getFareTypeName().hashCode();
        }
        _hashCode += getPriorityLevel();
        if (getContentID() != null) {
            _hashCode += getContentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsFareNote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>FareNote"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareTypeName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareTypeName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("priorityLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PriorityLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("contentID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ContentID"));
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
