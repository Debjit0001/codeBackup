public class Priority extends Thread{
    public void run(){
System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Priority t1=new Priority();
        Priority t2= new Priority();

        t1.start();
        t2.start();
        int a=t1.getPriority();
        int b=t2.getPriority();
        System.out.println(a+" "+b);
    }
}