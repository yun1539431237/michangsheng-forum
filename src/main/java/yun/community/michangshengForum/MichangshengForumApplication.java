package yun.community.michangshengForum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 *
 * @author 肖云标
 * @since 2020/7/2
 */
@MapperScan("yun.community.michangshengForum.dataStation.mapper")
@SpringBootApplication
public class MichangshengForumApplication {

    public static void main(String[] args) {
        SpringApplication.run(MichangshengForumApplication.class, args);
    }

}
