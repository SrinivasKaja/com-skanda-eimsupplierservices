/**
 * AddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AddressType  implements java.io.Serializable {
    /* Street Name and Number within the address */
    private org.opentravel.www.OTA._2003._05.StreetNmbrType streetNmbr;

    /* Building name, room, apartment, or suite number. */
    private java.lang.String bldgRoom;

    private java.lang.String[] addressLine;

    /* City name eg. Dublin */
    private java.lang.String cityName;

    /* Post Office Code number. */
    private java.lang.String postalCode;

    /* County Name eg. Fairfax */
    private java.lang.String county;

    /* State name eg. Texas */
    private org.opentravel.www.OTA._2003._05.StateProvType stateProv;

    /* Country name eg. Ireland */
    private org.opentravel.www.OTA._2003._05.CountryNameType countryName;

    private java.lang.Boolean formattedInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd;  // attribute

    private java.lang.String type;  // attribute

    public AddressType() {
    }

    public AddressType(
           org.opentravel.www.OTA._2003._05.StreetNmbrType streetNmbr,
           java.lang.String bldgRoom,
           java.lang.String[] addressLine,
           java.lang.String cityName,
           java.lang.String postalCode,
           java.lang.String county,
           org.opentravel.www.OTA._2003._05.StateProvType stateProv,
           org.opentravel.www.OTA._2003._05.CountryNameType countryName,
           java.lang.Boolean formattedInd,
           org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd,
           org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd,
           java.lang.String type) {
           this.streetNmbr = streetNmbr;
           this.bldgRoom = bldgRoom;
           this.addressLine = addressLine;
           this.cityName = cityName;
           this.postalCode = postalCode;
           this.county = county;
           this.stateProv = stateProv;
           this.countryName = countryName;
           this.formattedInd = formattedInd;
           this.shareSynchInd = shareSynchInd;
           this.shareMarketInd = shareMarketInd;
           this.type = type;
    }


    /**
     * Gets the streetNmbr value for this AddressType.
     * 
     * @return streetNmbr   * Street Name and Number within the address
     */
    public org.opentravel.www.OTA._2003._05.StreetNmbrType getStreetNmbr() {
        return streetNmbr;
    }


    /**
     * Sets the streetNmbr value for this AddressType.
     * 
     * @param streetNmbr   * Street Name and Number within the address
     */
    public void setStreetNmbr(org.opentravel.www.OTA._2003._05.StreetNmbrType streetNmbr) {
        this.streetNmbr = streetNmbr;
    }


    /**
     * Gets the bldgRoom value for this AddressType.
     * 
     * @return bldgRoom   * Building name, room, apartment, or suite number.
     */
    public java.lang.String getBldgRoom() {
        return bldgRoom;
    }


    /**
     * Sets the bldgRoom value for this AddressType.
     * 
     * @param bldgRoom   * Building name, room, apartment, or suite number.
     */
    public void setBldgRoom(java.lang.String bldgRoom) {
        this.bldgRoom = bldgRoom;
    }


    /**
     * Gets the addressLine value for this AddressType.
     * 
     * @return addressLine
     */
    public java.lang.String[] getAddressLine() {
        return addressLine;
    }


    /**
     * Sets the addressLine value for this AddressType.
     * 
     * @param addressLine
     */
    public void setAddressLine(java.lang.String[] addressLine) {
        this.addressLine = addressLine;
    }

    public java.lang.String getAddressLine(int i) {
        return this.addressLine[i];
    }

    public void setAddressLine(int i, java.lang.String _value) {
        this.addressLine[i] = _value;
    }


    /**
     * Gets the cityName value for this AddressType.
     * 
     * @return cityName   * City name eg. Dublin
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this AddressType.
     * 
     * @param cityName   * City name eg. Dublin
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the postalCode value for this AddressType.
     * 
     * @return postalCode   * Post Office Code number.
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this AddressType.
     * 
     * @param postalCode   * Post Office Code number.
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the county value for this AddressType.
     * 
     * @return county   * County Name eg. Fairfax
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this AddressType.
     * 
     * @param county   * County Name eg. Fairfax
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the stateProv value for this AddressType.
     * 
     * @return stateProv   * State name eg. Texas
     */
    public org.opentravel.www.OTA._2003._05.StateProvType getStateProv() {
        return stateProv;
    }


    /**
     * Sets the stateProv value for this AddressType.
     * 
     * @param stateProv   * State name eg. Texas
     */
    public void setStateProv(org.opentravel.www.OTA._2003._05.StateProvType stateProv) {
        this.stateProv = stateProv;
    }


    /**
     * Gets the countryName value for this AddressType.
     * 
     * @return countryName   * Country name eg. Ireland
     */
    public org.opentravel.www.OTA._2003._05.CountryNameType getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this AddressType.
     * 
     * @param countryName   * Country name eg. Ireland
     */
    public void setCountryName(org.opentravel.www.OTA._2003._05.CountryNameType countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the formattedInd value for this AddressType.
     * 
     * @return formattedInd
     */
    public java.lang.Boolean getFormattedInd() {
        return formattedInd;
    }


    /**
     * Sets the formattedInd value for this AddressType.
     * 
     * @param formattedInd
     */
    public void setFormattedInd(java.lang.Boolean formattedInd) {
        this.formattedInd = formattedInd;
    }


    /**
     * Gets the shareSynchInd value for this AddressType.
     * 
     * @return shareSynchInd
     */
    public org.opentravel.www.OTA._2003._05.ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }


    /**
     * Sets the shareSynchInd value for this AddressType.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }


    /**
     * Gets the shareMarketInd value for this AddressType.
     * 
     * @return shareMarketInd
     */
    public org.opentravel.www.OTA._2003._05.ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }


    /**
     * Sets the shareMarketInd value for this AddressType.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }


    /**
     * Gets the type value for this AddressType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this AddressType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressType)) return false;
        AddressType other = (AddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.streetNmbr==null && other.getStreetNmbr()==null) || 
             (this.streetNmbr!=null &&
              this.streetNmbr.equals(other.getStreetNmbr()))) &&
            ((this.bldgRoom==null && other.getBldgRoom()==null) || 
             (this.bldgRoom!=null &&
              this.bldgRoom.equals(other.getBldgRoom()))) &&
            ((this.addressLine==null && other.getAddressLine()==null) || 
             (this.addressLine!=null &&
              java.util.Arrays.equals(this.addressLine, other.getAddressLine()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.stateProv==null && other.getStateProv()==null) || 
             (this.stateProv!=null &&
              this.stateProv.equals(other.getStateProv()))) &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.formattedInd==null && other.getFormattedInd()==null) || 
             (this.formattedInd!=null &&
              this.formattedInd.equals(other.getFormattedInd()))) &&
            ((this.shareSynchInd==null && other.getShareSynchInd()==null) || 
             (this.shareSynchInd!=null &&
              this.shareSynchInd.equals(other.getShareSynchInd()))) &&
            ((this.shareMarketInd==null && other.getShareMarketInd()==null) || 
             (this.shareMarketInd!=null &&
              this.shareMarketInd.equals(other.getShareMarketInd()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getStreetNmbr() != null) {
            _hashCode += getStreetNmbr().hashCode();
        }
        if (getBldgRoom() != null) {
            _hashCode += getBldgRoom().hashCode();
        }
        if (getAddressLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getStateProv() != null) {
            _hashCode += getStateProv().hashCode();
        }
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getFormattedInd() != null) {
            _hashCode += getFormattedInd().hashCode();
        }
        if (getShareSynchInd() != null) {
            _hashCode += getShareSynchInd().hashCode();
        }
        if (getShareMarketInd() != null) {
            _hashCode += getShareMarketInd().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AddressType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("formattedInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FormattedInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
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
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OTA_CodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNmbr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StreetNmbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StreetNmbrType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bldgRoom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BldgRoom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AddressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "County"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StateProv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StateProvType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountryNameType"));
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
