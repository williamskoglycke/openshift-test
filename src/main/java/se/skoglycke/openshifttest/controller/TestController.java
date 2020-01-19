package se.skoglycke.openshifttest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path = "/echo/{echo}")
    public String echo(@PathVariable final String echo) {
        return echo;
    }

    @GetMapping
    public String hejsan() {
        return "Welcome";
    }

}
