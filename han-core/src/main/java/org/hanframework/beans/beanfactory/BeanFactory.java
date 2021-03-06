package org.hanframework.beans.beanfactory;

/**
 * bean 工厂定义在BeanFactory里只对IOC容器的基本行为作了定义，
 * 根本不关心你的bean是如何定义怎样加载的。正如我们只关心工厂里得到什么的产品对象，
 * 至于工厂是怎么生产这些对象的，这个基本的接口不关心。
 *
 * @author liuxin
 * @date 2017/9/15 下午2:05
 */
public interface BeanFactory {
    /**
     * FactoryBean的前缀
     */
    String FACTORY_BEAN_PREFIX = "&";


    /**
     * 根据名字获取Bean
     *
     * @param name bean名字
     * @return bean实例
     */
    Object getBean(String name);

    /**
     * 获取指定类型的bean
     *
     * @param requiredType bean类型
     * @param <T>          泛型
     * @return bean实例
     */
    <T> T getBean(Class<T> requiredType);

    /**
     * 根据bean的名字和Class类型来得到bean实例，增加了类型安全验证机制。
     *
     * @param name         bean名字
     * @param requiredType bean类型
     * @param <T>          泛型
     * @return bean实例
     */
    <T> T getBean(String name, Class<T> requiredType);

    /**
     * 提供对bean的检索，看看是否在IOC容器有这个名字的bean
     *
     * @param name bean名字
     * @return 包含/不包含
     */
    boolean containsBean(String name);

    /**
     * 根据bean名字得到bean实例，并同时判断这个bean是不是单例
     *
     * @param name bean名字
     * @return 是否单例
     */
    boolean isSingleton(String name);

    /**
     * 判断是否是原型模式
     *
     * @param name bean名字
     * @return 是否原型
     */
    boolean isPrototype(String name);

    /**
     * 得到bean实例的Class类型
     *
     * @param name 是否单例
     * @return bean类型
     */
    Class getType(String name);


}
