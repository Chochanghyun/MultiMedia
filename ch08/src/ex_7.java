import java.util.Date;

class PrintTime implements Runnable{
    int num;
    PrintTime(int num){
        this.num = num;
    }
    @Override
    public void run() {
        while(num--!=0){
            System.out.print("순위 : "+Thread.currentThread().getPriority());
            System.out.print(new Date().toString());
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class ex_7 {
    public static void main(String[] args){
        PrintTime p1 = new PrintTime(3);
        Thread th1 = new Thread(p1,"안녕하세요!");
        th1.setPriority(Thread.MAX_PRIORITY-1);
        th1.start();

        PrintTime p2 = new PrintTime(6);
        Thread th2 = new Thread(p2,"반갑습니다.");
        th2.setPriority(Thread.NORM_PRIORITY-1);
        th2.start();
    }
}
