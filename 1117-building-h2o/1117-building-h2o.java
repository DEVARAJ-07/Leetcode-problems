import java.util.concurrent.Semaphore;

class H2O {
    Semaphore h = new Semaphore(2);
    Semaphore o = new Semaphore(0);
    int c = 0;

    public H2O() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.acquire();
        releaseHydrogen.run();
        c += 1;
        if (c == 2)
            o.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire();
        releaseOxygen.run();
        c = 0;
        h.release(2);
    }
}