package com.cox.router;

import org.apache.camel.builder.RouteBuilder;

public class WeatherRB extends RouteBuilder {

	@Override
    public void configure() throws Exception {
      
		from("cxf:bean:weatherEndPoint")
		.routeId("weather-Route")
		.doTry()
			.choice()
			 .when(simple("${in.header.operationName} == 'GetCityWeatherByZIP'"))
			 	.log("Endpoint successfully executed")
			 .otherwise()
				 .log("Endpoint not found")
		.end();
    }
}
