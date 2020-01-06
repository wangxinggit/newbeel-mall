package ltd.newbee.mall;

import ltd.newbee.mall.util.MD5Util;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 */
@MapperScan("ltd.newbee.mall.dao")
@SpringBootApplication
public class NewBeeMallApplication {
    public static void main(String[] args) {

//        System.out.print(MD5Util.MD5Encode("admin123","UTF-8"));

        SpringApplication.run(NewBeeMallApplication.class, args);
    }
}
