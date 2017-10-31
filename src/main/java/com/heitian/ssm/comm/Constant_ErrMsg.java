package com.heitian.ssm.comm;

/**
 * 
 * 返回异常的 统一解释
 * 
 * @author 曾宝
 * @version [V1.00, 2015-11-2]
 * @see [相关类/方法]
 * @since V1.00
 */
public interface Constant_ErrMsg
{
    /**
     * 返回标志
     */
    public static final String RESULT = "result";
    
    /**
     * 返回消息
     */
    public static final String MSG = "message";
    
    /**
     * 
     * 返回值
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-2]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IResult
    {
        /**
         * 返回成功
         */
        public static final String RESULT_OK = "200";
        
        /**
         * 找不到返回值
         */
        public static final String RESULT_NOT_FOUND = "400";
        
        /**
         * service层的错误
         */
        public static final String RESULT_SERVICE_ERR = "500";
        
        /**
         * controller参数 错误
         */
        public static final String RESULT_PARASM_ERR = "600";
        
        /**
         * 后台未知错误
         */
        public static final String SYS_ERR = "900";
        
    }
    
    /**
     * 
     * 枚举
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-13]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IEnumeration_Err
    {
        /**
         * 类型不能为空
         */
        public static final String ENUMERATION_TYPE_NULL="类型不能为空";
        /**
         * 枚举库 获取失败
         */
        public static final String ENUMERATION_NULL = "枚举库 不存在";
        
        /**
         * 枚举库 获取成功
         */
        public static final String ENUMERATION_OK = "枚举库获取成功";
    }
    
    /**
     * 
     * 用户层 错误标准结束
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-2]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IUser_Err
    {
        /**
         * 用户不存在
         */
        public static final String USER_NULL = "用户不存在";
        
        /**
         * 用户验证失败
         */
        public static final String USER_VALIDATE_NOT = "用户名/密码 不正确";
        
        /**
         * 用户验证成功
         */
        public static final String USER_VALIDATE_OK = "登录成功";
        
        /**
         * 用户名不能为空
         */
        public static final String USER_VALIDATE_LOGINNAME_ERR = "用户名不能为空";
        
        /**
         * 登录密码不能为空
         */
        public static final String USER_VALIDATE_PASSWORD_ERR = "登录密码不能为空";
        
        /**
         * 注册手机号码不能为空
         */
        public static final String USER_REGISTER_MOBILE_NOT = "注册手机号码不能为空";
        /**
         * 重置密码，手机号码不能为空
         */
        public static final String USER_FORGETPWD_MOBILE_NOT = "重置密码，手机号码不能为空";
        
        /**
         * 重置密码，旧密码不能为空
         */
        public static final String USER_FORGETPWD_OLD_PWD_NOT = "重置密码，旧密码不能为空";
        
        /**
         * 重置密码，新密码不能为空
         */
        public static final String USER_FORGETPWD_NEW_PWD_NOT = "重置密码，新密码不能为空";
        /**
         * 重置密码,旧密码错误"
         */
        public static final String USER_FORGETPWD_OLD_PWD_NULL="重置密码,旧密码错误";
        /**
         * 注册密码不能为空
         */
        public static final String USER_REGISTER_PASSWORD_NOT = "注册密码不能为空";
        
        /**
         * 注册短信验证码不能为空
         */
        public static final String USER_REGISTER_VALIDATASMS_NOT = "注册短信验证码不能为空";
        
        /**
         * 注册 号码已存在
         */
        public static final String USER_REGISTER_SMS_USER_EXIST = "手机号已存在，无法注册";
        
        /**
         * 手机号不存在，无法找回
         */
        public static final String USER_FORGET_SMS_USER_EXIST = "手机号不存在，无法找回";
        public static final String SMS_OK = "短信发送成功";
        
        /**
         * 短信无法发出
         */
        public static final String SMS_ERR = "未知错误，短信无法发出";
        
        /**
         * 短信缓存未开启
         */
        public static final String SMS_ERR_TWO = "未知错误，短信无法验证";
        
        /**
         * 短信验证码错误
         */
        public static final String REGISTER_SMS_ERR_NULL = "短信验证码错误";
        
        /**
         * 短信验证成功
         */
        public static final String REGISTER_SMS_OK = "短信验证成功";
        
        /**
         * 注册失败
         */
        public static final String REGISTER_ERR = "注册失败";
        
        /**
         * 注册成功
         */
        public static final String REGISTER_OK = "注册成功";
        
        /**
         * 用户id不能为空
         */
        public static final String USER_USERID_ERR = "用户id不能为空";
        
        /**
         * 新密码不能为空
         */
        public static final String NEW_PASSWORD_ERR="新密码不能为空";
        
        /**
         * 更改密码成功
         */
        public static final String FINDPASSWORD_OK = "更改密码成功";
        
        /**
         * 更改密码失败
         */
        public static final String FINDPASSWORD_ERR= "更改密码失败";
        /**
         * 用户类型不能为空
         */
        public static final String USER_TYPE_ERR = "用户类型不能为空";
        /**
         * 更改用户信息成功
         */
        public static final String UPPDATEUSER_OK = "更改用户信息成功";
        
        /**
         * 更改用户信息失败
         */
        public static final String UPPDATEUSER_ERR= "更改用户信息失败";

        public static final String USER_ID_NULL = "用户ID 为空";
        
        /**
         * 添加举报信息失败
         */
        public static final String ADD_REPORT_ERROR = "新增举报信息失败!";
        /**
         * 添加举报信息成功
         */
        public static final String ADD_REPORT_OK = "新增举报信息成功!";
        /**
         * 添加黑名单信息成功
         */
        public static final String ADD_PUBLISHERID_OK = "添加黑名单信息成功!";
        /**
         * 添加黑名单信息失败
         */
        public static final String ADD_PUBLISHERID_ERROR = "添加黑名单信息失败!";
        /**
         * 获取黑名单信息成功
         */
        public static final String GET_PUBLISHERID_OK = "获取黑名单信息成功!";
        /**
         * 获取黑名单信息失败
         */
        public static final String GET_PUBLISHERID_ERROR = "获取黑名单信息失败!";
        /**
         * 取消黑名单信息成功
         */
        public static final String DEL_PUBLISHERID_OK = "取消黑名单信息成功!";
        /**
         * 取消黑名单信息失败
         */
        public static final String DEL_PUBLISHERID_ERROR = "取消黑名单信息失败!";
        /**
         * 新增反馈信息成功
         */
        public static final String SUG_PUBLISHERID_OK = "新增反馈信息成功!";
        /**
         * 新增反馈信息失败
         */
        public static final String SUG_PUBLISHERID_ERROR = "新增反馈信息失败!";
        
        
        /**
         * id为空
         */
        public static final String REPORT_ID_NULL ="id为空";
        /**
         * 用户id为空
         */
        public static final String REPORT_USERID_NULL="用户id为空";
        /**
         * 信息发布人
         */
        public static final String REPORT_PUBLISHERID_NULL="信息发布人id为空";
        /**
         * 反馈内容不能为空
         */
        public static final String SUG_CONTENT_ERROR = "反馈内容不能为空";
        /**
         * 举报理由为空
         */
        public static final String REPORT_REMARK_NULL="举报理由为空";
        /**
         * 举报类型
         */
        public static final String REPORT_TYPE_NULL ="举报类型为空";
    }
    
    /**
     * 
     * 广告 错误标准
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-2]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IAdv_Err
    {
        /**
         * 广告获取失败
         */
        public static final String ADV_NULL = "广告不存在";
        
        /**
         * 类型为空
         */
        public static final String ADV_TYPE_NULL = "类型为空";
        /**
         * 城市ID为空
         */
        public static final String ADV_CITY_ID_NULL = "城市ID为空";
        
        /**
         * 广告获取成功
         */
        public static final String ADV_OK = "广告获取成功";
    }
    
    /**
     * 
     * 缓存报错
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-2]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IRedis_Err
    {
        /**
         * 缓存数量上限
         */
        public static final String REDIS_NUM_ERR = "短信获取时间太快，请120秒后在尝试获取";
    }
    
    /**
     * 
     * 参数错误返回
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-9]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IParams_Err
    {
        /**
         * 手机号码不为空
         */
        public static final String PHONE_NULL = "手机号码不能为空";
        
        /**
         * 手机号码不合格
         */
        public static final String PHONE_NOT_VALIDATE = "手机号码不合格";
        
        /**
         * 类型不为空
         */
        public static final String MODE_NULL = "类型不能为空";
        
        /**
         * 类型不合格
         */
        public static final String MODE_NOT_VALIDATE = "类型不合格";
    }
    
    /**
     * 
     * 城市 错误
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-11]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface ICity_Err
    {
        /**
         * 城市查询不到
         */
        public static final String CITY_NOT_FIND = "城市查询不到";
        
        /**
         * 城市索引不能为空
         */
        public static final String CITY_CKEY_NULL = "城市索引不能为空";
        
        /**
         * 城市索引非法
         */
        public static final String CITY_CKEY_NOT_VALIDATE = "城市索引非法";
        
        /**
         * 城市查询成功
         */
        public static final String CITY_OK = "城市查询成功";
        
        /**
         * 城市修改时间失败
         */
        public static final String CITY_MODIFY_ERR = "修改时间查询失败";
        
        /**
         * 城市修改时间成功
         */
        public static final String CITY_MODIFY_OK = "修改时间查询成功";
        
        /**
         * 城市名称不能为空
         */
        public static final String CITY_NAME_NULL = "城市名称不能为空";
        
        /**
         * 城市详情查询成功
         */
        public static final String CITY_DETAIL_OK = "城市详情查询成功";
        
        /**
         * 城市详情查询失败
         */
        public static final String CITY_DETAIL_ERR = "城市详情查询失败";
    }
    
    /**
     * 商家错误
     * @author 吴迪 632132852@qq.com
     * @version [V1.00, 2015-11-19]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IBusiness_Err
    {
        /**
         * 商家审核成功
         */
        public static final String BUSINESS_APPROVESTATUS_SUCCESS = "商家审核成功!";
     /**
      * 
      * 论坛错误
      *  
      * @author 周倩
      * @version  [V1.00, 2015-11-24]
      * @see  [相关类/方法]
      * @since V1.00
      */
     public interface IForumRelease_Err{
         /**
          * 论坛id为空
          */
         public static final String FORUM_ID_NULL="论坛id为空";
         /**
          * 获取帖子列表成功
          */
         public static final String FORUMRELEASE_LIST_SUCCESS="获取帖子列表成功";
         /**
          * 获取帖子列表失败
          */
         public static final String FORUMRELEASE_LIST_ERROR="获取帖子列表失败";
     }
     
         /**
          * 名称不能为空
          */
         public static final String USERCOMMENTY_NAME_ERROR = " 个人发布名称不能为空!";
         
         
         /**
          * 名称不能为空
          */
         public static final String USERCOMMENTY_NAME_SUCCESS = " 个人发布查询成功";
         
        /**
         * 商家审核失败
         */
        public static final String BUSINESS_APPROVESTATUS_ERROR = "商家审核失败!";
        
        /**
         * 商家未审核
         */
        public static final String BUSINESS_APPROVEERR_ERROR = "商家未审核!";
        
        /**
         * 获取商家类别失败
         */
        public static final String BUSINESS_BUSINESSTYPE_ERROR = "获取商家类别失败!";
        
        /**
         * 商家id为空
         */
        public static final String BUSINESS_DETAIL_ID_ERROR = "商家ID为空";
        
        /**
         * 查找商家信息成功
         */
        public static final String BUSINESS_FIND_SUCCESS = "查找商家信息成功!";
        
        /**
         * 查找推荐商家成功
         */
        public static final String BUSINESSRECOMMEND_FIND_SUCCESS = "查找推荐商家成功!";
        
        
        /**
         * 查找商家信息失败
         */
        public static final String BUSINESS_FIND_ERROR = "查找商家信息失败!";
        
        /**
         * 查找推荐商家失败
         */
        public static final String BUSINESSRECOMMEND_FIND_ERROR = "查找推荐商家信息失败!";
        
        /**
         * 商家报名失败
         */
        public static final String BUSINESSRE_SIGN_ERROR = "查找推荐商家信息失败!";
        
        
        /**
         * 查找评论信息成功
         */
        public static final String BUSINESS_COMMENT_SUCCESS = "查找评论信息成功!";
        
        /**
         * 查找评论信息失败
         */
        public static final String BUSINESS_COMMENT_ERROR = "查找评论信息失败!";
        
        /**
         * 添加上家评论失败
         */
        public static final String ADDBUSINESS_COMMENT_ERROR = "添加评论信息失败!";
        
        /**
         * 添加上家评论失败
         */
        public static final String ADDBUSINESS_COMMENT_SUCCESS = "添加评论信息成功!";
        /**
         * 添加商家信息失败
         */
        public static final String BUSINESS_ADD_ERROR = "添加商家信息失败!";
        
        /**
         * 添加商家信息成功
         */
        public static final String BUSINESS_ADD_SUCCESS = "添加商家信息成功!";
        /**
         * 获取报名商家成功
         */
        public static final String SINGBUSINESS_GET_SUCCESS = "获取报名商家成功!";
        /**
         * 获取用户收藏的商家成功
         */
        public static final String CollectBusiness_GET_SUCCESS = "获取用户收藏的商家成功!";
       
        /**
         * 获取用户收藏的商家失败!
         */
        public static final String CollectBusiness_GET_ERROR = "获取用户收藏的商家失败!";
        /**
         * 获取报名商家失败
         */
        public static final String SINGBUSINESS_GET_ERROR = "获取报名商家失败!";
        /**
         * 商家ID为空
         */
        public static final String BUSINESS_ID_NULL = "商家ID为空!";
        /**
         * 商家发布ID为空
         */
        public static final String APPUSER_ID_NULL = "商家发布ID为空!";
        /**
         * 商家名称为空
         */
        public static final String BUSINESS_NAME_NULL = "商家名称为空!";
        
        /**
         * 商家简介为空
         */
        public static final String BUSINESS_RECOMMEND_NULL = "商家简介为空!";
        
        /**
         * 商家地址为空
         */
        public static final String BUSINESS_ADDRESS_NULL = "商家地址为空!";
        
        /**
         * 商家电话为空
         */
        public static final String BUSINESS_PHONE_NULL = "商家电话为空!";
        
        /**
         * 图片名称为空!
         */
        public static final String BUSINESS_PICTURE_NULL = "图片名称为空!";
        
        /**
         * 商家所在城市Id为空
         */
        public static final String BUSINESS_CITYID_NULL = "商家所在城市Id为空!";
        
        /**
         * 商家类型Id为空
         */
        public static final String BUSINESS_BUSINESSTYPEID_NULL = "商家类型Id为空!";
        
        /**
         * 商家数量出错
         */
        public static final String BUSINESS_COMMENT_COUNT_ERR = "商家数量出错";
        
        /**
         * 商品是否可以参与报名为空
         */
        public static final String BUSINESS_IS_SIGN_NULL = "商品是否可以参与报名为空!";
        /**
         * 商品id为空
         */
        public static final String BUSINESS_COMMODITYID_NULL = "商品Id为空!";
        /**
         * 评论
         */
        public static final String BUSINESS_COMMENT_NULL = "商品评论为空!";
        /**
         * 用户名为空
         */
        public static final String BUSINESS_USERNAME_NULL = "用户名为空!";
        
        public static final String BUSINESS_USERID_NULL="用户ID 为空!";
        /**
         * 用户电话为空
         */
        public static final String BUSINESS_USERPHONE_NULL = "用户电话为空!";
        /**
         * 商家报名成功
         */
        public static final String BUSINESS_SIGN_SUCCESS ="商家报名成功!";
        /**
         * 商家报名失败
         */
        public static final String BUSINESS_SIGN_ERROR ="商家报名失败!";
        
        /**
         * 修改商家信息成功
         */
        public static final String BUSINESS_UPDATE_SUCCESS ="修改商家信息成功!";
        
        /**
         * 修改商家信息失败
         */
        public static final String BUSINESS_UPDATE_ERROR ="修改商家信息失败!";
        
        /**
         * 删除商家信息失败
         */
        public static final String BUSINESS_DELETE_ERROR ="删除商家信息失败!";
        /**
         * 删除商家信息成功
         */
        public static final String BUSINESS_DELETE_SUCCESS ="删除商家信息成功!";
        
        public static final String BUSINESS_COLLECTION_ERROR ="获取用户收藏记录失败";
        
        public static final String BUSINESS_COLLECTION_SUCCESS ="获取用户收藏记录成功";
        
        public static final String DELETE_COLLECTION_ERROR = "取消用户收藏失败";
        
        public static final String DELETE_COLLECTION_SUCCESS= "取消用户收藏成功";
        
        public static final String BUSINESS_ID_ERROR ="Id为空";
    }
    
    /**
     * 
     * 商家类型
     * 
     * @author 曾宝
     * @version [V1.00, 2015-11-24]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IBusinessType_Err
    {
        /**
         * 商家分类不能为空
         */
        public static final String BUSINESSTYPE_NULL="商家分类不能为空";
        /**
         * 查询商家类型查询失败
         */
        public static final String BUSINESSTYPE_NOT_FOUND = "查询商家类型查询失败";
        
        /**
         * 查询商家类型查询成功
         */
        public static final String BUSINESSTYPE_OK = "查询商家类型查询成功";
        
        /**
         * 查询商家类型查询成功
         */
        public static final String BUSINESSTYPE_MODIFY_OK = "查询商家类型查询成功";
        
        /**
         * 查询商家类型修改时间失败
         */
        public static final String BUSINESSTYPE_MODIFY_ERR = "查询商家类型修改时间失败";
        
    }
    
    /**
     * 
     * 上传图片错误
     * 
     * @author 吴迪 632132852@qq.com
     * @version [V1.00, 2015-11-20]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IIMAGE_Err
    {
        /**
         * 图片base64编码为空
         */
        public static final String IMAGE_CODE_NUll = "上传图片Base64编码为空!";
        
        /**
         * 图片类型为空
         */
        public static final String IMAGE_TYPE_NUll = "上传图片类型为空!";
        
        /**
         * 保存图片成功
         */
        public static final String IMAGE_UPLOAD_SUCCESS = "上传图片成功!";
        
        /**
         * 保存图片失败
         */
        public static final String IMAGE_UPLOAD_ERROR = "上传图片失败!";
    }
    
    /**
     * 
     * 商品错误
     * 
     * @author 汤冬杰
     * @version [V1.00, 2015-11-24]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface ICommodity_Err
    {
        /**
         * 商品名称为空
         */
        public static final String BUSINESS_NAME_NULL = "商品名称为空!";
        
        /**
         * 商品价格为空
         */
        public static final String BUSINESS_PRICE_NULL = "商品价格为空!";
        
        /**
         * 商品优惠价格为空
         */
        public static final String BUSINESS_PREFERENTIAL_PRICE_NULL = "商品优惠价格为空!";
        
        /**
         * 图片名称为空!
         */
        public static final String BUSINESS_PICTURE_NULL = "图片名称为空!";
        
        /**
         * 添加商品信息失败
         */
        public static final String BUSINESS_ADD_ERROR = "添加商品信息失败!";
        
        /**
         * 添加商品信息成功
         */
        public static final String BUSINESS_ADD_SUCCESS = "添加商品信息成功!";
        
        /**
         * 查寻商品信息失败!
         */
        public static final String BUSINESS_NOT_FOUND = "查寻商品信息失败!";
        
        /**
         * 查寻商品信息成功!
         */
        public static final String BUSINESS_OK_FOUND = "查寻商品信息成功!";
    }
    
    /**
     * 
     * 公共 参数错误
     * 
     * @author 汤冬杰
     * @version [V1.00, 2015-11-23]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IComment_Err
    {
        /**
         * 分页参数不能为空
         */
        public static final String PARAMS_PAGENUM_ERR = "分页参数不能为空";
        
        /**
         * 获取记录总条数失败
         */
        public static final String PARAMS_COMMENTTOTAL_ERROR = "获取记录总条数失败";
        
        /**
         * 获取下载地址成功
         */
        public static final String PARAMS_DOWNLOAD_SUCCESS = "获取下载地址成功";
        /**
         * 获取下载地址失败
         */
        public static final String PARAMS_DOWNLOAD_ERROR = "获取下载地址失败";
        
        /**
         * 获取系统消息列表成功
         */
        public static final String PARAMS_SYSTEMMESSAGE_SUCCESS = "获取系统消息列表成功";
        /**
         * 获取系统消息列表失败
         */
        public static final String PARAMS_SYSTEMMESSAGE_ERROR = "获取系统消息列表失败";
        
    }
    /**
     * 
     * 论坛错误
     * 
     * @author 汤冬杰
     * @version [V1.00, 2015-11-25]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface IForum_Err
    {
        /**
         * 查找论坛信息成功
         */
        public static final String FORUM_FOND_SUCCESS = "查找论坛信息成功";
        
        /**
         * 查找论坛信息失败
         */
        public static final String FORUM_FOND_ERROR = "查找论坛信息失败";
        /**
         * 查找帖子信息成功
         */
        public static final String FORUMRELEASE_FOND_SUCCESS = "查找帖子信息成功";
        
        /**
         * 查找帖子信息失败
         */
        public static final String FORUMRELEASE_FOND_ERROR = "查找帖子信息失败";
        /**
         * 查找帖子评论信息失败
         */
        public static final String FORUMCOMMENT_FOND_ERROR = "查找帖子评论信息失败";
        /**
         * 查找帖子评论信息成功
         */
        public static final String FORUMCOMMENT_FOND_SUCCESS = "查找帖子评论信息成功";
        /**
         * 添加帖子信息成功
         */
        public static final String FORUM_ADD_SUCCESS = "添加帖子信息成功";
        /**
         * 添加帖子信息失败
         */
        public static final String FORUM_ADD_ERROR = "添加帖子信息失败";
        /**
         * 帖子ID为空
         */
        public static final String FORUMRELEASE_ID_NULL = "帖子ID为空";
        /**
         * 论坛ID为空
         */
        public static final String FORUM_ID_NULL = "论坛ID为空";
        /**
         * 帖子发布人为空
         */
        public static final String FORUMRELEASE_USERID_NULL = "帖子发布人为空";
        /**
         * 帖子主题为空
         */
        public static final String FORUMRELEASE_TITLE_NULL = "帖子主题为空";
        /**
         * 帖子内容为空
         */
        public static final String FORUMRELEASE_CONTENT_NULL = "帖子内容为空";
        
        /**
         * 评论内容为空
         */
        public static final String FORUMRCOMMODTIY_CONTENT_NULL = "评论内容为空";
        /**
         * 评论人ID为空
         */
        public static final String FORUMRCOMMODTIY_USERID_NULL = "评论人ID为空";
        /**
         * 帖子ID为空
         */
        public static final String FORUMRCOMMODTIY_FORUMID_NULL = "帖子ID为空";
        /**
         * 添加评论内容成功
         */
        public static final String FORUMRCOMMODTIY_ADD_SUCCESS = "添加评论内容成功";
        /**
         * 添加评论内容成功
         */
        public static final String FORUMRCOMMODTIY_ADD_ERROR = "添加评论内容成功";
        
        
        
    }
    
    
  /**
   * 
   * 贴子错误
   *  
   * @author 崔少杰
   * @version  [V1.00, 2015-11-25]
   * @see  [相关类/方法]
   * @since V1.00
   */
    public interface IForumRelease_Err
    {
        
         /**
         * 论坛ID参数不能为空
         */
        public static final String BUSINESS_IDFORUM_ID_ERROR = "论坛ID参数不能为空";
        
        /**
         * 查找帖子列表成功
         */
        public static final String BUSINESS_FORUMRELEASES_SUCCESS = "查找帖子列表成功";
        /**
         * 查找帖子列表失败
         */
        public static final String BUSINESS_FORUMRELEASES_ERROR = "查找帖子列表失败";
       
        /**
         * 查找帖子详情成功
         */
        public static final String BUSINESS_FORUMRELEASE_SUCCESS = "查找帖子详情成功";
        /**
         * 查找帖子详情失败
         */
        public static final String BUSINESS_FORUMRELEASE_ERROR = "查找帖子详情失败";
        
        /**
         * 获取置顶帖失败
         */
        public static final String FORUMRELEASETOP_ERROR ="获取置顶帖失败";
        
        /**
         * 获取置顶帖成功
         */
        public static final String FORUMRELEASETOP_SUCCESS ="获取置顶帖成功";
    }
    /**
     * 
     * 新闻错误
     * 
     * @author 周倩
     * @version [V1.00, 2015-11-23]
     * @see [相关类/方法]
     * @since V1.00
     */
    public interface INews_Err
    {
        /**
         * 新闻id不能为空
         */
        public static final String NEWS_ID_NULL = "新闻id不能为空";
        
        /**
         * 获取新闻列表成功
         */
        public static final String NEWS_LIST_SUCCESS = "获取新闻列表成功!";
        
        /**
         * 获取用户收藏的新闻列表成功
         */
        public static final String COLLECT_NEWS_LIST_SUCCESS = "获取用户收藏的新闻列表成功!";
        /**
         * 获取消息列表成功
         */
        public static final String GET_MESSAGE_LIST_SUCCESS = "获取消息列表成功!";
        
        /**
         * 获取消息列表失败
         */
        public static final String GET_MESSAGE_LIST_ERROR = "获取消息列表失败!";
        /**
         * 获取用户收藏的新闻列表失败
         */
        public static final String COLLECT_NEWS_LIST_ERROR = "获取用户收藏的新闻列表失败!";
        
        /**
         * 获取用户收藏的帖子列表成功
         */
        public static final String COLLECT_FORUM_LIST_SUCCESS = "获取用户收藏的帖子列表成功!";
        
        /**
         * 获取用户收藏的帖子列表失败
         */
        public static final String COLLECT_FORUM_LIST_ERROR = "获取用户收藏的帖子列表失败!";
        
        /**
         * 获取用户收藏的个人发布列表成功
         */
        public static final String COLLECT_USERCOMMODITY_LIST_SUCCESS = "获取用户收藏的个人发布列表成功!";
        
        /**
         * 获取用户收藏的个人发布列表失败
         */
        public static final String COLLECT_USERCOMMODITY_LIST_ERROR = "获取用户收藏的个人发布列表失败!";
        
        /**
         * 获取新闻列表失败
         */
        public static final String NEWS_LIST_ERROR = "获取新闻列表失败!";
        
        /**
         * 查找新闻信息成功
         */
        public static final String NEWS_FIND_SUCCESS = "查找新闻信息成功!";
        
        /**
         * 查找新闻信息失败
         */
        public static final String NEWS_FIND_ERROR = "查找新闻信息失败!";
        /**
         * 查找新闻图片成功
         */
        public static final String NEWS_PICTURE_SUCCESS = "查找新闻图片成功!";
        
        /**
         * 查找新闻图片失败
         */
        public static final String NEWS_PICTURE_ERROR = "查找新闻图片失败!";
        
        /**
         * 查找新闻评论信息成功
         */
        public static final String NEWS_COMMENT_SUCCESS = "查找评论信息成功!";
        
        /**
         * 查找新闻评论信息失败
         */
        public static final String NEWS_COMMENT_ERROR = "查找评论信息失败!";
        
        /**
         * 评论人id不能为空
         */
        public static final String NEWSCOMMENT_USER_ID_ERROR = "评论人id不能为空！";
        
        /**
         * 新闻评论内容不能为空
         */
        public static final String NEWSCOMMENT_CONTENT_ERROR = "新闻评论内容不能为空！";
        
        /**
         * 新闻评论时间不能为空
         */
        public static final String NEWSCOMMENT_CREATE_TIME_ERROR = "新闻评论时间不能为空！";
        
        /**
         * 添加评论成功
         */
        public static final String NEWS_ADDCOMMENT_SUCCESS = "添加评论成功!";
        
        /**
         * 添加评论失败
         */
        public static final String NEWS_ADDCOMMENT_ERROR = "添加评论失败!";
        /**
         * 评论类型查询失败
         */
        public static final String NEWS_TYPE_NULL_FOUND="评论类型查询失败";
        /**
         * 评论类型查询成功
         */
        public static final String NEWS_TYPE_OK_FOUND="评论类型查询成功";

        public static final String NEWS_NAME_NULL = "新闻名称不能为空";

        public static final String NEWS_ADD_SUCCESS = "新闻添加成功";

        public static final String NEW_CONTENT_ERROR = "新闻内容不能为空";

        public static final String NEWS_ADD_ERROR = "新闻添加失败";

        public static final String NEW_PICTURE_ERROR = "新闻图片不能为空";
        
    }
    /**
     * 
     * 用户发布
     * @author 曾宝
     * @version  [V1.00, 2015-11-28]
     * @see  [相关类/方法]
     * @since V1.00
     */
    public interface IUserCommodtiy_Err
    {
        /**
         * 用户发布信息查询失败
         */
        public static final String USERCOMMODITY_NOT_FOUND="用户发布信息查询失败";
        /**
         * 用户发布信息查询成功
         */
        public static final String USERCOMMODITY_OK_FOUND="用户发布信息查询成功";
        /**
         *用户发布失败 
         */
        public static final String ADDUSERCOMMODITY_ERR = "用户发布失败";
        /**
         * 用户发布成功
         */
        public static final String ADDUSERCOMMODITY_OK = "用户发布成功";
        /**
         * 发布ID 不能为空
         */
        public static final String USERCOMMODITY_ID_NULL="发布ID 不能为空";
        
        /**
         * 发布ID 不能为空
         */
        public static final String EDIT_ID_NULL="编辑ID 不能为空";
    }
    
    /**
     * 抽奖码错误
     * 
     * 吴迪
     */
    public interface ICode{
        /**
         * 新增抽奖码错误
         */
        public static final String ADDCODE_ERROR = "新增抽奖码错误";
        
        /**
         * 新增抽奖码成功
         */
        public static final String ADDCODE_SUCCESS = "新增抽奖码成功";
        
        /**
         * 活动id为空
         */
        public static final String MARKETID_ISNULL_ERROR = "活动id为空";
        
        /**
         * 用户id为空
         */
        public static final String APPUSERID_ISNULL_ERROR = "用户id为空";
        
        /**
         * 不可重复获取抽奖码
         */
        public static final String APPUSERID_ISEXCIT_ERROR ="不可重复获取抽奖码";
        
        /**
         * 标志 flag为空
         */
        public static final String APPUSERID_FLAG_ERROR ="flag为空!";
        
        /**
         * 获取抽奖码列表成功
         */
        public static final String ADDCODE_LIST_SUCCESS ="获取抽奖码列表成功!";
        /**
         * 获取抽奖码列表失败
         */
        public static final String ADDCODE_LIST_ERROR ="获取抽奖码列表失败!";
        
        public static final String ADDCODE_NAME_ERROR="用户名不能为空";
        
        public static final String ADDCODE_PHONE_ERROR="联系方式不能为空";
        
        
    }
    
    /**
     * 活动的常量
     */
    public interface IActivity{
        
        /**
         * 活动获取详情失败
         */
        public static final String ACTIVITY_DETAIL_ERROR = "获取活动详情失败";
        
        /**
         * 获取活动详情成功
         */
        public static final String ACTIVITY_DETAIL_SUCCESS = "获取活动详情成功";

        public static final String CODE_FOUND_OK = "推广码获取成功";

        public static final String CODE_FOUND_NO = "推广码获取失败";
    }
    
    /**
     * 状态常量
     */
    public interface IType{
        /**
         * 推荐_新闻
         */
        public static final String TYPE_RECOMMEND_NEWS = "type_recommend_news";
        /**
         * 推荐_个人发布
         */
        public static final String TYPE_RECOMMEND_USERCOMMODITY = "type_recommend_userCommodity";
        /**
         * 推荐_商家
         */
        public static final String TYPE_RECOMMEND_BUSINESS = "type_recommend_business";
        /**
         * 推荐_个人编辑
         */
        public static final String TYPE_RECOMMEND_EDIT = "type_recommend_edit";
        /**
         * 推荐列表为空
         */
        public static final String RECOMMEND_IS_NULL = "推荐列表为空!";
        
        /**
         * 获取推荐列表失败
         */
        public static final String RECOMMEND_LIST_ERROR ="获取推荐列表失败";
        
        /**
         * 获取编辑详情失败
         */
        public static final String EDIT_ERROR ="获取编辑详情失败";
        
        /**
         * 获取编辑详情成功
         */
        public static final String EDIT_SUCCESS ="获取编辑详情成功";
        
        /**
         * 新增用户收藏失败
         */
        public static final String ADDCOLLECTBUSINESS_ERORR ="新增用户收藏失败";
        
        /**
         * 新增用户收藏失败
         */
        public static final String ADDCOLLECTBUSINESS_SUCCESS ="新增用户收藏成功";
        
        
    }
    
    
}
