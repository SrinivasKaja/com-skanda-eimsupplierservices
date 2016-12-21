/**
 * FareTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTPA_Extensions  implements java.io.Serializable {
    /* Surcharge information */
    private org.opentravel.www.OTA._2003._05.SurchargesType[] surcharges;

    /* This is a collection of Leg Information */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLeg[] legs;

    /* A collection of additional information for each Fare Component */
    private org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponent[] fareComponents;

    private org.opentravel.www.OTA._2003._05.FareMessagesType messages;

    private org.opentravel.www.OTA._2003._05.BaggageInformationType[] baggageInformationList;

    private org.opentravel.www.OTA._2003._05.HandlingMarkupSummaryType[][] sellingFareDataList;

    private org.opentravel.www.OTA._2003._05.FareComponentBreakdownType[][] commissionData;

    public FareTypeTPA_Extensions() {
    }

    public FareTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.SurchargesType[] surcharges,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLeg[] legs,
           org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponent[] fareComponents,
           org.opentravel.www.OTA._2003._05.FareMessagesType messages,
           org.opentravel.www.OTA._2003._05.BaggageInformationType[] baggageInformationList,
           org.opentravel.www.OTA._2003._05.HandlingMarkupSummaryType[][] sellingFareDataList,
           org.opentravel.www.OTA._2003._05.FareComponentBreakdownType[][] commissionData) {
           this.surcharges = surcharges;
           this.legs = legs;
           this.fareComponents = fareComponents;
           this.messages = messages;
           this.baggageInformationList = baggageInformationList;
           this.sellingFareDataList = sellingFareDataList;
           this.commissionData = commissionData;
    }


    /**
     * Gets the surcharges value for this FareTypeTPA_Extensions.
     * 
     * @return surcharges   * Surcharge information
     */
    public org.opentravel.www.OTA._2003._05.SurchargesType[] getSurcharges() {
        return surcharges;
    }


    /**
     * Sets the surcharges value for this FareTypeTPA_Extensions.
     * 
     * @param surcharges   * Surcharge information
     */
    public void setSurcharges(org.opentravel.www.OTA._2003._05.SurchargesType[] surcharges) {
        this.surcharges = surcharges;
    }

    public org.opentravel.www.OTA._2003._05.SurchargesType getSurcharges(int i) {
        return this.surcharges[i];
    }

    public void setSurcharges(int i, org.opentravel.www.OTA._2003._05.SurchargesType _value) {
        this.surcharges[i] = _value;
    }


    /**
     * Gets the legs value for this FareTypeTPA_Extensions.
     * 
     * @return legs   * This is a collection of Leg Information
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLeg[] getLegs() {
        return legs;
    }


    /**
     * Sets the legs value for this FareTypeTPA_Extensions.
     * 
     * @param legs   * This is a collection of Leg Information
     */
    public void setLegs(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsLegsLeg[] legs) {
        this.legs = legs;
    }


    /**
     * Gets the fareComponents value for this FareTypeTPA_Extensions.
     * 
     * @return fareComponents   * A collection of additional information for each Fare Component
     */
    public org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponent[] getFareComponents() {
        return fareComponents;
    }


    /**
     * Sets the fareComponents value for this FareTypeTPA_Extensions.
     * 
     * @param fareComponents   * A collection of additional information for each Fare Component
     */
    public void setFareComponents(org.opentravel.www.OTA._2003._05.FareTypeTPA_ExtensionsFareComponentsFareComponent[] fareComponents) {
        this.fareComponents = fareComponents;
    }


    /**
     * Gets the messages value for this FareTypeTPA_Extensions.
     * 
     * @return messages
     */
    public org.opentravel.www.OTA._2003._05.FareMessagesType getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this FareTypeTPA_Extensions.
     * 
     * @param messages
     */
    public void setMessages(org.opentravel.www.OTA._2003._05.FareMessagesType messages) {
        this.messages = messages;
    }


    /**
     * Gets the baggageInformationList value for this FareTypeTPA_Extensions.
     * 
     * @return baggageInformationList
     */
    public org.opentravel.www.OTA._2003._05.BaggageInformationType[] getBaggageInformationList() {
        return baggageInformationList;
    }


    /**
     * Sets the baggageInformationList value for this FareTypeTPA_Extensions.
     * 
     * @param baggageInformationList
     */
    public void setBaggageInformationList(org.opentravel.www.OTA._2003._05.BaggageInformationType[] baggageInformationList) {
        this.baggageInformationList = baggageInformationList;
    }


    /**
     * Gets the sellingFareDataList value for this FareTypeTPA_Extensions.
     * 
     * @return sellingFareDataList
     */
    public org.opentravel.www.OTA._2003._05.HandlingMarkupSummaryType[][] getSellingFareDataList() {
        return sellingFareDataList;
    }


    /**
     * Sets the sellingFareDataList value for this FareTypeTPA_Extensions.
     * 
     * @param sellingFareDataList
     */
    public void setSellingFareDataList(org.opentravel.www.OTA._2003._05.HandlingMarkupSummaryType[][] sellingFareDataList) {
        this.sellingFareDataList = sellingFareDataList;
    }


    /**
     * Gets the commissionData value for this FareTypeTPA_Extensions.
     * 
     * @return commissionData
     */
    public org.opentravel.www.OTA._2003._05.FareComponentBreakdownType[][] getCommissionData() {
        return commissionData;
    }


    /**
     * Sets the commissionData value for this FareTypeTPA_Extensions.
     * 
     * @param commissionData
     */
    public void setCommissionData(org.opentravel.www.OTA._2003._05.FareComponentBreakdownType[][] commissionData) {
        this.commissionData = commissionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTPA_Extensions)) return false;
        FareTypeTPA_Extensions other = (FareTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.surcharges==null && other.getSurcharges()==null) || 
             (this.surcharges!=null &&
              java.util.Arrays.equals(this.surcharges, other.getSurcharges()))) &&
            ((this.legs==null && other.getLegs()==null) || 
             (this.legs!=null &&
              java.util.Arrays.equals(this.legs, other.getLegs()))) &&
            ((this.fareComponents==null && other.getFareComponents()==null) || 
             (this.fareComponents!=null &&
              java.util.Arrays.equals(this.fareComponents, other.getFareComponents()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              this.messages.equals(other.getMessages()))) &&
            ((this.baggageInformationList==null && other.getBaggageInformationList()==null) || 
             (this.baggageInformationList!=null &&
              java.util.Arrays.equals(this.baggageInformationList, other.getBaggageInformationList()))) &&
            ((this.sellingFareDataList==null && other.getSellingFareDataList()==null) || 
             (this.sellingFareDataList!=null &&
              java.util.Arrays.equals(this.sellingFareDataList, other.getSellingFareDataList()))) &&
            ((this.commissionData==null && other.getCommissionData()==null) || 
             (this.commissionData!=null &&
              java.util.Arrays.equals(this.commissionData, other.getCommissionData())));
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
        if (getSurcharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurcharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurcharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFareComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessages() != null) {
            _hashCode += getMessages().hashCode();
        }
        if (getBaggageInformationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaggageInformationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaggageInformationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellingFareDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellingFareDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellingFareDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommissionData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommissionData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommissionData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surcharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Surcharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SurchargesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Legs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>Legs>Leg"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Leg"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>TPA_Extensions>FareComponents>FareComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareComponent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareMessagesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baggageInformationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BaggageInformation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellingFareDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingFareDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingFareDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingFareData"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CommissionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VCCInformationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VCCInformation"));
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
