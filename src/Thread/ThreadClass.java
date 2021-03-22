package Thread;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        int i;
        for(i=0; i<=200; i++) {
            System.out.println(i + "\t");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadTest {
    public static void main(String[] args) {
        System.out.println("start");
        ThreadClass threadClass = new ThreadClass();
        ThreadClass threadClass2 = new ThreadClass();

        threadClass.start();
        threadClass2.start();
        System.out.println("end");
    }
}
