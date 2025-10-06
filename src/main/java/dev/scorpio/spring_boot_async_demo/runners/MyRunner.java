package dev.scorpio.spring_boot_async_demo.runners;

import dev.scorpio.spring_boot_async_demo.service.AsyncService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final AsyncService asyncService;

    public MyRunner(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Calling async method by thread "+Thread.currentThread().getName());
        asyncService.performAsyncTask();
        System.out.println("Async method called by thread "+Thread.currentThread().getName());
    }
}
