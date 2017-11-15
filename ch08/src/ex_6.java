class PrimeNumber03 implements Runnable {
    int num;
    int check[];
    PrimeNumber03(int num){
        this.num = num;
        check = new int[num+1];
    }
    void showPrime(){
        for (int i = 2; i <= num; i++) {
            check[i] = i;
        }
        for(int i=2;i<=num;i++){
            for(int j=2;j<=num;j++){
                if (check[j] != i && check[j] % i == 0)
                    check[j]=0;
            }
        }
        for (int i = 2; i<= num; i++) {
            if (check[i] != 0)
                System.out.print(check[i]+ " ");
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":");
        showPrime();
    }
}
public class ex_6 {
    public static void main(String[] args){
        new Thread(new PrimeNumber03(25),"소수를 만드는 스래드").start();
    }
}
