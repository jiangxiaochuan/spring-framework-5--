# Spring framework study note

--- 

## AOP
- 织入点(pointcut,express表达式)
- 通知:
    1. before
    2. after
    3. around
    4. after-return(注意返回void不会执行该类型通知)
    5. after-throwing(有异常跑出才会执行该类型通知)

# 反射
1. 判断字段类型是否static，public
`org.springframework.util.ReflectionUtils.isPublicStaticFinal`
2. 