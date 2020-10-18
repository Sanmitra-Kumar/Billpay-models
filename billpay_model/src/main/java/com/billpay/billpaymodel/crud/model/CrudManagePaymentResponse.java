package com.billpay.billpaymodel.crud.model;

import lombok.Data;

@Data
public class CrudManagePaymentResponse {

	private String responseCode;
	private String responseMessage;
	private String paymentReferenceNumber;
	private String recurringReferenceNumber;
}
