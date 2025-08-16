class SingleThreadedBrowser {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread is: " + t.getName());
        // Browsing
        for (int i=1; i<=100; i++) { System.out.println("Browsing: " + i +"%"); }
        
        // Downloading
        for (int i=1; i<=100; i++) { System.out.println("Downloading: " + i +"%"); }
        
        // Uploading
        for (int i=1; i<=100; i++) { System.out.println("Uploading: " + i +"%"); }
    }
}
