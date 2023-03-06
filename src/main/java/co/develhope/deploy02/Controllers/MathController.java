package co.develhope.deploy02.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public int sumNumber() {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        return a + b;
    }
}
