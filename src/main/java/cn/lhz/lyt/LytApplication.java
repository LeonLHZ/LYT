package cn.lhz.lyt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.lhz.lyt.dao")
@SpringBootApplication
//@ComponentScan(basePackages = {"cn.lhz.lyt"})
public class LytApplication {

	public static void main(String[] args) {
		SpringApplication.run(LytApplication.class, args);
	}

}
