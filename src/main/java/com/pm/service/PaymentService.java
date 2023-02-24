package com.pm.service;

import com.pm.dto.request.PaymentRequest;
import com.pm.dto.response.PaymentResponse;

public interface PaymentService<T extends PaymentRequest, R extends PaymentResponse> {
    R pay(T request);
}
