package com.traderjoey.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import com.traderjoey.bean.Currency;
import com.traderjoey.bean.CurrencyPrice;
import com.traderjoey.dao.CurrencyPricesDAO;

//FIXME chen
public class CurrencyPricesDAOImpl implements CurrencyPricesDAO{

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotal(Currency currency) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CurrencyPrice> list(Currency currency) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CurrencyPrice> list(Currency currency, Timestamp end, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(CurrencyPrice currencyPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Currency currency) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Timestamp end) {
		// TODO Auto-generated method stub
		
	}

}
