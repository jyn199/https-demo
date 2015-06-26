/**
 * https实现：
 * 1、创建java证书
 * keytool -genkey -alias yongnian.jiang -keypass yongnian.jiang -keyalg RSA -keysize 1024 -keystore https.keystore -storepass yongnian.jiang
 * 2、将创建的证书保存到C盘（为了方便演示）
 * keytool -export -keystore https.keystore -alias yongnian.jiang -file https.crt -storepass yongnian.jiang
 */
/**
 * @author yongnian.jiang
 *
 */
package com.jyn.demo.https;
