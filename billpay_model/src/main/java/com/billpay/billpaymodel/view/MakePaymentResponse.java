package com.billpay.billpaymodel.view;

import lombok.Data;

@Data
public class MakePaymentResponse {

	private String responseCode;
	private String paymentReferenceNumber;
}
