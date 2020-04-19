package Service_Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket_2 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(3459);
        System.out.println("正在等待客户端给我发消息");
        //监听客户端是否有像服务端发起通信，有就返回一个Socket对象
        Socket service = serverSocket.accept();

        //监听到后读取数据
        InputStream inputStream = service.getInputStream();
        DataInputStream reader = new DataInputStream(inputStream);

        String str = reader.readUTF();

        System.out.println("她给我说"+str);

        serverSocket.close();
        inputStream.close();
        reader.close();

    }
}
