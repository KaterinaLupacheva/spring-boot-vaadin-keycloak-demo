package io.ramonak.springbootbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/months")
    public List<String> welcomePage() {
        return Arrays.asList("December", "January", "February");
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Admin page";
    }
}
