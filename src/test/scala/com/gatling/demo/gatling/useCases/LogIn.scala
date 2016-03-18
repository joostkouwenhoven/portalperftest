package com.gatling.demo.gatling.useCases

import com.gatling.demo.gatling.configuration.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import jodd.util.URLDecoder
import scala.concurrent.duration._


object LogIn  {

	val useCase = 
        exec(
            http("Open Page")
            .get("/")
            )
        pause(2) 
        exec(
            http("Log In")
			 .post("/login")
			 .formParam("username", "joost@simtech.nl")
			 .formParam("password", "123456")
			 .check(status.is(200))
            )
            
}
