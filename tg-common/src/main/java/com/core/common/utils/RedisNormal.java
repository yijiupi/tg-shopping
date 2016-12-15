/**
 * RedisUtils.java
 */
package com.core.common.utils;

import redis.clients.jedis.Jedis;
/**
 * Redis连接（适用单个redis上，不用于集群）
 * @author Administrator
 *
 */
public class RedisNormal {
	
    private static String ADDR = "127.0.0.1";
    private static int PORT = 6379;
    //private static String AUTH = "51270815";
    
    public static Jedis getJedis() {  
    	Jedis jedis = new Jedis(ADDR, PORT);
    	//jedis.auth(AUTH);
		return jedis;
    }
}
