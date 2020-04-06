package android.推送;

public class push {
    /**
     *
     * 消息推送的实现原理
     *
     * 长连接+心跳帧，我们平常的socket连接都是短连接，当用完之后会close掉，长连接是一直保持这个连接状态，但是如果一段时间，
     * 服务器和客户端没有消息传递，这个连接会被断掉，这个时候就引入了心跳帧的概念，客户端每隔一段时间会发送一条心跳短消息，保证连接一直存在
     */
    /**
     * socket长连接
     */
}
