
package com.eim.common.constants;

/**
 * Common com.eim.common.constants which are used across applications
 */
public final class EIMServiceConstants
{
	// default private constructor to avoid object creation
	private EIMServiceConstants()
	{
	}

	/* Original message */
	public static final String ORIGINAL_MESSAGE = "OriginalMessage";
	/* Exception message */
	public static final String EXCEPTION_MESSAGE = "ExceptionMessage";

	/* Holds error key for exception handler */
	public static final String EXCEPTION_HANDLER_NOT_HANDLED = "err.ExceptionHandler.unhandled";
	public static final String EXCEPTION_HANDLER_NOT_HANDLED_CODE = "err.ExceptionHandler.unhandled.code";
	public static final String EXCEPTION_INVALID_INPUT = "err.Invalid.InputParam";
	public static final String EXCEPTION_INVALID_INPUT_CODE = "err.Invalid.InputParam.code";
	public static final String EXCEPTION_HANDLER_BUSINESS = "err.ExceptionHandler.business";
	public static final String EXCEPTION_HANDLER_BUSINESS_CODE = "err.ExceptionHandler.business.code";
	public static final String EXCEPTION_HANDLER_PAYLOAD_VALIDATION = "err.ExceptionHandler.payloadvalidation";
	public static final String EXCEPTION_HANDLER_PAYLOAD_VALIDATION_CODE = "err.ExceptionHandler.payloadvalidation.code";
	public static final String MANDATORY_FIELD_MISSING = "err.FieldValidation.mandatory";
	public static final String MANDATORY_FIELD_MISSING_CODE = "err.FieldValidation.mandatory.code";
	public static final String INVALID_DATA = "err.Invalid.Data";
	public static final String INVALID_DATA_CODE = "err.Invalid.Data.code";
	public static final String DAL_ERR_MESSAGE = "err.DAL.message";
	public static final String DAL_ERR_CODE = "err.DAL.code";

	public static final String EXCEPTION_MESSAGE_KEY = "err.ExceptionHandler.message";
	public static final String DEFAULT_ERROR_CODE = "";
	public static final String DEFAULT_ERROR_DESCRIPTION = "FAILURE";

	// no data found - code and message
	public static final String NO_DATA_FOUND_CODE = "1010";
	public static final String NO_DATA_FOUND = "No Data Found";

	public static final String STATUS_CODE = "STATUS_CODE";
	public static final String NO_REQUEST_FOUND_CODE = "1000";
	public static final String NO_REQUEST_FOUND = "Failed to save DC - INVALID request";

	/* Holds error key for alert handler */
	public static final String ALERT_HANDLER_MESSAGE_ONLY = "err.AlertHandler.messageOnly";
	public static final String ALERT_HANDLER_MESSAGE_WITH_ERROR = "err.AlertHandler.messageWithError";

	public static final String SUCCESS = "SUCCESS";
	public static final String LASTUPDATEDATE = "LastUpdatedDate";
	public static final String EFFECTIVEDATE = "EffectiveDate";
	public static final String SUPPLIER_LAST_UPDATED_DATE = "SupplierLastUpdatedDate";
	public static final String CONTRACT_LAST_UPDATED_DATE = "ContractLastUpdatedDate";
	// Common Mandatory Fields
	public static final String COUNTRY_CODE = "Country Code";
	public static final String BANK_COUNTRY_CODE = "Bank Country Code";
	public static final String COUNTRY_CODE_AND_SUPPLIER_ID = "Country Code,Supplier Id";
	public static final String COUNTRY_CODE_AND_LEGACY_SUPPLIER_ID = "Country Code,Legacy Supplier Id";
	public static final String SUPPLIER_CONTRACT_KEYS = "Country Code,Legacy Supplier Id,Department Number,Sequence Number";
	public static final String SUPPLIER_NAME = "Supplier Name,Tax Id";
	public static final String COUNTRY_CODE_AND_SUPPLIER_TYPE = "Country Code,Supplier Type Code";
	public static final String DC_KEYS = "Country Code,Legacy Supplier Id,Department Number,Sequence Number, NodeId";
	public static final String REMIX_KEYS = "Country Code,Legacy Supplier Id,Department Number,Sequence Number, NodeId, isRemix";
	// Camel Endpoints
	public static final String CAMEL_ENDPOINT = "seda:rsServer?waitForTaskToComplete=Always&timeout=600000";
	public static final String CAMEL_ENDPOINT_ACUITY = "seda:rsAcuityServer?waitForTaskToComplete=Always&timeout=600000";
	public static final String CAMEL_ENDPOINT_DNB = "seda:rsDnBServer?waitForTaskToComplete=Always&timeout=600000";
	public static final String CAMEL_ENDPOINT_DNB_CREDIT_HIST = "seda:rsDnbCreditHistoryDetailsServer?waitForTaskToComplete=Always&timeout=600000";
	public static final String CAMEL_ENDPOINT_SUPPLIER = "seda:supplierSearchRest?waitForTaskToComplete=Always&timeout=600000";

	// Search service URL handling
	public static final String SEARCH_SERVICE_FQ_CONDITION_REGEX = "\\s*\\w+:";
	public static final String SEARCH_SERVICE_Q = "q";
	public static final String SEARCH_SERVICE_FQ = "fq";
	public static final String SEARCH_SERVICE_DCNUMBER = "dc_number";
	public static final String SEARCH_SERVICE_DCNUMBERS = "dcnumbers";
	public static final String SEARCH_SERVICE_FL = "fl";
	public static final String ACCEPT_HEADER = "accept";
	public static final String STRING_AND = "AND";
	public static final String SEARCH_SERVICE_STANDARD_CASSANDRA = "cassandra";

	// Contract Search input parameters
	public static final String SEARCH_PARAM_COUNTRY_CODE = "country_code";
	public static final String SEARCH_PARAM_LEGACY_SUPPLIER_ID = "legacy_supplier_id";
	public static final String SEARCH_PARAM_STATUS_CODE = "statusCode";
	public static final String SEARCH_PARAM_STATUS_DESC = "statusDesc";
	public static final String SEARCH_PARAM_DEPT_NUMBER = "dept_number";
	public static final String SEARCH_PARAM_SEQ_NUMBER = "sequence_number";
	public static final String SEARCH_PARAM_CONTRACT_ID = "contractId";
	public static final String SEARCH_PARAM_REMIT_ADDRESS_LINE_ONE = "remitAddressLine1";
	public static final String SEARCH_PARAM_REMIT_CITY = "remitCity";
	public static final String SEARCH_PARAM_REMIT_STATE = "remitState";
	public static final String SEARCH_PARAM_REMIT_ZIP = "remitZip";
	public static final String SEARCH_PARAM_SUPPLIER_NAME = "supplierName";
	public static final String SEARCH_PARAM_LEGAL_NAME = "legalName";
	public static final String SEARCH_PARAM_ADDL_NAME = "additionalName";
	public static final String EMPTY_STRING = "";
	public static final String TRUE = "true";
	public static final String FALSE = "false";

	public static final String PUT = "PUT";
	public static final String DELETE = "DELETE";
	// Audit type values
	public static final String AUDIT_TYPE_DAILY = "DAILY";
	public static final String AUDIT_TYPE_WEEKLY = "WEEKLY";
	public static final String AUDIT_TYPE_MONTHLY = "MONTHLY";

	// Content Type
	public static final String APPLICATION_JSON = "application/json";

	// authentication constants
	public static final String HEADER_AUTH = "accessCode";
	public static final String DCFREIGHT_AUTH_NAME = "authorization";
	public static final String DCFREIGHT_SECURE_ID = "Authorization";

}
