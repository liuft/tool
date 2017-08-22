package com.lft.secretgarden.socket;

import com.lft.secretgarden.thread.ThreadPool;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by liufeitian on 16/9/28.
 */
public class ServiceSocket {

    public void receivedMessage(){
        ServerSocket ss = null;
        Socket socket = null;
        try {
            ss = new ServerSocket(4471);

        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true){

            try {
                socket = ss.accept();
                ThreadPool.getsigleton.testPool(new SocketTask(socket));

            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
    public static void main(String[] args){
        new ServiceSocket().receivedMessage();
    }
}
