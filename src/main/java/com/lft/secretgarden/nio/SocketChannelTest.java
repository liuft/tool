package com.lft.secretgarden.nio;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by liufeitian on 16/10/13.
 */
public class SocketChannelTest {
    public void sendSocketBffuer()throws Exception{

        String callmethod = "i am called ....";
        SocketChannel sc = SocketChannel.open();
        sc.connect(new InetSocketAddress("127.0.0.1",1044));
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        byte[] bytes = callmethod.getBytes();
        buffer.clear();
        buffer.put(bytes);
        buffer.flip();
        sc.write(buffer);
        sc.close();

    }
    public static void main(String[] args){
        try {
            new SocketChannelTest().sendSocketBffuer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
