package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // @Controller는 리턴값을 뷰의 이름으로 받지만
                // @RestController는 리턴값을 뷰의 body에 그대로 반환받음
public class LogTestController {

    // private final Logger log = LoggerFactory.getLogger(getClass());  //@Slf4j 애노테이션이 대신 해줌

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        // log의 레벨대로 순차적으로 적은것
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
