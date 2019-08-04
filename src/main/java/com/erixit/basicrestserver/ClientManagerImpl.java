package com.erixit.basicrestserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ClientManagerImpl implements ClientManager {
	private static Logger logger = LoggerFactory.getLogger(ClientManagerImpl.class);

	@Override
	public Boolean verify() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		logger.info("Reset succeeded");
	}

}
