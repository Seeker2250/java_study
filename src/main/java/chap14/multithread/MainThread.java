package chap14.multithread;



public class MainThread {
    public static void main(String[] args) {
        //1) Thread Class를 실행하는 방법 reference variable을 thread A

        ThreadA tha = new ThreadA();
        //tha.start();

        //2)Runnable interface를 실행하는 방법

        //Runnable r = new ThreadB();
        //interface이름이 먼저 오고 object 만들어

        //Thread thb = new Thread(r);
        //Thread를 통해서 집어넣는 과정을 거쳐야 해

        //위 두 줄을 한 줄로 만들면

        Thread thb = new Thread(new ThreadB());

        tha.start();
        thb.start();
        //Runnable interface에는 start method가 없기 때문에
        //object를 만드는 과정을 거쳐야 해

        for (int i = 0; i < 10; i++){
            System.out.println("main thread : " + i);

            //Ctrl + Alt + T
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
