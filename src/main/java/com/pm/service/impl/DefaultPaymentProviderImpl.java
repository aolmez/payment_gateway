package com.pm.service.impl;


import com.pm.dto.request.PaymentRequest;
import com.pm.dto.response.PaymentResponse;
import com.pm.service.PaymentProvider;
import com.pm.service.PaymentService;
import com.pm.util.PaymentProviderType;

import io.quarkus.arc.Arc;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DefaultPaymentProviderImpl implements PaymentProvider<PaymentService<PaymentRequest, PaymentResponse>> {

    @Override
    public PaymentService getProvider(PaymentProviderType type) {
        switch (type) {
            case PROVIDER_ONE:
                return  Arc.container().select(ProviderOnePaymentServiceImpl.class).get();
            case PROVIDER_TWO:
                return Arc.container().select(ProviderTwoPaymentServiceImpl.class).get(); 
            case PROVIDER_THREE:
                return  Arc.container().select(ProviderThreePaymentServiceImpl.class).get();
            default:
                throw new UnsupportedOperationException("Notification type: " + type + " not supported");
        }
    }

}
