package com.gatling.demo.gatling.useCases

import com.gatling.demo.gatling.configuration.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import jodd.util.URLDecoder
import scala.concurrent.duration._


object OpenApp  {

	val useCase1 = 
        exec(
            http("Open Page")
            .get("/")

     val useCase2 = 
        exec(
            http("Log In")
			 .post("/login")
			 .formParam("username", "joost@simtech.nl")
			 .formParam("password", "123456")
            )
            
	val useCase3 = 
        exec(
            http("Get Servicess")
		     .get("/getservices")
             check.status.is(200)
            )       
        
    val useCase4 = 
        exec(http("Log Out")
		.post("/logout")
       )
}
