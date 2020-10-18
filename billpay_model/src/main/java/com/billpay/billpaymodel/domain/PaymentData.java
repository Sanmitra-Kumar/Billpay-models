package com.billpay.billpaymodel.domain;

import java.math.BigDecimal;


import lombok.Data;

@Data
public class PaymentData {

	public enum PaymentMethod{
		ELECTRONIC,CHECK
	};
	public enum PaymentCategory{
		ONE_TIME("1"),RECCURING("2");
		
		private final String name;       

		PaymentCategory(final String string) {
			name=string;
		}
		
		public String getValue() {
			return name;
		}
	};
	
	public enum RepeatUntil{
		PAYMENT_COUNT_REACHED("C"),PAYMENT_AMOUNT_REACHED("A"),CANCELLED("D");
		
		private final String name;       

		RepeatUntil(final String string) {
			name=string;
		}
		
		public String getValue() {
			return name;
		}
	};
	public enum RecurringLimitType{
		WEEKLY("1"),MONTHLY("2"),EVERY_TWO_WEEK("3"),QUATERLY("4"),SEMI_ANNUALLY("5"),ANNUALLY("6");
		
		private final String name;       

		RecurringLimitType(final String string) {
			name=string;
		}
		
		public String getValue() {
			return name;
		}
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

}
