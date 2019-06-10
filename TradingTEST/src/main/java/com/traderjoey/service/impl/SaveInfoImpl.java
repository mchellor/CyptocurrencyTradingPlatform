package com.traderjoey.service.impl;

import com.traderjoey.dto.RequestUrl;
import com.traderjoey.utils.Key;

public class SaveInfoImpl extends HttpGetServiceImpl {

	public SaveInfoImpl() {
		super(new RequestUrl("https://api.nomics.com/v1/prices?key=" + Key.keyString));
	}
	
	public String getString() {
		// FIXME fan
		return null;
	}
}
