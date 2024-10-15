package exam;
public class Counter {

private int count = 0;

public synchronized void increment() {

count++;

}

public int getCount() {

return count;

}

public static void main(String[] args) {

Counter counter = new Counter();

Thread thread1 = new Thread(() -> {

for (int i = 0; i < 10000; i++) {

counter.increment();

}

});

Thread thread2 = new Thread(() -> {

for (int i = 0; i < 10000; i++) {

counter.increment();

}

});

thread1.start();

thread2.start();

System.out.println("Final Count: " + counter.getCount());

}

}