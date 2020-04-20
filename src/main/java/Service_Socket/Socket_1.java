package Service_Socket;

import java.io.*;
import java.net.Socket;

public class Socket_1 {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("192.168.91.1",3459);
            /*
            *通过流的方式把内容传到网络
             */
            OutputStream outputStream =  socket.getOutputStream();
            //产生数据流
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeUTF("hello word");

            //监听到后读取数据
            InputStream inputStream = socket.getInputStream();
            DataInputStream reader = new DataInputStream(inputStream);

            String str = reader.readUTF();

            System.out.println("她给我说"+str);
            //刷新
            dataOutputStream.flush();
            inputStream.close();
            outputStream.flush();
            outputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
