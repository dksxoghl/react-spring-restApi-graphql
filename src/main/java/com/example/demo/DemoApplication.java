
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
//    INSERT INTO categories (`id`, `name`, `parent_id`, `_order`, `status`, `active`) VALUES ('a0', '대분류', null, 1,'show',true);
//    default data.sql, 에러뜰시 파일지우기