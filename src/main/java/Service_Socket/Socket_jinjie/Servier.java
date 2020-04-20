package Service_Socket.Socket_jinjie;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servier {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(1098);
        System.out.println("等待聊天");
        //等到了，就会得到一个socket，进行聊天
        Socket socket = serverSocket.accept();
        /*
        读数据的流
         */
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream read = new ObjectInputStream(inputStream);


        /*
        写数据的流
         */
        //使用socket产生输出流输出流对象
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Scanner scanner = new Scanner(System.in);

        String sendNames = "";
        //向下转型，数据类型不一样，必须进行转换
        while (!sendNames.equals("bye")){
            //读数据
            Request_info requestInfo = (Request_info) read.readObject();
            System.out.println("【"+requestInfo.getSendeer()+"】对客户端说"+requestInfo.getConter());
            //写数据
            System.out.println("请输入你要对"+requestInfo.getSendeer()+"说的话");
            sendNames = scanner.next();
            Request_info request_info = new Request_info("服务器",sendNames);
            objectOutputStream.writeObject(request_info);
        }






        //通信结束，关闭所有流
        socket.close();
        inputStream.close();
        read.close();

        /*
        关闭写数据的流
         */
        objectOutputStream.flush();
        outputStream.flush();

        outputStream.close();
        objectOutputStream.close();
        scanner.close();
        socket.close();
    }
}
