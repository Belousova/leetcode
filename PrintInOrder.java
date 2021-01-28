//1114. Print in Order
class Foo {
    
    private final CountDownLatch third = new CountDownLatch(1);
    private final CountDownLatch second = new CountDownLatch(1);
    
    public Foo() {
   
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs first. Do not change or remove this line.
        printFirst.run();
        second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        second.await();
        // printSecond.run() outputs second. Do not change or remove this line.
        printSecond.run();
        third.countDown();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        
        third.await();
        // printThird.run() outputs third. Do not change or remove this line.
        printThird.run();
    }
}
