package com.billpay.billpaymodel.view;

import com.billpay.billpaymodel.item.PaymentItem;

import lombok.Data;

@Data
public class MakePaymentRequest {
	
	private String sourceAccount = null;
	private PaymentItem payment = null;
}
