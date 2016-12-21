/**
 * DocumentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Provides information on a specific documents.
 */
public class DocumentType  implements java.io.Serializable {
    /* Specify document holder name. */
    private java.lang.String docHolderName;

    /* Used to indicate any limitations on the document (e.g. as a
     * person may only be allowed to spend a max of 30 days in country on
     * a visitor's visa). */
    private java.lang.String[] docLimitations;

    private org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd;  // attribute

    private java.lang.String docIssueAuthority;  // attribute

    private java.lang.String docIssueLocation;  // attribute

    private java.lang.String docID;  // attribute

    private java.lang.String docType;  // attribute

    private org.opentravel.www.OTA._2003._05.Gender gender;  // attribute

    private java.util.Date birthDate;  // attribute

    private java.util.Date effectiveDate;  // attribute

    private java.util.Date expireDate;  // attribute

    public DocumentType() {
    }

    public DocumentType(
           java.lang.String docHolderName,
           java.lang.String[] docLimitations,
           org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd,
           org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd,
           java.lang.String docIssueAuthority,
           java.lang.String docIssueLocation,
           java.lang.String docID,
           java.lang.String docType,
           org.opentravel.www.OTA._2003._05.Gender gender,
           java.util.Date birthDate,
           java.util.Date effectiveDate,
           java.util.Date expireDate) {
           this.docHolderName = docHolderName;
           this.docLimitations = docLimitations;
           this.shareSynchInd = shareSynchInd;
           this.shareMarketInd = shareMarketInd;
           this.docIssueAuthority = docIssueAuthority;
           this.docIssueLocation = docIssueLocation;
           this.docID = docID;
           this.docType = docType;
           this.gender = gender;
           this.birthDate = birthDate;
           this.effectiveDate = effectiveDate;
           this.expireDate = expireDate;
    }


    /**
     * Gets the docHolderName value for this DocumentType.
     * 
     * @return docHolderName   * Specify document holder name.
     */
    public java.lang.String getDocHolderName() {
        return docHolderName;
    }


    /**
     * Sets the docHolderName value for this DocumentType.
     * 
     * @param docHolderName   * Specify document holder name.
     */
    public void setDocHolderName(java.lang.String docHolderName) {
        this.docHolderName = docHolderName;
    }


    /**
     * Gets the docLimitations value for this DocumentType.
     * 
     * @return docLimitations   * Used to indicate any limitations on the document (e.g. as a
     * person may only be allowed to spend a max of 30 days in country on
     * a visitor's visa).
     */
    public java.lang.String[] getDocLimitations() {
        return docLimitations;
    }


    /**
     * Sets the docLimitations value for this DocumentType.
     * 
     * @param docLimitations   * Used to indicate any limitations on the document (e.g. as a
     * person may only be allowed to spend a max of 30 days in country on
     * a visitor's visa).
     */
    public void setDocLimitations(java.lang.String[] docLimitations) {
        this.docLimitations = docLimitations;
    }

    public java.lang.String getDocLimitations(int i) {
        return this.docLimitations[i];
    }

    public void setDocLimitations(int i, java.lang.String _value) {
        this.docLimitations[i] = _value;
    }


    /**
     * Gets the shareSynchInd value for this DocumentType.
     * 
     * @return shareSynchInd
     */
    public org.opentravel.www.OTA._2003._05.ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }


    /**
     * Sets the shareSynchInd value for this DocumentType.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }


    /**
     * Gets the shareMarketInd value for this DocumentType.
     * 
     * @return shareMarketInd
     */
    public org.opentravel.www.OTA._2003._05.ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }


    /**
     * Sets the shareMarketInd value for this DocumentType.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }


    /**
     * Gets the docIssueAuthority value for this DocumentType.
     * 
     * @return docIssueAuthority
     */
    public java.lang.String getDocIssueAuthority() {
        return docIssueAuthority;
    }


    /**
     * Sets the docIssueAuthority value for this DocumentType.
     * 
     * @param docIssueAuthority
     */
    public void setDocIssueAuthority(java.lang.String docIssueAuthority) {
        this.docIssueAuthority = docIssueAuthority;
    }


    /**
     * Gets the docIssueLocation value for this DocumentType.
     * 
     * @return docIssueLocation
     */
    public java.lang.String getDocIssueLocation() {
        return docIssueLocation;
    }


    /**
     * Sets the docIssueLocation value for this DocumentType.
     * 
     * @param docIssueLocation
     */
    public void setDocIssueLocation(java.lang.String docIssueLocation) {
        this.docIssueLocation = docIssueLocation;
    }


    /**
     * Gets the docID value for this DocumentType.
     * 
     * @return docID
     */
    public java.lang.String getDocID() {
        return docID;
    }


    /**
     * Sets the docID value for this DocumentType.
     * 
     * @param docID
     */
    public void setDocID(java.lang.String docID) {
        this.docID = docID;
    }


    /**
     * Gets the docType value for this DocumentType.
     * 
     * @return docType
     */
    public java.lang.String getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this DocumentType.
     * 
     * @param docType
     */
    public void setDocType(java.lang.String docType) {
        this.docType = docType;
    }


    /**
     * Gets the gender value for this DocumentType.
     * 
     * @return gender
     */
    public org.opentravel.www.OTA._2003._05.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this DocumentType.
     * 
     * @param gender
     */
    public void setGender(org.opentravel.www.OTA._2003._05.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the birthDate value for this DocumentType.
     * 
     * @return birthDate
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this DocumentType.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the effectiveDate value for this DocumentType.
     * 
     * @return effectiveDate
     */
    public java.util.Date getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this DocumentType.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expireDate value for this DocumentType.
     * 
     * @return expireDate
     */
    public java.util.Date getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this DocumentType.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Date expireDate) {
        this.expireDate = expireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentType)) return false;
        DocumentType other = (DocumentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docHolderName==null && other.getDocHolderName()==null) || 
             (this.docHolderName!=null &&
              this.docHolderName.equals(other.getDocHolderName()))) &&
            ((this.docLimitations==null && other.getDocLimitations()==null) || 
             (this.docLimitations!=null &&
              java.util.Arrays.equals(this.docLimitations, other.getDocLimitations()))) &&
            ((this.shareSynchInd==null && other.getShareSynchInd()==null) || 
             (this.shareSynchInd!=null &&
              this.shareSynchInd.equals(other.getShareSynchInd()))) &&
            ((this.shareMarketInd==null && other.getShareMarketInd()==null) || 
             (this.shareMarketInd!=null &&
              this.shareMarketInd.equals(other.getShareMarketInd()))) &&
            ((this.docIssueAuthority==null && other.getDocIssueAuthority()==null) || 
             (this.docIssueAuthority!=null &&
              this.docIssueAuthority.equals(other.getDocIssueAuthority()))) &&
            ((this.docIssueLocation==null && other.getDocIssueLocation()==null) || 
             (this.docIssueLocation!=null &&
              this.docIssueLocation.equals(other.getDocIssueLocation()))) &&
            ((this.docID==null && other.getDocID()==null) || 
             (this.docID!=null &&
              this.docID.equals(other.getDocID()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
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
        if (getDocHolderName() != null) {
            _hashCode += getDocHolderName().hashCode();
        }
        if (getDocLimitations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocLimitations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocLimitations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShareSynchInd() != null) {
            _hashCode += getShareSynchInd().hashCode();
        }
        if (getShareMarketInd() != null) {
            _hashCode += getShareMarketInd().hashCode();
        }
        if (getDocIssueAuthority() != null) {
            _hashCode += getDocIssueAuthority().hashCode();
        }
        if (getDocIssueLocation() != null) {
            _hashCode += getDocIssueLocation().hashCode();
        }
        if (getDocID() != null) {
            _hashCode += getDocID().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DocumentType"));
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
        attrField.setFieldName("docIssueAuthority");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DocIssueAuthority"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("docIssueLocation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DocIssueLocation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("docID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DocID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("docType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DocType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("gender");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Gender"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Gender"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("birthDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BirthDate"));
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
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DocHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docLimitations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DocLimitations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
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
