package com.traderjoey.utils;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

public class DBUtilTest {

	@Test
	public void testGetConnection() throws Exception {
		Connection connection = new DBUtil().getConnection();
		assertNotNull(connection);
	}

}
