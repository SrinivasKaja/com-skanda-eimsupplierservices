/**
 * CustLoyaltyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Program rewarding frequent use by accumulating credits for services
 * provided by vendors.
 */
public class CustLoyaltyType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd;  // attribute

    private java.lang.String programID;  // attribute

    private java.lang.String membershipID;  // attribute

    private java.lang.String travelSector;  // attribute

    private java.lang.String loyalLevel;  // attribute

    private org.opentravel.www.OTA._2003._05.SingleVendorInd singleVendorInd;  // attribute

    private java.util.Date signupDate;  // attribute

    private java.util.Date effectiveDate;  // attribute

    private java.util.Date expireDate;  // attribute

    private java.lang.String RPH;  // attribute

    public CustLoyaltyType() {
    }

    public CustLoyaltyType(
           org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd,
           org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd,
           java.lang.String programID,
           java.lang.String membershipID,
           java.lang.String travelSector,
           java.lang.String loyalLevel,
           org.opentravel.www.OTA._2003._05.SingleVendorInd singleVendorInd,
           java.util.Date signupDate,
           java.util.Date effectiveDate,
           java.util.Date expireDate,
           java.lang.String RPH) {
           this.shareSynchInd = shareSynchInd;
           this.shareMarketInd = shareMarketInd;
           this.programID = programID;
           this.membershipID = membershipID;
           this.travelSector = travelSector;
           this.loyalLevel = loyalLevel;
           this.singleVendorInd = singleVendorInd;
           this.signupDate = signupDate;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
           this.RPH = RPH;
    }


    /**
     * Gets the shareSynchInd value for this CustLoyaltyType.
     * 
     * @return shareSynchInd
     */
    public org.opentravel.www.OTA._2003._05.ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }


    /**
     * Sets the shareSynchInd value for this CustLoyaltyType.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }


    /**
     * Gets the shareMarketInd value for this CustLoyaltyType.
     * 
     * @return shareMarketInd
     */
    public org.opentravel.www.OTA._2003._05.ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }


    /**
     * Sets the shareMarketInd value for this CustLoyaltyType.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }


    /**
     * Gets the programID value for this CustLoyaltyType.
     * 
     * @return programID
     */
    public java.lang.String getProgramID() {
        return programID;
    }


    /**
     * Sets the programID value for this CustLoyaltyType.
     * 
     * @param programID
     */
    public void setProgramID(java.lang.String programID) {
        this.programID = programID;
    }


    /**
     * Gets the membershipID value for this CustLoyaltyType.
     * 
     * @return membershipID
     */
    public java.lang.String getMembershipID() {
        return membershipID;
    }


    /**
     * Sets the membershipID value for this CustLoyaltyType.
     * 
     * @param membershipID
     */
    public void setMembershipID(java.lang.String membershipID) {
        this.membershipID = membershipID;
    }


    /**
     * Gets the travelSector value for this CustLoyaltyType.
     * 
     * @return travelSector
     */
    public java.lang.String getTravelSector() {
        return travelSector;
    }


    /**
     * Sets the travelSector value for this CustLoyaltyType.
     * 
     * @param travelSector
     */
    public void setTravelSector(java.lang.String travelSector) {
        this.travelSector = travelSector;
    }


    /**
     * Gets the loyalLevel value for this CustLoyaltyType.
     * 
     * @return loyalLevel
     */
    public java.lang.String getLoyalLevel() {
        return loyalLevel;
    }


    /**
     * Sets the loyalLevel value for this CustLoyaltyType.
     * 
     * @param loyalLevel
     */
    public void setLoyalLevel(java.lang.String loyalLevel) {
        this.loyalLevel = loyalLevel;
    }


    /**
     * Gets the singleVendorInd value for this CustLoyaltyType.
     * 
     * @return singleVendorInd
     */
    public org.opentravel.www.OTA._2003._05.SingleVendorInd getSingleVendorInd() {
        return singleVendorInd;
    }


    /**
     * Sets the singleVendorInd value for this CustLoyaltyType.
     * 
     * @param singleVendorInd
     */
    public void setSingleVendorInd(org.opentravel.www.OTA._2003._05.SingleVendorInd singleVendorInd) {
        this.singleVendorInd = singleVendorInd;
    }


    /**
     * Gets the signupDate value for this CustLoyaltyType.
     * 
     * @return signupDate
     */
    public java.util.Date getSignupDate() {
        return signupDate;
    }


    /**
     * Sets the signupDate value for this CustLoyaltyType.
     * 
     * @param signupDate
     */
    public void setSignupDate(java.util.Date signupDate) {
        this.signupDate = signupDate;
    }


    /**
     * Gets the effectiveDate value for this CustLoyaltyType.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this CustLoyaltyType.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this CustLoyaltyType.
     * 
     * @return expireDate
     */
    public java.util.Date getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this CustLoyaltyType.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Date expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the RPH value for this CustLoyaltyType.
     * 
     * @return RPH
     */
    public java.lang.String getRPH() {
        return RPH;
    }


    /**
     * Sets the RPH value for this CustLoyaltyType.
     * 
     * @param RPH
     */
    public void setRPH(java.lang.String RPH) {
        this.RPH = RPH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustLoyaltyType)) return false;
        CustLoyaltyType other = (CustLoyaltyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shareSynchInd==null && other.getShareSynchInd()==null) || 
             (this.shareSynchInd!=null &&
              this.shareSynchInd.equals(other.getShareSynchInd()))) &&
            ((this.shareMarketInd==null && other.getShareMarketInd()==null) || 
             (this.shareMarketInd!=null &&
              this.shareMarketInd.equals(other.getShareMarketInd()))) &&
            ((this.programID==null && other.getProgramID()==null) || 
             (this.programID!=null &&
              this.programID.equals(other.getProgramID()))) &&
            ((this.membershipID==null && other.getMembershipID()==null) || 
             (this.membershipID!=null &&
              this.membershipID.equals(other.getMembershipID()))) &&
            ((this.travelSector==null && other.getTravelSector()==null) || 
             (this.travelSector!=null &&
              this.travelSector.equals(other.getTravelSector()))) &&
            ((this.loyalLevel==null && other.getLoyalLevel()==null) || 
             (this.loyalLevel!=null &&
              this.loyalLevel.equals(other.getLoyalLevel()))) &&
            ((this.singleVendorInd==null && other.getSingleVendorInd()==null) || 
             (this.singleVendorInd!=null &&
              this.singleVendorInd.equals(other.getSingleVendorInd()))) &&
            ((this.signupDate==null && other.getSignupDate()==null) || 
             (this.signupDate!=null &&
              this.signupDate.equals(other.getSignupDate()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.RPH==null && other.getRPH()==null) || 
             (this.RPH!=null &&
              this.RPH.equals(other.getRPH())));
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
        if (getShareSynchInd() != null) {
            _hashCode += getShareSynchInd().hashCode();
        }
        if (getShareMarketInd() != null) {
            _hashCode += getShareMarketInd().hashCode();
        }
        if (getProgramID() != null) {
            _hashCode += getProgramID().hashCode();
        }
        if (getMembershipID() != null) {
            _hashCode += getMembershipID().hashCode();
        }
        if (getTravelSector() != null) {
            _hashCode += getTravelSector().hashCode();
        }
        if (getLoyalLevel() != null) {
            _hashCode += getLoyalLevel().hashCode();
        }
        if (getSingleVendorInd() != null) {
            _hashCode += getSingleVendorInd().hashCode();
        }
        if (getSignupDate() != null) {
            _hashCode += getSignupDate().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getRPH() != null) {
            _hashCode += getRPH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustLoyaltyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CustLoyaltyType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shareSynchInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShareSynchInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ShareSynchInd"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shareMarketInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShareMarketInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ShareMarketInd"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("programID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProgramID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("membershipID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MembershipID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("travelSector");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TravelSector"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("loyalLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LoyalLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("singleVendorInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SingleVendorInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">SingleVendorInd"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("signupDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SignupDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("effectiveDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EffectiveDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("expireDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExpireDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("RPH");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RPH"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
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
