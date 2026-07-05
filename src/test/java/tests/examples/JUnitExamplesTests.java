package tests.examples;

import org.junit.jupiter.api.*;

public class JUnitExamplesTests {

    @BeforeAll
    static void startup() {
        System.out.println("startup");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("tearDown");
    }
    @BeforeEach
    void startBrowser() {
        System.out.println("- start Browser");
    }

    @AfterEach
    void stopBrowser() {
        System.out.println("- stop Browser");
    }

    @Test
    void firstTest() {
        System.out.println("- - firstTest");
    }
    @Test
    void secondTest() {
        System.out.println("- - secondTest");
    }
}
