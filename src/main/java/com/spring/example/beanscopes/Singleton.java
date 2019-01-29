package com.spring.example.beanscopes;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singleton implements ApplicationContextAware {

    private Prototype prototype;
    private ApplicationContext context;

    public Prototype createPrototype()  {
        return context.getBean("prototype", Prototype.class);
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    /**
     * This method will be called immediately after the setPrototype method, and
     * injects the application context into this class. So that we can get differing instances
     * of the Prototype bean
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
