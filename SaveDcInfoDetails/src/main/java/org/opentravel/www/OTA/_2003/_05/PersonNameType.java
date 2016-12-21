/**
 * PersonNameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * This is an XML Schema representing the OTA Person Name object.
 */
public class PersonNameType  implements java.io.Serializable {
    /* Salutation of honorific. (e.g., Mr. Mrs., Ms., Miss, Dr.) */
    private java.lang.String[] namePrefix;

    /* Given name, first name or names */
    private java.lang.String[] givenName;

    /* Person's middle name */
    private java.lang.String[] middleName;

    /* e.g "van der", "von", "de" */
    private java.lang.String surnamePrefix;

    /* Family name, last name. */
    private java.lang.String surname;

    /* Hold various name suffixes and letters (e.g. Jr., Sr., III,
     * Ret., Esq.). */
    private java.lang.String[] nameSuffix;

    /* Degree or honors (e.g., Ph.D., M.D.) */
    private java.lang.String[] nameTitle;

    private org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd;  // attribute

    private java.lang.String nameType;  // attribute

    public PersonNameType() {
    }

    public PersonNameType(
           java.lang.String[] namePrefix,
           java.lang.String[] givenName,
           java.lang.String[] middleName,
           java.lang.String surnamePrefix,
           java.lang.String surname,
           java.lang.String[] nameSuffix,
           java.lang.String[] nameTitle,
           org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd,
           org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd,
           java.lang.String nameType) {
           this.namePrefix = namePrefix;
           this.givenName = givenName;
           this.middleName = middleName;
           this.surnamePrefix = surnamePrefix;
           this.surname = surname;
           this.nameSuffix = nameSuffix;
           this.nameTitle = nameTitle;
           this.shareSynchInd = shareSynchInd;
           this.shareMarketInd = shareMarketInd;
           this.nameType = nameType;
    }


    /**
     * Gets the namePrefix value for this PersonNameType.
     * 
     * @return namePrefix   * Salutation of honorific. (e.g., Mr. Mrs., Ms., Miss, Dr.)
     */
    public java.lang.String[] getNamePrefix() {
        return namePrefix;
    }


    /**
     * Sets the namePrefix value for this PersonNameType.
     * 
     * @param namePrefix   * Salutation of honorific. (e.g., Mr. Mrs., Ms., Miss, Dr.)
     */
    public void setNamePrefix(java.lang.String[] namePrefix) {
        this.namePrefix = namePrefix;
    }

    public java.lang.String getNamePrefix(int i) {
        return this.namePrefix[i];
    }

    public void setNamePrefix(int i, java.lang.String _value) {
        this.namePrefix[i] = _value;
    }


    /**
     * Gets the givenName value for this PersonNameType.
     * 
     * @return givenName   * Given name, first name or names
     */
    public java.lang.String[] getGivenName() {
        return givenName;
    }


    /**
     * Sets the givenName value for this PersonNameType.
     * 
     * @param givenName   * Given name, first name or names
     */
    public void setGivenName(java.lang.String[] givenName) {
        this.givenName = givenName;
    }

    public java.lang.String getGivenName(int i) {
        return this.givenName[i];
    }

    public void setGivenName(int i, java.lang.String _value) {
        this.givenName[i] = _value;
    }


    /**
     * Gets the middleName value for this PersonNameType.
     * 
     * @return middleName   * Person's middle name
     */
    public java.lang.String[] getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this PersonNameType.
     * 
     * @param middleName   * Person's middle name
     */
    public void setMiddleName(java.lang.String[] middleName) {
        this.middleName = middleName;
    }

    public java.lang.String getMiddleName(int i) {
        return this.middleName[i];
    }

    public void setMiddleName(int i, java.lang.String _value) {
        this.middleName[i] = _value;
    }


    /**
     * Gets the surnamePrefix value for this PersonNameType.
     * 
     * @return surnamePrefix   * e.g "van der", "von", "de"
     */
    public java.lang.String getSurnamePrefix() {
        return surnamePrefix;
    }


    /**
     * Sets the surnamePrefix value for this PersonNameType.
     * 
     * @param surnamePrefix   * e.g "van der", "von", "de"
     */
    public void setSurnamePrefix(java.lang.String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }


    /**
     * Gets the surname value for this PersonNameType.
     * 
     * @return surname   * Family name, last name.
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this PersonNameType.
     * 
     * @param surname   * Family name, last name.
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }


    /**
     * Gets the nameSuffix value for this PersonNameType.
     * 
     * @return nameSuffix   * Hold various name suffixes and letters (e.g. Jr., Sr., III,
     * Ret., Esq.).
     */
    public java.lang.String[] getNameSuffix() {
        return nameSuffix;
    }


    /**
     * Sets the nameSuffix value for this PersonNameType.
     * 
     * @param nameSuffix   * Hold various name suffixes and letters (e.g. Jr., Sr., III,
     * Ret., Esq.).
     */
    public void setNameSuffix(java.lang.String[] nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public java.lang.String getNameSuffix(int i) {
        return this.nameSuffix[i];
    }

    public void setNameSuffix(int i, java.lang.String _value) {
        this.nameSuffix[i] = _value;
    }


    /**
     * Gets the nameTitle value for this PersonNameType.
     * 
     * @return nameTitle   * Degree or honors (e.g., Ph.D., M.D.)
     */
    public java.lang.String[] getNameTitle() {
        return nameTitle;
    }


    /**
     * Sets the nameTitle value for this PersonNameType.
     * 
     * @param nameTitle   * Degree or honors (e.g., Ph.D., M.D.)
     */
    public void setNameTitle(java.lang.String[] nameTitle) {
        this.nameTitle = nameTitle;
    }

    public java.lang.String getNameTitle(int i) {
        return this.nameTitle[i];
    }

    public void setNameTitle(int i, java.lang.String _value) {
        this.nameTitle[i] = _value;
    }


    /**
     * Gets the shareSynchInd value for this PersonNameType.
     * 
     * @return shareSynchInd
     */
    public org.opentravel.www.OTA._2003._05.ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }


    /**
     * Sets the shareSynchInd value for this PersonNameType.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }


    /**
     * Gets the shareMarketInd value for this PersonNameType.
     * 
     * @return shareMarketInd
     */
    public org.opentravel.www.OTA._2003._05.ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }


    /**
     * Sets the shareMarketInd value for this PersonNameType.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }


    /**
     * Gets the nameType value for this PersonNameType.
     * 
     * @return nameType
     */
    public java.lang.String getNameType() {
        return nameType;
    }


    /**
     * Sets the nameType value for this PersonNameType.
     * 
     * @param nameType
     */
    public void setNameType(java.lang.String nameType) {
        this.nameType = nameType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonNameType)) return false;
        PersonNameType other = (PersonNameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.namePrefix==null && other.getNamePrefix()==null) || 
             (this.namePrefix!=null &&
              java.util.Arrays.equals(this.namePrefix, other.getNamePrefix()))) &&
            ((this.givenName==null && other.getGivenName()==null) || 
             (this.givenName!=null &&
              java.util.Arrays.equals(this.givenName, other.getGivenName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              java.util.Arrays.equals(this.middleName, other.getMiddleName()))) &&
            ((this.surnamePrefix==null && other.getSurnamePrefix()==null) || 
             (this.surnamePrefix!=null &&
              this.surnamePrefix.equals(other.getSurnamePrefix()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname()))) &&
            ((this.nameSuffix==null && other.getNameSuffix()==null) || 
             (this.nameSuffix!=null &&
              java.util.Arrays.equals(this.nameSuffix, other.getNameSuffix()))) &&
            ((this.nameTitle==null && other.getNameTitle()==null) || 
             (this.nameTitle!=null &&
              java.util.Arrays.equals(this.nameTitle, other.getNameTitle()))) &&
            ((this.shareSynchInd==null && other.getShareSynchInd()==null) || 
             (this.shareSynchInd!=null &&
              this.shareSynchInd.equals(other.getShareSynchInd()))) &&
            ((this.shareMarketInd==null && other.getShareMarketInd()==null) || 
             (this.shareMarketInd!=null &&
              this.shareMarketInd.equals(other.getShareMarketInd()))) &&
            ((this.nameType==null && other.getNameType()==null) || 
             (this.nameType!=null &&
              this.nameType.equals(other.getNameType())));
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
        if (getNamePrefix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamePrefix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamePrefix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGivenName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGivenName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGivenName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMiddleName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiddleName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiddleName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurnamePrefix() != null) {
            _hashCode += getSurnamePrefix().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        if (getNameSuffix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameSuffix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameSuffix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameTitle(), i);
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
        if (getNameType() != null) {
            _hashCode += getNameType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonNameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PersonNameType"));
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
        attrField.setFieldName("nameType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NameType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NamePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "GivenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surnamePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SurnamePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Surname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NameSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NameTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
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
