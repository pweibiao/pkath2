package com.pkath2.springcloud.aeskyedemo;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.pkath2.springcloud.aeskyedemo.WXBizMsgCrypt;

public class Program {

	public static void main(String[] args) throws Exception {

		//
		// 第三方回复公众平台
		//

		// 需要加密的明文
		String encodingAesKey = "43weiyiqiaencodingAesKey1111111111111111111";
		String token = "pamtest";
		String timestamp = "1648808269087";
		String nonce = "mQttnUnL";
		String appId = "myAPPID";
		String replyMsg = " 中文<xml><msgId>230372100</msgId><tm>1648808269085</tm><chatRecordId><![CDATA[1_5473555]]></chatRecordId><chatScore>4</chatScore><scoreDimension><![CDATA[项目1,项目2,项目3,项目4,项目5]]></scoreDimension><scoreSuggest><![CDATA[真不错啊真不错]]></scoreSuggest></xml>";

		WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId);
		String mingwen = pc.encryptMsg(replyMsg, timestamp, nonce);
		System.out.println("加密后: " + mingwen + "end");

		int startIndex = mingwen.indexOf("<![CDATA[");
		int endIndex = mingwen.indexOf("]]>");
		String startSubstring = mingwen.substring(0, startIndex+9);
		String keySubstring = mingwen.substring(startIndex+9,endIndex); // 密钥
		String endSubstring = mingwen.substring(endIndex);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		StringReader sr = new StringReader(mingwen);
		InputSource is = new InputSource(sr);
		Document document = db.parse(is);

		Element root = document.getDocumentElement();
		NodeList nodelist1 = root.getElementsByTagName("Encrypt");
		NodeList nodelist2 = root.getElementsByTagName("MsgSignature");

		String encrypt = nodelist1.item(0).getTextContent();
		String msgSignature = nodelist2.item(0).getTextContent();

		String format = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><Encrypt><![CDATA[%1$s]]></Encrypt></xml>";
		String fromXML = String.format(format, encrypt);

		//
		// 公众平台发送消息给第三方，第三方处理
		//

		// 第三方收到公众号平台发送的消息
		String result2 = pc.decryptMsg(msgSignature, timestamp, nonce, fromXML);
		System.out.println("解密后明文: " + result2);
		
		//pc.verifyUrl(null, null, null, null);
	}
}
