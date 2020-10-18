package com.billpay.billpaymodel.crud.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CrudBillPaymentInfoItem {
	
	private String paymentMethod;
	private String paymentFrequency;
	private String recurringLimitType;
	private String payeeNickname;
	private String paymentDate;
	private BigDecimal transactionAmount;
	private String nextPaymentDate;
	private BigDecimal totalPaymentCount;
	private BigDecimal totalTransactionAmount;
	private String paymentReferenceNumber;
	private String recurringReferenceNumber;
}
