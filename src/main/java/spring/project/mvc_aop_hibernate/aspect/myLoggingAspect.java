package spring.project.mvc_aop_hibernate.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class myLoggingAspect {
    @Around("execution (* spring.project.mvc_aop_hibernate.dao.*.*(..))")
    public  Object aroundAllRepositoryMethodsAdvice (ProceedingJoinPoint proceedingJoinPoint) {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin of method " + methodName);

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("End of " + methodName);
        return targetMethodResult;


    }

}
