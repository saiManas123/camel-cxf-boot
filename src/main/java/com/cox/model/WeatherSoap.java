package com.cox.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-03-20T15:44:57.083+05:30
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://ws.cdyne.com/WeatherWS/", name = "WeatherSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherSoap {

    /**
     * Gets Information for each WeatherID
     */
    @WebMethod(operationName = "GetWeatherInformation", action = "http://ws.cdyne.com/WeatherWS/GetWeatherInformation")
    @RequestWrapper(localName = "GetWeatherInformation", targetNamespace = "http://ws.cdyne.com/WeatherWS/", className = "com.cox.bis.model.GetWeatherInformation")
    @ResponseWrapper(localName = "GetWeatherInformationResponse", targetNamespace = "http://ws.cdyne.com/WeatherWS/", className = "com.cox.bis.model.GetWeatherInformationResponse")
    @WebResult(name = "GetWeatherInformationResult", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
    public com.cox.model.ArrayOfWeatherDescription getWeatherInformation();

    /**
     * Allows you to get your City's Weather, which is updated hourly. U.S. Only
     */
    @WebMethod(operationName = "GetCityWeatherByZIP", action = "http://ws.cdyne.com/WeatherWS/GetCityWeatherByZIP")
    @RequestWrapper(localName = "GetCityWeatherByZIP", targetNamespace = "http://ws.cdyne.com/WeatherWS/", className = "com.cox.bis.model.GetCityWeatherByZIP")
    @ResponseWrapper(localName = "GetCityWeatherByZIPResponse", targetNamespace = "http://ws.cdyne.com/WeatherWS/", className = "com.cox.bis.model.GetCityWeatherByZIPResponse")
    @WebResult(name = "GetCityWeatherByZIPResult", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
    public com.cox.model.WeatherReturn getCityWeatherByZIP(
        @WebParam(name = "ZIP", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
        java.lang.String zip
    );

    /**
     * Allows you to get your City Forecast Over the Next 7 Days, which is updated hourly. U.S. Only
     */
    @WebMethod(operationName = "GetCityForecastByZIP", action = "http://ws.cdyne.com/WeatherWS/GetCityForecastByZIP")
    @RequestWrapper(localName = "GetCityForecastByZIP", targetNamespace = "http://ws.cdyne.com/WeatherWS/", className = "com.cox.bis.model.GetCityForecastByZIP")
    @ResponseWrapper(localName = "GetCityForecastByZIPResponse", targetNamespace = "http://ws.cdyne.com/WeatherWS/", className = "com.cox.bis.model.GetCityForecastByZIPResponse")
    @WebResult(name = "GetCityForecastByZIPResult", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
    public com.cox.model.ForecastReturn getCityForecastByZIP(
        @WebParam(name = "ZIP", targetNamespace = "http://ws.cdyne.com/WeatherWS/")
        java.lang.String zip
    );
}
