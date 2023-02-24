package com.pm.service;

import com.pm.dto.request.PaymentRequest;
import com.pm.dto.response.PaymentResponse;

public interface PaymentGateway<T extends PaymentResponse, K extends PaymentRequest> {
    T makePayment(K paymentRequest);
}
