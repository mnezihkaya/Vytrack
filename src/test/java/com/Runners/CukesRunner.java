package com.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/stepDefinitions",
        dryRun = false,
        tags = "@w",
        publish = true
)

public class CukesRunner {
}