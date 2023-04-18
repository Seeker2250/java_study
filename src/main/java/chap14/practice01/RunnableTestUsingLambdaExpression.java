package chap14.practice01;

public class RunnableTestUsingLambdaExpression {
    public static void main(String[] args) {

        //1) Anonymous Class로 구현하는 방법

/*        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    System.out.println(i);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
       };
       new Thread(r1).start();*/

        //2)Lambda Expression으로 구현하는 방법
/*        Runnable r2 = () -> {
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

       new Thread(r2).start();*/


       //3)Runnable Interface를 직접 구현하는 방법
        new Thread(() -> {
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
