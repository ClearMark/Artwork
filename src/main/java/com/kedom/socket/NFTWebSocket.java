package com.kedom.socket;

import com.kedom.configClass.MySpringConfig;
import com.kedom.entity.Message;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


//定义一个WebSocket服务器
@ServerEndpoint(value="/websocketTest/{userId}",configurator = MySpringConfig.class)
@Component
@Scope("prototype")
public class NFTWebSocket {
    // 日志 private Logger logger = LoggerFactory.getLogger(MyWebSocket.class);
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static volatile AtomicInteger onlineCount=new AtomicInteger(0);

//    private final MessageService messageService;

    //记录每个用户下多个终端的连接
    private static final ConcurrentHashMap<String, Set<SocketUser>> userSocket = new ConcurrentHashMap<>();

    //需要session来对用户发送数据, 获取连接特征userId
//    private Session session;
//    private String username;


    /**
     * @Title: onOpen
     * @Description: websocket连接建立时的操作
     * @param @param userId 用户id
     * @param @param session websocket连接的session属性
     * @param @throws IOException
     */
    @OnOpen
    public void onOpen(@PathParam("userId") String username, Session session) throws IOException {
        SocketUser socketUser = new SocketUser(session, username);
//        this.session = session;
//        this.username = username;
        onlineCount.addAndGet(1);
        //根据该用户当前是否已经在别的终端登录进行添加操作
        if (userSocket.containsKey(socketUser.getUsername())) {
//          userSocket已经存储了一个user的socket 那么我们就将新的Socket加入列表
            userSocket.get(socketUser.getUsername()).add(socketUser); //增加该用户set中的连接实例

        }
        else {
            //          userSocket没有存储了一个user的socket 那么我们就将新的Socket加入列表
            Set userSocketSet=new HashSet();
            userSocketSet.add(socketUser);
            userSocket.put(socketUser.getUsername(), userSocketSet);
        }
    }

    /**
     * @Title: onClose
     * @Description: 连接关闭的操作
     */
    @OnClose
    public void onClose(){

//        if (userSocket.get(this.username)!=null)
//        {
//            userSocket.remove(this.username);
//        }

        //移除当前用户终端登录的websocket信息,如果该用户的所有终端都下线了，则删除该用户的记录
//        if (userSocket.get(this.userId).size() == 0) {
//            userSocket.remove(this.userId);
//        }else{
//            userSocket.get(this.userId).remove(this);
//        }
//        logger.debug("用户{}登录的终端个数是为{}",this.userId,userSocket.get(this.userId).size());
//        logger.debug("当前在线用户数为：{},所有终端个数为：{}",userSocket.size(),onlineCount);
    }

    /**
     * @Title: onMessage
     * @Description: 收到消息后的操作
     * @param @param message 收到的消息
     * @param @param session 该连接的session属性
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("aa");
//        logger.debug("收到来自用户id为：{}的消息：{}",this.userId,message);
//        if(session ==null)  logger.debug("session null");
    }

    /**
     * @Title: onError
     * @Description: 连接发生错误时候的操作
     * @param @param session 该连接的session
     * @param @param error 发生的错误
     */
    @OnError
    public void onError(Session session, Throwable error){
//        logger.debug("用户id为：{}的连接发送错误",this.userId);
        error.printStackTrace();
    }


    /**
     * @Title: sendMessageToUser
     * @Description: 发送消息给用户下的所有终端
     * @param @param userId 用户id
     * @param @param message 发送的消息
     * @param @return 发送成功返回true，反则返回false
     */
    public Boolean sendToUserMessage(Message message){
//        messageService.add(message);
        if (userSocket.containsKey(message.getMessageAcceptUserName()))
        {
//            MyWebSocket myWebSocket = userSocket.get(message.getMessageAcceptUserName());
//            try{
//                myWebSocket.session.getBasicRemote().sendText(message.getMessageText());
//            }
//            catch (Exception e)
//            {
//                return false;
//            }
        }
        return true;
    }

}

