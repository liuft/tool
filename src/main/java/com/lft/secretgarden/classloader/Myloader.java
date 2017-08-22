package com.lft.secretgarden.classloader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by liufeitian on 16/9/22.
 */
public class Myloader extends ClassLoader {
    public Class<?> loadNetWorkClass(String url)throws Exception{
            return findClass(url);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clz = null;
        byte[] classdate = getNetWorkClassDate("");
        clz = defineClass(name,classdate,0,classdate.length);
        return clz;
    }
    private byte[] getNetWorkClassDate(String url){
        byte[] ret = null;
        try {
            URL urlstr = new URL(url);
            InputStream fis = urlstr.openStream();
            ByteArrayOutputStream ops = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read()) != -1){
                ops.write(b,0,len);
            }
            ret = ops.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    public void testloader(){

    }

}
