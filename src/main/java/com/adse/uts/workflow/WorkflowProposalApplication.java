package com.adse.uts.workflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class WorkflowProposalApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowProposalApplication.class, args);
	}

}