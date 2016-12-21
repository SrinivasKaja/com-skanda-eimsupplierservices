/**
 * FlexibleFaresTypeFareParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FlexibleFaresTypeFareParameters  implements java.io.Serializable {
    /* Setting this to true means the same as setting ResTicketing,
     * MinMaxStay and RefundPenalty to false. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersExcludeRestricted excludeRestricted;

    /* If set to true, fares that have a reservation/ticketing can
     * be included in the responses. If set to false, then no fares that
     * include reservation/ticketing requirement will be included in the
     * response. This is negation of XA qualifier. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersResTicketing resTicketing;

    /* If set to true, fares that have a min/max stay can be included
     * in the responses. If set to false, then no fares that include a min/max
     * stay requirement will be included in the response. This is negation
     * of XS qualifier. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersMinMaxStay minMaxStay;

    /* If set to true, fares that have a refund penalty can be included
     * in the responses. If set to false, then no fares that include a refund
     * penalty requirement will be included in the response. This is negation
     * of XP qualifier. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersRefundPenalty refundPenalty;

    /* This element finds only public fares. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPublicFare publicFare;

    /* This element finds only private fares. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPrivateFare privateFare;

    /* This element specifies preffered cabin type. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCabin cabin;

    /* This element specifies PTC used to find this fare. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPassengerType passengerType;

    /* If set to true then returned fares need to match AcccountCode/CorpID
     * specified in Fare Group definition on all fare components. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersNegotiatedFaresOnly negotiatedFaresOnly;

    /* If set to true only fares matching PTC specified in the Flex
     * Fare Group will be returned on all fare components. */
    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersXOFares XOFares;

    /* Define information on the number of passengers of a specific
     * type. */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] passengerTypeQuantity;

    private org.opentravel.www.OTA._2003._05.JumpCabinLogicType jumpCabinLogic;

    private org.opentravel.www.OTA._2003._05.KeepSameCabinType keepSameCabin;

    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCorporateID corporateID;

    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersAccountCode accountCode;

    public FlexibleFaresTypeFareParameters() {
    }

    public FlexibleFaresTypeFareParameters(
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersExcludeRestricted excludeRestricted,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersResTicketing resTicketing,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersMinMaxStay minMaxStay,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersRefundPenalty refundPenalty,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPublicFare publicFare,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPrivateFare privateFare,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCabin cabin,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPassengerType passengerType,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersNegotiatedFaresOnly negotiatedFaresOnly,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersXOFares XOFares,
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] passengerTypeQuantity,
           org.opentravel.www.OTA._2003._05.JumpCabinLogicType jumpCabinLogic,
           org.opentravel.www.OTA._2003._05.KeepSameCabinType keepSameCabin,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCorporateID corporateID,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersAccountCode accountCode) {
           this.excludeRestricted = excludeRestricted;
           this.resTicketing = resTicketing;
           this.minMaxStay = minMaxStay;
           this.refundPenalty = refundPenalty;
           this.publicFare = publicFare;
           this.privateFare = privateFare;
           this.cabin = cabin;
           this.passengerType = passengerType;
           this.negotiatedFaresOnly = negotiatedFaresOnly;
           this.XOFares = XOFares;
           this.passengerTypeQuantity = passengerTypeQuantity;
           this.jumpCabinLogic = jumpCabinLogic;
           this.keepSameCabin = keepSameCabin;
           this.corporateID = corporateID;
           this.accountCode = accountCode;
    }


    /**
     * Gets the excludeRestricted value for this FlexibleFaresTypeFareParameters.
     * 
     * @return excludeRestricted   * Setting this to true means the same as setting ResTicketing,
     * MinMaxStay and RefundPenalty to false.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersExcludeRestricted getExcludeRestricted() {
        return excludeRestricted;
    }


    /**
     * Sets the excludeRestricted value for this FlexibleFaresTypeFareParameters.
     * 
     * @param excludeRestricted   * Setting this to true means the same as setting ResTicketing,
     * MinMaxStay and RefundPenalty to false.
     */
    public void setExcludeRestricted(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersExcludeRestricted excludeRestricted) {
        this.excludeRestricted = excludeRestricted;
    }


    /**
     * Gets the resTicketing value for this FlexibleFaresTypeFareParameters.
     * 
     * @return resTicketing   * If set to true, fares that have a reservation/ticketing can
     * be included in the responses. If set to false, then no fares that
     * include reservation/ticketing requirement will be included in the
     * response. This is negation of XA qualifier.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersResTicketing getResTicketing() {
        return resTicketing;
    }


    /**
     * Sets the resTicketing value for this FlexibleFaresTypeFareParameters.
     * 
     * @param resTicketing   * If set to true, fares that have a reservation/ticketing can
     * be included in the responses. If set to false, then no fares that
     * include reservation/ticketing requirement will be included in the
     * response. This is negation of XA qualifier.
     */
    public void setResTicketing(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersResTicketing resTicketing) {
        this.resTicketing = resTicketing;
    }


    /**
     * Gets the minMaxStay value for this FlexibleFaresTypeFareParameters.
     * 
     * @return minMaxStay   * If set to true, fares that have a min/max stay can be included
     * in the responses. If set to false, then no fares that include a min/max
     * stay requirement will be included in the response. This is negation
     * of XS qualifier.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersMinMaxStay getMinMaxStay() {
        return minMaxStay;
    }


    /**
     * Sets the minMaxStay value for this FlexibleFaresTypeFareParameters.
     * 
     * @param minMaxStay   * If set to true, fares that have a min/max stay can be included
     * in the responses. If set to false, then no fares that include a min/max
     * stay requirement will be included in the response. This is negation
     * of XS qualifier.
     */
    public void setMinMaxStay(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersMinMaxStay minMaxStay) {
        this.minMaxStay = minMaxStay;
    }


    /**
     * Gets the refundPenalty value for this FlexibleFaresTypeFareParameters.
     * 
     * @return refundPenalty   * If set to true, fares that have a refund penalty can be included
     * in the responses. If set to false, then no fares that include a refund
     * penalty requirement will be included in the response. This is negation
     * of XP qualifier.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersRefundPenalty getRefundPenalty() {
        return refundPenalty;
    }


    /**
     * Sets the refundPenalty value for this FlexibleFaresTypeFareParameters.
     * 
     * @param refundPenalty   * If set to true, fares that have a refund penalty can be included
     * in the responses. If set to false, then no fares that include a refund
     * penalty requirement will be included in the response. This is negation
     * of XP qualifier.
     */
    public void setRefundPenalty(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersRefundPenalty refundPenalty) {
        this.refundPenalty = refundPenalty;
    }


    /**
     * Gets the publicFare value for this FlexibleFaresTypeFareParameters.
     * 
     * @return publicFare   * This element finds only public fares.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPublicFare getPublicFare() {
        return publicFare;
    }


    /**
     * Sets the publicFare value for this FlexibleFaresTypeFareParameters.
     * 
     * @param publicFare   * This element finds only public fares.
     */
    public void setPublicFare(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPublicFare publicFare) {
        this.publicFare = publicFare;
    }


    /**
     * Gets the privateFare value for this FlexibleFaresTypeFareParameters.
     * 
     * @return privateFare   * This element finds only private fares.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPrivateFare getPrivateFare() {
        return privateFare;
    }


    /**
     * Sets the privateFare value for this FlexibleFaresTypeFareParameters.
     * 
     * @param privateFare   * This element finds only private fares.
     */
    public void setPrivateFare(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPrivateFare privateFare) {
        this.privateFare = privateFare;
    }


    /**
     * Gets the cabin value for this FlexibleFaresTypeFareParameters.
     * 
     * @return cabin   * This element specifies preffered cabin type.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCabin getCabin() {
        return cabin;
    }


    /**
     * Sets the cabin value for this FlexibleFaresTypeFareParameters.
     * 
     * @param cabin   * This element specifies preffered cabin type.
     */
    public void setCabin(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCabin cabin) {
        this.cabin = cabin;
    }


    /**
     * Gets the passengerType value for this FlexibleFaresTypeFareParameters.
     * 
     * @return passengerType   * This element specifies PTC used to find this fare.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPassengerType getPassengerType() {
        return passengerType;
    }


    /**
     * Sets the passengerType value for this FlexibleFaresTypeFareParameters.
     * 
     * @param passengerType   * This element specifies PTC used to find this fare.
     */
    public void setPassengerType(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersPassengerType passengerType) {
        this.passengerType = passengerType;
    }


    /**
     * Gets the negotiatedFaresOnly value for this FlexibleFaresTypeFareParameters.
     * 
     * @return negotiatedFaresOnly   * If set to true then returned fares need to match AcccountCode/CorpID
     * specified in Fare Group definition on all fare components.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersNegotiatedFaresOnly getNegotiatedFaresOnly() {
        return negotiatedFaresOnly;
    }


    /**
     * Sets the negotiatedFaresOnly value for this FlexibleFaresTypeFareParameters.
     * 
     * @param negotiatedFaresOnly   * If set to true then returned fares need to match AcccountCode/CorpID
     * specified in Fare Group definition on all fare components.
     */
    public void setNegotiatedFaresOnly(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersNegotiatedFaresOnly negotiatedFaresOnly) {
        this.negotiatedFaresOnly = negotiatedFaresOnly;
    }


    /**
     * Gets the XOFares value for this FlexibleFaresTypeFareParameters.
     * 
     * @return XOFares   * If set to true only fares matching PTC specified in the Flex
     * Fare Group will be returned on all fare components.
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersXOFares getXOFares() {
        return XOFares;
    }


    /**
     * Sets the XOFares value for this FlexibleFaresTypeFareParameters.
     * 
     * @param XOFares   * If set to true only fares matching PTC specified in the Flex
     * Fare Group will be returned on all fare components.
     */
    public void setXOFares(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersXOFares XOFares) {
        this.XOFares = XOFares;
    }


    /**
     * Gets the passengerTypeQuantity value for this FlexibleFaresTypeFareParameters.
     * 
     * @return passengerTypeQuantity   * Define information on the number of passengers of a specific
     * type.
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }


    /**
     * Sets the passengerTypeQuantity value for this FlexibleFaresTypeFareParameters.
     * 
     * @param passengerTypeQuantity   * Define information on the number of passengers of a specific
     * type.
     */
    public void setPassengerTypeQuantity(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType[] passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType getPassengerTypeQuantity(int i) {
        return this.passengerTypeQuantity[i];
    }

    public void setPassengerTypeQuantity(int i, org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType _value) {
        this.passengerTypeQuantity[i] = _value;
    }


    /**
     * Gets the jumpCabinLogic value for this FlexibleFaresTypeFareParameters.
     * 
     * @return jumpCabinLogic
     */
    public org.opentravel.www.OTA._2003._05.JumpCabinLogicType getJumpCabinLogic() {
        return jumpCabinLogic;
    }


    /**
     * Sets the jumpCabinLogic value for this FlexibleFaresTypeFareParameters.
     * 
     * @param jumpCabinLogic
     */
    public void setJumpCabinLogic(org.opentravel.www.OTA._2003._05.JumpCabinLogicType jumpCabinLogic) {
        this.jumpCabinLogic = jumpCabinLogic;
    }


    /**
     * Gets the keepSameCabin value for this FlexibleFaresTypeFareParameters.
     * 
     * @return keepSameCabin
     */
    public org.opentravel.www.OTA._2003._05.KeepSameCabinType getKeepSameCabin() {
        return keepSameCabin;
    }


    /**
     * Sets the keepSameCabin value for this FlexibleFaresTypeFareParameters.
     * 
     * @param keepSameCabin
     */
    public void setKeepSameCabin(org.opentravel.www.OTA._2003._05.KeepSameCabinType keepSameCabin) {
        this.keepSameCabin = keepSameCabin;
    }


    /**
     * Gets the corporateID value for this FlexibleFaresTypeFareParameters.
     * 
     * @return corporateID
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCorporateID getCorporateID() {
        return corporateID;
    }


    /**
     * Sets the corporateID value for this FlexibleFaresTypeFareParameters.
     * 
     * @param corporateID
     */
    public void setCorporateID(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersCorporateID corporateID) {
        this.corporateID = corporateID;
    }


    /**
     * Gets the accountCode value for this FlexibleFaresTypeFareParameters.
     * 
     * @return accountCode
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersAccountCode getAccountCode() {
        return accountCode;
    }


    /**
     * Sets the accountCode value for this FlexibleFaresTypeFareParameters.
     * 
     * @param accountCode
     */
    public void setAccountCode(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParametersAccountCode accountCode) {
        this.accountCode = accountCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexibleFaresTypeFareParameters)) return false;
        FlexibleFaresTypeFareParameters other = (FlexibleFaresTypeFareParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.excludeRestricted==null && other.getExcludeRestricted()==null) || 
             (this.excludeRestricted!=null &&
              this.excludeRestricted.equals(other.getExcludeRestricted()))) &&
            ((this.resTicketing==null && other.getResTicketing()==null) || 
             (this.resTicketing!=null &&
              this.resTicketing.equals(other.getResTicketing()))) &&
            ((this.minMaxStay==null && other.getMinMaxStay()==null) || 
             (this.minMaxStay!=null &&
              this.minMaxStay.equals(other.getMinMaxStay()))) &&
            ((this.refundPenalty==null && other.getRefundPenalty()==null) || 
             (this.refundPenalty!=null &&
              this.refundPenalty.equals(other.getRefundPenalty()))) &&
            ((this.publicFare==null && other.getPublicFare()==null) || 
             (this.publicFare!=null &&
              this.publicFare.equals(other.getPublicFare()))) &&
            ((this.privateFare==null && other.getPrivateFare()==null) || 
             (this.privateFare!=null &&
              this.privateFare.equals(other.getPrivateFare()))) &&
            ((this.cabin==null && other.getCabin()==null) || 
             (this.cabin!=null &&
              this.cabin.equals(other.getCabin()))) &&
            ((this.passengerType==null && other.getPassengerType()==null) || 
             (this.passengerType!=null &&
              this.passengerType.equals(other.getPassengerType()))) &&
            ((this.negotiatedFaresOnly==null && other.getNegotiatedFaresOnly()==null) || 
             (this.negotiatedFaresOnly!=null &&
              this.negotiatedFaresOnly.equals(other.getNegotiatedFaresOnly()))) &&
            ((this.XOFares==null && other.getXOFares()==null) || 
             (this.XOFares!=null &&
              this.XOFares.equals(other.getXOFares()))) &&
            ((this.passengerTypeQuantity==null && other.getPassengerTypeQuantity()==null) || 
             (this.passengerTypeQuantity!=null &&
              java.util.Arrays.equals(this.passengerTypeQuantity, other.getPassengerTypeQuantity()))) &&
            ((this.jumpCabinLogic==null && other.getJumpCabinLogic()==null) || 
             (this.jumpCabinLogic!=null &&
              this.jumpCabinLogic.equals(other.getJumpCabinLogic()))) &&
            ((this.keepSameCabin==null && other.getKeepSameCabin()==null) || 
             (this.keepSameCabin!=null &&
              this.keepSameCabin.equals(other.getKeepSameCabin()))) &&
            ((this.corporateID==null && other.getCorporateID()==null) || 
             (this.corporateID!=null &&
              this.corporateID.equals(other.getCorporateID()))) &&
            ((this.accountCode==null && other.getAccountCode()==null) || 
             (this.accountCode!=null &&
              this.accountCode.equals(other.getAccountCode())));
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
        if (getExcludeRestricted() != null) {
            _hashCode += getExcludeRestricted().hashCode();
        }
        if (getResTicketing() != null) {
            _hashCode += getResTicketing().hashCode();
        }
        if (getMinMaxStay() != null) {
            _hashCode += getMinMaxStay().hashCode();
        }
        if (getRefundPenalty() != null) {
            _hashCode += getRefundPenalty().hashCode();
        }
        if (getPublicFare() != null) {
            _hashCode += getPublicFare().hashCode();
        }
        if (getPrivateFare() != null) {
            _hashCode += getPrivateFare().hashCode();
        }
        if (getCabin() != null) {
            _hashCode += getCabin().hashCode();
        }
        if (getPassengerType() != null) {
            _hashCode += getPassengerType().hashCode();
        }
        if (getNegotiatedFaresOnly() != null) {
            _hashCode += getNegotiatedFaresOnly().hashCode();
        }
        if (getXOFares() != null) {
            _hashCode += getXOFares().hashCode();
        }
        if (getPassengerTypeQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengerTypeQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengerTypeQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJumpCabinLogic() != null) {
            _hashCode += getJumpCabinLogic().hashCode();
        }
        if (getKeepSameCabin() != null) {
            _hashCode += getKeepSameCabin().hashCode();
        }
        if (getCorporateID() != null) {
            _hashCode += getCorporateID().hashCode();
        }
        if (getAccountCode() != null) {
            _hashCode += getAccountCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlexibleFaresTypeFareParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FlexibleFaresType>FareParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeRestricted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExcludeRestricted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>ExcludeRestricted"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resTicketing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResTicketing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>ResTicketing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMaxStay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MinMaxStay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>MinMaxStay"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundPenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RefundPenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>RefundPenalty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PublicFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>PublicFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PrivateFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>PrivateFare"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Cabin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>Cabin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>PassengerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiatedFaresOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NegotiatedFaresOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>NegotiatedFaresOnly"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XOFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "XOFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>XOFares"));
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
        elemField.setFieldName("jumpCabinLogic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "JumpCabinLogic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "JumpCabinLogicType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keepSameCabin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "KeepSameCabin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "KeepSameCabinType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CorporateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>CorporateID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AccountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>FlexibleFaresType>FareParameters>AccountCode"));
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
