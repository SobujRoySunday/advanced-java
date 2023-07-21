package multithreading;

public class Thread2 implements Runnable {
    @Override
    public void run(){
        try{
            System.out.println("Thread2 running!");
        } catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}
