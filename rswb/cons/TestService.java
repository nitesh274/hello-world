package com.sps.portal.fileoperations.service;

import com.sps.portal.common.exception.TechnicalException;
import com.sps.portal.fileoperations.model.HelloResponse;
import com.sps.portal.fileoperations.model.ReqHello;

/**
 * Provides methods for meter reads details of a customer
 * from the MSSL and EBS systems.
 * @author Capgemini
 *
 */
public interface TestService {

	HelloResponse doHello(ReqHello reqHello) throws TechnicalException;
	

}
