class ProducerConsuemrDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Consumer c = new Consumer(obj);
        c.start();
        
        Producer p = new Producer(obj);
        p.start();
    }
}
class Producer extends Thread {
    Object obj;
    Producer(Object obj) { this.obj = obj; }
    
    public void run() {
        for (int i=1;i<=100;i++) {
           try { Thread.sleep(100); } catch (InterruptedException e) {}
           System.out.println("Pen " + i + " is ready");
           if (i%10==0) {
            synchronized(obj) { obj.notify(); }
           }
        }
    }
}
class Consumer extends Thread {
    Object obj;
    Consumer(Object obj) { this.obj = obj; }

    public void run() {
       synchronized(obj) {
        try { obj.wait(); }catch(InterruptedException e) {}
       }
       for (int i=1;i<=100;i++) {
         try { Thread.sleep(25); } catch (InterruptedException e) {}
         System.out.println("Pen " + i + " is colored");
         if(i%10 ==0) {
            synchronized(obj) {
                try { obj.wait(); }catch(InterruptedException e) {}
            }
         }
       }
        
    }
}
