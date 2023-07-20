package com.dr.spring.config.SpringMVC;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;


/**
 * 入门案例工作流程分析
 * 1、启动服务器工作流程分析
 *    a、服务器启动，执行ServletContainerInitConfig类，初始化web容器
 *    b、执行createServletApplicationContext()，创建WebApplicationContext对象
 *    c、加载SpringMvcConfig
 *    d、执行@ComponentScan加载对应的bean
 *    e、加载UserController，每个@ReuqestMapping的名称对应一个具体的方法
 *    f、执行getServletMappings()，定义所有的请求都通过SpringMVC
 */

public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
