package com.traderjoey.service.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HttpServiceImplTest {

	@Test
	public void testHttpCall() throws Exception {
		String resultString = new HttpGetServiceImpl("https://api.worldtradingdata.com/api/v1/stock?api_token=lph4ntTgbcPLtl7Efb8KkwxwgW7Ldgiqs5VXTuBDp0WvWJEoJ7Ahz6sKNXK0&symbol=AAPL").getString();
		System.out.println(resultString);
		assertNotNull(resultString);
	}

}
