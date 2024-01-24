public class Schedular extends Thread {
    Cpu os = new Cpu();

    public void run() {
        while (true) {
            os.i++;
        }
    }
}

class Cpu {
    int i;

    public int currenttime() {
        return i;
    }
}
