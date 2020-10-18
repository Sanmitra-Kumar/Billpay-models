package com.billpay.billpaymodel.crud.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CrudBillPaymentInfoItem {

	private String paymentMethod;
	private String payeeNickname;
	private String paymentDate;
	private String repeatUntil;
	private String recurringLimitType;
	private BigDecimal paymentAmount;
	private String nextPaymentDate;
	private BigDecimal totalPaymentCount;
	private BigDecimal paymentCountToDate;
	private BigDecimal totalAmountCount;
	private BigDecimal amountPaidToDate;
}
