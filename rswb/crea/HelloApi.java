package com.sps.portal.energyefficiency.webservice;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Apiadapter")
public class HelloApi {

	@RequestMapping(path = "/hello", method = RequestMethod.POST )
	public HelloRes helloRest(@RequestBody HelloReq req) {

		HelloRes res = new HelloRes();
		if ("morning".equalsIgnoreCase(req.getTime()))
			res.setGreet("Hello Good morning");

		else
			res.setGreet("please specify morning");
		return res;
	}

}
