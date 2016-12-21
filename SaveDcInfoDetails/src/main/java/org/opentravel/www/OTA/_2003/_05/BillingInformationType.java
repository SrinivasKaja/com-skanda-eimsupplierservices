/**
 * BillingInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class BillingInformationType  implements java.io.Serializable {
    private java.lang.Short userStation;  // attribute

    private java.lang.Short userBranch;  // attribute

    private java.lang.String partitionID;  // attribute

    private java.lang.String userSetAddress;  // attribute

    private java.lang.String AAACity;  // attribute

    private java.lang.String agentSineIn;  // attribute

    private java.lang.String serviceName;  // attribute

    private java.lang.String actionCode;  // attribute

    public BillingInformationType() {
    }

    public BillingInformationType(
           java.lang.Short userStation,
           java.lang.Short userBranch,
           java.lang.String partitionID,
           java.lang.String userSetAddress,
           java.lang.String AAACity,
           java.lang.String agentSineIn,
           java.lang.String serviceName,
           java.lang.String actionCode) {
           this.userStation = userStation;
           this.userBranch = userBranch;
           this.partitionID = partitionID;
           this.userSetAddress = userSetAddress;
           this.AAACity = AAACity;
           this.agentSineIn = agentSineIn;
           this.serviceName = serviceName;
           this.actionCode = actionCode;
    }


    /**
     * Gets the userStation value for this BillingInformationType.
     * 
     * @return userStation
     */
    public java.lang.Short getUserStation() {
        return userStation;
    }


    /**
     * Sets the userStation value for this BillingInformationType.
     * 
     * @param userStation
     */
    public void setUserStation(java.lang.Short userStation) {
        this.userStation = userStation;
    }


    /**
     * Gets the userBranch value for this BillingInformationType.
     * 
     * @return userBranch
     */
    public java.lang.Short getUserBranch() {
        return userBranch;
    }


    /**
     * Sets the userBranch value for this BillingInformationType.
     * 
     * @param userBranch
     */
    public void setUserBranch(java.lang.Short userBranch) {
        this.userBranch = userBranch;
    }


    /**
     * Gets the partitionID value for this BillingInformationType.
     * 
     * @return partitionID
     */
    public java.lang.String getPartitionID() {
        return partitionID;
    }


    /**
     * Sets the partitionID value for this BillingInformationType.
     * 
     * @param partitionID
     */
    public void setPartitionID(java.lang.String partitionID) {
        this.partitionID = partitionID;
    }


    /**
     * Gets the userSetAddress value for this BillingInformationType.
     * 
     * @return userSetAddress
     */
    public java.lang.String getUserSetAddress() {
        return userSetAddress;
    }


    /**
     * Sets the userSetAddress value for this BillingInformationType.
     * 
     * @param userSetAddress
     */
    public void setUserSetAddress(java.lang.String userSetAddress) {
        this.userSetAddress = userSetAddress;
    }


    /**
     * Gets the AAACity value for this BillingInformationType.
     * 
     * @return AAACity
     */
    public java.lang.String getAAACity() {
        return AAACity;
    }


    /**
     * Sets the AAACity value for this BillingInformationType.
     * 
     * @param AAACity
     */
    public void setAAACity(java.lang.String AAACity) {
        this.AAACity = AAACity;
    }


    /**
     * Gets the agentSineIn value for this BillingInformationType.
     * 
     * @return agentSineIn
     */
    public java.lang.String getAgentSineIn() {
        return agentSineIn;
    }


    /**
     * Sets the agentSineIn value for this BillingInformationType.
     * 
     * @param agentSineIn
     */
    public void setAgentSineIn(java.lang.String agentSineIn) {
        this.agentSineIn = agentSineIn;
    }


    /**
     * Gets the serviceName value for this BillingInformationType.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this BillingInformationType.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the actionCode value for this BillingInformationType.
     * 
     * @return actionCode
     */
    public java.lang.String getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this BillingInformationType.
     * 
     * @param actionCode
     */
    public void setActionCode(java.lang.String actionCode) {
        this.actionCode = actionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingInformationType)) return false;
        BillingInformationType other = (BillingInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userStation==null && other.getUserStation()==null) || 
             (this.userStation!=null &&
              this.userStation.equals(other.getUserStation()))) &&
            ((this.userBranch==null && other.getUserBranch()==null) || 
             (this.userBranch!=null &&
              this.userBranch.equals(other.getUserBranch()))) &&
            ((this.partitionID==null && other.getPartitionID()==null) || 
             (this.partitionID!=null &&
              this.partitionID.equals(other.getPartitionID()))) &&
            ((this.userSetAddress==null && other.getUserSetAddress()==null) || 
             (this.userSetAddress!=null &&
              this.userSetAddress.equals(other.getUserSetAddress()))) &&
            ((this.AAACity==null && other.getAAACity()==null) || 
             (this.AAACity!=null &&
              this.AAACity.equals(other.getAAACity()))) &&
            ((this.agentSineIn==null && other.getAgentSineIn()==null) || 
             (this.agentSineIn!=null &&
              this.agentSineIn.equals(other.getAgentSineIn()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.actionCode==null && other.getActionCode()==null) || 
             (this.actionCode!=null &&
              this.actionCode.equals(other.getActionCode())));
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
        if (getUserStation() != null) {
            _hashCode += getUserStation().hashCode();
        }
        if (getUserBranch() != null) {
            _hashCode += getUserBranch().hashCode();
        }
        if (getPartitionID() != null) {
            _hashCode += getPartitionID().hashCode();
        }
        if (getUserSetAddress() != null) {
            _hashCode += getUserSetAddress().hashCode();
        }
        if (getAAACity() != null) {
            _hashCode += getAAACity().hashCode();
        }
        if (getAgentSineIn() != null) {
            _hashCode += getAgentSineIn().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getActionCode() != null) {
            _hashCode += getActionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BillingInformationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("userStation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UserStation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("userBranch");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UserBranch"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("partitionID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PartitionID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PartitionIDType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("userSetAddress");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UserSetAddress"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LnIATAType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("AAACity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AAACity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("agentSineIn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AgentSineIn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AgentFunctionType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("serviceName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ServiceName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ServiceNameType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actionCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ActionCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BillingActionCodeType"));
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
