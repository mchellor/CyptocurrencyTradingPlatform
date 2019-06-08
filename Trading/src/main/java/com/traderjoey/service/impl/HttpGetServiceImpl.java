package com.traderjoey.service.impl;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.traderjoey.service.HttpGetService;

public class HttpGetServiceImpl implements HttpGetService {
	String urlString;
	String responseBodyString = null;
	JSONObject responseBodyJson = null;
	CloseableHttpClient client = HttpClients.createDefault();

	public HttpGetServiceImpl(String urlString) {
		super();
		this.urlString = urlString;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub

		try {
			HttpGet httpGet = new HttpGet(urlString);
			CloseableHttpResponse response = client.execute(httpGet);
			HttpEntity entity = response.getEntity();
			responseBodyString = EntityUtils.toString(entity);
			return responseBodyString;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JSONObject getJsonObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
