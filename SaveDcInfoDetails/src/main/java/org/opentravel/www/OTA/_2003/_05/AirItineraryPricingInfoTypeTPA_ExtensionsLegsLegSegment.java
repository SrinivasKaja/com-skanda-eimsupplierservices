/**
 * AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment  implements java.io.Serializable {
    private java.lang.Integer number;  // attribute

    private java.lang.String programID;  // attribute

    private java.lang.String programDescription;  // attribute

    private java.lang.String programSystemCode;  // attribute

    private java.lang.String brandID;  // attribute

    private java.lang.String brandName;  // attribute

    private java.lang.String fareStatus;  // attribute

    public AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment() {
    }

    public AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment(
           java.lang.Integer number,
           java.lang.String programID,
           java.lang.String programDescription,
           java.lang.String programSystemCode,
           java.lang.String brandID,
           java.lang.String brandName,
           java.lang.String fareStatus) {
           this.number = number;
           this.programID = programID;
           this.programDescription = programDescription;
           this.programSystemCode = programSystemCode;
           this.brandID = brandID;
           this.brandName = brandName;
           this.fareStatus = fareStatus;
    }


    /**
     * Gets the number value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @return number
     */
    public java.lang.Integer getNumber() {
        return number;
    }


    /**
     * Sets the number value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @param number
     */
    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }


    /**
     * Gets the programID value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @return programID
     */
    public java.lang.String getProgramID() {
        return programID;
    }


    /**
     * Sets the programID value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @param programID
     */
    public void setProgramID(java.lang.String programID) {
        this.programID = programID;
    }


    /**
     * Gets the programDescription value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @return programDescription
     */
    public java.lang.String getProgramDescription() {
        return programDescription;
    }


    /**
     * Sets the programDescription value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @param programDescription
     */
    public void setProgramDescription(java.lang.String programDescription) {
        this.programDescription = programDescription;
    }


    /**
     * Gets the programSystemCode value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @return programSystemCode
     */
    public java.lang.String getProgramSystemCode() {
        return programSystemCode;
    }


    /**
     * Sets the programSystemCode value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @param programSystemCode
     */
    public void setProgramSystemCode(java.lang.String programSystemCode) {
        this.programSystemCode = programSystemCode;
    }


    /**
     * Gets the brandID value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @return brandID
     */
    public java.lang.String getBrandID() {
        return brandID;
    }


    /**
     * Sets the brandID value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @param brandID
     */
    public void setBrandID(java.lang.String brandID) {
        this.brandID = brandID;
    }


    /**
     * Gets the brandName value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @return brandName
     */
    public java.lang.String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @param brandName
     */
    public void setBrandName(java.lang.String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the fareStatus value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @return fareStatus
     */
    public java.lang.String getFareStatus() {
        return fareStatus;
    }


    /**
     * Sets the fareStatus value for this AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.
     * 
     * @param fareStatus
     */
    public void setFareStatus(java.lang.String fareStatus) {
        this.fareStatus = fareStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment)) return false;
        AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment other = (AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.programID==null && other.getProgramID()==null) || 
             (this.programID!=null &&
              this.programID.equals(other.getProgramID()))) &&
            ((this.programDescription==null && other.getProgramDescription()==null) || 
             (this.programDescription!=null &&
              this.programDescription.equals(other.getProgramDescription()))) &&
            ((this.programSystemCode==null && other.getProgramSystemCode()==null) || 
             (this.programSystemCode!=null &&
              this.programSystemCode.equals(other.getProgramSystemCode()))) &&
            ((this.brandID==null && other.getBrandID()==null) || 
             (this.brandID!=null &&
              this.brandID.equals(other.getBrandID()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.fareStatus==null && other.getFareStatus()==null) || 
             (this.fareStatus!=null &&
              this.fareStatus.equals(other.getFareStatus())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getProgramID() != null) {
            _hashCode += getProgramID().hashCode();
        }
        if (getProgramDescription() != null) {
            _hashCode += getProgramDescription().hashCode();
        }
        if (getProgramSystemCode() != null) {
            _hashCode += getProgramSystemCode().hashCode();
        }
        if (getBrandID() != null) {
            _hashCode += getBrandID().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getFareStatus() != null) {
            _hashCode += getFareStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeTPA_ExtensionsLegsLegSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>TPA_Extensions>Legs>Leg>Segment"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programSystemCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramSystemCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareStatus"));
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
