package com.heitian.ssm.comm;

/**
 * 
 * 参数固定值
 * 
 * @author 曾宝
 * @version [V1.00, 2015-11-2]
 * @see [相关类/方法]
 * @since V1.00
 */
public interface Constant_Params
{
    /**
     * 登录名
     */
    public static final String LOGINNAME = "loginname";
    
    /**
     * 用户id
     */
    public static final String USERID = "id";
    
    /**
     * 登录密码
     */
    public static final String PASSWORD = "password";
    //Error:java: Compilation failed: internal java compiler error
    /**
     * 短信验证码
     */
    public static final String VALIDATASMS = "validateSMS";
    
    /**
     * 手机号码
     */
    public static final String MOBILE = "mobile";
    
    public static final String OLDE_PASSWORD = "old_password";
    
    /**
     * 用户头像
     */
    public static final String USER_PICTURE = "picture";
    
    /**
     * 用户名(昵称)
     */
    public static final String USER_NAME = "name";
    
    /**
     * 用户类型
     */
    public static final String USER_TYPE = "type";
    
    /**
     * 用户性别
     */
    public static final String USER_SEX = "sex";
    
    /**
     * 类型
     */
    public static final String MODE = "mode";
    
    /**
     * 城市首字母
     */
    public static final String CKEY = "ckey";
    
    /**
     * 城市名称
     */
    public static final String CITY_NAME = "name";
    
    /**
     * 商家名称
     */
    public static final String BUSINESS_NAME = "name";
    
    /**
     * 商家简介
     */
    public static final String BUSINESS_RECOMMEND = "recommend";
    
    /**
     * 商家地址
     */
    public static final String BUSINESS_ADDRESS = "address";
    
    /**
     * 商家电话
     */
    public static final String BUSINESS_PHONE = "phone";
    
    /**
     * 图片名称（已经上传）
     */
    public static final String BUSINESS_PICTURE = "picture";
    
    /**
     * 商家所在城市Id
     */
    public static final String BUSINESS_CITYID = "cityId";
    
    /**
     * 商家类型
     */
    public static final String BUSINESS_TYPEID = "businessTypeId";
    
    /**
     * 商家報名
     */
    public static final String BUSINESS_IS_SIGN = "is_sign";
    
    /**
     * 图片base64编码
     */
    public static final String IMAGECODE = "imageCode";
    
    /**
     * 图片类型
     */
    public static final String IMAGETYPE = "imageType";
    
    /**
     * 商家id
     */
    public static final String BUSINESS_ID = "id";
    
    /**
     * 评论通过人（来自sys_user表中的管理员）
     */
    public static final String APPROVEUSERID = "approve_user_id";
    
    /**
     * 评论页码
     */
    public static final String PAGENUM = "pageNum";
    
    /**
     * 新闻名字
     */
    public static final String NEWS_NAME = "name";
    
    /**
     * 新闻id
     */
    public static final String NEWS_ID = "id";
    
    /**
     * 新闻评论人id
     */
    public static final String NEWSCOMMENT_USER_ID = "user_id";
    
    /**
     * 新闻评论内容
     */
    public static final String NEWSCOMMENT_CONTENT = "content";
    
    public static final String NEWS_PICTURE = "news_picture";
    
    /**
     * 新闻评论时间
     */
    public static final String NEWSCOMMENT_CREATE_TIME = "create_time";
    
    /**
     * 商品Id
     */
    public static final String COMMODITY_ID = "commodityid";
    
    /**
     * 商品名称
     */
    public static final String COMMODITY_NAME = "commodityname";
    
    /**
     * 商品价格
     */
    public static final String COMMODITY_PRICE = "price";
    
    /**
     * 商品优惠价格
     */
    public static final String COMMODITY_PREFERENTIAL_PRICE = "preferential_price";
    
    /**
     * 商品小图片
     */
    public static final String COMMODITY_PICTURE_S = "picture_s";
    
    /**
     * 商品大图片
     */
    public static final String COMMODITY_PICTURE_B = "picture_b";
    
    /**
     * 商品是否可以参与报名
     */
    public static final String COMMODITY_IS_SIGN = "is_sign";
    
    /**
     * 帖子主题
     */
    public static final String FORUMRELEASE_TITLE = "title";
    
    /**
     * 论坛的id
     */
    public static final String FORUM_ID = "forum_id";
    
    /**
     * 帖子Id
     */
    public static final String FORUM_RELEASE_ID = "forumReleaseId";
    
    /**
     * 帖子发布人
     */
    public static final String FORUM_RELEASE_USER_ID = "user_id";
    
    /**
     * 帖子发布时间
     */
    public static final String FORUM_RELEASE_CREATE_TIME = "create_time";
    
    /**
     * 帖子发布内容
     */
    public static final String FORUM_RELEASE_CONTENT = "content";
    
    /**
     * 类型权限
     */
    public static final String TYPE_PERMISSION = "type";
    
    /**
     * 枚举类
     */
    public static final String TYPE_ENUMERATION = "type";
    
    /**
     * 个人发布ID
     */
    public static final String USERCOMMODITY_ID = "id";
    
    /**
     * String businessId(商家Id)
     */
    public static final String BUSINESSID = "businessId";
    
    /**
     * String commodityId(商品Id)
     */
    public static final String COMMODITYID = "commodityId";
    
    /**
     * String comment(评论)
     */
    public static final String COMMENT = "comment";
    
    /**
     * 内容
     */
    public static final String CONTENT = "content";
    
    /**
     * String username(用户名称)
     */
    public static final String USERNAME = "username";
    
    /**
     * String userphone(用户电话)
     */
    public static final String USERPHONE = "userphone";
    
    /**
     * 商家发布id
     */
    public static final String APPUSERID = "user_id";
    
    /**
     * 活动Id market_id
     */
    public static final String MARKET_ID = "market_id";
    
    /**
     * app 用户Id
     */
    public static final String APPUSER_ID = "user_id";
    
    public static final String PHONE = "phone";
    
    public static final String REQUEST_CODE = "request_code";
    
    /**
     * 是否需要重复性检查
     */
    public static final String FLAG = "flag";
    
    /**
     * 活动Id
     */
    public static final String ACTIVITYID = "activityId";
    
    /**
     * 编辑Id
     */
    public static final String ID = "id";
    
    /**
     * 收藏的用户Id
     */
    public static final String APP_USERID = "userId";
    /**
     * 黑名单信息发布人
     */
    public static final String PUBLISHERID ="publisherId";
    
    /**
     * 收藏的帖子Id
     */
    public static final String FROUMRELEASEID = "froumReleaseId";
    
    /**
     * 收藏的新闻Id
     */
    public static final String NEWID = "newsId";
    /**
     * 收藏的个人发布Id
     */
    public static final String USERCOMMODITYID = "usercommodityId";
    /**
     * 个人发布------------------------------------
     */
    
    /**
     * 发布人ID
     */
    String USERCOMMODITY_USER_ID = "user_id";
    
    /**
     * 城市ID
     */
    String USERCOMMODITY_CITY_ID = "city_id";
    
    /**
     * 类型ID
     */
    String USERCOMMODITY_TYPE_ID = "type_id";
    
    /**
     * 图片
     */
    String USERCOMMODITY_PICTURE = "picture";
    /**
     * 图片2
     */
    String USERCOMMODITY_PICTURE2 = "picture2";
    /**
     * 图片3
     */
    String USERCOMMODITY_PICTURE3 = "picture3";
    /**
     * 图片4
     */
    String USERCOMMODITY_PICTURE4 = "picture4";
    /**
     * 图片5
     */
    String USERCOMMODITY_PICTURE5 = "picture5";
    /**
     * 标题
     */
    String USERCOMMODITY_NAME = "name";
    
    /**
     * 学历要求
     */
    String USERCOMMODITY_EDUCATIONAL = "educational";
    
    /**
     * 工作经历
     */
    String USERCOMMODITY_WORK_EXPERIENCE = "work_experience";
    
    /**
     * 年龄要求
     */
    String USERCOMMODITY_AGE_REQUIRE = "age_require";
    
    /**
     * 岗位要求
     */
    String USERCOMMODITY_POST_REQUIRE = "post_require";
    
    /**
     * 待遇
     */
    String USERCOMMODITY_WORK_TREATMEN = "work_treatmen";
    
    /**
     * 联系方式
     */
    String USERCOMMODITY_PHONE = "phone";
    
    /**
     * 个人简介
     */
    String USERCOMMODITY_RESUME = "resume";
    
    /**
     * 期望薪资
     */
    String USERCOMMODITY_HOPE_SALARY = "hope_salary";
    
    /**
     * 内容
     */
    String USERCOMMODITY_RECOMMEND = "recommend";
    
    /**
     * 物品
     */
    String USERCOMMODITY_GOODS = "goods";
    
    /**
     * 价格
     */
    String USERCOMMODITY_PRICE = "price";
    
    /**
     * 地址
     */
    String USERCOMMODITY_ADDRESS = "address";
    
    /**
     * 面积
     */
    String USERCOMMODITY_AREA = "area";
    
    /**
     * 品种
     */
    String USERCOMMODITY_VARIETIES = "varieties";
    
    /**
     * 举报人id
     */
    String REPORTUSERID = "userid";
    /**
     * 举报内容id
     */
    String REPORTID = "id";
    /**
     * remark 举报理由
     */
    String REPORTREMARK ="remark";
    /**
     * type 举报类型 
     */
    String REPORTTYPE="type";
    
}
