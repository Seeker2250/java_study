package chap14.multithread;


//1)Thread Class를 Inheritance 하는 방법
public class ThreadA extends Thread {
    //Thread를 memory에 올리는 건 run method
    //그래서 override해야해
    //Alt + insert
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadA : "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
