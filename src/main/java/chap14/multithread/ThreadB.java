package chap14.multithread;
//public class ThreadB implements Runnable{
//2) Runnable interface로 구현하는 방법
public class ThreadB implements Runnable {
    //Runnable은 functional interface야

    @Override
    public void run() {
        //반드시 overriding 해야해
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


