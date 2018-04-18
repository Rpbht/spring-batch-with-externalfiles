package com.cignex.rahul;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class DemoStepListener implements StepExecutionListener{

	public void beforeStep(StepExecution stepExecution) {
		System.out.println("From listner beore : "+stepExecution);
		
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println("From listner beore : "+stepExecution);
		return stepExecution.getExitStatus();
	}

}
