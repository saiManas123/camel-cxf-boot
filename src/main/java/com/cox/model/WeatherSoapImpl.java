
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cox.model;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-03-20T15:44:57.039+05:30
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "Weather",
                      portName = "WeatherSoap",
                      targetNamespace = "http://ws.cdyne.com/WeatherWS/",
                      wsdlLocation = "file:/C:/Users/mpradhan/Documents/My%20Received%20Files/17-03-2017/camel-test/src/main/resources/wsdl/weather.wsdl",
                      endpointInterface = "com.cox.bis.model.WeatherSoap")
                      
public class WeatherSoapImpl implements WeatherSoap {

    private static final Logger LOG = Logger.getLogger(WeatherSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cox.bis.model.WeatherSoap#getWeatherInformation(*
     */
    public com.cox.model.ArrayOfWeatherDescription getWeatherInformation() { 
        LOG.info("Executing operation getWeatherInformation");
        try {
            com.cox.model.ArrayOfWeatherDescription _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cox.bis.model.WeatherSoap#getCityWeatherByZIP(java.lang.String  zip )*
     */
    public com.cox.model.WeatherReturn getCityWeatherByZIP(java.lang.String zip) { 
        LOG.info("Executing operation getCityWeatherByZIP");
        System.out.println(zip);
        try {
            com.cox.model.WeatherReturn _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cox.bis.model.WeatherSoap#getCityForecastByZIP(java.lang.String  zip )*
     */
    public com.cox.model.ForecastReturn getCityForecastByZIP(java.lang.String zip) { 
        LOG.info("Executing operation getCityForecastByZIP");
        System.out.println(zip);
        try {
            com.cox.model.ForecastReturn _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
