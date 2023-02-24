package com.pm.service.impl;

import org.springframework.stereotype.Component;

import com.pm.dto.request.ProviderTwoPaymentRequest;
import com.pm.dto.response.ProviderTwoPaymentResponse;
import com.pm.service.PaymentService;

@Component
public class ProviderTwoPaymentServiceImpl implements PaymentService<ProviderTwoPaymentRequest, ProviderTwoPaymentResponse> {

    @Override
    public ProviderTwoPaymentResponse pay(ProviderTwoPaymentRequest request) {
        // To do payment logic with provider 2 ...
        return new ProviderTwoPaymentResponse();
    }

}
