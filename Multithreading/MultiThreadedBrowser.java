class MultiThreadedBrowser {
    public static void main(String[] args) {
        DownloadThread t1 = new DownloadThread();
        t1.setName("Download-Thread");
        t1.start();

        UploadThread job = new UploadThread();
        Thread t2 = new Thread(job);
        t2.setName("Upload-thread");
        t2.start();

       // for(int i=1; i<=100;i++) {
        //    System.out.println("Browsing:" + i + "%");
       // }
    }
}
class DownloadThread extends Thread {
    public void run() {
        System.out.println("Logic of " + Thread.currentThread().getName() + " is starting");
        for(int i=1; i<=100; i++) {
            System.out.println("Downloading: " + i + "%");
        }
    }
}
class UploadThread implements Runnable {
    public void run() {

        System.out.println("Logic of " + Thread.currentThread().getName() + " is starting");
        for(int i=1; i<=100; i++) {
            System.out.println("Uploading: " + i + "%");
        }
    }
}

