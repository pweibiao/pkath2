package com.pkath2.springcloud.Common.utiltest;

import cn.hutool.core.util.XmlUtil;
import com.pkath2.springcloud.Common.PojoUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class UtilTest {




    public static void main(String[] args) {
        Document document = XmlUtil.readXML("<xml><msgId>230514656</msgId><tm>1648884375725</tm><companyStatus>2</companyStatus></xml>");
        System.out.println(document);

    }

}
