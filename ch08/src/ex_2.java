class InvalidWithdraw extends Exception{
    private static final long serialVersionUID = 1L;
    String msg;
    public InvalidWithdraw(String msg){
        this.msg=msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
class BankAccount{
    int minAcc=0;
    int money=0;
    BankAccount(int minAcc){
        this.minAcc = minAcc;
    }
    // inMoney Mathod
    void deposit(int money) {
        this.money = money;
        System.out.println("정상 입금처리 : 입금금액="+money+", 잔금="+this.money);
    }
    // outMoney Mathod
    void withdraw(int money) throws InvalidWithdraw {
        if(money<minAcc||money<0)
            throw new InvalidWithdraw("Invalid money");
        if(money>this.money)
            throw new InvalidWithdraw("초과출금 요구 예외");
        else
            System.out.println("정상 출금처리 : 인출금액="+money+", 잔금="+this.money);
    }
}

public class ex_2 {
    public static void main(String[] args){
        BankAccount ba = new BankAccount(-1000000);
        try {
            ba.withdraw(100000);
        } catch (InvalidWithdraw e) {
            e.printStackTrace();
        }

    }
}