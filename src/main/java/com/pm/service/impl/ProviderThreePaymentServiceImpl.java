package com.pm.service.impl;

import org.springframework.stereotype.Component;

import com.pm.dto.request.ProviderThreePaymentRequest;
import com.pm.dto.response.ProviderThreePaymentResponse;
import com.pm.service.PaymentService;

@Component
public class ProviderThreePaymentServiceImpl implements PaymentService<ProviderThreePaymentRequest, ProviderThreePaymentResponse> {

    @Override
    public ProviderThreePaymentResponse pay(ProviderThreePaymentRequest request) {
        // To do payment logic with provider 3 ...
        return new ProviderThreePaymentResponse();
    }

}
