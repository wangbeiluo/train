package cn.lewis.train.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lewis
 * @description:
 * @date: 2023/6/12
 * @Copyright:
 */
@SpringBootApplication
@ComponentScan("cn.lewis")
@MapperScan("cn.lewis.train.member.mapper")
public class MemberApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MemberApplication.class, args);
    }
}
