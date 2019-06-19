# openshift-spring-boot

## Openshift Deployment

```
oc new-app fabric8/s2i-java~https://github.com/alucard86/openshift-spring-boot.git --name s2i-spring-boot-gradle

oc expose svc/s2i-spring-boot-gradle
```