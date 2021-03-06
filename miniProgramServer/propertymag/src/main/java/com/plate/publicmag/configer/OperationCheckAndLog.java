package com.plate.publicmag.configer;


import java.lang.annotation.*;

/**
 * 自定义注解配置——验证前端用户是否拥有操作某项业务的权限（是否实名制）
 * 记录系统日志
 */
@Target(ElementType.METHOD) //注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
@Documented //生成文档
public @interface OperationCheckAndLog {
    //操作类型
    String cCzfs() default "";
}
