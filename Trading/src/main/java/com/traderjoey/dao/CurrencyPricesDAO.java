package com.traderjoey.dao;

import java.sql.Timestamp;
import java.util.List;

import com.traderjoey.bean.Currency;
import com.traderjoey.bean.CurrencyPrice;

public interface CurrencyPricesDAO {

	/**
	 * 调试时使用,看看现在数据库里面一共有多少个价格条目
	 * 
	 * @return
	 */
	public int getTotal();

	/**
	 * 调试时使用,看看现在数据库里面指定货币一共有多少个价格条目
	 * 
	 * @return
	 */
	public int getTotal(Currency currency);

	/**
	 * 查询指定货币的价格列表,交易页面使用,非常重要
	 * 
	 * @param currency
	 * @return
	 */
	public List<CurrencyPrice> list(Currency currency);

	/**
	 * 列出在某个时刻之前的,指定数量的,指定货币的价格
	 * 
	 * @param currency
	 * @param start
	 * @param count
	 * @return
	 */
	public List<CurrencyPrice> list(Currency currency, Timestamp end, int count);

	/**
	 * 存储数据时使用,重要方法,也可调试用,插入一个伪造的currency,应具timestamp备查重功能,若有重复,抛出自定义异常
	 * 
	 * @param currency
	 */
	public void add(CurrencyPrice currencyPrice);
	
	/**
	 * 删除指定货币的所有价格记录
	 * @param currency
	 */
	public void delete(Currency currency);

	/**
	 * 删除在某个时刻之前的,指定货币的价格记录
	 * @param end
	 * @param count
	 */
	public void delete(Timestamp end);
}
