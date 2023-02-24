package com.pm.dto.request;

import com.pm.util.PaymentProviderType;

public abstract class PaymentRequest {
    // any common fields
    public abstract PaymentProviderType getPaymentProviderType();
}
