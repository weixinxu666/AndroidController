package com.example.a12053;

import java.net.Socket;

public class Config {
    private static String carIP;
    private static int carPort;
    private static Socket tcpSock;

    public static String getCarIP() {
        return carIP;
    }

    public static void setCarIP(String carIP) {
        Config.carIP = carIP;
    }

    public static int getCarPort() {
        return carPort;
    }

    public static void setCarPort(int carPort) {
        Config.carPort = carPort;
    }

    public static Socket getTcpSock() {
        return tcpSock;
    }

    public static void setTcpSock(Socket tcpSock) {
        Config.tcpSock = tcpSock;
    }
}
