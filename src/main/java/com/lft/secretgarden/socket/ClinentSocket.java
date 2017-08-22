package com.lft.secretgarden.socket;

import com.sun.tools.classfile.Synthetic_attribute;

import java.io.*;
import java.net.Socket;

/**
 * Created by liufeitian on 16/9/28.
 */
public class ClinentSocket {



    public void clientSendMessage(){
        Socket sc = null;
        try {
            sc = new Socket("127.0.0.1",4471);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sc.getOutputStream())));
            pw.print("hello,this is from client");
            pw.print("eof");
            pw.flush();

            //发送完之后，开始读操作
            Reader reader = new InputStreamReader(sc.getInputStream());
            char[] chars = new char[128];
            int rederlen = 0;
            StringBuffer sb = new StringBuffer();
            while ((rederlen = reader.read(chars)) != -1){
                String temp = new String(chars,0,rederlen);
                    sb.append(temp);
                    if (temp.indexOf("eof") != -1){
                        break;
                    }
            }
            System.out.print("recivmessage "+sb.toString());
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static void main(String[] args){
        new ClinentSocket().clientSendMessage();
    }
}
