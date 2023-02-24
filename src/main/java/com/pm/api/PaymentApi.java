package com.pm.api;

import lombok.RequiredArgsConstructor;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pm.dto.request.PaymentRequest;
import com.pm.dto.request.ProviderOnePaymentRequest;
import com.pm.dto.response.PaymentResponse;
import com.pm.service.PaymentGateway;

@Path("/v1/payments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor
public class PaymentApi {
	private final PaymentGateway<PaymentResponse, PaymentRequest> paymentGateway;

	@POST
	@Path("/process")
	public PaymentResponse processPayment(@Valid ProviderOnePaymentRequest paymentRequest) {
		return paymentGateway.makePayment(paymentRequest);
	}

}
