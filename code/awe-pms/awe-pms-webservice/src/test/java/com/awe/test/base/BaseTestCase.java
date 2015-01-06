package com.awe.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * BaseTestCase without Transaction
 * 
 * @author ljz
 * @version 2015-1-4 16:09:19
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { TestConstants.LOCATIONS })
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class })
public abstract class BaseTestCase extends AbstractJUnit4SpringContextTests {

}
