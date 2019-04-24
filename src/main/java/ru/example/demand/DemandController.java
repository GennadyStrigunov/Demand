package ru.example.demand;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class DemandController {

    @GetMapping("/demand")
    public String demand(
            @RequestParam(name="description", required=false, defaultValue="") String description,
            Map<String, Object> model) {
        model.put("description", description);
        return "demand";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "Hello, Ghena!");
        return "main";
    }
}
