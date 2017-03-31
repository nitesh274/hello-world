package com.sps.portal.fileoperations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sps.portal.common.exception.MicroServiceException;
import com.sps.portal.common.model.RespData;
import com.sps.portal.common.util.RestClientSapUtil;
import com.sps.portal.fileoperations.model.HelloResponse;
import com.sps.portal.fileoperations.model.ReqHello;
import com.sps.portal.fileoperations.service.TestService;

@RestController
@RequestMapping(value = "helloApi")
public class TestController {	
	@Autowired
	private TestService meterReadService = null;
	@Autowired
	RestClientSapUtil restClientSapUtil;
	
	@RequestMapping(path = "/doHello", method = RequestMethod.POST)
	public ResponseEntity<RespData> doHello(@RequestBody ReqHello reqHello) throws MicroServiceException {
		
		ResponseEntity<RespData> responseEntity = null;
		RespData respData = null;
		
		HelloResponse helloResponse = null;

		try {
			helloResponse = meterReadService.doHello(reqHello);
			respData = new RespData(helloResponse, null);
			responseEntity = new ResponseEntity<>(respData, HttpStatus.OK);
		} catch (Exception e) {

			responseEntity = restClientSapUtil.prepareErrorResponse(e);
			
		}

	
		return responseEntity;
	}
}
