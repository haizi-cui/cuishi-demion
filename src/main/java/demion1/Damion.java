package demion1;

public class Damion {
    private String accountName;  //名字
    private String accountPwd;   //账户
    private double accountBalance;  // 金额

    //定义方法
    public void setAccountName(String _accountName) {
        accountName = _accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountPwd(String _accountPad) {
        accountPwd = _accountPad;
    }

    public String getAccountPwd() {
        return accountPwd;
    }


    public double getAccountBalance() {
        return accountBalance;
    }

    //定义单独的方法，进行存钱
    public void saveMoney(double _vm) {
        accountBalance += _vm;
    }

    //取钱
    public void reduceMoney(double _vm) {
        accountBalance -= _vm;
    }

}
