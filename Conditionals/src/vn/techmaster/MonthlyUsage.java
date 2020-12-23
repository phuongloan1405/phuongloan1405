package vn.techmaster;

public class MonthlyUsage {
    private Customer customer;
    private int callMinutes;
    private int smsCount;

    public MonthlyUsage(Customer customer, int callMinutes, int smsCount) {
        this.customer = customer;
        this.callMinutes = callMinutes;
        this.smsCount = smsCount;
    }

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getCallMinutes() {
		return callMinutes;
	}

	public void setCallMinutes(int callMinutes) {
		this.callMinutes = callMinutes;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}
    
}
