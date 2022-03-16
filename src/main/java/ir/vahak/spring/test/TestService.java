package ir.vahak.spring.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestService {

    @GetMapping("/test")
    String test() {
        return "vahid";
    }
}
