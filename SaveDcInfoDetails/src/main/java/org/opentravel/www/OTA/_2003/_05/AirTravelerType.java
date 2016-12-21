/**
 * AirTravelerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Information about the person traveling. Gender - the gender of
 * the customer, if needed. BirthDate - Date of Birth. Currency - the
 * preferred currency in which monetary amounts should be returned.
 */
public class AirTravelerType  implements java.io.Serializable {
    /* Stored information about a customer. May contain readily available
     * information relevant to the booking. */
    private org.opentravel.www.OTA._2003._05.AirTravelerTypeProfileRef profileRef;

    private org.opentravel.www.OTA._2003._05.PersonNameType personName;

    private org.opentravel.www.OTA._2003._05.TelephoneType[] telephone;

    private org.opentravel.www.OTA._2003._05.EmailType[] email;

    private org.opentravel.www.OTA._2003._05.AddressType[] address;

    /* Specify a customer loyalty program. */
    private org.opentravel.www.OTA._2003._05.CustLoyaltyType[] custLoyalty;

    private org.opentravel.www.OTA._2003._05.DocumentType[] document;

    /* Define information on the number of passengers of a specific
     * type. */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType passengerTypeQuantity;

    /* Direct reference of traveler assigned by requesting system.
     * Used as a cross reference between data segments. */
    private org.opentravel.www.OTA._2003._05.TravelerRefNumberType travelerRefNumber;

    /* Reference pointers to flight segments */
    private java.lang.String[] flightSegmentRPHs;

    private org.opentravel.www.OTA._2003._05.Gender gender;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd;  // attribute

    private org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd;  // attribute

    private java.util.Date birthDate;  // attribute

    private java.lang.String currencyCode;  // attribute

    private java.lang.String passengerTypeCode;  // attribute

    private java.lang.Boolean accompaniedByInfant;  // attribute

    public AirTravelerType() {
    }

    public AirTravelerType(
           org.opentravel.www.OTA._2003._05.AirTravelerTypeProfileRef profileRef,
           org.opentravel.www.OTA._2003._05.PersonNameType personName,
           org.opentravel.www.OTA._2003._05.TelephoneType[] telephone,
           org.opentravel.www.OTA._2003._05.EmailType[] email,
           org.opentravel.www.OTA._2003._05.AddressType[] address,
           org.opentravel.www.OTA._2003._05.CustLoyaltyType[] custLoyalty,
           org.opentravel.www.OTA._2003._05.DocumentType[] document,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType passengerTypeQuantity,
           org.opentravel.www.OTA._2003._05.TravelerRefNumberType travelerRefNumber,
           java.lang.String[] flightSegmentRPHs,
           org.opentravel.www.OTA._2003._05.Gender gender,
           org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd,
           org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd,
           java.util.Date birthDate,
           java.lang.String currencyCode,
           java.lang.String passengerTypeCode,
           java.lang.Boolean accompaniedByInfant) {
           this.profileRef = profileRef;
           this.personName = personName;
           this.telephone = telephone;
           this.email = email;
           this.address = address;
           this.custLoyalty = custLoyalty;
           this.document = document;
           this.passengerTypeQuantity = passengerTypeQuantity;
           this.travelerRefNumber = travelerRefNumber;
           this.flightSegmentRPHs = flightSegmentRPHs;
           this.gender = gender;
           this.shareSynchInd = shareSynchInd;
           this.shareMarketInd = shareMarketInd;
           this.birthDate = birthDate;
           this.currencyCode = currencyCode;
           this.passengerTypeCode = passengerTypeCode;
           this.accompaniedByInfant = accompaniedByInfant;
    }


    /**
     * Gets the profileRef value for this AirTravelerType.
     * 
     * @return profileRef   * Stored information about a customer. May contain readily available
     * information relevant to the booking.
     */
    public org.opentravel.www.OTA._2003._05.AirTravelerTypeProfileRef getProfileRef() {
        return profileRef;
    }


    /**
     * Sets the profileRef value for this AirTravelerType.
     * 
     * @param profileRef   * Stored information about a customer. May contain readily available
     * information relevant to the booking.
     */
    public void setProfileRef(org.opentravel.www.OTA._2003._05.AirTravelerTypeProfileRef profileRef) {
        this.profileRef = profileRef;
    }


    /**
     * Gets the personName value for this AirTravelerType.
     * 
     * @return personName
     */
    public org.opentravel.www.OTA._2003._05.PersonNameType getPersonName() {
        return personName;
    }


    /**
     * Sets the personName value for this AirTravelerType.
     * 
     * @param personName
     */
    public void setPersonName(org.opentravel.www.OTA._2003._05.PersonNameType personName) {
        this.personName = personName;
    }


    /**
     * Gets the telephone value for this AirTravelerType.
     * 
     * @return telephone
     */
    public org.opentravel.www.OTA._2003._05.TelephoneType[] getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this AirTravelerType.
     * 
     * @param telephone
     */
    public void setTelephone(org.opentravel.www.OTA._2003._05.TelephoneType[] telephone) {
        this.telephone = telephone;
    }

    public org.opentravel.www.OTA._2003._05.TelephoneType getTelephone(int i) {
        return this.telephone[i];
    }

    public void setTelephone(int i, org.opentravel.www.OTA._2003._05.TelephoneType _value) {
        this.telephone[i] = _value;
    }


    /**
     * Gets the email value for this AirTravelerType.
     * 
     * @return email
     */
    public org.opentravel.www.OTA._2003._05.EmailType[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AirTravelerType.
     * 
     * @param email
     */
    public void setEmail(org.opentravel.www.OTA._2003._05.EmailType[] email) {
        this.email = email;
    }

    public org.opentravel.www.OTA._2003._05.EmailType getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, org.opentravel.www.OTA._2003._05.EmailType _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the address value for this AirTravelerType.
     * 
     * @return address
     */
    public org.opentravel.www.OTA._2003._05.AddressType[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AirTravelerType.
     * 
     * @param address
     */
    public void setAddress(org.opentravel.www.OTA._2003._05.AddressType[] address) {
        this.address = address;
    }

    public org.opentravel.www.OTA._2003._05.AddressType getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, org.opentravel.www.OTA._2003._05.AddressType _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the custLoyalty value for this AirTravelerType.
     * 
     * @return custLoyalty   * Specify a customer loyalty program.
     */
    public org.opentravel.www.OTA._2003._05.CustLoyaltyType[] getCustLoyalty() {
        return custLoyalty;
    }


    /**
     * Sets the custLoyalty value for this AirTravelerType.
     * 
     * @param custLoyalty   * Specify a customer loyalty program.
     */
    public void setCustLoyalty(org.opentravel.www.OTA._2003._05.CustLoyaltyType[] custLoyalty) {
        this.custLoyalty = custLoyalty;
    }

    public org.opentravel.www.OTA._2003._05.CustLoyaltyType getCustLoyalty(int i) {
        return this.custLoyalty[i];
    }

    public void setCustLoyalty(int i, org.opentravel.www.OTA._2003._05.CustLoyaltyType _value) {
        this.custLoyalty[i] = _value;
    }


    /**
     * Gets the document value for this AirTravelerType.
     * 
     * @return document
     */
    public org.opentravel.www.OTA._2003._05.DocumentType[] getDocument() {
        return document;
    }


    /**
     * Sets the document value for this AirTravelerType.
     * 
     * @param document
     */
    public void setDocument(org.opentravel.www.OTA._2003._05.DocumentType[] document) {
        this.document = document;
    }

    public org.opentravel.www.OTA._2003._05.DocumentType getDocument(int i) {
        return this.document[i];
    }

    public void setDocument(int i, org.opentravel.www.OTA._2003._05.DocumentType _value) {
        this.document[i] = _value;
    }


    /**
     * Gets the passengerTypeQuantity value for this AirTravelerType.
     * 
     * @return passengerTypeQuantity   * Define information on the number of passengers of a specific
     * type.
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }


    /**
     * Sets the passengerTypeQuantity value for this AirTravelerType.
     * 
     * @param passengerTypeQuantity   * Define information on the number of passengers of a specific
     * type.
     */
    public void setPassengerTypeQuantity(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }


    /**
     * Gets the travelerRefNumber value for this AirTravelerType.
     * 
     * @return travelerRefNumber   * Direct reference of traveler assigned by requesting system.
     * Used as a cross reference between data segments.
     */
    public org.opentravel.www.OTA._2003._05.TravelerRefNumberType getTravelerRefNumber() {
        return travelerRefNumber;
    }


    /**
     * Sets the travelerRefNumber value for this AirTravelerType.
     * 
     * @param travelerRefNumber   * Direct reference of traveler assigned by requesting system.
     * Used as a cross reference between data segments.
     */
    public void setTravelerRefNumber(org.opentravel.www.OTA._2003._05.TravelerRefNumberType travelerRefNumber) {
        this.travelerRefNumber = travelerRefNumber;
    }


    /**
     * Gets the flightSegmentRPHs value for this AirTravelerType.
     * 
     * @return flightSegmentRPHs   * Reference pointers to flight segments
     */
    public java.lang.String[] getFlightSegmentRPHs() {
        return flightSegmentRPHs;
    }


    /**
     * Sets the flightSegmentRPHs value for this AirTravelerType.
     * 
     * @param flightSegmentRPHs   * Reference pointers to flight segments
     */
    public void setFlightSegmentRPHs(java.lang.String[] flightSegmentRPHs) {
        this.flightSegmentRPHs = flightSegmentRPHs;
    }


    /**
     * Gets the gender value for this AirTravelerType.
     * 
     * @return gender
     */
    public org.opentravel.www.OTA._2003._05.Gender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this AirTravelerType.
     * 
     * @param gender
     */
    public void setGender(org.opentravel.www.OTA._2003._05.Gender gender) {
        this.gender = gender;
    }


    /**
     * Gets the shareSynchInd value for this AirTravelerType.
     * 
     * @return shareSynchInd
     */
    public org.opentravel.www.OTA._2003._05.ShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }


    /**
     * Sets the shareSynchInd value for this AirTravelerType.
     * 
     * @param shareSynchInd
     */
    public void setShareSynchInd(org.opentravel.www.OTA._2003._05.ShareSynchInd shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }


    /**
     * Gets the shareMarketInd value for this AirTravelerType.
     * 
     * @return shareMarketInd
     */
    public org.opentravel.www.OTA._2003._05.ShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }


    /**
     * Sets the shareMarketInd value for this AirTravelerType.
     * 
     * @param shareMarketInd
     */
    public void setShareMarketInd(org.opentravel.www.OTA._2003._05.ShareMarketInd shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }


    /**
     * Gets the birthDate value for this AirTravelerType.
     * 
     * @return birthDate
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this AirTravelerType.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the currencyCode value for this AirTravelerType.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this AirTravelerType.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the passengerTypeCode value for this AirTravelerType.
     * 
     * @return passengerTypeCode
     */
    public java.lang.String getPassengerTypeCode() {
        return passengerTypeCode;
    }


    /**
     * Sets the passengerTypeCode value for this AirTravelerType.
     * 
     * @param passengerTypeCode
     */
    public void setPassengerTypeCode(java.lang.String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }


    /**
     * Gets the accompaniedByInfant value for this AirTravelerType.
     * 
     * @return accompaniedByInfant
     */
    public java.lang.Boolean getAccompaniedByInfant() {
        return accompaniedByInfant;
    }


    /**
     * Sets the accompaniedByInfant value for this AirTravelerType.
     * 
     * @param accompaniedByInfant
     */
    public void setAccompaniedByInfant(java.lang.Boolean accompaniedByInfant) {
        this.accompaniedByInfant = accompaniedByInfant;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirTravelerType)) return false;
        AirTravelerType other = (AirTravelerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileRef==null && other.getProfileRef()==null) || 
             (this.profileRef!=null &&
              this.profileRef.equals(other.getProfileRef()))) &&
            ((this.personName==null && other.getPersonName()==null) || 
             (this.personName!=null &&
              this.personName.equals(other.getPersonName()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              java.util.Arrays.equals(this.telephone, other.getTelephone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.custLoyalty==null && other.getCustLoyalty()==null) || 
             (this.custLoyalty!=null &&
              java.util.Arrays.equals(this.custLoyalty, other.getCustLoyalty()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              java.util.Arrays.equals(this.document, other.getDocument()))) &&
            ((this.passengerTypeQuantity==null && other.getPassengerTypeQuantity()==null) || 
             (this.passengerTypeQuantity!=null &&
              this.passengerTypeQuantity.equals(other.getPassengerTypeQuantity()))) &&
            ((this.travelerRefNumber==null && other.getTravelerRefNumber()==null) || 
             (this.travelerRefNumber!=null &&
              this.travelerRefNumber.equals(other.getTravelerRefNumber()))) &&
            ((this.flightSegmentRPHs==null && other.getFlightSegmentRPHs()==null) || 
             (this.flightSegmentRPHs!=null &&
              java.util.Arrays.equals(this.flightSegmentRPHs, other.getFlightSegmentRPHs()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.shareSynchInd==null && other.getShareSynchInd()==null) || 
             (this.shareSynchInd!=null &&
              this.shareSynchInd.equals(other.getShareSynchInd()))) &&
            ((this.shareMarketInd==null && other.getShareMarketInd()==null) || 
             (this.shareMarketInd!=null &&
              this.shareMarketInd.equals(other.getShareMarketInd()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.passengerTypeCode==null && other.getPassengerTypeCode()==null) || 
             (this.passengerTypeCode!=null &&
              this.passengerTypeCode.equals(other.getPassengerTypeCode()))) &&
            ((this.accompaniedByInfant==null && other.getAccompaniedByInfant()==null) || 
             (this.accompaniedByInfant!=null &&
              this.accompaniedByInfant.equals(other.getAccompaniedByInfant())));
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
        if (getProfileRef() != null) {
            _hashCode += getProfileRef().hashCode();
        }
        if (getPersonName() != null) {
            _hashCode += getPersonName().hashCode();
        }
        if (getTelephone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelephone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelephone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustLoyalty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustLoyalty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustLoyalty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassengerTypeQuantity() != null) {
            _hashCode += getPassengerTypeQuantity().hashCode();
        }
        if (getTravelerRefNumber() != null) {
            _hashCode += getTravelerRefNumber().hashCode();
        }
        if (getFlightSegmentRPHs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlightSegmentRPHs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlightSegmentRPHs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getShareSynchInd() != null) {
            _hashCode += getShareSynchInd().hashCode();
        }
        if (getShareMarketInd() != null) {
            _hashCode += getShareMarketInd().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getPassengerTypeCode() != null) {
            _hashCode += getPassengerTypeCode().hashCode();
        }
        if (getAccompaniedByInfant() != null) {
            _hashCode += getAccompaniedByInfant().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirTravelerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTravelerType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("gender");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Gender"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Gender"));
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
        attrField.setFieldName("birthDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BirthDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currencyCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CurrencyCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("passengerTypeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PassengerTypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("accompaniedByInfant");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AccompaniedByInfant"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProfileRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirTravelerType>ProfileRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PersonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PersonNameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TelephoneType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "EmailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custLoyalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CustLoyalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CustLoyaltyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerTypeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelerRefNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerRefNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerRefNumberType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightSegmentRPHs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightSegmentRPHs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightSegmentRPH"));
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
