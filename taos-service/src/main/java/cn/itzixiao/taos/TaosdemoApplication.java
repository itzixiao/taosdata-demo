package cn.itzixiao.taos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.itzixiao.taos"})
public class TaosdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaosdemoApplication.class, args);
    }
}