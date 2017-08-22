package com.lft.secretgarden.socket;

import com.lft.secretgarden.thread.TaskHander;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;

/**
 * Created by liufeitian on 16/9/29.
 */
public class SocketTask extends TaskHander {

    private Socket socket = null;

    public SocketTask(Socket socket){
        this.socket = socket;
    }
    public void runTask() throws Exception{

        if(socket == null){
            System.out.println("soket is null");
        }
        Reader br = new InputStreamReader(socket.getInputStream());
        char[] chars = new char[128];
        int brlen;
        StringBuffer sb = new StringBuffer();
        while ((brlen = br.read(chars)) != -1){
            String temp = new String(chars,0,brlen);
            sb.append(temp);
            if(temp.indexOf("eof") != -1){
                break;
            }
        }
        System.out.println("this is service ,i got message from client"+sb.toString());
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        pw.print("i got you client");
        pw.print("eof");
        pw.flush();
        br.close();
        pw.close();
        socket.close();
    }
}
