package com.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA #34 is resolved")
    void basicTest() {

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly() {

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyForJava17() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyForJava13() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testForOnlyForJavaRange () {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testForOnlyForJavaRangeMin () {

    }

}
