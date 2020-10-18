package com.billpay.billpaymodel.item;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PaymentItem {
	public enum PaymentMethod{
		ELECTRONIC,CHECK
	};
	public enum PaymentCategory{
		ONE_TIME,RECURRING
	};
	public enum RepeatUntil{
		PAYMENT_COUNT_REACHED,PAYMENT_AMOUNT_REACHED,CANCELLED
	};
	public enum RecurringLimitType{
		WEEKLY,MONTHLY,EVERY_TWO_WEEK,QUATERLY,SEMI_ANNUALLY,ANNUALLY
	};
	private PaymentMethod paymentMethod;
	private PaymentCategory paymentCategory;
	private RepeatUntil repeatUntil;
	private RecurringLimitType recurringLimitType;
	private String payeeNickname;
	private String paymentDate;
	private BigDecimal paymentAmount;
	private String nextPaymentDate;
	private BigDecimal totalPaymentCount;
	private BigDecimal paymentCountToDate;
	private BigDecimal totalAmountCount;
	private BigDecimal amountPaidToDate;
	
	//private String paymentReferenceNumber;
	
}
