package zly.util;

import java.util.Base64;

/**   
* Copyright: Copyright (c) 2018
* @ClassName: Base64Util.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: feri
* @date: 2018年12月18日 下午2:35:56 
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年12月18日       feri           v1.0.0               修改原因
*/
public class Base64Util {
	//转换为Base64
	public static String base64Enc(byte[] msg) {
		return Base64.getEncoder().encodeToString(msg);
	}
	//解码
	public static byte[] base64Dec(String msg) {
		return Base64.getDecoder().decode(msg);
	}

}
