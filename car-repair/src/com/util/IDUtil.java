package com.util;

import java.security.MessageDigest;
import java.util.Calendar;
import java.util.UUID;

public class IDUtil {
	
	
	/**
	 * 生成一个令牌号
	 */
	public static String createToken(){
		String str =createId();
		return str.replaceAll("-", "");
	}
	
	/**
	 * 采用UUID算法生成一个唯一性的字符串
	 */
	public static String createId(){
//		UUID uuid=UUID.randomUUID();
//		String id=uuid.toString();
		Calendar calendar = Calendar.getInstance();
		String id=String.valueOf(calendar.getTime().getTime());
		return id;
	}
	
	public static void main(String[] args) {
		System.out.println(createId());
	}
}
