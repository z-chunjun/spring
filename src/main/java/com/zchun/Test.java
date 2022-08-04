package com.zchun;

import com.spring.ZChunApplicationContext;
import com.zchun.service.UserInterface;

/**
 * @author z-chun
 */
public class Test {

    public static void main(String[] args) {

        // 扫描--->创建单例Bean BeanDefinition BeanPostPRocess
        ZChunApplicationContext applicationContext = new ZChunApplicationContext(AppConfig.class);

        UserInterface userService = (UserInterface) applicationContext.getBean("userService");
        userService.test();
    }
}
