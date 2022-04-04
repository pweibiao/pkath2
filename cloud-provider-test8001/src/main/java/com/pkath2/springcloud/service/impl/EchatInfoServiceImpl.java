package com.pkath2.springcloud.service.impl;

import cn.hutool.core.util.XmlUtil;
import com.pkath2.springcloud.dto.BaseXMLDto;
import com.pkath2.springcloud.service.EchatInfoService;

public class EchatInfoServiceImpl implements EchatInfoService {


    @Override
    public String resolveChatStart(BaseXMLDto pojo) {
        String encrypt = pojo.getEncrypt();

        String dataType = pojo.getDataType();

        switch (dataType){
            // 公司状态变更
            case "companyStatus" :
                break;
            // 分组状态变更
            case "skillStatus":
                break;
            // 客服状态变更
            case "staffStatus":
                break;
            // 路由状态变更
            case "routeStatus":
                break;
            // 留言分配信息
            // 触发：留言分配
            case "leaveMsgOwner":
                break;

            // 对话开始
            // 触发：人工对话/留言 开始
            case "chatStart":
                break;
            // 触发：机器人对话开始
            case "robotChatStart":
                break;

            // 对话结束
            // 触发：人工对话/留言 结束
            case "chatEnd":
                break;
            // 触发：机器人对话结束
            case "robotChatEnd":
                break;

            // 对话接通
            // 触发：排队接通的对话
            case "chatAnswer":
                break;
            // 对话转接
            case "chatTransfer":
                break;

            // 对话内容
            case "chatContent":
                break;
            // 对话内容
            case "leaveMsgContent":
                break;

            // 对话评估
            case "chatSubject":
                break;
            // 对话满意度评价
            case "chatScore":
                break;
            // 客户数据
            case "crmStatus":
                break;
            // 访客进入
            case "visitorEnter":
                break;

            // 关键字数据 事件类型：
            case "keywordReturn":
                break;

            // 访客离开
            case "visitorOut":
                break;
            // 轨迹数据
            case "visitorTrackPage":
                break;

        }

        return null;
    }


    private void companyStatus(String xml) {

    }

}
