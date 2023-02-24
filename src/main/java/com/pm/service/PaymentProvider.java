package com.pm.service;

import com.pm.util.PaymentProviderType;

public interface PaymentProvider<T> {
    T getProvider(PaymentProviderType type);
}
