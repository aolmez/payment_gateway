package com.pm.service.impl;

import org.springframework.stereotype.Component;

import com.pm.dto.request.ProviderOnePaymentRequest;
import com.pm.dto.response.ProviderOnePaymentResponse;
import com.pm.service.PaymentService;

@Component
public class ProviderOnePaymentServiceImpl implements PaymentService<ProviderOnePaymentRequest, ProviderOnePaymentResponse> {

    @Override
    public ProviderOnePaymentResponse pay(ProviderOnePaymentRequest request) {
        // To do payment logic with provider 1 ...
        return new ProviderOnePaymentResponse();
    }

}
