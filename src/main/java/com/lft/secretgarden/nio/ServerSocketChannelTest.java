package com.lft.secretgarden.nio;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;

/**
 * Created by liufeitian on 16/10/13.
 */
public class ServerSocketChannelTest {
    public static void recivedmsg()throws Exception{
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(1044));
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        ssc.configureBlocking(false);
        while (true){
            SocketChannel ss = ssc.accept();
            if(ss != null && ss.read(buffer) > 0){
               byte[] bytes = buffer.array();


                System.out.println("=========="+bytes.toString());
                String abc = new String(bytes);
                System.out.println(">>>>>>>"+abc);
                for(byte b : bytes){
                    System.out.print(b +"==");
                }
                System.out.println();
            }

        }


    }
    public static void main(String[] args){
        try {
            ServerSocketChannelTest.recivedmsg();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
