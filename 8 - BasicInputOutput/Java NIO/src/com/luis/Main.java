package com.luis;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Pipe pipe = Pipe.open();

            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for (int i = 0; i < 10; i++) {
                            String currentTime = "The time is: " + System.currentTimeMillis();

                            buffer.put(currentTime.getBytes());
                            buffer.flip();

                            while (buffer.hasRemaining()) {
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);

                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for (int i = 0; i < 10; i++) {
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Reader thread: " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();


        } catch (IOException e) {
            e.printStackTrace();
        }

//        try (FileOutputStream binFile = new FileOutputStream("data.dat");
//             FileChannel binChannel = binFile.getChannel()) {
//
//
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//// Chained version
////            byte[] outputBytes = "Hello World!".getBytes();
////            byte[] outputBytes2 = "Nice to meet you".getBytes();
////            buffer.put(outputBytes).putInt(245).putInt(-98546).put(outputBytes2).putInt(1000);
////            buffer.flip();
//
//
//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            long int1Pos = outputBytes.length;
//            buffer.putInt(345);
//            long int2Pos = int1Pos + Integer.BYTES;
//            buffer.putInt(-98546);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
//            buffer.putInt(1000);
//            buffer.flip();
//
//
//            binChannel.write(buffer);
//
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//
//            channel.position(int3Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int3: " + readBuffer.getInt());
//
//            readBuffer.flip();
//            channel.position(int2Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int2: " + readBuffer.getInt());
//
//            readBuffer.flip();
//            channel.position(int1Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int1: " + readBuffer.getInt());
//
//
//            RandomAccessFile copyFile = new RandomAccessFile("dataCopy.dat","rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            channel.position(0);
////            long numTransferred = copyChannel.transferFrom(channel,0,channel.size());
//            long numTransferred = channel.transferTo(0,channel.size(),copyChannel);
//            System.out.println("numTransferred =" + numTransferred);
//
//            channel.close();
//            ra.close();
//            copyChannel.close();
//
//
////              writing sequentially
////            byte[] outputString = "Hello, World!".getBytes();
////            long str1Pos = 0;
////            long newInt1Pos = outputString.length;
////            long newInt2Pos = newInt1Pos + Integer.BYTES;
////
////            byte[] outputString2 = "Nice to meet you!".getBytes();
////            long str2Pos = newInt2Pos + Integer.BYTES;
////            long newInt3Pos = str2Pos + outputBytes2.length;
////
////            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
////            intBuffer.putInt(245);
////            intBuffer.flip();
////            binChannel.position(newInt1Pos);
////            binChannel.write(intBuffer);
////
////            intBuffer.flip();
////            intBuffer.putInt(-93123);
////            intBuffer.flip();
////            binChannel.position(newInt2Pos);
////            binChannel.write(intBuffer);
////
////            intBuffer.flip();
////            intBuffer.putInt(1000);
////            intBuffer.flip();
////            binChannel.position(newInt3Pos);
////            binChannel.write(intBuffer);
////
////            binChannel.position(str1Pos);
////            binChannel.write(ByteBuffer.wrap(outputBytes));
////
////            binChannel.position(str2Pos);
////            binChannel.write(ByteBuffer.wrap(outputBytes2));
//
//
//
//
////            ByteBuffer readBuffer = ByteBuffer.allocate(100);
////            channel.read(readBuffer);
////            readBuffer.flip();
////            byte[] inputString = new byte[outputBytes.length];
////            readBuffer.get(inputString);
////            System.out.println("inputString: " + new String(inputString));
////            System.out.println("int1 = " + readBuffer.getInt());
////            System.out.println("int2 = " + readBuffer.getInt());
////            byte[] inputString2 = new byte[outputBytes2.length];
////
////            readBuffer.get(inputString2);
////            System.out.println("inputString2: " + new String(inputString2));
////            System.out.println("int3 = " + readBuffer.getInt());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
//            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
//            buffer.put(outputBytes);
//            buffer.flip();
//
//            int numBytes = binChannel.write(buffer);
//            System.out.println("numBytes written: " + numBytes);
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written: " + numBytes);
//
//            intBuffer.flip();
//            intBuffer.putInt(-95312);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written: " + numBytes);
//
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//
//            outputBytes[0] = 'a';
//            outputBytes[1] = 'b';
//            buffer.flip();
//            long numBytesRead = channel.read(buffer);
//            if(buffer.hasArray()) {
//                System.out.println("byte buffer = " + new String(buffer.array()));
////                System.out.println("byte buffer = " + new String(outputBytes));
//            }
//
//
//            // Absolute read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt(0));
//            System.out.println(intBuffer.getInt());


// Relative read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());

//            channel.close();
//                    ra.close();

//reading using Random Access
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            byte[] b = new byte[outputBytes.length];
//            ra.read(b);
//            System.out.println(new String (b));
//
//            long int1 = ra.readInt();
//            long int2 = ra.readInt();
//            System.out.println(int1);
//            System.out.println(int2);

//
//        FileInputStream file = new FileInputStream("data.txt");
//        FileChannel channel = file.getChannel();

//        Path dataPath = FileSystems.getDefault().getPath("data.txt");
//        Files.write(dataPath,"\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
//        List<String> lines = Files.readAllLines(dataPath);
//        for (String line: lines
//             ) {
//            System.out.println(line);
//
//        }