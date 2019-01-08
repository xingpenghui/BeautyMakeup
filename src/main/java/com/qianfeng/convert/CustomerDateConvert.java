package com.qianfeng.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

//Converter 接口中，第一个参数表示要处理的数据的类型，第二参数表示要转换的数据的类型
public class CustomerDateConvert implements Converter<String, Date>{
	
	SimpleDateFormat[] formats = new SimpleDateFormat[]{
			new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyyMMdd"),
			new SimpleDateFormat("yyyyMMddhhmmss"),
			new SimpleDateFormat("yyyy.MM.dd"),
			new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"),
			new SimpleDateFormat("yyyy")
	};

	@Override
	public Date convert(String activityDate) {
		// TODO Auto-generated method stub
		if(activityDate == null || activityDate.trim().isEmpty()){
			return null;
		}
		
		for (SimpleDateFormat sdf : formats) {
			try {
				// 日期格式字符串转为日期对象
				return sdf.parse(activityDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				continue;
			}
		}
		
		
		return null;
	}

}
