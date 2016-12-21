/**
 * ReissueInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Defines the data fields available for the reissue info type
 */
public class ReissueInfoType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFees changeFees;

    private java.lang.String residualIdicator;  // attribute

    private java.lang.String typeOfServiceFee;  // attribute

    private java.lang.String typeOfReissueTransaction;  // attribute

    private java.lang.Boolean reissueResultFromTag;  // attribute

    private java.lang.String formOfRefund;  // attribute

    private java.lang.Boolean reissueRequiresElectronicTicket;  // attribute

    private java.lang.Boolean reissueDoesNotAllowElectronicTicket;  // attribute

    private java.lang.Boolean taxRefundable;  // attribute

    public ReissueInfoType() {
    }

    public ReissueInfoType(
           org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFees changeFees,
           java.lang.String residualIdicator,
           java.lang.String typeOfServiceFee,
           java.lang.String typeOfReissueTransaction,
           java.lang.Boolean reissueResultFromTag,
           java.lang.String formOfRefund,
           java.lang.Boolean reissueRequiresElectronicTicket,
           java.lang.Boolean reissueDoesNotAllowElectronicTicket,
           java.lang.Boolean taxRefundable) {
           this.changeFees = changeFees;
           this.residualIdicator = residualIdicator;
           this.typeOfServiceFee = typeOfServiceFee;
           this.typeOfReissueTransaction = typeOfReissueTransaction;
           this.reissueResultFromTag = reissueResultFromTag;
           this.formOfRefund = formOfRefund;
           this.reissueRequiresElectronicTicket = reissueRequiresElectronicTicket;
           this.reissueDoesNotAllowElectronicTicket = reissueDoesNotAllowElectronicTicket;
           this.taxRefundable = taxRefundable;
    }


    /**
     * Gets the changeFees value for this ReissueInfoType.
     * 
     * @return changeFees
     */
    public org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFees getChangeFees() {
        return changeFees;
    }


    /**
     * Sets the changeFees value for this ReissueInfoType.
     * 
     * @param changeFees
     */
    public void setChangeFees(org.opentravel.www.OTA._2003._05.ReissueInfoTypeChangeFees changeFees) {
        this.changeFees = changeFees;
    }


    /**
     * Gets the residualIdicator value for this ReissueInfoType.
     * 
     * @return residualIdicator
     */
    public java.lang.String getResidualIdicator() {
        return residualIdicator;
    }


    /**
     * Sets the residualIdicator value for this ReissueInfoType.
     * 
     * @param residualIdicator
     */
    public void setResidualIdicator(java.lang.String residualIdicator) {
        this.residualIdicator = residualIdicator;
    }


    /**
     * Gets the typeOfServiceFee value for this ReissueInfoType.
     * 
     * @return typeOfServiceFee
     */
    public java.lang.String getTypeOfServiceFee() {
        return typeOfServiceFee;
    }


    /**
     * Sets the typeOfServiceFee value for this ReissueInfoType.
     * 
     * @param typeOfServiceFee
     */
    public void setTypeOfServiceFee(java.lang.String typeOfServiceFee) {
        this.typeOfServiceFee = typeOfServiceFee;
    }


    /**
     * Gets the typeOfReissueTransaction value for this ReissueInfoType.
     * 
     * @return typeOfReissueTransaction
     */
    public java.lang.String getTypeOfReissueTransaction() {
        return typeOfReissueTransaction;
    }


    /**
     * Sets the typeOfReissueTransaction value for this ReissueInfoType.
     * 
     * @param typeOfReissueTransaction
     */
    public void setTypeOfReissueTransaction(java.lang.String typeOfReissueTransaction) {
        this.typeOfReissueTransaction = typeOfReissueTransaction;
    }


    /**
     * Gets the reissueResultFromTag value for this ReissueInfoType.
     * 
     * @return reissueResultFromTag
     */
    public java.lang.Boolean getReissueResultFromTag() {
        return reissueResultFromTag;
    }


    /**
     * Sets the reissueResultFromTag value for this ReissueInfoType.
     * 
     * @param reissueResultFromTag
     */
    public void setReissueResultFromTag(java.lang.Boolean reissueResultFromTag) {
        this.reissueResultFromTag = reissueResultFromTag;
    }


    /**
     * Gets the formOfRefund value for this ReissueInfoType.
     * 
     * @return formOfRefund
     */
    public java.lang.String getFormOfRefund() {
        return formOfRefund;
    }


    /**
     * Sets the formOfRefund value for this ReissueInfoType.
     * 
     * @param formOfRefund
     */
    public void setFormOfRefund(java.lang.String formOfRefund) {
        this.formOfRefund = formOfRefund;
    }


    /**
     * Gets the reissueRequiresElectronicTicket value for this ReissueInfoType.
     * 
     * @return reissueRequiresElectronicTicket
     */
    public java.lang.Boolean getReissueRequiresElectronicTicket() {
        return reissueRequiresElectronicTicket;
    }


    /**
     * Sets the reissueRequiresElectronicTicket value for this ReissueInfoType.
     * 
     * @param reissueRequiresElectronicTicket
     */
    public void setReissueRequiresElectronicTicket(java.lang.Boolean reissueRequiresElectronicTicket) {
        this.reissueRequiresElectronicTicket = reissueRequiresElectronicTicket;
    }


    /**
     * Gets the reissueDoesNotAllowElectronicTicket value for this ReissueInfoType.
     * 
     * @return reissueDoesNotAllowElectronicTicket
     */
    public java.lang.Boolean getReissueDoesNotAllowElectronicTicket() {
        return reissueDoesNotAllowElectronicTicket;
    }


    /**
     * Sets the reissueDoesNotAllowElectronicTicket value for this ReissueInfoType.
     * 
     * @param reissueDoesNotAllowElectronicTicket
     */
    public void setReissueDoesNotAllowElectronicTicket(java.lang.Boolean reissueDoesNotAllowElectronicTicket) {
        this.reissueDoesNotAllowElectronicTicket = reissueDoesNotAllowElectronicTicket;
    }


    /**
     * Gets the taxRefundable value for this ReissueInfoType.
     * 
     * @return taxRefundable
     */
    public java.lang.Boolean getTaxRefundable() {
        return taxRefundable;
    }


    /**
     * Sets the taxRefundable value for this ReissueInfoType.
     * 
     * @param taxRefundable
     */
    public void setTaxRefundable(java.lang.Boolean taxRefundable) {
        this.taxRefundable = taxRefundable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReissueInfoType)) return false;
        ReissueInfoType other = (ReissueInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeFees==null && other.getChangeFees()==null) || 
             (this.changeFees!=null &&
              this.changeFees.equals(other.getChangeFees()))) &&
            ((this.residualIdicator==null && other.getResidualIdicator()==null) || 
             (this.residualIdicator!=null &&
              this.residualIdicator.equals(other.getResidualIdicator()))) &&
            ((this.typeOfServiceFee==null && other.getTypeOfServiceFee()==null) || 
             (this.typeOfServiceFee!=null &&
              this.typeOfServiceFee.equals(other.getTypeOfServiceFee()))) &&
            ((this.typeOfReissueTransaction==null && other.getTypeOfReissueTransaction()==null) || 
             (this.typeOfReissueTransaction!=null &&
              this.typeOfReissueTransaction.equals(other.getTypeOfReissueTransaction()))) &&
            ((this.reissueResultFromTag==null && other.getReissueResultFromTag()==null) || 
             (this.reissueResultFromTag!=null &&
              this.reissueResultFromTag.equals(other.getReissueResultFromTag()))) &&
            ((this.formOfRefund==null && other.getFormOfRefund()==null) || 
             (this.formOfRefund!=null &&
              this.formOfRefund.equals(other.getFormOfRefund()))) &&
            ((this.reissueRequiresElectronicTicket==null && other.getReissueRequiresElectronicTicket()==null) || 
             (this.reissueRequiresElectronicTicket!=null &&
              this.reissueRequiresElectronicTicket.equals(other.getReissueRequiresElectronicTicket()))) &&
            ((this.reissueDoesNotAllowElectronicTicket==null && other.getReissueDoesNotAllowElectronicTicket()==null) || 
             (this.reissueDoesNotAllowElectronicTicket!=null &&
              this.reissueDoesNotAllowElectronicTicket.equals(other.getReissueDoesNotAllowElectronicTicket()))) &&
            ((this.taxRefundable==null && other.getTaxRefundable()==null) || 
             (this.taxRefundable!=null &&
              this.taxRefundable.equals(other.getTaxRefundable())));
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
        if (getChangeFees() != null) {
            _hashCode += getChangeFees().hashCode();
        }
        if (getResidualIdicator() != null) {
            _hashCode += getResidualIdicator().hashCode();
        }
        if (getTypeOfServiceFee() != null) {
            _hashCode += getTypeOfServiceFee().hashCode();
        }
        if (getTypeOfReissueTransaction() != null) {
            _hashCode += getTypeOfReissueTransaction().hashCode();
        }
        if (getReissueResultFromTag() != null) {
            _hashCode += getReissueResultFromTag().hashCode();
        }
        if (getFormOfRefund() != null) {
            _hashCode += getFormOfRefund().hashCode();
        }
        if (getReissueRequiresElectronicTicket() != null) {
            _hashCode += getReissueRequiresElectronicTicket().hashCode();
        }
        if (getReissueDoesNotAllowElectronicTicket() != null) {
            _hashCode += getReissueDoesNotAllowElectronicTicket().hashCode();
        }
        if (getTaxRefundable() != null) {
            _hashCode += getTaxRefundable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReissueInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ReissueInfoType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("residualIdicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResidualIdicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("typeOfServiceFee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TypeOfServiceFee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("typeOfReissueTransaction");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TypeOfReissueTransaction"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueResultFromTag");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueResultFromTag"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("formOfRefund");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FormOfRefund"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueRequiresElectronicTicket");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueRequiresElectronicTicket"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueDoesNotAllowElectronicTicket");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueDoesNotAllowElectronicTicket"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("taxRefundable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TaxRefundable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ChangeFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ReissueInfoType>ChangeFees"));
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
