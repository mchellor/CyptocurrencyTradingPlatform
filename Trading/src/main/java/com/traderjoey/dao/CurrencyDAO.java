package com.traderjoey.dao;

import com.traderjoey.bean.Currency;
import com.traderjoey.bean.CurrencyPrice;

public interface CurrencyDAO {
	/**
	 * 以下都是增删改查
	 * 
	 */
	public void add(Currency currency);

	public void delete(Currency currency);

	public void update(Currency currency);

	public void get(Currency currency);
	
	/**
	 * 在api远程取到了最新的价格之后,不止要在CurrencyPrices表里面插入,还要在这里更新
	 * @param currencyPrice
	 */
	public void setMostRecentPrice(CurrencyPrice currencyPrice);

}
