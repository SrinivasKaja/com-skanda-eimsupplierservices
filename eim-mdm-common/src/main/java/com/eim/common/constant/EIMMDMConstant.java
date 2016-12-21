
package com.eim.common.constant;

/**
 * Class to store generic constant at EIM  level
 */
public final class EIMMDMConstant
{
	/**
	 * Private constructor to prevent instantiation.
	 */
	private EIMMDMConstant()
	{
	}

	/* System properties */
	public static final String LOG_HOME = "LOG_HOME";
	public static final String TC_ENV = "TC_ENV";
	public static final String PROPS_FILE_EXTN = ".properties";
	public static final String SWITCH_FILE_EXTN = ".switch";

	/* Camel End points */
	public static final String SFTP = "sftp";
	public static final String FTP = "ftp";
	public static final String FILE = "file";
	public static final String MQ = "amq";
	public static final String TIMER = "timer";

	/* Camel Constants */
	public static final String CAMEL_SPLIT_INDEX = "CamelSplitIndex";
	public static final String CAMEL_SPLIT_COMPLETE = "CamelSplitComplete";
	public static final String FILE_NAME = "FileName";
	public static final String REQUEST_ID = "RequestId";
	public static final String ORIGINAL_MESSAGE = "OriginalMessage";
	public static final String SOURCE_FILE = "SourceFile";
	public static final String DESTINATION_FILE = "DestinationFile";
	public static final String DESTINATION_DIR = "DestinationDir";
	public static final String SUCCESS_COUNT = "SUCCESS_COUNT";
	public static final String FAILURE_COUNT = "FAILURE_COUNT";
	public static final String TOTAL_COUNT = "TOTAL_COUNT";
	public static final String TOTAL_CONTRACT_COUNT = "TOTAL_CONTRACT_COUNT";
	public static final String TOTAL_DCFREIGHT_COUNT = "TOTAL_DCFREIGHT_COUNT";
	public static final String DELIMITED_STRING = "DELIMITED_STRING";

	/* Generic Constants */
	public static final String HYPHEN = "-";
	public static final String COLON = ":";
	public static final String COMMA = ",";
	public static final String AT = "@";
	public static final String START_KEY = "[";
	public static final String END_KEY = "]";
	public static final String ARROW_SEPARATOR = "=>";
	public static final String NEW_LINE = "\n";
	public static final String UNDERSCORE = "_";
	public static final String SPACE = " ";
	public static final String BRACKET_OPEN = "(";
	public static final String BRACKET_CLOSE = ")";
	public static final String DBL_QUOTE_WITH_ESCAPE = "\"";
	public static final String BLANK_STRING = "";
	public static final String PIPE = "|";
	public static final int ZERO = 0;

	/* Audit message constants */
	public static final String EXCEPTION_MESSAGE = "Exception:";
	public static final String AUDIT_ID = "AuditId";
	public static final String INTERFACE_ID = "InterfaceId";
	public static final String TIMESTAMP = "Timestamp";
	public static final String EXCHANGEID = "EXCHANGEID";

	/* Date & time format */
	public static final String DATE_FORMAT = "yyyyMMddhhmmss";
	public static final String DATE_FORMAT_MS = "yyyyMMddHHmmssSSS";
	public static final String REGULAR_DATE_FORMAT = "yyyy-MM-dd";
	public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String TIMESTAMP_FORMAT_DATE = "MM-dd-yyyy HH:mm:ss";
	public static final String DATE_FORMAT_IN_MILSEC = "yyyy-MM-dd-hh.mm.ss.SSS";
	public static final String DATE_TO_STRING_FORMAT = "yyyyMMdd";
	public static final String ZERO_TIMESTAMP = "00:00:00";
	public static final String DATE_FORMAT_AUDIT_SERVICE = "yyyy-MM-dd'T'hh:mm:ss";
	public static final String DATE_FORMAT_SOLR_SERVICE = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	public static final String DATE_FORMAT_XMLGC = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	public static final String DATE_FORMAT_XMLGCIMPL = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String UTC = "UTC";
	public static final String GMT = "GMT";
	public static final String CST = "CST";
	

	public static final String DOT = ".";
	public static final String SINGLE_QUOTE = "'";
	public static final String ASTERIX = "*";
	public static final String SQUARE_BRACKET_OPEN = "[";
	public static final String SQUARE_BRACKET_CLOSE = "]";
	public static final String CURLEY_BRACKET_OPEN = "{";
	public static final String CURLEYE_BRACKET_CLOSE = "}";

	// Debar Reporting Constants
	public static final String SUPPLIER_NAME = "Supplier Name";
	public static final String LEGAL_NAME = "Legal Name";
	public static final String DOING_BUSINESS_AS = "Doing Business As";
	public static final String TAX_ID_TYPE = "Tax ID Type";

	// Yes/No values
	public static final String YES_SHORT = "Y";
	public static final String NO_SHORT = "N";

	public static final String ACTIVE_IND = "Active";
	public static final String INACTIVE_IND = "Inactive";
	public static final String DELETE_IND = "Delete";


	public static final Integer DEAFAULT_ZERO = 0;
	public static final String NAME = "name";
	public static final String QUESTION_MARK = "?";
	public static final String EQUALS = "=";
	public static final String SEMI_COLON = ";";

	public static final String SPECIAL_CHARS[] =
	{ BRACKET_OPEN, BRACKET_CLOSE, HYPHEN, SQUARE_BRACKET_OPEN, SQUARE_BRACKET_CLOSE, CURLEY_BRACKET_OPEN,
			CURLEYE_BRACKET_CLOSE, DOT, QUESTION_MARK, EQUALS, SEMI_COLON, DBL_QUOTE_WITH_ESCAPE };
	// Switching Properties: Module name
	public static final String PUB_SUB = "pubSub";
	public static final String DATA_LOADER = "dataLoader";

	// Switching Properties: Directory & file names:
	public static final String PUB_SUB_SWITCH_FILE_PATH = "/EIM_SUPPLIER/supplier-pubsub/switch/";
	public static final String PUB_SUB_SWITCH_FILE_NAME = "supplier-messaging";

	// data loader Properties: Directory & file names:
	public static final String DATA_LOADER_FILE_PATH = "/EIM_SUPPLIER/supplier-loader/properties/";
	public static final String DATA_LOADER_FILE_NAME = "supplier";

	// Switching Properties: values
	public static final String SWITCH_ON = "ON";
	public static final String SWITCH_OFF = "OFF";

	// Numbers
	public static final int INT_MINUS_TEN = -10;
	public static final int INT_ZERO = 0;
	public static final int INT_ONE = 1;
	public static final int INT_TWO = 2;
	public static final int INT_THREE = 3;
	public static final int INT_FOUR = 4;
	public static final int INT_FIVE = 5;
	public static final int INT_TEN = 10;
	public static final int INT_ELEVEN = 11;
	public static final int INT_FIFTEEN = 15;
	public static final int INT_SIXTY = 60;

	// Exceptions
	public static final String NO_SUCH_ALGORITHM_EXCEPTION = "No Such Algorithm exists:";
	public static final String NO_SUCH_PADDING_EXCEPTION = "No Such Padding exists:";
	public static final String BAD_PADDING_EXCEPTION = "Bad Padding:";
	public static final String ILLEGAL_BLOCK_EXCEPTION = "Illegal Block Size:";
	public static final String INVALID_PARAMETER_EXCEPTION = "Invalid Parameter:";
	public static final String INVALID_KEY_EXCEPTION = "Invalid Key exception:";
	public static final String UN_SUPPORTED_ENCODING_EXCEPTION = "UnsupportedEncoding exception:";
	public static final String PARSE_ERROR = "Not able to parse date format";
	public static final String PARSE_DATE_ERROR =  "Not able to parse last updated date format";

	// Entity field names
	public static final String COUNTRY_CODE = "countryCode";
	public static final String LEGACY_SUPPLIER_ID = "legacySupplierId";
	public static final String DEPARTMENT_NUMBER = "deptNumber";
	public static final String SEQUENCE_NUMBER = "sequence_number";
	public static final String ADDRESS_TYPE_CODE = "addressTypeCode";
	public static final String COMPANY_CODE = "companyCode";
	public static final String PURCHASING_ORG_ID = "purchasingOrgId";


	public static final String COUNTRY_CODE_CF = "country_code =";
	public static final String LEGACY_SUPPLIER_ID_CF = "legacy_supplier_id =";
	public static final String DEPT_NUMBER = "dept_number =";
	public static final String SEQUENCE_NUMBER_CF = "sequence_number =";
	public static final String DC_NUMBER = "dc_number" ;
	// SUCCESS & FAILURE
	public static final String SUCCESS = "SUCCESS";
	public static final String FAILURE = "FAIL";
	public static final String UPDATE_QUERY = "update dcfreightterms set hvdc_remix_flag =";
	public static final String SELECT_QUERY = "select country_code,legacy_supplier_id,dept_number,sequence_number,dc_number,"
			+ "supplier_name,hvdc_remix_flag,supplier_freight_billing_type_code,supplier_transport_method_code,supplier_transport_type_code,shipment_whse_location_code,"
			+ "po_message_code,shipment_load_type_code,last_updated_userid,last_updated_date from dcfreightterms  where country_code =";
	public static final String SELECT = "select ";
	public static final String ALLOWANCE_QUERY = " from dcfreightterms  where country_code =";
	public static final String CLOSE_QUERY = "= ?;";
	public static final String WHERE = "where";
	public static final String NOT_AVAILABLE = "NA";
	public static final String DEFAULT_CONTRACT_ADDRESS_TYPE_CODE_1 = "100019";
	public static final String DEFAULT_CONTRACT_ADDRESS_TYPE_CODE_2 = "WMT06";
	// Rest service method name
	public static final String SUPPLIER_BANK_INFO_METHOD = "getBankDetails";
	public static final String SUPPLIER_DIVERSITY_INFO_METHOD = "getDiversityDetails";
	public static final String SUPPLIER_REPRESENTATIVE_INFO_METHOD = "getRepresentativeDetails";
	public static final String SUPPLIER_IDENTIFICATION_INFO_METHOD = "getIdentificationDetails";
	public static final String CONTRACT_ALLOWANCE_METHOD = "getContractAllowance";
	public static final String CONTRACT_SHIP_POINT_METHOD = "getShipPointDetails";
	
	public static final String DEFAULT_DC_NUMBERS = "default.dc.numbers";
	public static final String SHIPTO_LOCATION2_DEPT_NBRS = "shipto.location2.dept.numbers";
	public static final String VND_FREIGHT_BASIS = "vnd.freight.basis";
	public static final String VND_TRANSPORT_METHOD_CODE= "vnd.transport.method.code";
	public static final String VND_TRANSPORT_TYPE_CODE= "vnd.transport.type.code";
	public static final String VND_SHIPTO_LOCATION1= "vnd.shipto.location1";
	public static final String VND_SHIPTO_LOCATION2= "vnd.shipto.location2";
	public static final String VND_PO_MESSAGE_IDX= "vnd.po.message.idx";
	public static final String VND_LOAD_TYPE_CODE= "vnd.load.type.code";
	
	// queue constants
	public static final long TWENTY_FOUR_HOURS = 86400000;
	public static final String JMS_EXPIRY = "JMSEXPIRY";
	public static final String JMS_PRIORITY = "JMSPriority";
	public static final int DEFAULT_PRIORITY = 4;


}
