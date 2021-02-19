package com.cybage.junit_demo;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectPackages("com.cybage.junit_demo")
@ExcludeTags("PROD")
public class TestSuite {

}
