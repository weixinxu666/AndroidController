package com.example.a12053;

import java.io.DataInputStream;
import java.io.IOException;

public class Recv implements Runnable{
    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(Config.getTcpSock().getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
