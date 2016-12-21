
package com.eim.common.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

/**
 * Class to advice common logs used in all classes of the implementing project
 */
@Aspect
public class LoggingAspect
{

	/** Variable to hold LOGGER reference */
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	/**
	 * Common Log Entry Exit method which will log entry-exit logs in the log
	 * files.
	 * 
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("within(com.eim..*)")
	public Object logEntryExit(ProceedingJoinPoint joinPoint) throws Throwable
	{
		Object returnValue = null;
		StopWatch stopWatch = new StopWatch();
		LOGGER.debug("Inside logEntryExit");
		StringBuffer logMessage = new StringBuffer();
		logMessage.append(joinPoint.getTarget().getClass().getName());
		logMessage.append(".");
		logMessage.append(joinPoint.getSignature().getName());
		LOGGER.debug("Entered - " + logMessage.toString());
		stopWatch.start();
		returnValue = joinPoint.proceed();
		stopWatch.stop();
		LOGGER.debug("Exited - " + logMessage.toString());
		LOGGER.debug("Total time taken by method:" + stopWatch.getTotalTimeMillis() + " ms.");
		return returnValue;
	}

}
