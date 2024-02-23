package cn.zhangyis.minispring.dto;

import org.junit.jupiter.api.Test;

/**
 * @Description TODO
 * @Date 2024/2/23 13:55
 * @Created by libo
 */
public class PersonTest {
    @Test
    public void test() {
        Person person = new Person();
        person.setName("libo");
        person.setAge(18);
        System.out.println("-------------------->"+person);
    }
}
