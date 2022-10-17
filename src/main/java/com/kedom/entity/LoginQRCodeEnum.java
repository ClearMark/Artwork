package com.kedom.entity;

public enum LoginQRCodeEnum {
    not_scanned,//返回二维码，移动端未扫码
    scanned,//移动端已扫码，未确定登陆之后拒绝他人扫码
    confirmed,//移动端已确定登陆，但网页的端还未获取到移动端的用户信息
    logged;//网页端已获取移动端的数据之后拒绝他人获取
}
