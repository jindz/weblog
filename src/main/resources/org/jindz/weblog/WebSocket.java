package org.jindz.weblog;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value="/websocket",configurator=GetHttpSessionConfigurator.class)
public class WebSocket {
    @OnMessage
    public void onMessage(String message, Session session) throws IOException, InterruptedException {

        // Print the client message for testing purposes
        System.out.println("接收消息: " + message);
        
        // Send the first message to the client
        session.getBasicRemote().sendText("服务端已收到消息，你的消息是："+message);

//        // Send 3 messages to the client every 5 seconds
//        int sentMessages = 0;
//        while (sentMessages < 3) {
//            Thread.sleep(5000);
//            session.getBasicRemote().sendText("这是一个中间服务器消息。计数：" + sentMessages);
//            sentMessages++;
//        }
//
//        // Send a final message to the client
//        session.getBasicRemote().sendText("这是最后一个服务器消息");
    }

    @OnOpen
    public void onOpen(Session session,EndpointConfig config) {
        System.out.println("客户端连接");
        HttpSession httpSession= (HttpSession) config.getUserProperties().get(HttpSession.class.getName());
        System.out.println(httpSession.getId());
    }

    @OnClose
    public void onClose() {
        System.out.println("连接关闭");
    }
}
