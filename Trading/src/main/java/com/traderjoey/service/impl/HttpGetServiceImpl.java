package com.traderjoey.service.impl;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import com.traderjoey.dto.RequestUrl;
import com.traderjoey.dto.ResponseInfo;


public class HttpGetServiceImpl{
	RequestUrl url;
	ResponseInfo response;
	CloseableHttpClient client = HttpClients.createDefault();
	HttpEntity entity = null;

	public HttpGetServiceImpl(RequestUrl url) {
		super();
		this.url = url;
		try {
			HttpGet httpGet = new HttpGet(url.urlString);
			CloseableHttpResponse response = client.execute(httpGet);
			HttpEntity entity = response.getEntity();
			this.entity = entity;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
