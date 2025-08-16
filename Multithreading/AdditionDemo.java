class AdditionDemo {
    // 1 to 100 numbers addition
    public static void main(String[] args) {
        AdditionThread t[] = new AdditionThread[10];
        for (int i=0; i < 10; i++) {
            //i=0 1,10 
            //i=1 11,20
            t[i] = new AdditionThread(i*10+1, i*10+10);
            t[i].start();
            try {
                t[i].join();
            }catch(InterruptedException e) {}
        }

        // ask all thread about their output
        int sum=0;
        for (int i=0; i<10; i++){
            sum = sum + t[i].ans;
        }
        System.out.println("Final sum: " + sum);
    }
}

class AdditionThread extends Thread {
  int start;
  int end;
  int ans;
  AdditionThread(int start, int end) {
    this.start = start; this.end = end;
  }
  public void run() {
    System.out.println("Starting thread: " + Thread.currentThread().getName());
    for (int i=this.start; i<=this.end;i++) {
        this.ans = this.ans + i;
    }
  }
}
