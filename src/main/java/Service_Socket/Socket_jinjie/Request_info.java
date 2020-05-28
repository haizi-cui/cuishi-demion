package Service_Socket.Socket_jinjie;

import java.io.Serializable;

//继承来进行序列化
public class Request_info implements Serializable {

    /*
    昵称
     */
    private String sendeer;

    /*
    发送的内容
     */
    private String conter;


    public String getSendeer() {
        return sendeer;
    }

    public void setSendeer(String sendeer) {
        this.sendeer = sendeer;
    }

    public String getConter() {
        return conter;
    }

    public void setConter(String conter) {
        this.conter = conter;
    }

    public Request_info(String sendeer, String conter) {
        super();
        this.sendeer = sendeer;
        this.conter = conter;
    }
}
