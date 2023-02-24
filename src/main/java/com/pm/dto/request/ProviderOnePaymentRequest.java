package com.pm.dto.request;

import com.pm.util.PaymentProviderType;

public class ProviderOnePaymentRequest extends PaymentRequest {

    @Override
    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_ONE;
    }

}
