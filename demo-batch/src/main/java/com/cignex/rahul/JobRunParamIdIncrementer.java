package com.cignex.rahul;

import java.util.Calendar;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;

public class JobRunParamIdIncrementer implements JobParametersIncrementer{

	public JobParameters getNext(JobParameters parameters) {
		// TODO Auto-generated method stub
		return new JobParametersBuilder().addLong("run.id", Calendar.getInstance().getTimeInMillis()).toJobParameters();
	}

}
