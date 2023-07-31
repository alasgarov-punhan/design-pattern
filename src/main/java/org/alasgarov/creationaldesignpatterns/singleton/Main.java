package org.alasgarov.creationaldesignpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e){

                }
                System.out.println("HashCode of Lazy : " + SingletonLazy.getInstance().hashCode());
                System.out.println("HashCode of Eager : " + SingletonEager.getInstance().hashCode());
                System.out.println("HashCode of Enum : " + SingletonEnum.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HashCode of Lazy : " + SingletonLazy.getInstance().hashCode());
                System.out.println("HashCode of Eager : " + SingletonEager.getInstance().hashCode());
                System.out.println("HashCode of Enum : " + SingletonEnum.INSTANCE.hashCode());
            }
        }).start();
    }
}
