package Service_Socket.Socket_jinjie;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Socket socket = new Socket("192.168.91.1", 1098);
        //使用socket产生输出流输出流对象，写数据的流
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

             /*
        读数据的流
         */
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream read = new ObjectInputStream(inputStream);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入昵称");
        String sendName = scanner.next();

        String content = "";
        while (!content.equals("bye")) {
            //写数据
            System.out.println("请输入发送的内容");
            content = scanner.next();
            Request_info requestInfo = new Request_info(sendName, content);
            objectOutputStream.writeObject(requestInfo);

            //向下转型，数据类型不一样，必须进行转换
            //读数据
            Request_info request_info = (Request_info) read.readObject();
            System.out.println("【" + request_info.getSendeer() + "】对服务器说" + request_info.getConter());

        }


        //刷新关闭
        objectOutputStream.flush();
        outputStream.flush();

        outputStream.close();
        objectOutputStream.close();
        scanner.close();
        socket.close();


        //通信结束，关闭所有流
        socket.close();
        inputStream.close();
        read.close();


    }
}
