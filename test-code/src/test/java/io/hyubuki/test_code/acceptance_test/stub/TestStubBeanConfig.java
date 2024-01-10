package io.hyubuki.test_code.acceptance_test.stub;

import io.hyubuki.test_code.app.bean.Child;
import org.springframework.context.annotation.Bean;

public class TestStubBeanConfig {

    @Bean
    public Child child() {
        return new Daughter();
    }
}
