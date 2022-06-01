package de.uucly.azuredevops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VariableController {

    @Value("${my.env}")
    private String myEnv;

    @Value("${my.secret}")
    private String mySecret;

    @GetMapping(path = "env")
    public String getEnvironment() {
        return System.getenv("MY_ENV");
    }

    @GetMapping(path = "app")
    public String getApplicationYml() {
        return myEnv;
    }
    @GetMapping(path = "secret")
    public String getSecret() {
        return mySecret;
    }

}
