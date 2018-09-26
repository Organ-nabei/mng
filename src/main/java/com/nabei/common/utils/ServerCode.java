package com.nabei.common.utils;

/**
 * @Auther: huangxiaosen
 * @Date: 2018/9/24 16:54
 * @Description:
 */
public enum ServerCode {

    SUCCESS(0000, "受理成功"),
    //========================================================================//
    //9-系统服务异常
    //========================================================================//
    UNKNOWN_EXCEPTION(9999, "系统未知错误"),
    //========================================================================//
    //1-请求业务校验
    //========================================================================//
    REQUEST_PARAM_ILLEGAL(1002, "请求参数非法"),
    REQUEST_PARAM_ILLEGAL_FRIENDLY(1003, ""),
    REQUEST_DUPLICAT_REQUEST(1006, "请求流水号重复"),
    DUPLICAT_EXT_LOANORDER_ID(1007, "外部订单号重复申请"),
    ORDER_INVALID(1008, "当前订单状态非法"),
    TOKEN_EXPIRED(1011, "异地登录,请重新登录账号"),
    HEAD_ILLEGAL(1012, "请求头信息有误"),
    MERCHANT_NOT_FOUND(8888, "用户名或密码错误"),
    MERCHANT_NOT_REGIST(8000, "该用户未注册,请联系拿贝客服"),
    MERCHANT_ALREADY_EXISTS(8001, "该手机号码已注册,请更换手机号码或联系管理员"),
    /*LOGINPWD_NOT_FOUND(1013, "原密码输入错误"),*/
    NEWPWD_INVALID(1014, "请输入正确的确认密码"),
    MEMBER_CANCEL(1015, "对不起,客户已经取消订单"),
    DELIVER_INVALID(1016, "此号码已存在，请搜索配送员列表"),
    VALIDATE_INVALID(1017, "验证码错误，请重新输入"),
    OLDPWD_INVALID(1018, "旧密码输入错误"),
    OPERATOR_INVALID(1019, "该手机号已经存在，请直接登陆"),
    GET_VERIFICATION_CODE(1020,"获取验证码失败,请重新获取"),
    IS_PAY_PASSWORD(1021,"支付密码未设置"),
    UPDATE_PAY_PASSWORD(1022,"密码设置失败"),
    SINGLE_RED_PACKET_UNLAWFUL(1024,"单个红包金额不可能低于0.01元"),
    THE_DELIVER_IS_DISABLED(1025,"该账号被禁用,请联系拿贝管理员"),
    UNLAWFUL_TIME(1026,"时间选择有误"),
    RED_ADD_SUCCESS(1027,"红包创建成功"),
    RED_ADD_EXCEPTION(1028,"红包创建失败,该区域可能没有店铺，请选择其他区域"),
    LOGIN_EXCEPTION(1029,"登录状态失效，请重新登录"),
    PAY_EXCEPTION(1030,"提现失败"),
    ACCOUNT_NOT_ENOUGH(1023,"账户余额不足"),
    PASSWORD_EXCEPTION(1031,"密码错误请重试"),
    WECHAT_EXCEPTION(1032,"请进行微信公众号认证"),
    GET_VERIFICATION_CODE_EXCEPTION(1033,"获取验证码失败"),
    PHONEMUMBER_NULL_EXCEPTION(1034,"电话号码不能为空"),
    PAYTIME_EXCEPTION(1035,"不在提款期限内"),
    RED_GET_EXCEPTION(1036,"商家红包已抢完"),
    RED_NUM_EXCEPTION(1037,"今日抢红包次数已达上限"),
    RED_GET_SUCCESS(1038,"成功获取红包"),
    RED_GET_NUM_EXCEPTION(1039,"您的抢红包次数已经用完，下单可以继续抢哦"),
    CITY_LOCATION_EXCEPTION(1040,"获取定位失败"),
    SINGLE_RED_NUM_EXCEPTION(1040,"红包数量不合法 "),
    CITY_ADDRESS_EXCEPTION(1041,"获取城市adCode失败"),
    PAYAMOUNT_EXCEPTION(1042,"提款金额小于最小提现金额"),
    DISTANCE_OUT_OF_RANGE(1050,"配送距离超出范围，请重新下单"),
    MEMBER_RED_FLAT_EXCEPTION(1043,"您抢的太快啦，请10分钟以后再试"),
    GOOD_CATEGORY_DELETE_EXCEPTION(1044,"此分类下仍有商品，请移除后再删除"),
    UPDATE_MERCHANT_MESSAGE_EXCEPTION(1045,"修改用户信息失败"),
    ACTIVITY_NO_IN_TIME_EXCEPTION(1046,"亲!活动还未开始,请在活动时间内再来"),
    ACTIVITY_IS_OVER_EXCEPTION(1047,"亲!活动已结束,请选择其他活动"),
    ACTIVITY_MEMBER_IN_EXCEPTION(1048,"亲!您已参加了该活动,请分享给好友帮忙砍价吧"),
    ACTIVITY_MEMBER_CUTDOWN_EXCEPTION(1049,"你已砍过此商品了"),
    ACTIVITY_SUPPORT_MEMBER_COMPLETE_EXCEPTION(1050,"砍价已完成,赶快通知您的好友来领取商品"),
    ACTIVITY_MEMBER_COMPLETE_EXCEPTION(1051,"砍价已完成,赶快来领取商品"),
    TIME_EXCEPTION(1052,"开始时间大于结束时间"),
    ACTIVITY_MEMBER_NOT_FINASH_EXCEPTION(1053,"砍价未完成，不能领取商品"),
    ACTIVITY_NUM_EXCEPTION(1054,"此活动已完成，换个商品砍价呗"),
    ACTIVITY_PARAM_ILLEGAL(1055, "砍价数量过高，请核对信息"),
    ACTIVITY_MEMBER_JOIN_ILLEGAL(1056, "您今日已经参与过，留点机会给别人吧！"),
    ACTIVITY_MEMBER_ALREADY_RECEIVED(1057,"您已领取过此商品，不能重复领取哦"),
    ACTIVITY_SUPPORT_MEMBER_NUMBER_EXCEPTION(1058,"今日帮砍次数已达上限，请明日再来"),
    ASSIGN_MERCHANT_RED_EXCEPTION(1059,"请指定商家发放红包"),
    ASSIGN_MERCHANT_RED_NUM_EXCEPTION(1060,"红包个数必须大于等于商家个数"),
    WITHDRAW_TYPE_EXCEPTION(1061,"提现方式有误"),
    ACTIVITY_CUTDOWN_MEMBER_WEEK_EXCEPTION(1062,"本周免费砍价次数已用完，下单后可以继续参与砍价"),
    SITEORDER_CANCELLATION_EXCEPTION(1063,"该订单不复合取消条件"),
    MERCHANT_WITHDRAW_CHARGES_EXCEPTION(1064,"2小时紧急提现金额不能小于手续费"),
    PAYAMOUNT_NOTMAX_EXCEPTION(1065,"提款金额大于最大提现金额"),
    SHOP_KEY_WORD_EXCEPTION(1062,"商家标签不能超过三个"),
    MERCHANT_AREA_REWARD_START_EXCEPTION(1064,"商家地区收银奖励开始日期有误"),
    MERCHANT_AREA_REWARD_END_EXCEPTION(1065,"商家地区收银奖励结束日期有误"),
    MERCHANT_AREA_REWARD_AREA_EXCEPTION(1066,"商家地区收银奖励地区有误"),
    MERCHANT_AREA_REWARD_EXIST_EXCEPTION(1067,"商家地区收银奖励已存在"),
    MERCHANT_WITHDRAW_IS_TIME_EXCEPTION(1068,"不在提现时间段内"),
    MEMBER_BUY_HAVE_NO_USE(1069,"你还有未使用的抢餐卡"),
    MEMBER_BUY_IS_IN_ACTIVITY(1070,"你已经参加过该活动"),
    ACTIVITY_MEMBER_TODAY_BUY_EXCEPTION(1071,"今天你已经参加过活动"),
    ACTIVITY_MEMBER_NOT_JOIN_BUY_EXCEPTION(1072,"无抢餐资格"),
    THIS_NUMBER_ALREADY_EXISTS(1073,"已存在此号码"),
    DELETION_ERROR(1074,"删除错误"),
    WITHDRAWAL_IS_SUCCESSFUL_WAITING_FOR_AUDIT(1075,"提现成功，请等待审核"),
    REVIEW_THE_SUCCESS(1076,"审核成功"),
    AUDIT_FAILURE(1077,"审核失败,详情请查看日志"),
    MERCHANT_WITHDRAW_CEILING(1075,"今日提现额度已达上限，请改日再来"),
    MERCHANT_WITHDRAW_LIMIT_AMOUNT(1078,"您上次提现过大，请在两小时后重试"),
    DISABLED_MERCHANT(1079,"该商家已禁用拿贝收款"),
    NOT_WITHDRAW_DATE_EXCEPTION(1080,"不在提现时间段内"),
    SALESMAN_UPDATE_PHONENUMBER_EXCEPTION(1081,"该电话号码已存在,请重新输入"),
    SALESMAN_UPDATE_PHONENUMBER_NULL_EXCEPTION(1082,"请输入正确的电话号码");

    private Integer code;

    private String message;

    ServerCode(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
