class MultiThreadedWithAnnonymous {
    public static void main(String[] args) {
        // Annonymous inner class
        new Thread() {
            public void run() {
              for(int i=1; i<=100; i++) { System.out.println("Downloading "+i+"%"); }
            }
        }.start();

        new Thread(new Runnable(){
            public void run() {
              for(int i=1; i<=100; i++) { System.out.println("Uploading "+i+"%"); }
            }
        }).start();

        for(int i=1; i<=100; i++) { System.out.println("Browsing "+i+"%"); }
    }
}
