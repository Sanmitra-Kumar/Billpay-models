package com.billpay.billpaymodel.domain;

import lombok.Data;

@Data
public class MakePaymentData {

	private String sourceAccount = null;
	private PaymentData payment = null;
}
