package network.https;

public class https {
    /**
     * https的目的
     *
     *     内容加密：采用混合加密技术，中间者无法直接查看明文内容
     *     验证身份：通过证书认证客户端访问的是自己的服务器
     *     保护数据完整性：防止传输的内容被中间人冒充或者篡改
     */

/**
 * HTTPS验证过程就是SSL握手协议的交互过程。“HTTPS验证”这个说法其实不准确的，应该是“SSL验证”
 *
 * https://blog.csdn.net/superviser3000/article/details/80812263
 *
 * 双向认证和单向认证基本一样（某些银行系统就需要双向认证）
 *
 * 客户端服务端约定好ssl协议版本号。验证完服务端秘钥后，再约定加密法式（双向认证，该数据要用客户端的公钥加密的），客户端用该加密方式生成随机码，
 * 公钥加密，服务端私钥解密。（双向认证中，客户端也需要提供自己的公钥和证书）
 */

/**
 * 公钥加密，私钥解密
 */

}
