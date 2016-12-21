/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsPartitions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsPartitions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.CachePartitionType partition;

    private org.opentravel.www.OTA._2003._05.CachePartitionType[] group;

    public OTA_AirLowFareSearchRQTPA_ExtensionsPartitions() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsPartitions(
           org.opentravel.www.OTA._2003._05.CachePartitionType partition,
           org.opentravel.www.OTA._2003._05.CachePartitionType[] group) {
           this.partition = partition;
           this.group = group;
    }


    /**
     * Gets the partition value for this OTA_AirLowFareSearchRQTPA_ExtensionsPartitions.
     * 
     * @return partition
     */
    public org.opentravel.www.OTA._2003._05.CachePartitionType getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this OTA_AirLowFareSearchRQTPA_ExtensionsPartitions.
     * 
     * @param partition
     */
    public void setPartition(org.opentravel.www.OTA._2003._05.CachePartitionType partition) {
        this.partition = partition;
    }


    /**
     * Gets the group value for this OTA_AirLowFareSearchRQTPA_ExtensionsPartitions.
     * 
     * @return group
     */
    public org.opentravel.www.OTA._2003._05.CachePartitionType[] getGroup() {
        return group;
    }


    /**
     * Sets the group value for this OTA_AirLowFareSearchRQTPA_ExtensionsPartitions.
     * 
     * @param group
     */
    public void setGroup(org.opentravel.www.OTA._2003._05.CachePartitionType[] group) {
        this.group = group;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsPartitions)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsPartitions other = (OTA_AirLowFareSearchRQTPA_ExtensionsPartitions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              java.util.Arrays.equals(this.group, other.getGroup())));
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
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup(), i);
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
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsPartitions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>Partitions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CachePartitionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CachePartitionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Partition"));
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
