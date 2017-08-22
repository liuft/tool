package com.lft.secretgarden.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;

/**
 * Created by liufeitian on 16/10/12.
 */
public class FileChannelTest {
    public void readFileFromchannel()throws Exception{
        RandomAccessFile raf = new RandomAccessFile("/opt/","rw");
        FileChannel fc = raf.getChannel();

        ByteBuffer bb = ByteBuffer.allocate(48);

        int bytesread = 0;
        while ((bytesread = fc.read(bb)) != -1){
            System.out.println("read "+bb);
            bb.flip();
            while (bb.hasRemaining()){
                bb.get();
            }
            bb.clear();
        }
    }
    public void pipetest()throws Exception{
        Pipe pipe = Pipe.open();
        String dataSource = "this is a test data";
        Pipe.SinkChannel sinkChannel = pipe.sink();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.clear();
        buffer.put(dataSource.getBytes());

        buffer.flip();

        while (buffer.hasRemaining()){
            sinkChannel.write(buffer);
        }

        Pipe.SourceChannel psc = pipe.source();
        psc.read(buffer);

        

    }
}
