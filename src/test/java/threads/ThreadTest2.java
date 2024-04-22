package threads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreadTest2 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.init(100, 10);
        ticket.execute();
    }
}

class Ticket extends Thread {
    private static int ticketNum;
    private static int poolSize;

    public void init(int ticketNum, int poolSize) {
        this.ticketNum = ticketNum;
        this.poolSize = poolSize;
    }


    public void execute() {
        for (int i = 0; i < poolSize; i++) {
            Ticket t = new Ticket();
            t.start();
        }
    }

//    @Override
//    public void run() {
//        while (ticketNum > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("售票窗口：" + Thread.currentThread().getName() + " 售出一张票," + "剩余票数为：" + --ticketNum);
//        }
//    }


    @Override
    public void run() {
        while (true) {
            //方法中的代码块，使用synchronized，注意此时同步锁锁定的对象是Ticket.class
            synchronized (Ticket.class) {
                if (ticketNum <= 0) {
                    System.out.println("售票窗口：" + Thread.currentThread().getName() + "票已经售罄！");
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("售票窗口：" + Thread.currentThread().getName() + " 售出一张票," + "剩余票数为：" + (--ticketNum));
            }
        }
    }
}


