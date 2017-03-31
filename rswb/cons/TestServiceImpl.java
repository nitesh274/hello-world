package com.sps.portal.fileoperations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sps.portal.common.constants.InterfaceEndpointConstants;
import com.sps.portal.common.exception.TechnicalException;
import com.sps.portal.common.util.RestClientSapUtil;
import com.sps.portal.fileoperations.model.HelloResponse;
import com.sps.portal.fileoperations.model.ReqHello;

@Service("testservice")
public class TestServiceImpl implements TestService {
	@Autowired
	RestClientSapUtil restClientSapUtil;


	@Override
	public HelloResponse doHello(ReqHello reqHello) throws TechnicalException {
		HelloResponse response;
		response=restClientSapUtil.callService(reqHello,
				InterfaceEndpointConstants.HELLO, HelloResponse.class);
		return response;
	}

}
