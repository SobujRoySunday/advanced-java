package multithreading;

public class Thread1 extends Thread {
    @Override
    public void run(){
        try{
            System.out.println("Thread1 running!");
        } catch(Exception e){
            System.out.println("Exception raised" + e);
        }
    }
}
