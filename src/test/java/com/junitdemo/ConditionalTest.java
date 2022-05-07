package com.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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

}
