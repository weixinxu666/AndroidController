package com.example.a12053;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class MainActivity extends AppCompatActivity {

    private EditText mEdIP;
    private EditText mEdPort;
    private Button mBtnLogin;

    // @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdIP = (EditText) findViewById(R.id.et_ip);
        mEdPort = (EditText) findViewById(R.id.et_port);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new OnClick());

    }
    class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            new ClientThread().start();
            Intent intent = new Intent(MainActivity.this,ControllerActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
        }
    }

    class ClientThread extends Thread{

        String ip = mEdIP.getText().toString();
        int port = Integer.parseInt(String.valueOf(mEdPort.getText()));

        public void run() {
            Socket socket = null;
            Config.setCarIP(ip);
            Config.setCarPort(port);
            try {
                socket = new Socket(ip,port);
                Config.setTcpSock(socket);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("A".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

