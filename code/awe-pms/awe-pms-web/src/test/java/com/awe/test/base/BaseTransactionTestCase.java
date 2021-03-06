package com.awe.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

/**
 * Base TestCase with Transaction
 * 
 * @author ljz
 * @version 2014-12-30 16:41:55
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { TestConstants.LOCATIONS })
@TransactionConfiguration(transactionManager = TestConstants.TRANSACTION_MANAGER, defaultRollback = true)
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class })
public abstract class BaseTransactionTestCase extends AbstractTransactionalJUnit4SpringContextTests {

}
