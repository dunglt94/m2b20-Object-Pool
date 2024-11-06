package view;

import controller.TaxiPool;
import controller.TaxiThread;

public class ObjectPoolDemo {
    public static int NUM_OF_CLIENT = 8;

    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();

        while (NUM_OF_CLIENT > 0) {
                Runnable client = new TaxiThread(taxiPool);
                Thread thread = new Thread(client);
                thread.start();

            NUM_OF_CLIENT--; // Giảm số lượng khách hàng sau mỗi lần khởi chạy một luồng
        }
    }
}
