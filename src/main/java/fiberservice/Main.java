package fiberservice;


import javax.annotation.processing.AbstractProcessor;

public class Main {
    private static final ScopedValue<String> USER_CONTEXT = ScopedValue.newInstance();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ScopedValue.where(USER_CONTEXT, "admin").run(()->{
            String name = USER_CONTEXT.get();
        });
        Thread.startVirtualThread(() -> {

        });

    }
}