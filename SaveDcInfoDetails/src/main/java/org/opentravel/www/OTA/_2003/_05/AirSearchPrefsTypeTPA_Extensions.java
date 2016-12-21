/**
 * AirSearchPrefsTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_Extensions  implements java.io.Serializable {
    /* This should be of the form HHMMHHMM. */
    private java.lang.String departureWindow;

    /* This should be of the form HHMMHHMM. */
    private java.lang.String arrivalWindow;

    /* This element allows a user to exclude certain carriers from
     * the search. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeVendorPref[] excludeVendorPref;

    /* Consider only these alliances. */
    private org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref;

    /* Do not consider these alliances. */
    private org.opentravel.www.OTA._2003._05.AllianceType[] excludeAlliancePref;

    private org.opentravel.www.OTA._2003._05.NumTripsType numTrips;

    private org.opentravel.www.OTA._2003._05.AltCitiesCombinationsType altCitiesCombinations;

    /* This element allows a user to specify the number of itineraries
     * with special routing returned. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumTripsWithRouting numTripsWithRouting;

    private org.opentravel.www.OTA._2003._05.OnlineIndicator onlineIndicator;

    private org.opentravel.www.OTA._2003._05.InterlineIndicator interlineIndicator;

    /* Specify air trip type. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTripType tripType;

    /* Maximum price returned from LFE service. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxPrice maxPrice;

    /* Restrict content type returned by LFE service. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsContentType contentType;

    /* Domestic maximum connecting hours. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDomesticLayoverTime domesticLayoverTime;

    /* Change minimum and maximum connect time per connection in long
     * connection schedules if Long Connect Time logic is enabled. Specified
     * values should be less than 1440 minutes (24 hours). */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectTime longConnectTime;

    /* Minimum and maximum number of connection points (not necessarily
     * long) for Long Connections. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints longConnectPoints;

    /* Return air service only. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAirServiceOnly airServiceOnly;

    /* Return jet service only. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsJetServiceOnly jetServiceOnly;

    /* Same airport at connection point restriction */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameConnectionAirportOnly sameConnectionAirportOnly;

    /* Same airport at origin point restriction */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameOriginAirportOnly sameOriginAirportOnly;

    /* Same airport at turnaround point restriction */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameTurnaroundAirportOnly sameTurnaroundAirportOnly;

    /* Aircraft type penalty (in dollars). Used to penalize propeller
     * aircraft type in the response. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAircraftTypePenalty aircraftTypePenalty;

    /* Alternate airport penalty (in dollars). Used to penalize options
     * with alternate airports. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAlternateAirportPenalty alternateAirportPenalty;

    /* % ESV value above the lowest itinerary */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareAmountThreshold fareAmountThreshold;

    /* Number of low fare solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfLowFareSol numOfLowFareSol;

    /* Number of must price online solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceOnlSol numOfMustPriceOnlSol;

    /* Number of must price interline solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceInrlSol numOfMustPriceInrlSol;

    /* Number of must price non-stop online solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpOnlSol numOfMustPriceNStpOnlSol;

    /* Number of must price non-stop interline solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpInrlSol numOfMustPriceNStpInrlSol;

    /* Number of must price single stop online solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceSStopOnlSol numOfMustPriceSStopOnlSol;

    /* Stop penalty in dollars for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsStpPenaltyInUSD stpPenaltyInUSD;

    /* Duration penalty in dollars for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDurPenaltyInUSD durPenaltyInUSD;

    /* Departure penalty in dollars for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDepPenaltyInUSD depPenaltyInUSD;

    /* Max allowed must price overage per carrier for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedMustPriceOveragePerCrr maxAllowedMustPriceOveragePerCrr;

    /* Flight option reuse limit (must price) for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptMustPriceReuseLimit fltOptMustPriceReuseLimit;

    /* Upper bound factor for not non-stops (must price) for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNotNonStp upperBoundMustPriceFactorForNotNonStp;

    /* Low fare search upper bound factor for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundLFSFactor upperBoundLFSFactor;

    /* Number of must price non-stop/one-stop online solutions for
     * ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpOnlSol numOfMustPriceNStp1StpOnlSol;

    /* Number of must price non-stop/one-stop interline solutions
     * for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpInrlSol numOfMustPriceNStp1StpInrlSol;

    /* Upper bound factor for non-stops (must price) for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNonStp upperBoundMustPriceFactorForNonStp;

    /* Low fare search max allowed overage per carrier % for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedLFSOveragePerCrrPercent maxAllowedLFSOveragePerCrrPercent;

    /* Low fare search target minimum number of online solutions per
     * carrier for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSOnlSolPerCrr targetMinNumOfLFSOnlSolPerCrr;

    /* Low fare search target minimum number of total online solutions
     * % for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSTotOnlSolPercent targetMinNumOfLFSTotOnlSolPercent;

    /* Low fare search flight option reuse limit for non AVS for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForNonAVS fltOptLFSReuseLimitForNonAVS;

    /* Low fare search flight option reuse limit for AVS for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForAVS fltOptLFSReuseLimitForAVS;

    /* AVS penalty carrier list (| delimited) for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAvsPenaltyCrrs avsPenaltyCrrs;

    /* Max number of nonstop online solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpOnlSol maxNumOfNonStpOnlSol;

    /* Max number of nonstop interline solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpInrlSol maxNumOfNonStpInrlSol;

    /* Max number of single stop online solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfSingleStpOnlSol maxNumOfSingleStpOnlSol;

    /* Max number of 2+ stops solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOf2PlusStpSol maxNumOf2PlusStpSol;

    /* Min allowed overage per carrier % for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrrPercent minAllowedOveragePerCrrPercent;

    /* Min allowed overage per carrier for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrr minAllowedOveragePerCrr;

    /* Max relative fare level of x for nonstops for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForNonStp maxRelFareLvlOfxForNonStp;

    /* Max relative fare level of x for carrier for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForCnx maxRelFareLvlOfxForCnx;

    /* Number of must price 2+ stops solutions for ESV2 */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPrice2PlusStpSol numOfMustPrice2PlusStpSol;

    /* Number of preffered/good itins to price */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsItineraryNumberThreshold itineraryNumberThreshold;

    private org.opentravel.www.OTA._2003._05.XOFaresType XOFares;

    /* Exempt all taxes (/TE) */
    private org.opentravel.www.OTA._2003._05.ExemptAllTaxes exemptAllTaxes;

    /* Exempt all taxes and fees (/TN) */
    private org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees exemptAllTaxesAndFees;

    /* Specify Taxes (/TX) */
    private org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] taxes;

    /* Exempt Tax (/TE) */
    private org.opentravel.www.OTA._2003._05.TaxCodeType[] exemptTax;

    private org.opentravel.www.OTA._2003._05.FlightStopsAsConnectionsType flightStopsAsConnections;

    /* Settings specific to Ticketing Sum of Locals processing */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTicketingSumOfLocals ticketingSumOfLocals;

    /* Settings specific to Multi Airport Codes processing */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMultiAirportCodes multiAirportCodes;

    private org.opentravel.www.OTA._2003._05.JumpCabinLogicType jumpCabinLogic;

    private org.opentravel.www.OTA._2003._05.KeepSameCabinType keepSameCabin;

    private org.opentravel.www.OTA._2003._05.GoverningCarrierOverrideType governingCarrierOverride;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeCallDirectCarriers excludeCallDirectCarriers;

    private org.opentravel.www.OTA._2003._05.ValidatingCarrierTypePreference[] validatingCarrier;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck validatingCarrierCheck;

    private java.lang.String settlementMethod;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFlightRepeatLimit flightRepeatLimit;

    private org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParameters[] flexibleFares;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParameters diversityParameters;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAdditionalFareLimit additionalFareLimit;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareFocusRules fareFocusRules;

    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevels sellingLevels;

    /* Budget Shopping settings */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsBudget budget;

    /* List of dates/date pairs with different requested number of
     * options */
    private org.opentravel.www.OTA._2003._05.OptionsPerDatePairType[] optionsPerDatePairList;

    /* List of countries to be excluded from processing */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsCountryPref[] countryPref;

    private org.opentravel.www.OTA._2003._05.RetailerRulesTypeRetailerRule[] retailerRules;

    public AirSearchPrefsTypeTPA_Extensions() {
    }

    public AirSearchPrefsTypeTPA_Extensions(
           java.lang.String departureWindow,
           java.lang.String arrivalWindow,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeVendorPref[] excludeVendorPref,
           org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref,
           org.opentravel.www.OTA._2003._05.AllianceType[] excludeAlliancePref,
           org.opentravel.www.OTA._2003._05.NumTripsType numTrips,
           org.opentravel.www.OTA._2003._05.AltCitiesCombinationsType altCitiesCombinations,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumTripsWithRouting numTripsWithRouting,
           org.opentravel.www.OTA._2003._05.OnlineIndicator onlineIndicator,
           org.opentravel.www.OTA._2003._05.InterlineIndicator interlineIndicator,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTripType tripType,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxPrice maxPrice,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsContentType contentType,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDomesticLayoverTime domesticLayoverTime,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectTime longConnectTime,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints longConnectPoints,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAirServiceOnly airServiceOnly,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsJetServiceOnly jetServiceOnly,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameConnectionAirportOnly sameConnectionAirportOnly,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameOriginAirportOnly sameOriginAirportOnly,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameTurnaroundAirportOnly sameTurnaroundAirportOnly,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAircraftTypePenalty aircraftTypePenalty,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAlternateAirportPenalty alternateAirportPenalty,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareAmountThreshold fareAmountThreshold,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfLowFareSol numOfLowFareSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceOnlSol numOfMustPriceOnlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceInrlSol numOfMustPriceInrlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpOnlSol numOfMustPriceNStpOnlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpInrlSol numOfMustPriceNStpInrlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceSStopOnlSol numOfMustPriceSStopOnlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsStpPenaltyInUSD stpPenaltyInUSD,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDurPenaltyInUSD durPenaltyInUSD,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDepPenaltyInUSD depPenaltyInUSD,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedMustPriceOveragePerCrr maxAllowedMustPriceOveragePerCrr,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptMustPriceReuseLimit fltOptMustPriceReuseLimit,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNotNonStp upperBoundMustPriceFactorForNotNonStp,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundLFSFactor upperBoundLFSFactor,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpOnlSol numOfMustPriceNStp1StpOnlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpInrlSol numOfMustPriceNStp1StpInrlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNonStp upperBoundMustPriceFactorForNonStp,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedLFSOveragePerCrrPercent maxAllowedLFSOveragePerCrrPercent,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSOnlSolPerCrr targetMinNumOfLFSOnlSolPerCrr,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSTotOnlSolPercent targetMinNumOfLFSTotOnlSolPercent,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForNonAVS fltOptLFSReuseLimitForNonAVS,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForAVS fltOptLFSReuseLimitForAVS,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAvsPenaltyCrrs avsPenaltyCrrs,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpOnlSol maxNumOfNonStpOnlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpInrlSol maxNumOfNonStpInrlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfSingleStpOnlSol maxNumOfSingleStpOnlSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOf2PlusStpSol maxNumOf2PlusStpSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrrPercent minAllowedOveragePerCrrPercent,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrr minAllowedOveragePerCrr,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForNonStp maxRelFareLvlOfxForNonStp,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForCnx maxRelFareLvlOfxForCnx,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPrice2PlusStpSol numOfMustPrice2PlusStpSol,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsItineraryNumberThreshold itineraryNumberThreshold,
           org.opentravel.www.OTA._2003._05.XOFaresType XOFares,
           org.opentravel.www.OTA._2003._05.ExemptAllTaxes exemptAllTaxes,
           org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees exemptAllTaxesAndFees,
           org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] taxes,
           org.opentravel.www.OTA._2003._05.TaxCodeType[] exemptTax,
           org.opentravel.www.OTA._2003._05.FlightStopsAsConnectionsType flightStopsAsConnections,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTicketingSumOfLocals ticketingSumOfLocals,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMultiAirportCodes multiAirportCodes,
           org.opentravel.www.OTA._2003._05.JumpCabinLogicType jumpCabinLogic,
           org.opentravel.www.OTA._2003._05.KeepSameCabinType keepSameCabin,
           org.opentravel.www.OTA._2003._05.GoverningCarrierOverrideType governingCarrierOverride,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeCallDirectCarriers excludeCallDirectCarriers,
           org.opentravel.www.OTA._2003._05.ValidatingCarrierTypePreference[] validatingCarrier,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck validatingCarrierCheck,
           java.lang.String settlementMethod,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFlightRepeatLimit flightRepeatLimit,
           org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParameters[] flexibleFares,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParameters diversityParameters,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAdditionalFareLimit additionalFareLimit,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareFocusRules fareFocusRules,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevels sellingLevels,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsBudget budget,
           org.opentravel.www.OTA._2003._05.OptionsPerDatePairType[] optionsPerDatePairList,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsCountryPref[] countryPref,
           org.opentravel.www.OTA._2003._05.RetailerRulesTypeRetailerRule[] retailerRules) {
           this.departureWindow = departureWindow;
           this.arrivalWindow = arrivalWindow;
           this.excludeVendorPref = excludeVendorPref;
           this.includeAlliancePref = includeAlliancePref;
           this.excludeAlliancePref = excludeAlliancePref;
           this.numTrips = numTrips;
           this.altCitiesCombinations = altCitiesCombinations;
           this.numTripsWithRouting = numTripsWithRouting;
           this.onlineIndicator = onlineIndicator;
           this.interlineIndicator = interlineIndicator;
           this.tripType = tripType;
           this.maxPrice = maxPrice;
           this.contentType = contentType;
           this.domesticLayoverTime = domesticLayoverTime;
           this.longConnectTime = longConnectTime;
           this.longConnectPoints = longConnectPoints;
           this.airServiceOnly = airServiceOnly;
           this.jetServiceOnly = jetServiceOnly;
           this.sameConnectionAirportOnly = sameConnectionAirportOnly;
           this.sameOriginAirportOnly = sameOriginAirportOnly;
           this.sameTurnaroundAirportOnly = sameTurnaroundAirportOnly;
           this.aircraftTypePenalty = aircraftTypePenalty;
           this.alternateAirportPenalty = alternateAirportPenalty;
           this.fareAmountThreshold = fareAmountThreshold;
           this.numOfLowFareSol = numOfLowFareSol;
           this.numOfMustPriceOnlSol = numOfMustPriceOnlSol;
           this.numOfMustPriceInrlSol = numOfMustPriceInrlSol;
           this.numOfMustPriceNStpOnlSol = numOfMustPriceNStpOnlSol;
           this.numOfMustPriceNStpInrlSol = numOfMustPriceNStpInrlSol;
           this.numOfMustPriceSStopOnlSol = numOfMustPriceSStopOnlSol;
           this.stpPenaltyInUSD = stpPenaltyInUSD;
           this.durPenaltyInUSD = durPenaltyInUSD;
           this.depPenaltyInUSD = depPenaltyInUSD;
           this.maxAllowedMustPriceOveragePerCrr = maxAllowedMustPriceOveragePerCrr;
           this.fltOptMustPriceReuseLimit = fltOptMustPriceReuseLimit;
           this.upperBoundMustPriceFactorForNotNonStp = upperBoundMustPriceFactorForNotNonStp;
           this.upperBoundLFSFactor = upperBoundLFSFactor;
           this.numOfMustPriceNStp1StpOnlSol = numOfMustPriceNStp1StpOnlSol;
           this.numOfMustPriceNStp1StpInrlSol = numOfMustPriceNStp1StpInrlSol;
           this.upperBoundMustPriceFactorForNonStp = upperBoundMustPriceFactorForNonStp;
           this.maxAllowedLFSOveragePerCrrPercent = maxAllowedLFSOveragePerCrrPercent;
           this.targetMinNumOfLFSOnlSolPerCrr = targetMinNumOfLFSOnlSolPerCrr;
           this.targetMinNumOfLFSTotOnlSolPercent = targetMinNumOfLFSTotOnlSolPercent;
           this.fltOptLFSReuseLimitForNonAVS = fltOptLFSReuseLimitForNonAVS;
           this.fltOptLFSReuseLimitForAVS = fltOptLFSReuseLimitForAVS;
           this.avsPenaltyCrrs = avsPenaltyCrrs;
           this.maxNumOfNonStpOnlSol = maxNumOfNonStpOnlSol;
           this.maxNumOfNonStpInrlSol = maxNumOfNonStpInrlSol;
           this.maxNumOfSingleStpOnlSol = maxNumOfSingleStpOnlSol;
           this.maxNumOf2PlusStpSol = maxNumOf2PlusStpSol;
           this.minAllowedOveragePerCrrPercent = minAllowedOveragePerCrrPercent;
           this.minAllowedOveragePerCrr = minAllowedOveragePerCrr;
           this.maxRelFareLvlOfxForNonStp = maxRelFareLvlOfxForNonStp;
           this.maxRelFareLvlOfxForCnx = maxRelFareLvlOfxForCnx;
           this.numOfMustPrice2PlusStpSol = numOfMustPrice2PlusStpSol;
           this.itineraryNumberThreshold = itineraryNumberThreshold;
           this.XOFares = XOFares;
           this.exemptAllTaxes = exemptAllTaxes;
           this.exemptAllTaxesAndFees = exemptAllTaxesAndFees;
           this.taxes = taxes;
           this.exemptTax = exemptTax;
           this.flightStopsAsConnections = flightStopsAsConnections;
           this.ticketingSumOfLocals = ticketingSumOfLocals;
           this.multiAirportCodes = multiAirportCodes;
           this.jumpCabinLogic = jumpCabinLogic;
           this.keepSameCabin = keepSameCabin;
           this.governingCarrierOverride = governingCarrierOverride;
           this.excludeCallDirectCarriers = excludeCallDirectCarriers;
           this.validatingCarrier = validatingCarrier;
           this.validatingCarrierCheck = validatingCarrierCheck;
           this.settlementMethod = settlementMethod;
           this.flightRepeatLimit = flightRepeatLimit;
           this.flexibleFares = flexibleFares;
           this.diversityParameters = diversityParameters;
           this.additionalFareLimit = additionalFareLimit;
           this.fareFocusRules = fareFocusRules;
           this.sellingLevels = sellingLevels;
           this.budget = budget;
           this.optionsPerDatePairList = optionsPerDatePairList;
           this.countryPref = countryPref;
           this.retailerRules = retailerRules;
    }


    /**
     * Gets the departureWindow value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return departureWindow   * This should be of the form HHMMHHMM.
     */
    public java.lang.String getDepartureWindow() {
        return departureWindow;
    }


    /**
     * Sets the departureWindow value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param departureWindow   * This should be of the form HHMMHHMM.
     */
    public void setDepartureWindow(java.lang.String departureWindow) {
        this.departureWindow = departureWindow;
    }


    /**
     * Gets the arrivalWindow value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return arrivalWindow   * This should be of the form HHMMHHMM.
     */
    public java.lang.String getArrivalWindow() {
        return arrivalWindow;
    }


    /**
     * Sets the arrivalWindow value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param arrivalWindow   * This should be of the form HHMMHHMM.
     */
    public void setArrivalWindow(java.lang.String arrivalWindow) {
        this.arrivalWindow = arrivalWindow;
    }


    /**
     * Gets the excludeVendorPref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return excludeVendorPref   * This element allows a user to exclude certain carriers from
     * the search.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeVendorPref[] getExcludeVendorPref() {
        return excludeVendorPref;
    }


    /**
     * Sets the excludeVendorPref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param excludeVendorPref   * This element allows a user to exclude certain carriers from
     * the search.
     */
    public void setExcludeVendorPref(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeVendorPref[] excludeVendorPref) {
        this.excludeVendorPref = excludeVendorPref;
    }

    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeVendorPref getExcludeVendorPref(int i) {
        return this.excludeVendorPref[i];
    }

    public void setExcludeVendorPref(int i, org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeVendorPref _value) {
        this.excludeVendorPref[i] = _value;
    }


    /**
     * Gets the includeAlliancePref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return includeAlliancePref   * Consider only these alliances.
     */
    public org.opentravel.www.OTA._2003._05.AllianceType[] getIncludeAlliancePref() {
        return includeAlliancePref;
    }


    /**
     * Sets the includeAlliancePref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param includeAlliancePref   * Consider only these alliances.
     */
    public void setIncludeAlliancePref(org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref) {
        this.includeAlliancePref = includeAlliancePref;
    }

    public org.opentravel.www.OTA._2003._05.AllianceType getIncludeAlliancePref(int i) {
        return this.includeAlliancePref[i];
    }

    public void setIncludeAlliancePref(int i, org.opentravel.www.OTA._2003._05.AllianceType _value) {
        this.includeAlliancePref[i] = _value;
    }


    /**
     * Gets the excludeAlliancePref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return excludeAlliancePref   * Do not consider these alliances.
     */
    public org.opentravel.www.OTA._2003._05.AllianceType[] getExcludeAlliancePref() {
        return excludeAlliancePref;
    }


    /**
     * Sets the excludeAlliancePref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param excludeAlliancePref   * Do not consider these alliances.
     */
    public void setExcludeAlliancePref(org.opentravel.www.OTA._2003._05.AllianceType[] excludeAlliancePref) {
        this.excludeAlliancePref = excludeAlliancePref;
    }

    public org.opentravel.www.OTA._2003._05.AllianceType getExcludeAlliancePref(int i) {
        return this.excludeAlliancePref[i];
    }

    public void setExcludeAlliancePref(int i, org.opentravel.www.OTA._2003._05.AllianceType _value) {
        this.excludeAlliancePref[i] = _value;
    }


    /**
     * Gets the numTrips value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numTrips
     */
    public org.opentravel.www.OTA._2003._05.NumTripsType getNumTrips() {
        return numTrips;
    }


    /**
     * Sets the numTrips value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numTrips
     */
    public void setNumTrips(org.opentravel.www.OTA._2003._05.NumTripsType numTrips) {
        this.numTrips = numTrips;
    }


    /**
     * Gets the altCitiesCombinations value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return altCitiesCombinations
     */
    public org.opentravel.www.OTA._2003._05.AltCitiesCombinationsType getAltCitiesCombinations() {
        return altCitiesCombinations;
    }


    /**
     * Sets the altCitiesCombinations value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param altCitiesCombinations
     */
    public void setAltCitiesCombinations(org.opentravel.www.OTA._2003._05.AltCitiesCombinationsType altCitiesCombinations) {
        this.altCitiesCombinations = altCitiesCombinations;
    }


    /**
     * Gets the numTripsWithRouting value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numTripsWithRouting   * This element allows a user to specify the number of itineraries
     * with special routing returned.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumTripsWithRouting getNumTripsWithRouting() {
        return numTripsWithRouting;
    }


    /**
     * Sets the numTripsWithRouting value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numTripsWithRouting   * This element allows a user to specify the number of itineraries
     * with special routing returned.
     */
    public void setNumTripsWithRouting(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumTripsWithRouting numTripsWithRouting) {
        this.numTripsWithRouting = numTripsWithRouting;
    }


    /**
     * Gets the onlineIndicator value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return onlineIndicator
     */
    public org.opentravel.www.OTA._2003._05.OnlineIndicator getOnlineIndicator() {
        return onlineIndicator;
    }


    /**
     * Sets the onlineIndicator value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param onlineIndicator
     */
    public void setOnlineIndicator(org.opentravel.www.OTA._2003._05.OnlineIndicator onlineIndicator) {
        this.onlineIndicator = onlineIndicator;
    }


    /**
     * Gets the interlineIndicator value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return interlineIndicator
     */
    public org.opentravel.www.OTA._2003._05.InterlineIndicator getInterlineIndicator() {
        return interlineIndicator;
    }


    /**
     * Sets the interlineIndicator value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param interlineIndicator
     */
    public void setInterlineIndicator(org.opentravel.www.OTA._2003._05.InterlineIndicator interlineIndicator) {
        this.interlineIndicator = interlineIndicator;
    }


    /**
     * Gets the tripType value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return tripType   * Specify air trip type.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTripType getTripType() {
        return tripType;
    }


    /**
     * Sets the tripType value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param tripType   * Specify air trip type.
     */
    public void setTripType(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTripType tripType) {
        this.tripType = tripType;
    }


    /**
     * Gets the maxPrice value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxPrice   * Maximum price returned from LFE service.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxPrice getMaxPrice() {
        return maxPrice;
    }


    /**
     * Sets the maxPrice value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxPrice   * Maximum price returned from LFE service.
     */
    public void setMaxPrice(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxPrice maxPrice) {
        this.maxPrice = maxPrice;
    }


    /**
     * Gets the contentType value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return contentType   * Restrict content type returned by LFE service.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsContentType getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param contentType   * Restrict content type returned by LFE service.
     */
    public void setContentType(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsContentType contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the domesticLayoverTime value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return domesticLayoverTime   * Domestic maximum connecting hours.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDomesticLayoverTime getDomesticLayoverTime() {
        return domesticLayoverTime;
    }


    /**
     * Sets the domesticLayoverTime value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param domesticLayoverTime   * Domestic maximum connecting hours.
     */
    public void setDomesticLayoverTime(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDomesticLayoverTime domesticLayoverTime) {
        this.domesticLayoverTime = domesticLayoverTime;
    }


    /**
     * Gets the longConnectTime value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return longConnectTime   * Change minimum and maximum connect time per connection in long
     * connection schedules if Long Connect Time logic is enabled. Specified
     * values should be less than 1440 minutes (24 hours).
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectTime getLongConnectTime() {
        return longConnectTime;
    }


    /**
     * Sets the longConnectTime value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param longConnectTime   * Change minimum and maximum connect time per connection in long
     * connection schedules if Long Connect Time logic is enabled. Specified
     * values should be less than 1440 minutes (24 hours).
     */
    public void setLongConnectTime(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectTime longConnectTime) {
        this.longConnectTime = longConnectTime;
    }


    /**
     * Gets the longConnectPoints value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return longConnectPoints   * Minimum and maximum number of connection points (not necessarily
     * long) for Long Connections.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints getLongConnectPoints() {
        return longConnectPoints;
    }


    /**
     * Sets the longConnectPoints value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param longConnectPoints   * Minimum and maximum number of connection points (not necessarily
     * long) for Long Connections.
     */
    public void setLongConnectPoints(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints longConnectPoints) {
        this.longConnectPoints = longConnectPoints;
    }


    /**
     * Gets the airServiceOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return airServiceOnly   * Return air service only.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAirServiceOnly getAirServiceOnly() {
        return airServiceOnly;
    }


    /**
     * Sets the airServiceOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param airServiceOnly   * Return air service only.
     */
    public void setAirServiceOnly(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAirServiceOnly airServiceOnly) {
        this.airServiceOnly = airServiceOnly;
    }


    /**
     * Gets the jetServiceOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return jetServiceOnly   * Return jet service only.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsJetServiceOnly getJetServiceOnly() {
        return jetServiceOnly;
    }


    /**
     * Sets the jetServiceOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param jetServiceOnly   * Return jet service only.
     */
    public void setJetServiceOnly(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsJetServiceOnly jetServiceOnly) {
        this.jetServiceOnly = jetServiceOnly;
    }


    /**
     * Gets the sameConnectionAirportOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return sameConnectionAirportOnly   * Same airport at connection point restriction
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameConnectionAirportOnly getSameConnectionAirportOnly() {
        return sameConnectionAirportOnly;
    }


    /**
     * Sets the sameConnectionAirportOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param sameConnectionAirportOnly   * Same airport at connection point restriction
     */
    public void setSameConnectionAirportOnly(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameConnectionAirportOnly sameConnectionAirportOnly) {
        this.sameConnectionAirportOnly = sameConnectionAirportOnly;
    }


    /**
     * Gets the sameOriginAirportOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return sameOriginAirportOnly   * Same airport at origin point restriction
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameOriginAirportOnly getSameOriginAirportOnly() {
        return sameOriginAirportOnly;
    }


    /**
     * Sets the sameOriginAirportOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param sameOriginAirportOnly   * Same airport at origin point restriction
     */
    public void setSameOriginAirportOnly(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameOriginAirportOnly sameOriginAirportOnly) {
        this.sameOriginAirportOnly = sameOriginAirportOnly;
    }


    /**
     * Gets the sameTurnaroundAirportOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return sameTurnaroundAirportOnly   * Same airport at turnaround point restriction
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameTurnaroundAirportOnly getSameTurnaroundAirportOnly() {
        return sameTurnaroundAirportOnly;
    }


    /**
     * Sets the sameTurnaroundAirportOnly value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param sameTurnaroundAirportOnly   * Same airport at turnaround point restriction
     */
    public void setSameTurnaroundAirportOnly(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSameTurnaroundAirportOnly sameTurnaroundAirportOnly) {
        this.sameTurnaroundAirportOnly = sameTurnaroundAirportOnly;
    }


    /**
     * Gets the aircraftTypePenalty value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return aircraftTypePenalty   * Aircraft type penalty (in dollars). Used to penalize propeller
     * aircraft type in the response.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAircraftTypePenalty getAircraftTypePenalty() {
        return aircraftTypePenalty;
    }


    /**
     * Sets the aircraftTypePenalty value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param aircraftTypePenalty   * Aircraft type penalty (in dollars). Used to penalize propeller
     * aircraft type in the response.
     */
    public void setAircraftTypePenalty(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAircraftTypePenalty aircraftTypePenalty) {
        this.aircraftTypePenalty = aircraftTypePenalty;
    }


    /**
     * Gets the alternateAirportPenalty value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return alternateAirportPenalty   * Alternate airport penalty (in dollars). Used to penalize options
     * with alternate airports.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAlternateAirportPenalty getAlternateAirportPenalty() {
        return alternateAirportPenalty;
    }


    /**
     * Sets the alternateAirportPenalty value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param alternateAirportPenalty   * Alternate airport penalty (in dollars). Used to penalize options
     * with alternate airports.
     */
    public void setAlternateAirportPenalty(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAlternateAirportPenalty alternateAirportPenalty) {
        this.alternateAirportPenalty = alternateAirportPenalty;
    }


    /**
     * Gets the fareAmountThreshold value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return fareAmountThreshold   * % ESV value above the lowest itinerary
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareAmountThreshold getFareAmountThreshold() {
        return fareAmountThreshold;
    }


    /**
     * Sets the fareAmountThreshold value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param fareAmountThreshold   * % ESV value above the lowest itinerary
     */
    public void setFareAmountThreshold(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareAmountThreshold fareAmountThreshold) {
        this.fareAmountThreshold = fareAmountThreshold;
    }


    /**
     * Gets the numOfLowFareSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfLowFareSol   * Number of low fare solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfLowFareSol getNumOfLowFareSol() {
        return numOfLowFareSol;
    }


    /**
     * Sets the numOfLowFareSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfLowFareSol   * Number of low fare solutions for ESV2
     */
    public void setNumOfLowFareSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfLowFareSol numOfLowFareSol) {
        this.numOfLowFareSol = numOfLowFareSol;
    }


    /**
     * Gets the numOfMustPriceOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPriceOnlSol   * Number of must price online solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceOnlSol getNumOfMustPriceOnlSol() {
        return numOfMustPriceOnlSol;
    }


    /**
     * Sets the numOfMustPriceOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPriceOnlSol   * Number of must price online solutions for ESV2
     */
    public void setNumOfMustPriceOnlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceOnlSol numOfMustPriceOnlSol) {
        this.numOfMustPriceOnlSol = numOfMustPriceOnlSol;
    }


    /**
     * Gets the numOfMustPriceInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPriceInrlSol   * Number of must price interline solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceInrlSol getNumOfMustPriceInrlSol() {
        return numOfMustPriceInrlSol;
    }


    /**
     * Sets the numOfMustPriceInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPriceInrlSol   * Number of must price interline solutions for ESV2
     */
    public void setNumOfMustPriceInrlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceInrlSol numOfMustPriceInrlSol) {
        this.numOfMustPriceInrlSol = numOfMustPriceInrlSol;
    }


    /**
     * Gets the numOfMustPriceNStpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPriceNStpOnlSol   * Number of must price non-stop online solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpOnlSol getNumOfMustPriceNStpOnlSol() {
        return numOfMustPriceNStpOnlSol;
    }


    /**
     * Sets the numOfMustPriceNStpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPriceNStpOnlSol   * Number of must price non-stop online solutions for ESV2
     */
    public void setNumOfMustPriceNStpOnlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpOnlSol numOfMustPriceNStpOnlSol) {
        this.numOfMustPriceNStpOnlSol = numOfMustPriceNStpOnlSol;
    }


    /**
     * Gets the numOfMustPriceNStpInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPriceNStpInrlSol   * Number of must price non-stop interline solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpInrlSol getNumOfMustPriceNStpInrlSol() {
        return numOfMustPriceNStpInrlSol;
    }


    /**
     * Sets the numOfMustPriceNStpInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPriceNStpInrlSol   * Number of must price non-stop interline solutions for ESV2
     */
    public void setNumOfMustPriceNStpInrlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStpInrlSol numOfMustPriceNStpInrlSol) {
        this.numOfMustPriceNStpInrlSol = numOfMustPriceNStpInrlSol;
    }


    /**
     * Gets the numOfMustPriceSStopOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPriceSStopOnlSol   * Number of must price single stop online solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceSStopOnlSol getNumOfMustPriceSStopOnlSol() {
        return numOfMustPriceSStopOnlSol;
    }


    /**
     * Sets the numOfMustPriceSStopOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPriceSStopOnlSol   * Number of must price single stop online solutions for ESV2
     */
    public void setNumOfMustPriceSStopOnlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceSStopOnlSol numOfMustPriceSStopOnlSol) {
        this.numOfMustPriceSStopOnlSol = numOfMustPriceSStopOnlSol;
    }


    /**
     * Gets the stpPenaltyInUSD value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return stpPenaltyInUSD   * Stop penalty in dollars for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsStpPenaltyInUSD getStpPenaltyInUSD() {
        return stpPenaltyInUSD;
    }


    /**
     * Sets the stpPenaltyInUSD value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param stpPenaltyInUSD   * Stop penalty in dollars for ESV2
     */
    public void setStpPenaltyInUSD(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsStpPenaltyInUSD stpPenaltyInUSD) {
        this.stpPenaltyInUSD = stpPenaltyInUSD;
    }


    /**
     * Gets the durPenaltyInUSD value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return durPenaltyInUSD   * Duration penalty in dollars for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDurPenaltyInUSD getDurPenaltyInUSD() {
        return durPenaltyInUSD;
    }


    /**
     * Sets the durPenaltyInUSD value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param durPenaltyInUSD   * Duration penalty in dollars for ESV2
     */
    public void setDurPenaltyInUSD(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDurPenaltyInUSD durPenaltyInUSD) {
        this.durPenaltyInUSD = durPenaltyInUSD;
    }


    /**
     * Gets the depPenaltyInUSD value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return depPenaltyInUSD   * Departure penalty in dollars for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDepPenaltyInUSD getDepPenaltyInUSD() {
        return depPenaltyInUSD;
    }


    /**
     * Sets the depPenaltyInUSD value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param depPenaltyInUSD   * Departure penalty in dollars for ESV2
     */
    public void setDepPenaltyInUSD(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDepPenaltyInUSD depPenaltyInUSD) {
        this.depPenaltyInUSD = depPenaltyInUSD;
    }


    /**
     * Gets the maxAllowedMustPriceOveragePerCrr value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxAllowedMustPriceOveragePerCrr   * Max allowed must price overage per carrier for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedMustPriceOveragePerCrr getMaxAllowedMustPriceOveragePerCrr() {
        return maxAllowedMustPriceOveragePerCrr;
    }


    /**
     * Sets the maxAllowedMustPriceOveragePerCrr value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxAllowedMustPriceOveragePerCrr   * Max allowed must price overage per carrier for ESV2
     */
    public void setMaxAllowedMustPriceOveragePerCrr(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedMustPriceOveragePerCrr maxAllowedMustPriceOveragePerCrr) {
        this.maxAllowedMustPriceOveragePerCrr = maxAllowedMustPriceOveragePerCrr;
    }


    /**
     * Gets the fltOptMustPriceReuseLimit value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return fltOptMustPriceReuseLimit   * Flight option reuse limit (must price) for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptMustPriceReuseLimit getFltOptMustPriceReuseLimit() {
        return fltOptMustPriceReuseLimit;
    }


    /**
     * Sets the fltOptMustPriceReuseLimit value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param fltOptMustPriceReuseLimit   * Flight option reuse limit (must price) for ESV2
     */
    public void setFltOptMustPriceReuseLimit(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptMustPriceReuseLimit fltOptMustPriceReuseLimit) {
        this.fltOptMustPriceReuseLimit = fltOptMustPriceReuseLimit;
    }


    /**
     * Gets the upperBoundMustPriceFactorForNotNonStp value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return upperBoundMustPriceFactorForNotNonStp   * Upper bound factor for not non-stops (must price) for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNotNonStp getUpperBoundMustPriceFactorForNotNonStp() {
        return upperBoundMustPriceFactorForNotNonStp;
    }


    /**
     * Sets the upperBoundMustPriceFactorForNotNonStp value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param upperBoundMustPriceFactorForNotNonStp   * Upper bound factor for not non-stops (must price) for ESV2
     */
    public void setUpperBoundMustPriceFactorForNotNonStp(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNotNonStp upperBoundMustPriceFactorForNotNonStp) {
        this.upperBoundMustPriceFactorForNotNonStp = upperBoundMustPriceFactorForNotNonStp;
    }


    /**
     * Gets the upperBoundLFSFactor value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return upperBoundLFSFactor   * Low fare search upper bound factor for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundLFSFactor getUpperBoundLFSFactor() {
        return upperBoundLFSFactor;
    }


    /**
     * Sets the upperBoundLFSFactor value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param upperBoundLFSFactor   * Low fare search upper bound factor for ESV2
     */
    public void setUpperBoundLFSFactor(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundLFSFactor upperBoundLFSFactor) {
        this.upperBoundLFSFactor = upperBoundLFSFactor;
    }


    /**
     * Gets the numOfMustPriceNStp1StpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPriceNStp1StpOnlSol   * Number of must price non-stop/one-stop online solutions for
     * ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpOnlSol getNumOfMustPriceNStp1StpOnlSol() {
        return numOfMustPriceNStp1StpOnlSol;
    }


    /**
     * Sets the numOfMustPriceNStp1StpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPriceNStp1StpOnlSol   * Number of must price non-stop/one-stop online solutions for
     * ESV2
     */
    public void setNumOfMustPriceNStp1StpOnlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpOnlSol numOfMustPriceNStp1StpOnlSol) {
        this.numOfMustPriceNStp1StpOnlSol = numOfMustPriceNStp1StpOnlSol;
    }


    /**
     * Gets the numOfMustPriceNStp1StpInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPriceNStp1StpInrlSol   * Number of must price non-stop/one-stop interline solutions
     * for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpInrlSol getNumOfMustPriceNStp1StpInrlSol() {
        return numOfMustPriceNStp1StpInrlSol;
    }


    /**
     * Sets the numOfMustPriceNStp1StpInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPriceNStp1StpInrlSol   * Number of must price non-stop/one-stop interline solutions
     * for ESV2
     */
    public void setNumOfMustPriceNStp1StpInrlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPriceNStp1StpInrlSol numOfMustPriceNStp1StpInrlSol) {
        this.numOfMustPriceNStp1StpInrlSol = numOfMustPriceNStp1StpInrlSol;
    }


    /**
     * Gets the upperBoundMustPriceFactorForNonStp value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return upperBoundMustPriceFactorForNonStp   * Upper bound factor for non-stops (must price) for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNonStp getUpperBoundMustPriceFactorForNonStp() {
        return upperBoundMustPriceFactorForNonStp;
    }


    /**
     * Sets the upperBoundMustPriceFactorForNonStp value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param upperBoundMustPriceFactorForNonStp   * Upper bound factor for non-stops (must price) for ESV2
     */
    public void setUpperBoundMustPriceFactorForNonStp(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsUpperBoundMustPriceFactorForNonStp upperBoundMustPriceFactorForNonStp) {
        this.upperBoundMustPriceFactorForNonStp = upperBoundMustPriceFactorForNonStp;
    }


    /**
     * Gets the maxAllowedLFSOveragePerCrrPercent value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxAllowedLFSOveragePerCrrPercent   * Low fare search max allowed overage per carrier % for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedLFSOveragePerCrrPercent getMaxAllowedLFSOveragePerCrrPercent() {
        return maxAllowedLFSOveragePerCrrPercent;
    }


    /**
     * Sets the maxAllowedLFSOveragePerCrrPercent value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxAllowedLFSOveragePerCrrPercent   * Low fare search max allowed overage per carrier % for ESV2
     */
    public void setMaxAllowedLFSOveragePerCrrPercent(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxAllowedLFSOveragePerCrrPercent maxAllowedLFSOveragePerCrrPercent) {
        this.maxAllowedLFSOveragePerCrrPercent = maxAllowedLFSOveragePerCrrPercent;
    }


    /**
     * Gets the targetMinNumOfLFSOnlSolPerCrr value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return targetMinNumOfLFSOnlSolPerCrr   * Low fare search target minimum number of online solutions per
     * carrier for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSOnlSolPerCrr getTargetMinNumOfLFSOnlSolPerCrr() {
        return targetMinNumOfLFSOnlSolPerCrr;
    }


    /**
     * Sets the targetMinNumOfLFSOnlSolPerCrr value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param targetMinNumOfLFSOnlSolPerCrr   * Low fare search target minimum number of online solutions per
     * carrier for ESV2
     */
    public void setTargetMinNumOfLFSOnlSolPerCrr(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSOnlSolPerCrr targetMinNumOfLFSOnlSolPerCrr) {
        this.targetMinNumOfLFSOnlSolPerCrr = targetMinNumOfLFSOnlSolPerCrr;
    }


    /**
     * Gets the targetMinNumOfLFSTotOnlSolPercent value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return targetMinNumOfLFSTotOnlSolPercent   * Low fare search target minimum number of total online solutions
     * % for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSTotOnlSolPercent getTargetMinNumOfLFSTotOnlSolPercent() {
        return targetMinNumOfLFSTotOnlSolPercent;
    }


    /**
     * Sets the targetMinNumOfLFSTotOnlSolPercent value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param targetMinNumOfLFSTotOnlSolPercent   * Low fare search target minimum number of total online solutions
     * % for ESV2
     */
    public void setTargetMinNumOfLFSTotOnlSolPercent(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTargetMinNumOfLFSTotOnlSolPercent targetMinNumOfLFSTotOnlSolPercent) {
        this.targetMinNumOfLFSTotOnlSolPercent = targetMinNumOfLFSTotOnlSolPercent;
    }


    /**
     * Gets the fltOptLFSReuseLimitForNonAVS value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return fltOptLFSReuseLimitForNonAVS   * Low fare search flight option reuse limit for non AVS for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForNonAVS getFltOptLFSReuseLimitForNonAVS() {
        return fltOptLFSReuseLimitForNonAVS;
    }


    /**
     * Sets the fltOptLFSReuseLimitForNonAVS value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param fltOptLFSReuseLimitForNonAVS   * Low fare search flight option reuse limit for non AVS for ESV2
     */
    public void setFltOptLFSReuseLimitForNonAVS(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForNonAVS fltOptLFSReuseLimitForNonAVS) {
        this.fltOptLFSReuseLimitForNonAVS = fltOptLFSReuseLimitForNonAVS;
    }


    /**
     * Gets the fltOptLFSReuseLimitForAVS value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return fltOptLFSReuseLimitForAVS   * Low fare search flight option reuse limit for AVS for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForAVS getFltOptLFSReuseLimitForAVS() {
        return fltOptLFSReuseLimitForAVS;
    }


    /**
     * Sets the fltOptLFSReuseLimitForAVS value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param fltOptLFSReuseLimitForAVS   * Low fare search flight option reuse limit for AVS for ESV2
     */
    public void setFltOptLFSReuseLimitForAVS(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFltOptLFSReuseLimitForAVS fltOptLFSReuseLimitForAVS) {
        this.fltOptLFSReuseLimitForAVS = fltOptLFSReuseLimitForAVS;
    }


    /**
     * Gets the avsPenaltyCrrs value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return avsPenaltyCrrs   * AVS penalty carrier list (| delimited) for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAvsPenaltyCrrs getAvsPenaltyCrrs() {
        return avsPenaltyCrrs;
    }


    /**
     * Sets the avsPenaltyCrrs value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param avsPenaltyCrrs   * AVS penalty carrier list (| delimited) for ESV2
     */
    public void setAvsPenaltyCrrs(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAvsPenaltyCrrs avsPenaltyCrrs) {
        this.avsPenaltyCrrs = avsPenaltyCrrs;
    }


    /**
     * Gets the maxNumOfNonStpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxNumOfNonStpOnlSol   * Max number of nonstop online solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpOnlSol getMaxNumOfNonStpOnlSol() {
        return maxNumOfNonStpOnlSol;
    }


    /**
     * Sets the maxNumOfNonStpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxNumOfNonStpOnlSol   * Max number of nonstop online solutions for ESV2
     */
    public void setMaxNumOfNonStpOnlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpOnlSol maxNumOfNonStpOnlSol) {
        this.maxNumOfNonStpOnlSol = maxNumOfNonStpOnlSol;
    }


    /**
     * Gets the maxNumOfNonStpInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxNumOfNonStpInrlSol   * Max number of nonstop interline solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpInrlSol getMaxNumOfNonStpInrlSol() {
        return maxNumOfNonStpInrlSol;
    }


    /**
     * Sets the maxNumOfNonStpInrlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxNumOfNonStpInrlSol   * Max number of nonstop interline solutions for ESV2
     */
    public void setMaxNumOfNonStpInrlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfNonStpInrlSol maxNumOfNonStpInrlSol) {
        this.maxNumOfNonStpInrlSol = maxNumOfNonStpInrlSol;
    }


    /**
     * Gets the maxNumOfSingleStpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxNumOfSingleStpOnlSol   * Max number of single stop online solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfSingleStpOnlSol getMaxNumOfSingleStpOnlSol() {
        return maxNumOfSingleStpOnlSol;
    }


    /**
     * Sets the maxNumOfSingleStpOnlSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxNumOfSingleStpOnlSol   * Max number of single stop online solutions for ESV2
     */
    public void setMaxNumOfSingleStpOnlSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOfSingleStpOnlSol maxNumOfSingleStpOnlSol) {
        this.maxNumOfSingleStpOnlSol = maxNumOfSingleStpOnlSol;
    }


    /**
     * Gets the maxNumOf2PlusStpSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxNumOf2PlusStpSol   * Max number of 2+ stops solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOf2PlusStpSol getMaxNumOf2PlusStpSol() {
        return maxNumOf2PlusStpSol;
    }


    /**
     * Sets the maxNumOf2PlusStpSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxNumOf2PlusStpSol   * Max number of 2+ stops solutions for ESV2
     */
    public void setMaxNumOf2PlusStpSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxNumOf2PlusStpSol maxNumOf2PlusStpSol) {
        this.maxNumOf2PlusStpSol = maxNumOf2PlusStpSol;
    }


    /**
     * Gets the minAllowedOveragePerCrrPercent value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return minAllowedOveragePerCrrPercent   * Min allowed overage per carrier % for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrrPercent getMinAllowedOveragePerCrrPercent() {
        return minAllowedOveragePerCrrPercent;
    }


    /**
     * Sets the minAllowedOveragePerCrrPercent value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param minAllowedOveragePerCrrPercent   * Min allowed overage per carrier % for ESV2
     */
    public void setMinAllowedOveragePerCrrPercent(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrrPercent minAllowedOveragePerCrrPercent) {
        this.minAllowedOveragePerCrrPercent = minAllowedOveragePerCrrPercent;
    }


    /**
     * Gets the minAllowedOveragePerCrr value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return minAllowedOveragePerCrr   * Min allowed overage per carrier for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrr getMinAllowedOveragePerCrr() {
        return minAllowedOveragePerCrr;
    }


    /**
     * Sets the minAllowedOveragePerCrr value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param minAllowedOveragePerCrr   * Min allowed overage per carrier for ESV2
     */
    public void setMinAllowedOveragePerCrr(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMinAllowedOveragePerCrr minAllowedOveragePerCrr) {
        this.minAllowedOveragePerCrr = minAllowedOveragePerCrr;
    }


    /**
     * Gets the maxRelFareLvlOfxForNonStp value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxRelFareLvlOfxForNonStp   * Max relative fare level of x for nonstops for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForNonStp getMaxRelFareLvlOfxForNonStp() {
        return maxRelFareLvlOfxForNonStp;
    }


    /**
     * Sets the maxRelFareLvlOfxForNonStp value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxRelFareLvlOfxForNonStp   * Max relative fare level of x for nonstops for ESV2
     */
    public void setMaxRelFareLvlOfxForNonStp(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForNonStp maxRelFareLvlOfxForNonStp) {
        this.maxRelFareLvlOfxForNonStp = maxRelFareLvlOfxForNonStp;
    }


    /**
     * Gets the maxRelFareLvlOfxForCnx value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return maxRelFareLvlOfxForCnx   * Max relative fare level of x for carrier for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForCnx getMaxRelFareLvlOfxForCnx() {
        return maxRelFareLvlOfxForCnx;
    }


    /**
     * Sets the maxRelFareLvlOfxForCnx value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param maxRelFareLvlOfxForCnx   * Max relative fare level of x for carrier for ESV2
     */
    public void setMaxRelFareLvlOfxForCnx(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMaxRelFareLvlOfxForCnx maxRelFareLvlOfxForCnx) {
        this.maxRelFareLvlOfxForCnx = maxRelFareLvlOfxForCnx;
    }


    /**
     * Gets the numOfMustPrice2PlusStpSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return numOfMustPrice2PlusStpSol   * Number of must price 2+ stops solutions for ESV2
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPrice2PlusStpSol getNumOfMustPrice2PlusStpSol() {
        return numOfMustPrice2PlusStpSol;
    }


    /**
     * Sets the numOfMustPrice2PlusStpSol value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param numOfMustPrice2PlusStpSol   * Number of must price 2+ stops solutions for ESV2
     */
    public void setNumOfMustPrice2PlusStpSol(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsNumOfMustPrice2PlusStpSol numOfMustPrice2PlusStpSol) {
        this.numOfMustPrice2PlusStpSol = numOfMustPrice2PlusStpSol;
    }


    /**
     * Gets the itineraryNumberThreshold value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return itineraryNumberThreshold   * Number of preffered/good itins to price
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsItineraryNumberThreshold getItineraryNumberThreshold() {
        return itineraryNumberThreshold;
    }


    /**
     * Sets the itineraryNumberThreshold value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param itineraryNumberThreshold   * Number of preffered/good itins to price
     */
    public void setItineraryNumberThreshold(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsItineraryNumberThreshold itineraryNumberThreshold) {
        this.itineraryNumberThreshold = itineraryNumberThreshold;
    }


    /**
     * Gets the XOFares value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return XOFares
     */
    public org.opentravel.www.OTA._2003._05.XOFaresType getXOFares() {
        return XOFares;
    }


    /**
     * Sets the XOFares value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param XOFares
     */
    public void setXOFares(org.opentravel.www.OTA._2003._05.XOFaresType XOFares) {
        this.XOFares = XOFares;
    }


    /**
     * Gets the exemptAllTaxes value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return exemptAllTaxes   * Exempt all taxes (/TE)
     */
    public org.opentravel.www.OTA._2003._05.ExemptAllTaxes getExemptAllTaxes() {
        return exemptAllTaxes;
    }


    /**
     * Sets the exemptAllTaxes value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param exemptAllTaxes   * Exempt all taxes (/TE)
     */
    public void setExemptAllTaxes(org.opentravel.www.OTA._2003._05.ExemptAllTaxes exemptAllTaxes) {
        this.exemptAllTaxes = exemptAllTaxes;
    }


    /**
     * Gets the exemptAllTaxesAndFees value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return exemptAllTaxesAndFees   * Exempt all taxes and fees (/TN)
     */
    public org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees getExemptAllTaxesAndFees() {
        return exemptAllTaxesAndFees;
    }


    /**
     * Sets the exemptAllTaxesAndFees value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param exemptAllTaxesAndFees   * Exempt all taxes and fees (/TN)
     */
    public void setExemptAllTaxesAndFees(org.opentravel.www.OTA._2003._05.ExemptAllTaxesAndFees exemptAllTaxesAndFees) {
        this.exemptAllTaxesAndFees = exemptAllTaxesAndFees;
    }


    /**
     * Gets the taxes value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return taxes   * Specify Taxes (/TX)
     */
    public org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param taxes   * Specify Taxes (/TX)
     */
    public void setTaxes(org.opentravel.www.OTA._2003._05.TaxCodeAmountType[] taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the exemptTax value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return exemptTax   * Exempt Tax (/TE)
     */
    public org.opentravel.www.OTA._2003._05.TaxCodeType[] getExemptTax() {
        return exemptTax;
    }


    /**
     * Sets the exemptTax value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param exemptTax   * Exempt Tax (/TE)
     */
    public void setExemptTax(org.opentravel.www.OTA._2003._05.TaxCodeType[] exemptTax) {
        this.exemptTax = exemptTax;
    }

    public org.opentravel.www.OTA._2003._05.TaxCodeType getExemptTax(int i) {
        return this.exemptTax[i];
    }

    public void setExemptTax(int i, org.opentravel.www.OTA._2003._05.TaxCodeType _value) {
        this.exemptTax[i] = _value;
    }


    /**
     * Gets the flightStopsAsConnections value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return flightStopsAsConnections
     */
    public org.opentravel.www.OTA._2003._05.FlightStopsAsConnectionsType getFlightStopsAsConnections() {
        return flightStopsAsConnections;
    }


    /**
     * Sets the flightStopsAsConnections value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param flightStopsAsConnections
     */
    public void setFlightStopsAsConnections(org.opentravel.www.OTA._2003._05.FlightStopsAsConnectionsType flightStopsAsConnections) {
        this.flightStopsAsConnections = flightStopsAsConnections;
    }


    /**
     * Gets the ticketingSumOfLocals value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return ticketingSumOfLocals   * Settings specific to Ticketing Sum of Locals processing
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTicketingSumOfLocals getTicketingSumOfLocals() {
        return ticketingSumOfLocals;
    }


    /**
     * Sets the ticketingSumOfLocals value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param ticketingSumOfLocals   * Settings specific to Ticketing Sum of Locals processing
     */
    public void setTicketingSumOfLocals(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsTicketingSumOfLocals ticketingSumOfLocals) {
        this.ticketingSumOfLocals = ticketingSumOfLocals;
    }


    /**
     * Gets the multiAirportCodes value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return multiAirportCodes   * Settings specific to Multi Airport Codes processing
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMultiAirportCodes getMultiAirportCodes() {
        return multiAirportCodes;
    }


    /**
     * Sets the multiAirportCodes value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param multiAirportCodes   * Settings specific to Multi Airport Codes processing
     */
    public void setMultiAirportCodes(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsMultiAirportCodes multiAirportCodes) {
        this.multiAirportCodes = multiAirportCodes;
    }


    /**
     * Gets the jumpCabinLogic value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return jumpCabinLogic
     */
    public org.opentravel.www.OTA._2003._05.JumpCabinLogicType getJumpCabinLogic() {
        return jumpCabinLogic;
    }


    /**
     * Sets the jumpCabinLogic value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param jumpCabinLogic
     */
    public void setJumpCabinLogic(org.opentravel.www.OTA._2003._05.JumpCabinLogicType jumpCabinLogic) {
        this.jumpCabinLogic = jumpCabinLogic;
    }


    /**
     * Gets the keepSameCabin value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return keepSameCabin
     */
    public org.opentravel.www.OTA._2003._05.KeepSameCabinType getKeepSameCabin() {
        return keepSameCabin;
    }


    /**
     * Sets the keepSameCabin value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param keepSameCabin
     */
    public void setKeepSameCabin(org.opentravel.www.OTA._2003._05.KeepSameCabinType keepSameCabin) {
        this.keepSameCabin = keepSameCabin;
    }


    /**
     * Gets the governingCarrierOverride value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return governingCarrierOverride
     */
    public org.opentravel.www.OTA._2003._05.GoverningCarrierOverrideType getGoverningCarrierOverride() {
        return governingCarrierOverride;
    }


    /**
     * Sets the governingCarrierOverride value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param governingCarrierOverride
     */
    public void setGoverningCarrierOverride(org.opentravel.www.OTA._2003._05.GoverningCarrierOverrideType governingCarrierOverride) {
        this.governingCarrierOverride = governingCarrierOverride;
    }


    /**
     * Gets the excludeCallDirectCarriers value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return excludeCallDirectCarriers
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeCallDirectCarriers getExcludeCallDirectCarriers() {
        return excludeCallDirectCarriers;
    }


    /**
     * Sets the excludeCallDirectCarriers value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param excludeCallDirectCarriers
     */
    public void setExcludeCallDirectCarriers(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsExcludeCallDirectCarriers excludeCallDirectCarriers) {
        this.excludeCallDirectCarriers = excludeCallDirectCarriers;
    }


    /**
     * Gets the validatingCarrier value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return validatingCarrier
     */
    public org.opentravel.www.OTA._2003._05.ValidatingCarrierTypePreference[] getValidatingCarrier() {
        return validatingCarrier;
    }


    /**
     * Sets the validatingCarrier value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param validatingCarrier
     */
    public void setValidatingCarrier(org.opentravel.www.OTA._2003._05.ValidatingCarrierTypePreference[] validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }


    /**
     * Gets the validatingCarrierCheck value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return validatingCarrierCheck
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck getValidatingCarrierCheck() {
        return validatingCarrierCheck;
    }


    /**
     * Sets the validatingCarrierCheck value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param validatingCarrierCheck
     */
    public void setValidatingCarrierCheck(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheck validatingCarrierCheck) {
        this.validatingCarrierCheck = validatingCarrierCheck;
    }


    /**
     * Gets the settlementMethod value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return settlementMethod
     */
    public java.lang.String getSettlementMethod() {
        return settlementMethod;
    }


    /**
     * Sets the settlementMethod value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param settlementMethod
     */
    public void setSettlementMethod(java.lang.String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }


    /**
     * Gets the flightRepeatLimit value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return flightRepeatLimit
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFlightRepeatLimit getFlightRepeatLimit() {
        return flightRepeatLimit;
    }


    /**
     * Sets the flightRepeatLimit value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param flightRepeatLimit
     */
    public void setFlightRepeatLimit(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFlightRepeatLimit flightRepeatLimit) {
        this.flightRepeatLimit = flightRepeatLimit;
    }


    /**
     * Gets the flexibleFares value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return flexibleFares
     */
    public org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParameters[] getFlexibleFares() {
        return flexibleFares;
    }


    /**
     * Sets the flexibleFares value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param flexibleFares
     */
    public void setFlexibleFares(org.opentravel.www.OTA._2003._05.FlexibleFaresTypeFareParameters[] flexibleFares) {
        this.flexibleFares = flexibleFares;
    }


    /**
     * Gets the diversityParameters value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return diversityParameters
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParameters getDiversityParameters() {
        return diversityParameters;
    }


    /**
     * Sets the diversityParameters value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param diversityParameters
     */
    public void setDiversityParameters(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParameters diversityParameters) {
        this.diversityParameters = diversityParameters;
    }


    /**
     * Gets the additionalFareLimit value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return additionalFareLimit
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAdditionalFareLimit getAdditionalFareLimit() {
        return additionalFareLimit;
    }


    /**
     * Sets the additionalFareLimit value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param additionalFareLimit
     */
    public void setAdditionalFareLimit(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsAdditionalFareLimit additionalFareLimit) {
        this.additionalFareLimit = additionalFareLimit;
    }


    /**
     * Gets the fareFocusRules value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return fareFocusRules
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareFocusRules getFareFocusRules() {
        return fareFocusRules;
    }


    /**
     * Sets the fareFocusRules value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param fareFocusRules
     */
    public void setFareFocusRules(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsFareFocusRules fareFocusRules) {
        this.fareFocusRules = fareFocusRules;
    }


    /**
     * Gets the sellingLevels value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return sellingLevels
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevels getSellingLevels() {
        return sellingLevels;
    }


    /**
     * Sets the sellingLevels value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param sellingLevels
     */
    public void setSellingLevels(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsSellingLevels sellingLevels) {
        this.sellingLevels = sellingLevels;
    }


    /**
     * Gets the budget value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return budget   * Budget Shopping settings
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsBudget getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param budget   * Budget Shopping settings
     */
    public void setBudget(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsBudget budget) {
        this.budget = budget;
    }


    /**
     * Gets the optionsPerDatePairList value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return optionsPerDatePairList   * List of dates/date pairs with different requested number of
     * options
     */
    public org.opentravel.www.OTA._2003._05.OptionsPerDatePairType[] getOptionsPerDatePairList() {
        return optionsPerDatePairList;
    }


    /**
     * Sets the optionsPerDatePairList value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param optionsPerDatePairList   * List of dates/date pairs with different requested number of
     * options
     */
    public void setOptionsPerDatePairList(org.opentravel.www.OTA._2003._05.OptionsPerDatePairType[] optionsPerDatePairList) {
        this.optionsPerDatePairList = optionsPerDatePairList;
    }


    /**
     * Gets the countryPref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return countryPref   * List of countries to be excluded from processing
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsCountryPref[] getCountryPref() {
        return countryPref;
    }


    /**
     * Sets the countryPref value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param countryPref   * List of countries to be excluded from processing
     */
    public void setCountryPref(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsCountryPref[] countryPref) {
        this.countryPref = countryPref;
    }

    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsCountryPref getCountryPref(int i) {
        return this.countryPref[i];
    }

    public void setCountryPref(int i, org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsCountryPref _value) {
        this.countryPref[i] = _value;
    }


    /**
     * Gets the retailerRules value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @return retailerRules
     */
    public org.opentravel.www.OTA._2003._05.RetailerRulesTypeRetailerRule[] getRetailerRules() {
        return retailerRules;
    }


    /**
     * Sets the retailerRules value for this AirSearchPrefsTypeTPA_Extensions.
     * 
     * @param retailerRules
     */
    public void setRetailerRules(org.opentravel.www.OTA._2003._05.RetailerRulesTypeRetailerRule[] retailerRules) {
        this.retailerRules = retailerRules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_Extensions)) return false;
        AirSearchPrefsTypeTPA_Extensions other = (AirSearchPrefsTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureWindow==null && other.getDepartureWindow()==null) || 
             (this.departureWindow!=null &&
              this.departureWindow.equals(other.getDepartureWindow()))) &&
            ((this.arrivalWindow==null && other.getArrivalWindow()==null) || 
             (this.arrivalWindow!=null &&
              this.arrivalWindow.equals(other.getArrivalWindow()))) &&
            ((this.excludeVendorPref==null && other.getExcludeVendorPref()==null) || 
             (this.excludeVendorPref!=null &&
              java.util.Arrays.equals(this.excludeVendorPref, other.getExcludeVendorPref()))) &&
            ((this.includeAlliancePref==null && other.getIncludeAlliancePref()==null) || 
             (this.includeAlliancePref!=null &&
              java.util.Arrays.equals(this.includeAlliancePref, other.getIncludeAlliancePref()))) &&
            ((this.excludeAlliancePref==null && other.getExcludeAlliancePref()==null) || 
             (this.excludeAlliancePref!=null &&
              java.util.Arrays.equals(this.excludeAlliancePref, other.getExcludeAlliancePref()))) &&
            ((this.numTrips==null && other.getNumTrips()==null) || 
             (this.numTrips!=null &&
              this.numTrips.equals(other.getNumTrips()))) &&
            ((this.altCitiesCombinations==null && other.getAltCitiesCombinations()==null) || 
             (this.altCitiesCombinations!=null &&
              this.altCitiesCombinations.equals(other.getAltCitiesCombinations()))) &&
            ((this.numTripsWithRouting==null && other.getNumTripsWithRouting()==null) || 
             (this.numTripsWithRouting!=null &&
              this.numTripsWithRouting.equals(other.getNumTripsWithRouting()))) &&
            ((this.onlineIndicator==null && other.getOnlineIndicator()==null) || 
             (this.onlineIndicator!=null &&
              this.onlineIndicator.equals(other.getOnlineIndicator()))) &&
            ((this.interlineIndicator==null && other.getInterlineIndicator()==null) || 
             (this.interlineIndicator!=null &&
              this.interlineIndicator.equals(other.getInterlineIndicator()))) &&
            ((this.tripType==null && other.getTripType()==null) || 
             (this.tripType!=null &&
              this.tripType.equals(other.getTripType()))) &&
            ((this.maxPrice==null && other.getMaxPrice()==null) || 
             (this.maxPrice!=null &&
              this.maxPrice.equals(other.getMaxPrice()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.domesticLayoverTime==null && other.getDomesticLayoverTime()==null) || 
             (this.domesticLayoverTime!=null &&
              this.domesticLayoverTime.equals(other.getDomesticLayoverTime()))) &&
            ((this.longConnectTime==null && other.getLongConnectTime()==null) || 
             (this.longConnectTime!=null &&
              this.longConnectTime.equals(other.getLongConnectTime()))) &&
            ((this.longConnectPoints==null && other.getLongConnectPoints()==null) || 
             (this.longConnectPoints!=null &&
              this.longConnectPoints.equals(other.getLongConnectPoints()))) &&
            ((this.airServiceOnly==null && other.getAirServiceOnly()==null) || 
             (this.airServiceOnly!=null &&
              this.airServiceOnly.equals(other.getAirServiceOnly()))) &&
            ((this.jetServiceOnly==null && other.getJetServiceOnly()==null) || 
             (this.jetServiceOnly!=null &&
              this.jetServiceOnly.equals(other.getJetServiceOnly()))) &&
            ((this.sameConnectionAirportOnly==null && other.getSameConnectionAirportOnly()==null) || 
             (this.sameConnectionAirportOnly!=null &&
              this.sameConnectionAirportOnly.equals(other.getSameConnectionAirportOnly()))) &&
            ((this.sameOriginAirportOnly==null && other.getSameOriginAirportOnly()==null) || 
             (this.sameOriginAirportOnly!=null &&
              this.sameOriginAirportOnly.equals(other.getSameOriginAirportOnly()))) &&
            ((this.sameTurnaroundAirportOnly==null && other.getSameTurnaroundAirportOnly()==null) || 
             (this.sameTurnaroundAirportOnly!=null &&
              this.sameTurnaroundAirportOnly.equals(other.getSameTurnaroundAirportOnly()))) &&
            ((this.aircraftTypePenalty==null && other.getAircraftTypePenalty()==null) || 
             (this.aircraftTypePenalty!=null &&
              this.aircraftTypePenalty.equals(other.getAircraftTypePenalty()))) &&
            ((this.alternateAirportPenalty==null && other.getAlternateAirportPenalty()==null) || 
             (this.alternateAirportPenalty!=null &&
              this.alternateAirportPenalty.equals(other.getAlternateAirportPenalty()))) &&
            ((this.fareAmountThreshold==null && other.getFareAmountThreshold()==null) || 
             (this.fareAmountThreshold!=null &&
              this.fareAmountThreshold.equals(other.getFareAmountThreshold()))) &&
            ((this.numOfLowFareSol==null && other.getNumOfLowFareSol()==null) || 
             (this.numOfLowFareSol!=null &&
              this.numOfLowFareSol.equals(other.getNumOfLowFareSol()))) &&
            ((this.numOfMustPriceOnlSol==null && other.getNumOfMustPriceOnlSol()==null) || 
             (this.numOfMustPriceOnlSol!=null &&
              this.numOfMustPriceOnlSol.equals(other.getNumOfMustPriceOnlSol()))) &&
            ((this.numOfMustPriceInrlSol==null && other.getNumOfMustPriceInrlSol()==null) || 
             (this.numOfMustPriceInrlSol!=null &&
              this.numOfMustPriceInrlSol.equals(other.getNumOfMustPriceInrlSol()))) &&
            ((this.numOfMustPriceNStpOnlSol==null && other.getNumOfMustPriceNStpOnlSol()==null) || 
             (this.numOfMustPriceNStpOnlSol!=null &&
              this.numOfMustPriceNStpOnlSol.equals(other.getNumOfMustPriceNStpOnlSol()))) &&
            ((this.numOfMustPriceNStpInrlSol==null && other.getNumOfMustPriceNStpInrlSol()==null) || 
             (this.numOfMustPriceNStpInrlSol!=null &&
              this.numOfMustPriceNStpInrlSol.equals(other.getNumOfMustPriceNStpInrlSol()))) &&
            ((this.numOfMustPriceSStopOnlSol==null && other.getNumOfMustPriceSStopOnlSol()==null) || 
             (this.numOfMustPriceSStopOnlSol!=null &&
              this.numOfMustPriceSStopOnlSol.equals(other.getNumOfMustPriceSStopOnlSol()))) &&
            ((this.stpPenaltyInUSD==null && other.getStpPenaltyInUSD()==null) || 
             (this.stpPenaltyInUSD!=null &&
              this.stpPenaltyInUSD.equals(other.getStpPenaltyInUSD()))) &&
            ((this.durPenaltyInUSD==null && other.getDurPenaltyInUSD()==null) || 
             (this.durPenaltyInUSD!=null &&
              this.durPenaltyInUSD.equals(other.getDurPenaltyInUSD()))) &&
            ((this.depPenaltyInUSD==null && other.getDepPenaltyInUSD()==null) || 
             (this.depPenaltyInUSD!=null &&
              this.depPenaltyInUSD.equals(other.getDepPenaltyInUSD()))) &&
            ((this.maxAllowedMustPriceOveragePerCrr==null && other.getMaxAllowedMustPriceOveragePerCrr()==null) || 
             (this.maxAllowedMustPriceOveragePerCrr!=null &&
              this.maxAllowedMustPriceOveragePerCrr.equals(other.getMaxAllowedMustPriceOveragePerCrr()))) &&
            ((this.fltOptMustPriceReuseLimit==null && other.getFltOptMustPriceReuseLimit()==null) || 
             (this.fltOptMustPriceReuseLimit!=null &&
              this.fltOptMustPriceReuseLimit.equals(other.getFltOptMustPriceReuseLimit()))) &&
            ((this.upperBoundMustPriceFactorForNotNonStp==null && other.getUpperBoundMustPriceFactorForNotNonStp()==null) || 
             (this.upperBoundMustPriceFactorForNotNonStp!=null &&
              this.upperBoundMustPriceFactorForNotNonStp.equals(other.getUpperBoundMustPriceFactorForNotNonStp()))) &&
            ((this.upperBoundLFSFactor==null && other.getUpperBoundLFSFactor()==null) || 
             (this.upperBoundLFSFactor!=null &&
              this.upperBoundLFSFactor.equals(other.getUpperBoundLFSFactor()))) &&
            ((this.numOfMustPriceNStp1StpOnlSol==null && other.getNumOfMustPriceNStp1StpOnlSol()==null) || 
             (this.numOfMustPriceNStp1StpOnlSol!=null &&
              this.numOfMustPriceNStp1StpOnlSol.equals(other.getNumOfMustPriceNStp1StpOnlSol()))) &&
            ((this.numOfMustPriceNStp1StpInrlSol==null && other.getNumOfMustPriceNStp1StpInrlSol()==null) || 
             (this.numOfMustPriceNStp1StpInrlSol!=null &&
              this.numOfMustPriceNStp1StpInrlSol.equals(other.getNumOfMustPriceNStp1StpInrlSol()))) &&
            ((this.upperBoundMustPriceFactorForNonStp==null && other.getUpperBoundMustPriceFactorForNonStp()==null) || 
             (this.upperBoundMustPriceFactorForNonStp!=null &&
              this.upperBoundMustPriceFactorForNonStp.equals(other.getUpperBoundMustPriceFactorForNonStp()))) &&
            ((this.maxAllowedLFSOveragePerCrrPercent==null && other.getMaxAllowedLFSOveragePerCrrPercent()==null) || 
             (this.maxAllowedLFSOveragePerCrrPercent!=null &&
              this.maxAllowedLFSOveragePerCrrPercent.equals(other.getMaxAllowedLFSOveragePerCrrPercent()))) &&
            ((this.targetMinNumOfLFSOnlSolPerCrr==null && other.getTargetMinNumOfLFSOnlSolPerCrr()==null) || 
             (this.targetMinNumOfLFSOnlSolPerCrr!=null &&
              this.targetMinNumOfLFSOnlSolPerCrr.equals(other.getTargetMinNumOfLFSOnlSolPerCrr()))) &&
            ((this.targetMinNumOfLFSTotOnlSolPercent==null && other.getTargetMinNumOfLFSTotOnlSolPercent()==null) || 
             (this.targetMinNumOfLFSTotOnlSolPercent!=null &&
              this.targetMinNumOfLFSTotOnlSolPercent.equals(other.getTargetMinNumOfLFSTotOnlSolPercent()))) &&
            ((this.fltOptLFSReuseLimitForNonAVS==null && other.getFltOptLFSReuseLimitForNonAVS()==null) || 
             (this.fltOptLFSReuseLimitForNonAVS!=null &&
              this.fltOptLFSReuseLimitForNonAVS.equals(other.getFltOptLFSReuseLimitForNonAVS()))) &&
            ((this.fltOptLFSReuseLimitForAVS==null && other.getFltOptLFSReuseLimitForAVS()==null) || 
             (this.fltOptLFSReuseLimitForAVS!=null &&
              this.fltOptLFSReuseLimitForAVS.equals(other.getFltOptLFSReuseLimitForAVS()))) &&
            ((this.avsPenaltyCrrs==null && other.getAvsPenaltyCrrs()==null) || 
             (this.avsPenaltyCrrs!=null &&
              this.avsPenaltyCrrs.equals(other.getAvsPenaltyCrrs()))) &&
            ((this.maxNumOfNonStpOnlSol==null && other.getMaxNumOfNonStpOnlSol()==null) || 
             (this.maxNumOfNonStpOnlSol!=null &&
              this.maxNumOfNonStpOnlSol.equals(other.getMaxNumOfNonStpOnlSol()))) &&
            ((this.maxNumOfNonStpInrlSol==null && other.getMaxNumOfNonStpInrlSol()==null) || 
             (this.maxNumOfNonStpInrlSol!=null &&
              this.maxNumOfNonStpInrlSol.equals(other.getMaxNumOfNonStpInrlSol()))) &&
            ((this.maxNumOfSingleStpOnlSol==null && other.getMaxNumOfSingleStpOnlSol()==null) || 
             (this.maxNumOfSingleStpOnlSol!=null &&
              this.maxNumOfSingleStpOnlSol.equals(other.getMaxNumOfSingleStpOnlSol()))) &&
            ((this.maxNumOf2PlusStpSol==null && other.getMaxNumOf2PlusStpSol()==null) || 
             (this.maxNumOf2PlusStpSol!=null &&
              this.maxNumOf2PlusStpSol.equals(other.getMaxNumOf2PlusStpSol()))) &&
            ((this.minAllowedOveragePerCrrPercent==null && other.getMinAllowedOveragePerCrrPercent()==null) || 
             (this.minAllowedOveragePerCrrPercent!=null &&
              this.minAllowedOveragePerCrrPercent.equals(other.getMinAllowedOveragePerCrrPercent()))) &&
            ((this.minAllowedOveragePerCrr==null && other.getMinAllowedOveragePerCrr()==null) || 
             (this.minAllowedOveragePerCrr!=null &&
              this.minAllowedOveragePerCrr.equals(other.getMinAllowedOveragePerCrr()))) &&
            ((this.maxRelFareLvlOfxForNonStp==null && other.getMaxRelFareLvlOfxForNonStp()==null) || 
             (this.maxRelFareLvlOfxForNonStp!=null &&
              this.maxRelFareLvlOfxForNonStp.equals(other.getMaxRelFareLvlOfxForNonStp()))) &&
            ((this.maxRelFareLvlOfxForCnx==null && other.getMaxRelFareLvlOfxForCnx()==null) || 
             (this.maxRelFareLvlOfxForCnx!=null &&
              this.maxRelFareLvlOfxForCnx.equals(other.getMaxRelFareLvlOfxForCnx()))) &&
            ((this.numOfMustPrice2PlusStpSol==null && other.getNumOfMustPrice2PlusStpSol()==null) || 
             (this.numOfMustPrice2PlusStpSol!=null &&
              this.numOfMustPrice2PlusStpSol.equals(other.getNumOfMustPrice2PlusStpSol()))) &&
            ((this.itineraryNumberThreshold==null && other.getItineraryNumberThreshold()==null) || 
             (this.itineraryNumberThreshold!=null &&
              this.itineraryNumberThreshold.equals(other.getItineraryNumberThreshold()))) &&
            ((this.XOFares==null && other.getXOFares()==null) || 
             (this.XOFares!=null &&
              this.XOFares.equals(other.getXOFares()))) &&
            ((this.exemptAllTaxes==null && other.getExemptAllTaxes()==null) || 
             (this.exemptAllTaxes!=null &&
              this.exemptAllTaxes.equals(other.getExemptAllTaxes()))) &&
            ((this.exemptAllTaxesAndFees==null && other.getExemptAllTaxesAndFees()==null) || 
             (this.exemptAllTaxesAndFees!=null &&
              this.exemptAllTaxesAndFees.equals(other.getExemptAllTaxesAndFees()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.exemptTax==null && other.getExemptTax()==null) || 
             (this.exemptTax!=null &&
              java.util.Arrays.equals(this.exemptTax, other.getExemptTax()))) &&
            ((this.flightStopsAsConnections==null && other.getFlightStopsAsConnections()==null) || 
             (this.flightStopsAsConnections!=null &&
              this.flightStopsAsConnections.equals(other.getFlightStopsAsConnections()))) &&
            ((this.ticketingSumOfLocals==null && other.getTicketingSumOfLocals()==null) || 
             (this.ticketingSumOfLocals!=null &&
              this.ticketingSumOfLocals.equals(other.getTicketingSumOfLocals()))) &&
            ((this.multiAirportCodes==null && other.getMultiAirportCodes()==null) || 
             (this.multiAirportCodes!=null &&
              this.multiAirportCodes.equals(other.getMultiAirportCodes()))) &&
            ((this.jumpCabinLogic==null && other.getJumpCabinLogic()==null) || 
             (this.jumpCabinLogic!=null &&
              this.jumpCabinLogic.equals(other.getJumpCabinLogic()))) &&
            ((this.keepSameCabin==null && other.getKeepSameCabin()==null) || 
             (this.keepSameCabin!=null &&
              this.keepSameCabin.equals(other.getKeepSameCabin()))) &&
            ((this.governingCarrierOverride==null && other.getGoverningCarrierOverride()==null) || 
             (this.governingCarrierOverride!=null &&
              this.governingCarrierOverride.equals(other.getGoverningCarrierOverride()))) &&
            ((this.excludeCallDirectCarriers==null && other.getExcludeCallDirectCarriers()==null) || 
             (this.excludeCallDirectCarriers!=null &&
              this.excludeCallDirectCarriers.equals(other.getExcludeCallDirectCarriers()))) &&
            ((this.validatingCarrier==null && other.getValidatingCarrier()==null) || 
             (this.validatingCarrier!=null &&
              java.util.Arrays.equals(this.validatingCarrier, other.getValidatingCarrier()))) &&
            ((this.validatingCarrierCheck==null && other.getValidatingCarrierCheck()==null) || 
             (this.validatingCarrierCheck!=null &&
              this.validatingCarrierCheck.equals(other.getValidatingCarrierCheck()))) &&
            ((this.settlementMethod==null && other.getSettlementMethod()==null) || 
             (this.settlementMethod!=null &&
              this.settlementMethod.equals(other.getSettlementMethod()))) &&
            ((this.flightRepeatLimit==null && other.getFlightRepeatLimit()==null) || 
             (this.flightRepeatLimit!=null &&
              this.flightRepeatLimit.equals(other.getFlightRepeatLimit()))) &&
            ((this.flexibleFares==null && other.getFlexibleFares()==null) || 
             (this.flexibleFares!=null &&
              java.util.Arrays.equals(this.flexibleFares, other.getFlexibleFares()))) &&
            ((this.diversityParameters==null && other.getDiversityParameters()==null) || 
             (this.diversityParameters!=null &&
              this.diversityParameters.equals(other.getDiversityParameters()))) &&
            ((this.additionalFareLimit==null && other.getAdditionalFareLimit()==null) || 
             (this.additionalFareLimit!=null &&
              this.additionalFareLimit.equals(other.getAdditionalFareLimit()))) &&
            ((this.fareFocusRules==null && other.getFareFocusRules()==null) || 
             (this.fareFocusRules!=null &&
              this.fareFocusRules.equals(other.getFareFocusRules()))) &&
            ((this.sellingLevels==null && other.getSellingLevels()==null) || 
             (this.sellingLevels!=null &&
              this.sellingLevels.equals(other.getSellingLevels()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.optionsPerDatePairList==null && other.getOptionsPerDatePairList()==null) || 
             (this.optionsPerDatePairList!=null &&
              java.util.Arrays.equals(this.optionsPerDatePairList, other.getOptionsPerDatePairList()))) &&
            ((this.countryPref==null && other.getCountryPref()==null) || 
             (this.countryPref!=null &&
              java.util.Arrays.equals(this.countryPref, other.getCountryPref()))) &&
            ((this.retailerRules==null && other.getRetailerRules()==null) || 
             (this.retailerRules!=null &&
              java.util.Arrays.equals(this.retailerRules, other.getRetailerRules())));
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
        if (getDepartureWindow() != null) {
            _hashCode += getDepartureWindow().hashCode();
        }
        if (getArrivalWindow() != null) {
            _hashCode += getArrivalWindow().hashCode();
        }
        if (getExcludeVendorPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeVendorPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeVendorPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeAlliancePref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeAlliancePref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeAlliancePref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeAlliancePref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeAlliancePref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeAlliancePref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumTrips() != null) {
            _hashCode += getNumTrips().hashCode();
        }
        if (getAltCitiesCombinations() != null) {
            _hashCode += getAltCitiesCombinations().hashCode();
        }
        if (getNumTripsWithRouting() != null) {
            _hashCode += getNumTripsWithRouting().hashCode();
        }
        if (getOnlineIndicator() != null) {
            _hashCode += getOnlineIndicator().hashCode();
        }
        if (getInterlineIndicator() != null) {
            _hashCode += getInterlineIndicator().hashCode();
        }
        if (getTripType() != null) {
            _hashCode += getTripType().hashCode();
        }
        if (getMaxPrice() != null) {
            _hashCode += getMaxPrice().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getDomesticLayoverTime() != null) {
            _hashCode += getDomesticLayoverTime().hashCode();
        }
        if (getLongConnectTime() != null) {
            _hashCode += getLongConnectTime().hashCode();
        }
        if (getLongConnectPoints() != null) {
            _hashCode += getLongConnectPoints().hashCode();
        }
        if (getAirServiceOnly() != null) {
            _hashCode += getAirServiceOnly().hashCode();
        }
        if (getJetServiceOnly() != null) {
            _hashCode += getJetServiceOnly().hashCode();
        }
        if (getSameConnectionAirportOnly() != null) {
            _hashCode += getSameConnectionAirportOnly().hashCode();
        }
        if (getSameOriginAirportOnly() != null) {
            _hashCode += getSameOriginAirportOnly().hashCode();
        }
        if (getSameTurnaroundAirportOnly() != null) {
            _hashCode += getSameTurnaroundAirportOnly().hashCode();
        }
        if (getAircraftTypePenalty() != null) {
            _hashCode += getAircraftTypePenalty().hashCode();
        }
        if (getAlternateAirportPenalty() != null) {
            _hashCode += getAlternateAirportPenalty().hashCode();
        }
        if (getFareAmountThreshold() != null) {
            _hashCode += getFareAmountThreshold().hashCode();
        }
        if (getNumOfLowFareSol() != null) {
            _hashCode += getNumOfLowFareSol().hashCode();
        }
        if (getNumOfMustPriceOnlSol() != null) {
            _hashCode += getNumOfMustPriceOnlSol().hashCode();
        }
        if (getNumOfMustPriceInrlSol() != null) {
            _hashCode += getNumOfMustPriceInrlSol().hashCode();
        }
        if (getNumOfMustPriceNStpOnlSol() != null) {
            _hashCode += getNumOfMustPriceNStpOnlSol().hashCode();
        }
        if (getNumOfMustPriceNStpInrlSol() != null) {
            _hashCode += getNumOfMustPriceNStpInrlSol().hashCode();
        }
        if (getNumOfMustPriceSStopOnlSol() != null) {
            _hashCode += getNumOfMustPriceSStopOnlSol().hashCode();
        }
        if (getStpPenaltyInUSD() != null) {
            _hashCode += getStpPenaltyInUSD().hashCode();
        }
        if (getDurPenaltyInUSD() != null) {
            _hashCode += getDurPenaltyInUSD().hashCode();
        }
        if (getDepPenaltyInUSD() != null) {
            _hashCode += getDepPenaltyInUSD().hashCode();
        }
        if (getMaxAllowedMustPriceOveragePerCrr() != null) {
            _hashCode += getMaxAllowedMustPriceOveragePerCrr().hashCode();
        }
        if (getFltOptMustPriceReuseLimit() != null) {
            _hashCode += getFltOptMustPriceReuseLimit().hashCode();
        }
        if (getUpperBoundMustPriceFactorForNotNonStp() != null) {
            _hashCode += getUpperBoundMustPriceFactorForNotNonStp().hashCode();
        }
        if (getUpperBoundLFSFactor() != null) {
            _hashCode += getUpperBoundLFSFactor().hashCode();
        }
        if (getNumOfMustPriceNStp1StpOnlSol() != null) {
            _hashCode += getNumOfMustPriceNStp1StpOnlSol().hashCode();
        }
        if (getNumOfMustPriceNStp1StpInrlSol() != null) {
            _hashCode += getNumOfMustPriceNStp1StpInrlSol().hashCode();
        }
        if (getUpperBoundMustPriceFactorForNonStp() != null) {
            _hashCode += getUpperBoundMustPriceFactorForNonStp().hashCode();
        }
        if (getMaxAllowedLFSOveragePerCrrPercent() != null) {
            _hashCode += getMaxAllowedLFSOveragePerCrrPercent().hashCode();
        }
        if (getTargetMinNumOfLFSOnlSolPerCrr() != null) {
            _hashCode += getTargetMinNumOfLFSOnlSolPerCrr().hashCode();
        }
        if (getTargetMinNumOfLFSTotOnlSolPercent() != null) {
            _hashCode += getTargetMinNumOfLFSTotOnlSolPercent().hashCode();
        }
        if (getFltOptLFSReuseLimitForNonAVS() != null) {
            _hashCode += getFltOptLFSReuseLimitForNonAVS().hashCode();
        }
        if (getFltOptLFSReuseLimitForAVS() != null) {
            _hashCode += getFltOptLFSReuseLimitForAVS().hashCode();
        }
        if (getAvsPenaltyCrrs() != null) {
            _hashCode += getAvsPenaltyCrrs().hashCode();
        }
        if (getMaxNumOfNonStpOnlSol() != null) {
            _hashCode += getMaxNumOfNonStpOnlSol().hashCode();
        }
        if (getMaxNumOfNonStpInrlSol() != null) {
            _hashCode += getMaxNumOfNonStpInrlSol().hashCode();
        }
        if (getMaxNumOfSingleStpOnlSol() != null) {
            _hashCode += getMaxNumOfSingleStpOnlSol().hashCode();
        }
        if (getMaxNumOf2PlusStpSol() != null) {
            _hashCode += getMaxNumOf2PlusStpSol().hashCode();
        }
        if (getMinAllowedOveragePerCrrPercent() != null) {
            _hashCode += getMinAllowedOveragePerCrrPercent().hashCode();
        }
        if (getMinAllowedOveragePerCrr() != null) {
            _hashCode += getMinAllowedOveragePerCrr().hashCode();
        }
        if (getMaxRelFareLvlOfxForNonStp() != null) {
            _hashCode += getMaxRelFareLvlOfxForNonStp().hashCode();
        }
        if (getMaxRelFareLvlOfxForCnx() != null) {
            _hashCode += getMaxRelFareLvlOfxForCnx().hashCode();
        }
        if (getNumOfMustPrice2PlusStpSol() != null) {
            _hashCode += getNumOfMustPrice2PlusStpSol().hashCode();
        }
        if (getItineraryNumberThreshold() != null) {
            _hashCode += getItineraryNumberThreshold().hashCode();
        }
        if (getXOFares() != null) {
            _hashCode += getXOFares().hashCode();
        }
        if (getExemptAllTaxes() != null) {
            _hashCode += getExemptAllTaxes().hashCode();
        }
        if (getExemptAllTaxesAndFees() != null) {
            _hashCode += getExemptAllTaxesAndFees().hashCode();
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExemptTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExemptTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExemptTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlightStopsAsConnections() != null) {
            _hashCode += getFlightStopsAsConnections().hashCode();
        }
        if (getTicketingSumOfLocals() != null) {
            _hashCode += getTicketingSumOfLocals().hashCode();
        }
        if (getMultiAirportCodes() != null) {
            _hashCode += getMultiAirportCodes().hashCode();
        }
        if (getJumpCabinLogic() != null) {
            _hashCode += getJumpCabinLogic().hashCode();
        }
        if (getKeepSameCabin() != null) {
            _hashCode += getKeepSameCabin().hashCode();
        }
        if (getGoverningCarrierOverride() != null) {
            _hashCode += getGoverningCarrierOverride().hashCode();
        }
        if (getExcludeCallDirectCarriers() != null) {
            _hashCode += getExcludeCallDirectCarriers().hashCode();
        }
        if (getValidatingCarrier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidatingCarrier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidatingCarrier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidatingCarrierCheck() != null) {
            _hashCode += getValidatingCarrierCheck().hashCode();
        }
        if (getSettlementMethod() != null) {
            _hashCode += getSettlementMethod().hashCode();
        }
        if (getFlightRepeatLimit() != null) {
            _hashCode += getFlightRepeatLimit().hashCode();
        }
        if (getFlexibleFares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlexibleFares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlexibleFares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiversityParameters() != null) {
            _hashCode += getDiversityParameters().hashCode();
        }
        if (getAdditionalFareLimit() != null) {
            _hashCode += getAdditionalFareLimit().hashCode();
        }
        if (getFareFocusRules() != null) {
            _hashCode += getFareFocusRules().hashCode();
        }
        if (getSellingLevels() != null) {
            _hashCode += getSellingLevels().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getOptionsPerDatePairList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionsPerDatePairList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionsPerDatePairList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetailerRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRetailerRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRetailerRules(), i);
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
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeVendorPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExcludeVendorPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ExcludeVendorPref"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAlliancePref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeAlliancePref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AllianceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeAlliancePref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExcludeAlliancePref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AllianceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTrips");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumTrips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumTripsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altCitiesCombinations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AltCitiesCombinations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AltCitiesCombinationsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTripsWithRouting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumTripsWithRouting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>NumTripsWithRouting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OnlineIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OnlineIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interlineIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "InterlineIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">InterlineIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TripType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>TripType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MaxPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>MaxPrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domesticLayoverTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DomesticLayoverTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>DomesticLayoverTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longConnectTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LongConnectTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>LongConnectTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longConnectPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LongConnectPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>LongConnectPoints"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airServiceOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirServiceOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AirServiceOnly"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jetServiceOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "JetServiceOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>JetServiceOnly"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameConnectionAirportOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SameConnectionAirportOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SameConnectionAirportOnly"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameOriginAirportOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SameOriginAirportOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SameOriginAirportOnly"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sameTurnaroundAirportOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SameTurnaroundAirportOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SameTurnaroundAirportOnly"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aircraftTypePenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AircraftTypePenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AircraftTypePenalty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateAirportPenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateAirportPenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AlternateAirportPenalty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareAmountThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareAmountThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>FareAmountThreshold"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfLowFareSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfLowFareSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfLowFareSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPriceOnlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPriceOnlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceOnlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPriceInrlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPriceInrlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceInrlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPriceNStpOnlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPriceNStpOnlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStpOnlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPriceNStpInrlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPriceNStpInrlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStpInrlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPriceSStopOnlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPriceSStopOnlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceSStopOnlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stpPenaltyInUSD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "stpPenaltyInUSD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>stpPenaltyInUSD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durPenaltyInUSD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "durPenaltyInUSD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>durPenaltyInUSD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depPenaltyInUSD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "depPenaltyInUSD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>depPenaltyInUSD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAllowedMustPriceOveragePerCrr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxAllowedMustPriceOveragePerCrr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxAllowedMustPriceOveragePerCrr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fltOptMustPriceReuseLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "fltOptMustPriceReuseLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>fltOptMustPriceReuseLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperBoundMustPriceFactorForNotNonStp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "upperBoundMustPriceFactorForNotNonStp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>upperBoundMustPriceFactorForNotNonStp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperBoundLFSFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "upperBoundLFSFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>upperBoundLFSFactor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPriceNStp1StpOnlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPriceNStp1StpOnlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStp1StpOnlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPriceNStp1StpInrlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPriceNStp1StpInrlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPriceNStp1StpInrlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperBoundMustPriceFactorForNonStp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "upperBoundMustPriceFactorForNonStp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>upperBoundMustPriceFactorForNonStp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAllowedLFSOveragePerCrrPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxAllowedLFSOveragePerCrrPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxAllowedLFSOveragePerCrrPercent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetMinNumOfLFSOnlSolPerCrr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "targetMinNumOfLFSOnlSolPerCrr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>targetMinNumOfLFSOnlSolPerCrr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetMinNumOfLFSTotOnlSolPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "targetMinNumOfLFSTotOnlSolPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>targetMinNumOfLFSTotOnlSolPercent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fltOptLFSReuseLimitForNonAVS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "fltOptLFSReuseLimitForNonAVS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>fltOptLFSReuseLimitForNonAVS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fltOptLFSReuseLimitForAVS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "fltOptLFSReuseLimitForAVS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>fltOptLFSReuseLimitForAVS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsPenaltyCrrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "avsPenaltyCrrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>avsPenaltyCrrs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumOfNonStpOnlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxNumOfNonStpOnlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOfNonStpOnlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumOfNonStpInrlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxNumOfNonStpInrlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOfNonStpInrlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumOfSingleStpOnlSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxNumOfSingleStpOnlSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOfSingleStpOnlSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumOf2PlusStpSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxNumOf2PlusStpSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxNumOf2PlusStpSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAllowedOveragePerCrrPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "minAllowedOveragePerCrrPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>minAllowedOveragePerCrrPercent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAllowedOveragePerCrr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "minAllowedOveragePerCrr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>minAllowedOveragePerCrr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRelFareLvlOfxForNonStp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxRelFareLvlOfxForNonStp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxRelFareLvlOfxForNonStp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRelFareLvlOfxForCnx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "maxRelFareLvlOfxForCnx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>maxRelFareLvlOfxForCnx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOfMustPrice2PlusStpSol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "numOfMustPrice2PlusStpSol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>numOfMustPrice2PlusStpSol"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraryNumberThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItineraryNumberThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ItineraryNumberThreshold"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XOFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "XOFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "XOFaresType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptAllTaxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExemptAllTaxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExemptAllTaxes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptAllTaxesAndFees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExemptAllTaxesAndFees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ExemptAllTaxesAndFees"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TaxCodeAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tax"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptTax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExemptTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TaxCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightStopsAsConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightStopsAsConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightStopsAsConnectionsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketingSumOfLocals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketingSumOfLocals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>TicketingSumOfLocals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiAirportCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MultiAirportCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>MultiAirportCodes"));
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
        elemField.setFieldName("governingCarrierOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "GoverningCarrierOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "GoverningCarrierOverrideType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCallDirectCarriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExcludeCallDirectCarriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ExcludeCallDirectCarriers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ValidatingCarrierType>Preference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Preference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatingCarrierCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrierCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SettlementMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightRepeatLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightRepeatLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>FlightRepeatLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexibleFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlexibleFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FlexibleFaresType>FareParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareParameters"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diversityParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DiversityParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>DiversityParameters"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalFareLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdditionalFareLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>AdditionalFareLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareFocusRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareFocusRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>FareFocusRules"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellingLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SellingLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>SellingLevels"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>Budget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsPerDatePairList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OptionsPerDatePairList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OptionsPerDatePairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OptionsPerDatePair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountryPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>CountryPref"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailerRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RetailerRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RetailerRulesType>RetailerRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RetailerRule"));
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
