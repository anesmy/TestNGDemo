package org.example;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class CalculatorTestRunner {
    public static void main(String[] args) {
        System.out.println("Calculation test via TestNg");

        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG testng = new TestNG();
        testng.addListener(tla);

        List<String> suites = Lists.newArrayList();

        // path to xml.. This will refer the internal
        // folder that contains the filename
        suites.add("testng.xml");
        testng.setTestSuites(suites);

        testng.run();
    }
}
