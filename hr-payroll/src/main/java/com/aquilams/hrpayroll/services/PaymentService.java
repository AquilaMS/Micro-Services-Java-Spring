package com.aquilams.hrpayroll.services;

import com.aquilams.hrpayroll.entities.Payment;
import com.aquilams.hrpayroll.entities.Worker;
import com.aquilams.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(),days);
    }
}
