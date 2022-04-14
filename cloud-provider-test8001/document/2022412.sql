USE `server_echat_data`;
DROP TABLE
    IF
    EXISTS `base_chat_data`;
CREATE TABLE `base_chat_data` (
                                  `record_id` VARCHAR ( 100 ) NOT NULL COMMENT '对话记录的ID',
                                  `status` INT ( 2 ) DEFAULT NULL COMMENT '对话状态，1：人工对话开始 2：人工对话结束 3：留言开始 4: 留言结束 5：机器人对话开始 6：机器人对话结束',
                                  `answer_time` datetime DEFAULT NULL COMMENT '对话接通时间',
                                  `wait_time` INT ( 11 ) DEFAULT NULL COMMENT '访客等待时长，单位：秒',
                                  `type` INT ( 2 ) DEFAULT NULL COMMENT '会话类型，1：在线对话 2：忙碌对话 3：离线消息 5:机器人对话',
                                  `staff_id` BIGINT ( 11 ) DEFAULT NULL COMMENT '接待对话的客服ID',
                                  `staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服登录名',
                                  `staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服姓名',
                                  `staff_role` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服的内部角色名称',
                                  `page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话页面，微信对话为空',
                                  `page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话页面标题',
                                  `times` INT DEFAULT NULL COMMENT '访客的对话次数',
                                  `event` INT ( 11 ) DEFAULT NULL COMMENT '对话发起的方式，1：点击图标 2：接受邀请对话 3：客服主动对话 4：微信输入任意文字接入对话 5：微信点击菜单接入 6：微信输入指定文字接入 7：微信机器人转人工 11：机器人转人工 12：机器人转留言 14：web自动弹屏自动接入 15：web自动弹屏访客输入消息接入 16：商户留言转平台接入 17：微信开发者接入 18：自定义渠道事件接入 19：自定义渠道发送消息接入',
                                  `request_time` datetime DEFAULT NULL COMMENT '请求对话的时间',
                                  `entrance` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话入口',
                                  PRIMARY KEY ( `record_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_meta_data`;
CREATE TABLE `base_meta_data` (
                                  `u_id` VARCHAR ( 100 ) NOT NULL COMMENT '会员的唯一值',
                                  `grade` INT ( 11 ) DEFAULT NULL COMMENT '会员级别',
                                  `category` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员类别',
                                  `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员姓名',
                                  `nick_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员昵称',
                                  `gender` INT ( 1 ) DEFAULT NULL COMMENT '会员性别',
                                  `age` INT ( 2 ) DEFAULT NULL COMMENT '会员年龄',
                                  `birthday` datetime DEFAULT NULL COMMENT '会员生日',
                                  `marital_status` INT ( 1 ) DEFAULT NULL COMMENT '会员婚姻状况，0：未知 1：未婚 2：已婚',
                                  `phone` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员联系电话',
                                  `qq` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员QQ',
                                  `wechat` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员微信',
                                  `email` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员邮件地址',
                                  `nation` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员国家',
                                  `province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员省份',
                                  `city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员城市',
                                  `address` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员地址',
                                  `photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员头像地址',
                                  `memo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员备注信息',
                                  PRIMARY KEY ( `u_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '会员信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_visitor_data`;
CREATE TABLE `base_visitor_data` (
                                     `id` VARCHAR ( 100 ) NOT NULL COMMENT '访客ID，身份描述+ID',
                                     `enter_time` datetime DEFAULT NULL COMMENT '访客进入的时间',
                                     `media` INT DEFAULT NULL COMMENT '客户端媒介，1：PC网页 2：手机网页 5：微信 6：sdk 200：自定义渠道',
                                     `type` INT DEFAULT NULL COMMENT '访客身份类型，-1：未知 0：游客(web) 1：会员(vip) 2：SDK游客(sdk) 4：微信（wechat) 5：自定义接口(custom)',
                                     `media_id` INT DEFAULT NULL COMMENT 'visitorType==5时，此值有效，值为自定义渠道的渠道ID',
                                     `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客姓名',
                                     `photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客头像',
                                     `visit_times` INT DEFAULT NULL COMMENT '访客来访次数',
                                     `lan` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访问者语言',
                                     `ip` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访IP',
                                     `country` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在国家',
                                     `province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在省份',
                                     `city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在城市',
                                     `browser_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器',
                                     `browser_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器版本',
                                     `screen_resolution` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的屏幕分辨率',
                                     `os_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客操作系统',
                                     `os_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '操作系统版本',
                                     `se` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索引擎',
                                     `keyword` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索关键字',
                                     `bidding_word` VARCHAR ( 100 ) DEFAULT NULL COMMENT '推广词',
                                     `keyword_type` VARCHAR ( 100 ) DEFAULT NULL COMMENT '关键词类型 0：未区分SEO、推广 1：自然优化 2： 推广',
                                     `refer_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来源的URL，如果是微信，就是公众号名',
                                     `first_time` datetime DEFAULT NULL COMMENT '进入网站的时间',
                                     `first_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页',
                                     `first_page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页面标题',
                                     `last_chat_time` datetime DEFAULT NULL COMMENT '上次对话时间',
                                     `last_chat_staff_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '上次对话客服ID',
                                     `last_chat_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服账号',
                                     `last_chat_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服姓名',
                                     PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '访客信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_route_data`;
CREATE TABLE `base_route_data` (
                                   `id` BIGINT ( 20 ) NOT NULL COMMENT '接入对话的路由ID,-1：web访客的默认路由 -2：微信对话的默认路由 -3：SDK对话的默认路由',
                                   `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由名称',
                                   `style_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '路由所使用的样式ID',
                                   `style_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由所使用样式的名称',
                                   `chat_department_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '本次分配对话的分组ID，如果是全部人员可接待则ID为0',
                                   `chat_department_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '本地分配对话的分组名称',
                                   PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '路由信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_staff_data`;
CREATE TABLE `base_staff_data` (
                                   `id` BIGINT ( 11 ) NOT NULL COMMENT 'ID',
                                   `log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '登录名',
                                   `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '姓名',
                                   `role` VARCHAR ( 100 ) DEFAULT NULL COMMENT '内部角色名称',
                                   PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '客服信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `server_chat_answer`;
CREATE TABLE `server_chat_answer` (
                                      `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                      `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                      `chat_status` INT ( 2 ) DEFAULT NULL COMMENT '对话状态，1：人工对话开始 2：人工对话结束 3：留言开始 4: 留言结束 5：机器人对话开始 6：机器人对话结束',
                                      `chat_answer_time` datetime DEFAULT NULL COMMENT '对话接通时间',
                                      `chat_wait_time` INT ( 11 ) DEFAULT NULL COMMENT '访客等待时长，单位：秒',
                                      `chat_type` INT ( 2 ) DEFAULT NULL COMMENT '会话类型，1：在线对话 2：忙碌对话 3：离线消息 5：机器人对话',
                                      `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                      `chat_staff_id` BIGINT ( 11 ) DEFAULT NULL COMMENT '接待对话的客服ID',
                                      `chat_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服登录名',
                                      `chat_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服姓名',
                                      `chat_staff_role` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服的内部角色名称',
                                      PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话接通-服务器数据';
DROP TABLE
    IF
    EXISTS `server_chat_start`;
CREATE TABLE `server_chat_start` (
                                     `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                     `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                     `chat_status` INT ( 2 ) DEFAULT NULL COMMENT '对话状态，1：人工对话开始 2：人工对话结束 3：留言开始 4: 留言结束 5：机器人对话开始 6：机器人对话结束',
                                     `my_data` VARCHAR ( 100 ) DEFAULT NULL COMMENT '开发者自定义扩展数据，如果打开对话时加了这个参数则传递该数据',
                                     `meta_u_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员的唯一值',
                                     `meta_grade` INT ( 11 ) DEFAULT NULL COMMENT '会员级别',
                                     `meta_category` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员类别',
                                     `meta_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员姓名',
                                     `meta_nick_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员昵称',
                                     `meta_gender` INT ( 1 ) DEFAULT NULL COMMENT '会员性别',
                                     `meta_age` INT ( 2 ) DEFAULT NULL COMMENT '会员年龄',
                                     `meta_birthday` datetime DEFAULT NULL COMMENT '会员生日',
                                     `meta_marital_status` INT ( 1 ) DEFAULT NULL COMMENT '会员婚姻状况，0：未知 1：未婚 2：已婚',
                                     `meta_phone` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员联系电话',
                                     `meta_qq` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员QQ',
                                     `meta_wechat` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员微信',
                                     `meta_email` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员邮件地址',
                                     `meta_nation` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员国家',
                                     `meta_province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员省份',
                                     `meta_city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员城市',
                                     `meta_address` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员地址',
                                     `meta_photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员头像地址',
                                     `meta_memo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员备注信息',
                                     `visitor_enterTime` datetime DEFAULT NULL COMMENT '访客进入的时间',
                                     `visitor_media` INT DEFAULT NULL COMMENT '客户端媒介，1：PC网页 2：手机网页 5：微信 6：sdk 200：自定义渠道',
                                     `visitor_type` INT DEFAULT NULL COMMENT '访客身份类型，-1：未知 0：游客(web) 1：会员(vip) 2：SDK游客(sdk) 4：微信（wechat) 5：自定义接口(custom)',
                                     `media_id` INT DEFAULT NULL COMMENT '访客身份类型，-1：未知 0：游客(web) 1：会员(vip) 2：SDK游客(sdk) 4：微信（wechat) 5：自定义接口(custom)',
                                     `visitor_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客ID，身份描述+ID',
                                     `visitor_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客姓名',
                                     `visitor_photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客头像',
                                     `visit_times` INT DEFAULT NULL COMMENT '访客来访次数',
                                     `visitor_lan` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访问者语言',
                                     `visitor_ip` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访IP',
                                     `visitor_country` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在国家',
                                     `visitor_province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在省份',
                                     `visitor_city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在城市',
                                     `browser_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器',
                                     `browser_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器版本',
                                     `screen_resolution` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的屏幕分辨率',
                                     `os_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客操作系统',
                                     `os_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '操作系统版本',
                                     `se` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索引擎',
                                     `keyword` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索关键字',
                                     `bidding_word` VARCHAR ( 100 ) DEFAULT NULL COMMENT '推广词',
                                     `keyword_type` VARCHAR ( 100 ) DEFAULT NULL COMMENT '关键词类型 0：未区分SEO、推广 1：自然优化 2： 推广',
                                     `refer_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来源的URL，如果是微信，就是公众号名',
                                     `first_time` datetime DEFAULT NULL COMMENT '进入网站的时间',
                                     `first_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页',
                                     `first_page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页面标题',
                                     `last_chat_time` datetime DEFAULT NULL COMMENT '上次对话时间',
                                     `last_chat_staff_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '上次对话客服ID',
                                     `last_chat_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服账号',
                                     `last_chat_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服姓名',
                                     `route_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '接入对话的路由ID,-1：web访客的默认路由 -2：微信对话的默认路由 -3：SDK对话的默认路由',
                                     `route_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由名称',
                                     `style_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '路由所使用的样式ID',
                                     `style_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由所使用样式的名称',
                                     `chat_department_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '本次分配对话的分组ID，如果是全部人员可接待则ID为0',
                                     `chat_department_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '本地分配对话的分组名称',
                                     `chat_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话页面，微信对话为空',
                                     `chat_page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话页面标题',
                                     `chat_times` INT DEFAULT NULL COMMENT '访客的对话次数',
                                     `chat_event` INT ( 11 ) DEFAULT NULL COMMENT '对话发起的方式，1：点击图标 2：接受邀请对话 3：客服主动对话 4：微信输入任意文字接入对话 5：微信点击菜单接入 6：微信输入指定文字接入 7：微信机器人转人工 11：机器人转人工 12：机器人转留言 14：web自动弹屏自动接入 15：web自动弹屏访客输入消息接入 16：商户留言转平台接入 17：微信开发者接入 18：自定义渠道事件接入 19：自定义渠道发送消息接入',
                                     `chat_request_time` datetime DEFAULT NULL COMMENT '请求对话的时间',
                                     `chat_answer_time` datetime DEFAULT NULL COMMENT '对话接通的时间',
                                     `chat_type` INT ( 2 ) DEFAULT NULL COMMENT '会话类型，1：在线对话 2：忙碌对话 3：离线消息 5：机器人对话',
                                     `chat_staff_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '接待对话的客服ID，人工对话有效',
                                     `chat_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服登录名，人工对话有效',
                                     `chat_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服姓名，人工对话有效',
                                     `chat_staff_role` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服的内部角色名称',
                                     `chat_entrance` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话入口',
                                     `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                     PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话开始-服务器数据';
DROP TABLE
    IF
    EXISTS `server_chat_score`;
CREATE TABLE `server_chat_score` (
                                     `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                     `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                     `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                     `chat_score` INT ( 2 ) DEFAULT NULL COMMENT '满意度评价，1：非常不满意 2：不满意 3：一般 4：满意 5：非常满意',
                                     `score_dimension` VARCHAR ( 100 ) DEFAULT NULL COMMENT '评价维度',
                                     `score_suggest` VARCHAR ( 100 ) DEFAULT NULL COMMENT '评价的内容',
                                     `chat_staff_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '接待对话的客服ID，评价发生时正在接待对话有效，评价对话技术无此信息',
                                     `chat_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服登录名，评价发生时正在接待对话有效，评价对话技术无此信息',
                                     `chat_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服姓名，评价发生时正在接待对话有效，评价对话技术无此信息',
                                     PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话满意度评价-服务器数据';
DROP TABLE
    IF
    EXISTS `server_chat_end`;
CREATE TABLE `server_chat_end` (
                                   `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                   `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                   `chat_status` INT ( 2 ) DEFAULT NULL COMMENT '对话状态，1：人工对话开始 2：人工对话结束 3：留言开始 4: 留言结束 5：机器人对话开始 6：机器人对话结束',
                                   `visitor_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客id',
                                   `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                   `chat_end_time` datetime DEFAULT NULL COMMENT '对话结束时间',
                                   `chat_end_type` INT ( 2 ) DEFAULT NULL COMMENT '对话结束方式，0：未知 1：访客结束对话 2：客服结束对话 3：访客超时 5：客服退出 6：系统关闭 8：访客长时间未回复结束 12：忙碌放弃结束 14：留言超时结束 15：机器人自动转人工结束 16：机器人手动转人工结束 18：客服主动对话后留言/机器人对话结束',
                                   `chat_total_time` INT ( 11 ) DEFAULT NULL COMMENT '通话时长 单位：毫秒',
                                   `chat_wait_time` INT ( 11 ) DEFAULT NULL COMMENT '等待时长 单位：毫秒',
                                   `first_answer_time` INT ( 11 ) DEFAULT NULL COMMENT '首次响应时长 单位：毫秒',
                                   `avg_answer_time` INT ( 11 ) DEFAULT NULL COMMENT '平均响应时长 单位：毫秒',
                                   `visitor_send_msg` INT ( 11 ) DEFAULT NULL COMMENT '访客发送消息条数',
                                   `staff_send_msg` INT ( 11 ) DEFAULT NULL COMMENT '客服发送消息条数',
                                   `perfect_matchs` INT ( 11 ) DEFAULT NULL COMMENT '完全匹配数（机器人对话）',
                                   `exact_matchs` INT ( 11 ) DEFAULT NULL COMMENT '精准匹配数（机器人对话）',
                                   `similarity_matchs` INT ( 11 ) DEFAULT NULL COMMENT '相似匹配数（机器人对话）',
                                   `mis_match_count` INT ( 11 ) DEFAULT NULL COMMENT '未命中数（机器人对话）',
                                   `solved_count` INT ( 11 ) DEFAULT NULL COMMENT '点击解决数（机器人对话）',
                                   `unsolved_count` INT ( 11 ) DEFAULT NULL COMMENT '点击未解决数（机器人对话）',
                                   PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话结束-服务器数据';
DROP TABLE
    IF
    EXISTS `server_chat_content`;
CREATE TABLE `server_chat_content` (
                                       `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                       `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                       `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                       `chat_content` text DEFAULT NULL COMMENT '对话内容',
                                       PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话内容-服务器数据';
DROP TABLE
    IF
    EXISTS `server_leave_msg_content`;
CREATE TABLE `server_leave_msg_content` (
                                            `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                            `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                            `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                            `chat_content` text DEFAULT NULL COMMENT '对话内容',
                                            `visitor_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的唯一值',
                                            `category` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户类别',
                                            `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户姓名',
                                            `nick_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户的昵称',
                                            `gender` INT ( 1 ) DEFAULT NULL COMMENT '性别，0：未知 1：男 2：女',
                                            `age` VARCHAR ( 100 ) DEFAULT NULL COMMENT '年龄',
                                            `birthday` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户生日',
                                            `marital_status` INT ( 1 ) DEFAULT NULL COMMENT '婚姻状况，0：未知 1：未婚 2：已婚',
                                            `phone` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户电话号码',
                                            `qq` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户qq号码',
                                            `wechat` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户微信号',
                                            `email` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户邮箱地址',
                                            `nation` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户所在国家',
                                            `province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户所在省份',
                                            `city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户所在城市',
                                            `address` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户地址',
                                            `photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户头像地址',
                                            `c1` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段1',
                                            `c2` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段2',
                                            `c3` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段3',
                                            `c4` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段4',
                                            `c5` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段5',
                                            `c6` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段6',
                                            `c7` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段7',
                                            `c8` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段8',
                                            `c9` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段9',
                                            `c10` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段10',
                                            `c11` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段11',
                                            `c12` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段12',
                                            `c13` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段13',
                                            `c14` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段14',
                                            `c15` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段15',
                                            `c16` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段16',
                                            `c17` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段17',
                                            `c18` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段18',
                                            `c19` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段19',
                                            `c20` VARCHAR ( 100 ) DEFAULT NULL COMMENT '自定义字段20',
                                            `memo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客户信息备注',
                                            PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '访客留言内容-服务器数据';
DROP TABLE
    IF
    EXISTS `server_chat_subject`;
CREATE TABLE `server_chat_subject` (
                                       `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                       `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                       `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                       `chat_subject` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话评估的主题',
                                       `chat_subject_memo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话评估备注',
                                       PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话评估-服务器数据';
DROP TABLE
    IF
    EXISTS `sever_staff_status`;
CREATE TABLE `sever_staff_status` (
                                      `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                      `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                      `staff_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '状态发生变化的客服ID',
                                      `staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '状态发生变化的客服账号',
                                      `staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '状态发生变化的客服姓名',
                                      `staff_status` INT ( 1 ) DEFAULT NULL COMMENT '当前客服的状态，1：在线 2：忙碌 3：离开 4：隐身 5：退出',
                                      PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '客服状态变更-服务器数据';
DROP TABLE
    IF
    EXISTS `sever_company_status`;
CREATE TABLE `sever_company_status` (
                                        `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                        `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                        `company_status` INT ( 1 ) DEFAULT NULL COMMENT '公司所有客服在线状态，1：在线 2：离线',
                                        PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '公司状态变更-服务器数据';
DROP TABLE
    IF
    EXISTS `sever_leave_msg_owner`;
CREATE TABLE `sever_leave_msg_owner` (
                                         `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                         `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                         `visitor_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员的唯一值',
                                         `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                         `staff_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '客服id，-1：系统自动分配',
                                         `staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客服账号',
                                         `staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '客服姓名',
                                         `owner_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '所有者的ID',
                                         `owner_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '所有者登录的用户名',
                                         `owner_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '所有者姓名',
                                         `chat_department_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '本次分配对话的分组ID，0：全部人员可接待',
                                         `chat_department_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '本地分配对话的分组名称',
                                         PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '留言分配信息-服务器数据';
DROP TABLE
    IF
    EXISTS `sever_chat_transfer`;
CREATE TABLE `sever_chat_transfer` (
                                       `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                       `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                       `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话记录的ID',
                                       `transfer_time` datetime DEFAULT NULL COMMENT '对话转接时间',
                                       `from_staff_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '发起转接的客服ID',
                                       `from_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '发起转接请求的客服登录名',
                                       `from_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '发起转接请求的客服名称',
                                       `to_staff_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接受转接的客服ID',
                                       `to_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接受转接的客服登陆名',
                                       `to_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接受转接的客服名称',
                                       PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话转接-服务器数据';
DROP TABLE
    IF
    EXISTS `sever_visitor_enter`;
CREATE TABLE `sever_visitor_enter` (
                                       `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                       `tm` BIGINT ( 20 ) DEFAULT NULL NULL COMMENT '时间戳',
                                       `visitor_enter_time` datetime DEFAULT NULL COMMENT '访客进入的时间',
                                       `visitor_media` INT DEFAULT NULL COMMENT '客户端媒介，1：PC网页 2：手机网页 5：微信 6：sdk 200：自定义渠道',
                                       `visitor_type` INT DEFAULT NULL COMMENT '访客身份类型，-1：未知 0：游客(web) 1：会员(vip) 2：SDK游客(sdk) 4：微信（wechat) 5：自定义接口(custom)',
                                       `visitor_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客ID，身份描述+ID',
                                       `visitor_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客姓名',
                                       `visitor_photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客头像',
                                       `visit_times` INT DEFAULT NULL COMMENT '访客来访次数',
                                       `visitor_lan` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访问者语言',
                                       `visitor_ip` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访IP',
                                       `visitor_country` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在国家',
                                       `visitor_province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在省份',
                                       `visitor_city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在城市',
                                       `browser_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器',
                                       `browser_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器版本',
                                       `screen_resolution` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的屏幕分辨率',
                                       `os_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客操作系统',
                                       `os_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '操作系统版本',
                                       `se` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索引擎',
                                       `keyword` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索关键字',
                                       `bidding_word` VARCHAR ( 100 ) DEFAULT NULL COMMENT '推广词',
                                       `keyword_type` VARCHAR ( 100 ) DEFAULT NULL COMMENT '关键词类型 0：未区分SEO、推广 1：自然优化 2： 推广',
                                       `refer_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来源的URL，如果是微信，就是公众号名',
                                       `first_time` datetime DEFAULT NULL COMMENT '进入网站的时间',
                                       `first_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页',
                                       `first_page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页面标题',
                                       `last_chat_time` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话时间',
                                       `last_chat_staff_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服ID',
                                       `last_chat_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服账号',
                                       `last_chat_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服姓名',
                                       `route_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '接入对话的路由ID,-1：web访客的默认路由 -2：微信对话的默认路由 -3：SDK对话的默认路由',
                                       `route_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由名称',
                                       `style_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '路由所使用的样式ID',
                                       `style_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由所使用样式的名称',
                                       `route_status` INT ( 1 ) DEFAULT NULL COMMENT '指定路由的状态，1：在线 2：离线',
                                       `chat_department_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '本次分配对话的分组ID，如果是全部人员可接待则ID为0',
                                       `chat_department_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '本地分配对话的分组名称',
                                       `track_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '此次浏览轨迹的ID，浏览记录唯一值',
                                       PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '访客进入-服务器数据';
DROP TABLE
    IF
    EXISTS `sever_visitor_track_page`;
CREATE TABLE `sever_visitor_track_page` (
                                            `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                            `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                            `visitor_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员的唯一值',
                                            `track_record_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '此次浏览轨迹ID',
                                            PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '轨迹数据-服务器数据';
DROP TABLE
    IF
    EXISTS `sever_visitor_out`;
CREATE TABLE `sever_visitor_out` (
                                     `msg_id` BIGINT ( 20 ) NOT NULL COMMENT '消息的唯一ID',
                                     `tm` BIGINT ( 20 ) DEFAULT NULL COMMENT '时间戳',
                                     `route_status` INT ( 1 ) DEFAULT NULL COMMENT '指定路由的状态，1：在线 2：离线',
                                     `track_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '此次浏览轨迹的ID，浏览记录唯一值',
                                     `visit_page_count` INT ( 11 ) DEFAULT NULL COMMENT '访客退出时此次浏览页面的数量',
                                     `visit_total_time` BIGINT ( 20 ) DEFAULT NULL COMMENT '此次浏览页面访客的总浏览时长 单位：秒',
                                     `chat_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '整个会话范围过程产生的人工对话的ID、机器人对话的ID、留言对话的ID列表',
                                     `give_up_record_id` VARCHAR ( 100 ) DEFAULT NULL COMMENT '整个会话范围过程中，访客点击对话，弹出信息收集框但访客最终未进入对话的，放弃的记录ID，记录ID是点击的ID，和对话记录留言记录的ID不是同一个数据',
                                     `visitor_out_time` datetime DEFAULT NULL COMMENT '访客的离开的时间',
                                     PRIMARY KEY ( `msg_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '访客离开-服务器数据';
DROP TABLE
    IF
    EXISTS `base_chat_data`;
CREATE TABLE `base_chat_data` (
                                  `record_id` VARCHAR ( 100 ) NOT NULL COMMENT '对话记录的ID',
                                  `status` INT ( 2 ) DEFAULT NULL COMMENT '对话状态，1：人工对话开始 2：人工对话结束 3：留言开始 4: 留言结束 5：机器人对话开始 6：机器人对话结束',
                                  `wait_time` INT ( 11 ) DEFAULT NULL COMMENT '访客等待时长，单位：秒',
                                  `staff_id` BIGINT ( 11 ) DEFAULT NULL COMMENT '接待对话的客服ID',
                                  `staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服登录名',
                                  `staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服姓名',
                                  `staff_role` VARCHAR ( 100 ) DEFAULT NULL COMMENT '接待对话的客服的内部角色名称',
                                  `page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话页面，微信对话为空',
                                  `page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话页面标题',
                                  `times` INT DEFAULT NULL COMMENT '访客的对话次数',
                                  `event` INT ( 11 ) DEFAULT NULL COMMENT '对话发起的方式，1：点击图标 2：接受邀请对话 3：客服主动对话 4：微信输入任意文字接入对话 5：微信点击菜单接入 6：微信输入指定文字接入 7：微信机器人转人工 11：机器人转人工 12：机器人转留言 14：web自动弹屏自动接入 15：web自动弹屏访客输入消息接入 16：商户留言转平台接入 17：微信开发者接入 18：自定义渠道事件接入 19：自定义渠道发送消息接入',
                                  `request_time` datetime DEFAULT NULL COMMENT '请求对话的时间',
                                  `answer_time` datetime DEFAULT NULL COMMENT '对话接通时间',
                                  `type` INT ( 2 ) DEFAULT NULL COMMENT '会话类型，1：在线对话 2：忙碌对话 3：离线消息 5:机器人对话',
                                  `entrance` VARCHAR ( 100 ) DEFAULT NULL COMMENT '对话入口',
                                  PRIMARY KEY ( `record_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '对话信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_meta_data`;
CREATE TABLE `base_meta_data` (
                                  `u_id` VARCHAR ( 100 ) NOT NULL COMMENT '会员的唯一值',
                                  `grade` INT ( 11 ) DEFAULT NULL COMMENT '会员级别',
                                  `category` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员类别',
                                  `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员姓名',
                                  `nick_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员昵称',
                                  `gender` INT ( 1 ) DEFAULT NULL COMMENT '会员性别',
                                  `age` INT ( 2 ) DEFAULT NULL COMMENT '会员年龄',
                                  `birthday` datetime DEFAULT NULL COMMENT '会员生日',
                                  `marital_status` INT ( 1 ) DEFAULT NULL COMMENT '会员婚姻状况，0：未知 1：未婚 2：已婚',
                                  `phone` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员联系电话',
                                  `qq` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员QQ',
                                  `wechat` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员微信',
                                  `email` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员邮件地址',
                                  `nation` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员国家',
                                  `province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员省份',
                                  `city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员城市',
                                  `address` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员地址',
                                  `photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员头像地址',
                                  `memo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '会员备注信息',
                                  PRIMARY KEY ( `u_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '会员信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_visitor_data`;
CREATE TABLE `base_visitor_data` (
                                     `id` VARCHAR ( 100 ) NOT NULL COMMENT '访客ID，身份描述+ID',
                                     `enter_time` datetime DEFAULT NULL COMMENT '访客进入的时间',
                                     `media` INT DEFAULT NULL COMMENT '客户端媒介，1：PC网页 2：手机网页 5：微信 6：sdk 200：自定义渠道',
                                     `type` INT DEFAULT NULL COMMENT '访客身份类型，-1：未知 0：游客(web) 1：会员(vip) 2：SDK游客(sdk) 4：微信（wechat) 5：自定义接口(custom)',
                                     `media_id` INT DEFAULT NULL COMMENT 'visitorType==5时，此值有效，值为自定义渠道的渠道ID',
                                     `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客姓名',
                                     `photo` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客头像',
                                     `visit_times` INT DEFAULT NULL COMMENT '访客来访次数',
                                     `lan` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访问者语言',
                                     `ip` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访IP',
                                     `country` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在国家',
                                     `province` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在省份',
                                     `city` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客所在城市',
                                     `browser_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器',
                                     `browser_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的浏览器版本',
                                     `screen_resolution` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客的屏幕分辨率',
                                     `os_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客操作系统',
                                     `os_version` VARCHAR ( 100 ) DEFAULT NULL COMMENT '操作系统版本',
                                     `se` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索引擎',
                                     `keyword` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来访的搜索关键字',
                                     `bidding_word` VARCHAR ( 100 ) DEFAULT NULL COMMENT '推广词',
                                     `keyword_type` VARCHAR ( 100 ) DEFAULT NULL COMMENT '关键词类型 0：未区分SEO、推广 1：自然优化 2： 推广',
                                     `refer_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访客来源的URL，如果是微信，就是公众号名',
                                     `first_time` datetime DEFAULT NULL COMMENT '进入网站的时间',
                                     `first_page` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页',
                                     `first_page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '落地页面标题',
                                     `last_chat_time` datetime DEFAULT NULL COMMENT '上次对话时间',
                                     `last_chat_staff_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '上次对话客服ID',
                                     `last_chat_staff_log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服账号',
                                     `last_chat_staff_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '上次对话客服姓名',
                                     PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '访客信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_route_data`;
CREATE TABLE `base_route_data` (
                                   `id` BIGINT ( 20 ) NOT NULL COMMENT '接入对话的路由ID,-1：web访客的默认路由 -2：微信对话的默认路由 -3：SDK对话的默认路由',
                                   `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由名称',
                                   `style_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '路由所使用的样式ID',
                                   `style_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '路由所使用样式的名称',
                                   `chat_department_id` BIGINT ( 20 ) DEFAULT NULL COMMENT '本次分配对话的分组ID，如果是全部人员可接待则ID为0',
                                   `chat_department_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '本地分配对话的分组名称',
                                   PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '路由信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_staff_data`;
CREATE TABLE `base_staff_data` (
                                   `id` BIGINT ( 11 ) NOT NULL COMMENT 'ID',
                                   `log_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '登录名',
                                   `name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '姓名',
                                   `role` VARCHAR ( 100 ) DEFAULT NULL COMMENT '内部角色名称',
                                   PRIMARY KEY ( `id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '客服信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_visit_page_data`;
CREATE TABLE `base_visit_page_data` (
                                        `visit_time` datetime DEFAULT NULL COMMENT '访问时间',
                                        `page_url` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访问页面的地址',
                                        `page_title` VARCHAR ( 100 ) DEFAULT NULL COMMENT '访问页面的标题',
                                        `page_url_alias` VARCHAR ( 100 ) DEFAULT NULL COMMENT '此页面的别名',
                                        `track_record_id` BIGINT ( 20 ) NOT NULL COMMENT '关联的浏览轨迹ID',
                                        KEY `idx_track_record_id` ( `track_record_id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '浏览页面信息-基础对象数据';
DROP TABLE
    IF
    EXISTS `base_track_data`;
CREATE TABLE `base_track_data` (
                                   `track_record_id` BIGINT ( 20 ) NOT NULL COMMENT '关联的浏览轨迹ID',
                                   `visit_times` INT DEFAULT NULL COMMENT '当前访客此次是第几次来访',
                                   PRIMARY KEY ( `track_record_id` )
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '浏览页面信息-基础对象数据';