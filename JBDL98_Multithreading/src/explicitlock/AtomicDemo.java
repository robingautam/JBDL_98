package explicitlock;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    AtomicInteger data = new AtomicInteger(0);

    public void increment(){
        data.incrementAndGet();
    }

    public int getData(){
        return data.get();
    }
}
