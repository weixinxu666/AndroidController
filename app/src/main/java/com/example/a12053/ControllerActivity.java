package com.example.a12053;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ControllerActivity extends AppCompatActivity {

    private Button mBtnForward;
    private Button mBtnBack;
    private Button mBtnLeft;
    private Button mBtnRight;
    private Button mBtnStop;
//    private TextView mTvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);
//
//        mTvMessage = (TextView) findViewById(R.id.tv_message);
//        DataInputStream dataInputStream = null;
//        try {
//            dataInputStream = new DataInputStream(Config.getTcpSock().getInputStream());
//            byte[] buf = new byte[1024];
//            int msg = dataInputStream.read(buf);
//            mTvMessage.setText(msg);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        mBtnForward = (Button)findViewById(R.id.btn_forward);
        mBtnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OutputStream outputStream = null;
                byte[] buf = "9W|".getBytes();
                Socket sock = Config.getTcpSock();
                try {
                    outputStream = (OutputStream) Config.getTcpSock().getOutputStream();
                    outputStream.write(buf);
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        mBtnBack = (Button)findViewById(R.id.btn_back);
        mBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OutputStream outputStream = null;
                byte[] buf = "9S|".getBytes();
                Socket sock = Config.getTcpSock();
                try {
                    outputStream = (OutputStream) Config.getTcpSock().getOutputStream();
                    outputStream.write(buf);
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        mBtnLeft = (Button)findViewById(R.id.btn_left);
        mBtnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OutputStream outputStream = null;
                byte[] buf = "9A|".getBytes();
                Socket sock = Config.getTcpSock();
                try {
                    outputStream = (OutputStream) Config.getTcpSock().getOutputStream();
                    outputStream.write(buf);
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        mBtnRight = (Button)findViewById(R.id.btn_right);
        mBtnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OutputStream outputStream = null;
                byte[] buf = "9D|".getBytes();
                Socket sock = Config.getTcpSock();
                try {
                    outputStream = (OutputStream) Config.getTcpSock().getOutputStream();
                    outputStream.write(buf);
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        mBtnStop = (Button)findViewById(R.id.btn_stop);
        mBtnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OutputStream outputStream = null;
                byte[] buf = "9P|".getBytes();
                Socket sock = Config.getTcpSock();
                try {
                    outputStream = (OutputStream) Config.getTcpSock().getOutputStream();
                    outputStream.write(buf);
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }

}
