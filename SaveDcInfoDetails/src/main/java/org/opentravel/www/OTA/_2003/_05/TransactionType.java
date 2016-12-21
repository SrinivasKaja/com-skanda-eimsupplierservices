/**
 * TransactionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * IntelliSell Type
 */
public class TransactionType  implements java.io.Serializable {
    /* Identifier of the type of request. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeRequestType requestType;

    /* Identifier of the transaction path. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeServiceTag serviceTag;

    /* A target available for user, that can be used to create specific
     * rules. For example, if the client wants to target preferred customer
     * request, we can use this element to achieve this. */
    private org.opentravel.www.OTA._2003._05.TransactionTypePurchaseType purchaseType;

    /* Sabre authentication ID (ATH) - passed into the request to
     * keep session information when communicating with TPF. The use of this
     * element had been deprecated and is achieved by session pooling mechanism
     * in Intellisell. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeSabreAth sabreAth;

    /* Transaction ID. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeTranID tranID;

    /* A unique identifier to relate all transactions within a single
     * session. Used by AirShop/LFE transactions. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeClientSessionID clientSessionID;

    /* Attribute of the Rule that can be passed in to selectively
     * target a rule. This has been deprecated. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeBranch branch;

    /* Decides if the response should be compressed. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeCompressResponse compressResponse;

    /* Contains a sequence of fare overrides. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeFareOverridesFareOverride[] fareOverrides;

    /* For internal use */
    private org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnostic[] diagnostics;

    /* Subagent data for LFE transactions. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeSubagentData subagentData;

    /* Settings for IntelliSell merchandising */
    private org.opentravel.www.OTA._2003._05.TransactionTypeResponseSorting responseSorting;

    private org.opentravel.www.OTA._2003._05.SeatStatusSimType seatStatusSim;

    private org.opentravel.www.OTA._2003._05.TransactionTypeAvailableLevel availableLevel;

    /* Allows ATSE Team to test new features. This element and its
     * content is meant to never be published. */
    private org.opentravel.www.OTA._2003._05.TransactionTypeATSETest ATSETest;

    private boolean debug;  // attribute

    private java.lang.String debugKey;  // attribute

    private java.lang.String configSet;  // attribute

    private boolean disableCache;  // attribute

    private java.lang.String chunkNumber;  // attribute

    private boolean showItinSource;  // attribute

    public TransactionType() {
    }

    public TransactionType(
           org.opentravel.www.OTA._2003._05.TransactionTypeRequestType requestType,
           org.opentravel.www.OTA._2003._05.TransactionTypeServiceTag serviceTag,
           org.opentravel.www.OTA._2003._05.TransactionTypePurchaseType purchaseType,
           org.opentravel.www.OTA._2003._05.TransactionTypeSabreAth sabreAth,
           org.opentravel.www.OTA._2003._05.TransactionTypeTranID tranID,
           org.opentravel.www.OTA._2003._05.TransactionTypeClientSessionID clientSessionID,
           org.opentravel.www.OTA._2003._05.TransactionTypeBranch branch,
           org.opentravel.www.OTA._2003._05.TransactionTypeCompressResponse compressResponse,
           org.opentravel.www.OTA._2003._05.TransactionTypeFareOverridesFareOverride[] fareOverrides,
           org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnostic[] diagnostics,
           org.opentravel.www.OTA._2003._05.TransactionTypeSubagentData subagentData,
           org.opentravel.www.OTA._2003._05.TransactionTypeResponseSorting responseSorting,
           org.opentravel.www.OTA._2003._05.SeatStatusSimType seatStatusSim,
           org.opentravel.www.OTA._2003._05.TransactionTypeAvailableLevel availableLevel,
           org.opentravel.www.OTA._2003._05.TransactionTypeATSETest ATSETest,
           boolean debug,
           java.lang.String debugKey,
           java.lang.String configSet,
           boolean disableCache,
           java.lang.String chunkNumber,
           boolean showItinSource) {
           this.requestType = requestType;
           this.serviceTag = serviceTag;
           this.purchaseType = purchaseType;
           this.sabreAth = sabreAth;
           this.tranID = tranID;
           this.clientSessionID = clientSessionID;
           this.branch = branch;
           this.compressResponse = compressResponse;
           this.fareOverrides = fareOverrides;
           this.diagnostics = diagnostics;
           this.subagentData = subagentData;
           this.responseSorting = responseSorting;
           this.seatStatusSim = seatStatusSim;
           this.availableLevel = availableLevel;
           this.ATSETest = ATSETest;
           this.debug = debug;
           this.debugKey = debugKey;
           this.configSet = configSet;
           this.disableCache = disableCache;
           this.chunkNumber = chunkNumber;
           this.showItinSource = showItinSource;
    }


    /**
     * Gets the requestType value for this TransactionType.
     * 
     * @return requestType   * Identifier of the type of request.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeRequestType getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this TransactionType.
     * 
     * @param requestType   * Identifier of the type of request.
     */
    public void setRequestType(org.opentravel.www.OTA._2003._05.TransactionTypeRequestType requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the serviceTag value for this TransactionType.
     * 
     * @return serviceTag   * Identifier of the transaction path.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeServiceTag getServiceTag() {
        return serviceTag;
    }


    /**
     * Sets the serviceTag value for this TransactionType.
     * 
     * @param serviceTag   * Identifier of the transaction path.
     */
    public void setServiceTag(org.opentravel.www.OTA._2003._05.TransactionTypeServiceTag serviceTag) {
        this.serviceTag = serviceTag;
    }


    /**
     * Gets the purchaseType value for this TransactionType.
     * 
     * @return purchaseType   * A target available for user, that can be used to create specific
     * rules. For example, if the client wants to target preferred customer
     * request, we can use this element to achieve this.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypePurchaseType getPurchaseType() {
        return purchaseType;
    }


    /**
     * Sets the purchaseType value for this TransactionType.
     * 
     * @param purchaseType   * A target available for user, that can be used to create specific
     * rules. For example, if the client wants to target preferred customer
     * request, we can use this element to achieve this.
     */
    public void setPurchaseType(org.opentravel.www.OTA._2003._05.TransactionTypePurchaseType purchaseType) {
        this.purchaseType = purchaseType;
    }


    /**
     * Gets the sabreAth value for this TransactionType.
     * 
     * @return sabreAth   * Sabre authentication ID (ATH) - passed into the request to
     * keep session information when communicating with TPF. The use of this
     * element had been deprecated and is achieved by session pooling mechanism
     * in Intellisell.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeSabreAth getSabreAth() {
        return sabreAth;
    }


    /**
     * Sets the sabreAth value for this TransactionType.
     * 
     * @param sabreAth   * Sabre authentication ID (ATH) - passed into the request to
     * keep session information when communicating with TPF. The use of this
     * element had been deprecated and is achieved by session pooling mechanism
     * in Intellisell.
     */
    public void setSabreAth(org.opentravel.www.OTA._2003._05.TransactionTypeSabreAth sabreAth) {
        this.sabreAth = sabreAth;
    }


    /**
     * Gets the tranID value for this TransactionType.
     * 
     * @return tranID   * Transaction ID.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeTranID getTranID() {
        return tranID;
    }


    /**
     * Sets the tranID value for this TransactionType.
     * 
     * @param tranID   * Transaction ID.
     */
    public void setTranID(org.opentravel.www.OTA._2003._05.TransactionTypeTranID tranID) {
        this.tranID = tranID;
    }


    /**
     * Gets the clientSessionID value for this TransactionType.
     * 
     * @return clientSessionID   * A unique identifier to relate all transactions within a single
     * session. Used by AirShop/LFE transactions.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeClientSessionID getClientSessionID() {
        return clientSessionID;
    }


    /**
     * Sets the clientSessionID value for this TransactionType.
     * 
     * @param clientSessionID   * A unique identifier to relate all transactions within a single
     * session. Used by AirShop/LFE transactions.
     */
    public void setClientSessionID(org.opentravel.www.OTA._2003._05.TransactionTypeClientSessionID clientSessionID) {
        this.clientSessionID = clientSessionID;
    }


    /**
     * Gets the branch value for this TransactionType.
     * 
     * @return branch   * Attribute of the Rule that can be passed in to selectively
     * target a rule. This has been deprecated.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeBranch getBranch() {
        return branch;
    }


    /**
     * Sets the branch value for this TransactionType.
     * 
     * @param branch   * Attribute of the Rule that can be passed in to selectively
     * target a rule. This has been deprecated.
     */
    public void setBranch(org.opentravel.www.OTA._2003._05.TransactionTypeBranch branch) {
        this.branch = branch;
    }


    /**
     * Gets the compressResponse value for this TransactionType.
     * 
     * @return compressResponse   * Decides if the response should be compressed.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeCompressResponse getCompressResponse() {
        return compressResponse;
    }


    /**
     * Sets the compressResponse value for this TransactionType.
     * 
     * @param compressResponse   * Decides if the response should be compressed.
     */
    public void setCompressResponse(org.opentravel.www.OTA._2003._05.TransactionTypeCompressResponse compressResponse) {
        this.compressResponse = compressResponse;
    }


    /**
     * Gets the fareOverrides value for this TransactionType.
     * 
     * @return fareOverrides   * Contains a sequence of fare overrides.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeFareOverridesFareOverride[] getFareOverrides() {
        return fareOverrides;
    }


    /**
     * Sets the fareOverrides value for this TransactionType.
     * 
     * @param fareOverrides   * Contains a sequence of fare overrides.
     */
    public void setFareOverrides(org.opentravel.www.OTA._2003._05.TransactionTypeFareOverridesFareOverride[] fareOverrides) {
        this.fareOverrides = fareOverrides;
    }


    /**
     * Gets the diagnostics value for this TransactionType.
     * 
     * @return diagnostics   * For internal use
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnostic[] getDiagnostics() {
        return diagnostics;
    }


    /**
     * Sets the diagnostics value for this TransactionType.
     * 
     * @param diagnostics   * For internal use
     */
    public void setDiagnostics(org.opentravel.www.OTA._2003._05.TransactionTypeDiagnosticsDiagnostic[] diagnostics) {
        this.diagnostics = diagnostics;
    }


    /**
     * Gets the subagentData value for this TransactionType.
     * 
     * @return subagentData   * Subagent data for LFE transactions.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeSubagentData getSubagentData() {
        return subagentData;
    }


    /**
     * Sets the subagentData value for this TransactionType.
     * 
     * @param subagentData   * Subagent data for LFE transactions.
     */
    public void setSubagentData(org.opentravel.www.OTA._2003._05.TransactionTypeSubagentData subagentData) {
        this.subagentData = subagentData;
    }


    /**
     * Gets the responseSorting value for this TransactionType.
     * 
     * @return responseSorting   * Settings for IntelliSell merchandising
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeResponseSorting getResponseSorting() {
        return responseSorting;
    }


    /**
     * Sets the responseSorting value for this TransactionType.
     * 
     * @param responseSorting   * Settings for IntelliSell merchandising
     */
    public void setResponseSorting(org.opentravel.www.OTA._2003._05.TransactionTypeResponseSorting responseSorting) {
        this.responseSorting = responseSorting;
    }


    /**
     * Gets the seatStatusSim value for this TransactionType.
     * 
     * @return seatStatusSim
     */
    public org.opentravel.www.OTA._2003._05.SeatStatusSimType getSeatStatusSim() {
        return seatStatusSim;
    }


    /**
     * Sets the seatStatusSim value for this TransactionType.
     * 
     * @param seatStatusSim
     */
    public void setSeatStatusSim(org.opentravel.www.OTA._2003._05.SeatStatusSimType seatStatusSim) {
        this.seatStatusSim = seatStatusSim;
    }


    /**
     * Gets the availableLevel value for this TransactionType.
     * 
     * @return availableLevel
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeAvailableLevel getAvailableLevel() {
        return availableLevel;
    }


    /**
     * Sets the availableLevel value for this TransactionType.
     * 
     * @param availableLevel
     */
    public void setAvailableLevel(org.opentravel.www.OTA._2003._05.TransactionTypeAvailableLevel availableLevel) {
        this.availableLevel = availableLevel;
    }


    /**
     * Gets the ATSETest value for this TransactionType.
     * 
     * @return ATSETest   * Allows ATSE Team to test new features. This element and its
     * content is meant to never be published.
     */
    public org.opentravel.www.OTA._2003._05.TransactionTypeATSETest getATSETest() {
        return ATSETest;
    }


    /**
     * Sets the ATSETest value for this TransactionType.
     * 
     * @param ATSETest   * Allows ATSE Team to test new features. This element and its
     * content is meant to never be published.
     */
    public void setATSETest(org.opentravel.www.OTA._2003._05.TransactionTypeATSETest ATSETest) {
        this.ATSETest = ATSETest;
    }


    /**
     * Gets the debug value for this TransactionType.
     * 
     * @return debug
     */
    public boolean isDebug() {
        return debug;
    }


    /**
     * Sets the debug value for this TransactionType.
     * 
     * @param debug
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
    }


    /**
     * Gets the debugKey value for this TransactionType.
     * 
     * @return debugKey
     */
    public java.lang.String getDebugKey() {
        return debugKey;
    }


    /**
     * Sets the debugKey value for this TransactionType.
     * 
     * @param debugKey
     */
    public void setDebugKey(java.lang.String debugKey) {
        this.debugKey = debugKey;
    }


    /**
     * Gets the configSet value for this TransactionType.
     * 
     * @return configSet
     */
    public java.lang.String getConfigSet() {
        return configSet;
    }


    /**
     * Sets the configSet value for this TransactionType.
     * 
     * @param configSet
     */
    public void setConfigSet(java.lang.String configSet) {
        this.configSet = configSet;
    }


    /**
     * Gets the disableCache value for this TransactionType.
     * 
     * @return disableCache
     */
    public boolean isDisableCache() {
        return disableCache;
    }


    /**
     * Sets the disableCache value for this TransactionType.
     * 
     * @param disableCache
     */
    public void setDisableCache(boolean disableCache) {
        this.disableCache = disableCache;
    }


    /**
     * Gets the chunkNumber value for this TransactionType.
     * 
     * @return chunkNumber
     */
    public java.lang.String getChunkNumber() {
        return chunkNumber;
    }


    /**
     * Sets the chunkNumber value for this TransactionType.
     * 
     * @param chunkNumber
     */
    public void setChunkNumber(java.lang.String chunkNumber) {
        this.chunkNumber = chunkNumber;
    }


    /**
     * Gets the showItinSource value for this TransactionType.
     * 
     * @return showItinSource
     */
    public boolean isShowItinSource() {
        return showItinSource;
    }


    /**
     * Sets the showItinSource value for this TransactionType.
     * 
     * @param showItinSource
     */
    public void setShowItinSource(boolean showItinSource) {
        this.showItinSource = showItinSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionType)) return false;
        TransactionType other = (TransactionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.serviceTag==null && other.getServiceTag()==null) || 
             (this.serviceTag!=null &&
              this.serviceTag.equals(other.getServiceTag()))) &&
            ((this.purchaseType==null && other.getPurchaseType()==null) || 
             (this.purchaseType!=null &&
              this.purchaseType.equals(other.getPurchaseType()))) &&
            ((this.sabreAth==null && other.getSabreAth()==null) || 
             (this.sabreAth!=null &&
              this.sabreAth.equals(other.getSabreAth()))) &&
            ((this.tranID==null && other.getTranID()==null) || 
             (this.tranID!=null &&
              this.tranID.equals(other.getTranID()))) &&
            ((this.clientSessionID==null && other.getClientSessionID()==null) || 
             (this.clientSessionID!=null &&
              this.clientSessionID.equals(other.getClientSessionID()))) &&
            ((this.branch==null && other.getBranch()==null) || 
             (this.branch!=null &&
              this.branch.equals(other.getBranch()))) &&
            ((this.compressResponse==null && other.getCompressResponse()==null) || 
             (this.compressResponse!=null &&
              this.compressResponse.equals(other.getCompressResponse()))) &&
            ((this.fareOverrides==null && other.getFareOverrides()==null) || 
             (this.fareOverrides!=null &&
              java.util.Arrays.equals(this.fareOverrides, other.getFareOverrides()))) &&
            ((this.diagnostics==null && other.getDiagnostics()==null) || 
             (this.diagnostics!=null &&
              java.util.Arrays.equals(this.diagnostics, other.getDiagnostics()))) &&
            ((this.subagentData==null && other.getSubagentData()==null) || 
             (this.subagentData!=null &&
              this.subagentData.equals(other.getSubagentData()))) &&
            ((this.responseSorting==null && other.getResponseSorting()==null) || 
             (this.responseSorting!=null &&
              this.responseSorting.equals(other.getResponseSorting()))) &&
            ((this.seatStatusSim==null && other.getSeatStatusSim()==null) || 
             (this.seatStatusSim!=null &&
              this.seatStatusSim.equals(other.getSeatStatusSim()))) &&
            ((this.availableLevel==null && other.getAvailableLevel()==null) || 
             (this.availableLevel!=null &&
              this.availableLevel.equals(other.getAvailableLevel()))) &&
            ((this.ATSETest==null && other.getATSETest()==null) || 
             (this.ATSETest!=null &&
              this.ATSETest.equals(other.getATSETest()))) &&
            this.debug == other.isDebug() &&
            ((this.debugKey==null && other.getDebugKey()==null) || 
             (this.debugKey!=null &&
              this.debugKey.equals(other.getDebugKey()))) &&
            ((this.configSet==null && other.getConfigSet()==null) || 
             (this.configSet!=null &&
              this.configSet.equals(other.getConfigSet()))) &&
            this.disableCache == other.isDisableCache() &&
            ((this.chunkNumber==null && other.getChunkNumber()==null) || 
             (this.chunkNumber!=null &&
              this.chunkNumber.equals(other.getChunkNumber()))) &&
            this.showItinSource == other.isShowItinSource();
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
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getServiceTag() != null) {
            _hashCode += getServiceTag().hashCode();
        }
        if (getPurchaseType() != null) {
            _hashCode += getPurchaseType().hashCode();
        }
        if (getSabreAth() != null) {
            _hashCode += getSabreAth().hashCode();
        }
        if (getTranID() != null) {
            _hashCode += getTranID().hashCode();
        }
        if (getClientSessionID() != null) {
            _hashCode += getClientSessionID().hashCode();
        }
        if (getBranch() != null) {
            _hashCode += getBranch().hashCode();
        }
        if (getCompressResponse() != null) {
            _hashCode += getCompressResponse().hashCode();
        }
        if (getFareOverrides() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareOverrides());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareOverrides(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiagnostics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnostics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnostics(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubagentData() != null) {
            _hashCode += getSubagentData().hashCode();
        }
        if (getResponseSorting() != null) {
            _hashCode += getResponseSorting().hashCode();
        }
        if (getSeatStatusSim() != null) {
            _hashCode += getSeatStatusSim().hashCode();
        }
        if (getAvailableLevel() != null) {
            _hashCode += getAvailableLevel().hashCode();
        }
        if (getATSETest() != null) {
            _hashCode += getATSETest().hashCode();
        }
        _hashCode += (isDebug() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDebugKey() != null) {
            _hashCode += getDebugKey().hashCode();
        }
        if (getConfigSet() != null) {
            _hashCode += getConfigSet().hashCode();
        }
        _hashCode += (isDisableCache() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChunkNumber() != null) {
            _hashCode += getChunkNumber().hashCode();
        }
        _hashCode += (isShowItinSource() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TransactionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("debug");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Debug"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("debugKey");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DebugKey"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("configSet");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConfigSet"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("disableCache");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DisableCache"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("chunkNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChunkNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("showItinSource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ShowItinSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>RequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ServiceTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ServiceTag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PurchaseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>PurchaseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sabreAth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SabreAth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>SabreAth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TranID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>TranID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ClientSessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ClientSessionID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Branch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>Branch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompressResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>CompressResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>FareOverrides>FareOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareOverride"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnostics");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Diagnostics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TransactionType>Diagnostics>Diagnostic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Diagnostic"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subagentData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SubagentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>SubagentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSorting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseSorting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ResponseSorting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatStatusSim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SeatStatusSim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SeatStatusSimType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AvailableLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>AvailableLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATSETest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ATSETest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>ATSETest"));
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
