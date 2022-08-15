## Create a native image

```
❯ lein native-image
Compiling aleph-graal.core
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]    classlist:   1,949.12 ms,  0.96 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]        (cap):     500.39 ms,  0.96 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]        setup:   1,986.55 ms,  0.96 GB
Warning: class initialization of class io.netty.util.internal.logging.Slf4JLoggerFactory$NopInstanceHolder failed with exception java.lang.NoClassDefFoundError: Could not initialize class io.netty.util.internal.logging.Slf4JLoggerFactory$NopInstanceHolder. This class will be initialized at run time because option --allow-incomplete-classpath is used for image building. Use the option --initialize-at-run-time=io.netty.util.internal.logging.Slf4JLoggerFactory$NopInstanceHolder to explicitly request delayed initialization of this class.
Warning: class initialization of class io.netty.util.internal.logging.Log4JLogger failed with exception java.lang.NoClassDefFoundError: org/apache/log4j/Priority. This class will be initialized at run time because option --allow-incomplete-classpath is used for image building. Use the option --initialize-at-run-time=io.netty.util.internal.logging.Log4JLogger to explicitly request delayed initialization of this class.
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]     (clinit):     318.67 ms,  2.29 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]   (typeflow):  10,867.91 ms,  2.29 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]    (objects):  12,853.49 ms,  2.29 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]   (features):     834.49 ms,  2.29 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]     analysis:  26,098.80 ms,  2.29 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]     universe:     760.10 ms,  2.29 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]      (parse):   2,075.68 ms,  3.14 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]     (inline):   1,720.25 ms,  3.14 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]    (compile):  14,338.18 ms,  5.07 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]      compile:  19,029.82 ms,  5.07 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]        image:   2,284.76 ms,  5.07 GB
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]        write:     295.35 ms,  5.07 GB
# Printing build artifacts to: target/aleph-graal.build_artifacts.txt
[/home/arnaudgeiser/code/aleph-graal/target/aleph-graal:123082]      [total]:  52,595.50 ms,  5.07 GB
Created native image /home/arnaudgeiser/code/aleph-graal/target/aleph-graal
```

## Run

```
❯ target/aleph-graal
```

## Test

```
❯ curl localhost:8080
Hello!%
```
