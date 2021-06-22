package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CalculateNumbers implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int number1 = (int) delegateExecution.getVariable("number1");
        int number2 = (int) (Math.random()*100 );
        int result = number1+number2;
        delegateExecution.setVariable("result", result);
    }
}
