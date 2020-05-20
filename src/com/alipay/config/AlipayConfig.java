package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102400752326";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDFfocAXwDnURS8LYwd8nUp8kCPqyQ0ukr/yQ2I93dptR/Wvsh8w2iRbpcVSLLEJmFBKwm3RiAFlEoupXhZ+EOLDFIarHfRDCwnfuDPN67qEOOnY9uRvEfRPf4vDsk9ugpcpH86tsNvHERWXPpR3VpyJGIWZrHCxX9NFTEkswcBbZRwPI47g1y7BNFwClJCiHs3HulELeHJDqp1/BVdNrNkIUBfACuJduQEgqT7e2luZwWFBgs6IULkpwjZHgEnp8l239w9EJivaJ0xRPSUzy6TFbi7gRYfl8p+YU+MYaisCUZ0yzPq5R9HNlMFKvsq6ICaQkz8p72W0gi/UPS5JoHVAgMBAAECggEAGC+opNj9qVZ6rZj+YeSBiMOMOIwDARoXeT/MEowL6bwuzAPNVcowki7y/b5Ldk4k9vAoXnOOFGDWvOOy24HV879shqu8eLN+7M9TBM2S9ENhPeyyxSRDv1JSQL0U1CRmhHX4xt3/DSpvDAyS81eibfwarxegiXPaZTxFKnNqVjg4Im2lo4fIYe1Tvg/vgaypwbT9spCnbYIV2x/Yi+XLNyN9DKx2WzFEIgBBnRwenRWwFtIjiQe7m6cWNaLyd7sJszd3ViPny9CksZEGKQ+ud6qOGaIEsQpknELzjDOi0QHklL0xYnqlMQsZN6sNTss0D97AF+P/c9JNu50JGwUxAQKBgQDskXc53ag2peVIB3n9ISx174CU1cGiV+UYgxw7fauvDeJ/HdKo69fL44A9JsiBt+bVhriTj5knkxn/fjfAvjtUAC5XLnqtZtd6lLqQ6FXf5A2jwun1wtvzZ5utj3+UxKR3W4TSUGk95EShrPiOIffSzh7koSk1dtKE+9c1hLGVIQKBgQDVt2ru5hJlX8UW2zWiE6N8j2zYfw+/qP8avtRAVRoh19lyNdaXfKcXAQlvYOx0dwR0vuKqymM21TJkPI+eKlk2LFZ4T51SMKFzLMjqNbJqtaImD75I5o4cqndNK6tPqDdm12Jh3nxmuR5nMWcGFBZqt5I3eMWueFvWQAnEj8xiNQKBgQDOohDd/nqboTQwQjePnpZTPSu21S8ZOmTlkD/sxsxbT2lzVv1WhworEUBGKcYhaBy8jbxTR66jHp4qyHiyZncz3CSeCf8lzxqP+7EqOYYo1e4ECJCLFfVBGlKkux7ZNxnhF5NgkNQcN3KrNYa1v33UKC5bzVlNVch0V/WWzZy/gQKBgB76w4l12FzRkSRLCm9AIYbA06peYM4LlU8vMl1Q+MTHIUIpA75Z127CO7fleOE5D3BM61aOl+su5GsbTEZFJUFxE+fEwq1TV1P2vfkVZ5OIWMTjq1Wt9hO5simBlweo/r7todlGAwpw8zNKOgDrkIRPr+ZSn3U3BTj9d20C20GxAoGBALcO3KbZdIwuG6+Sp5vJwvMJrBgxtDn/Vm+gGvr/FpvjUzXYe9pq/wCfH0Q8FtYKNJ1yLTrm/8gkHRim/114kTdpT77+N/eHjIGLQLQFw85LB83jONyWPcMXDYzD3mOveVukgF8t47qLoAHrekkcNeAQ4SyVtQGewKuagomcYOD2";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs+Ngny79P8eJWbwTZ1h83gTissJUNwZJ05lOBq6RybSSd6VYLj6yiGITEd2EewM0RnNjhQTxUnDB3KcqzhWgxKFjsrvtIEaUTR7pUf/csQFfOqTBjTIHitBINFEE6KX5/ygKYXy5bdLbtN7+ecXFVdaRTQcFvoMPtERKZbRlIe8WEL43r9NkN154x15OcEQsWIlIMU3KjtQKg85LLjUWM+34SDI/1ENP55M+5plw5xTNPz99kHjPvBySDU7gPzS47LYYCsOaWlerTv+sIZx8z8K4bWHOVFbgnSi3xps5d5z3TCup4/4N8CRLcVV+OE8vqLx0gmHSWpdpz2MdbYjClQIDAQAB";
	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/ClientTest/error.html";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/ClientTest/result.html";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";

//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
