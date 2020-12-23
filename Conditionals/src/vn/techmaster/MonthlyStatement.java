package vn.techmaster;

public class MonthlyStatement {
    private float CallCost;
    private float SmsCost;
    private float TotalCost;

    public MonthlyStatement() {
    }

    public void Generate(MonthlyUsage usage) throws Exception {
        switch (usage.getCustomer().getType())
        {
            case PayAsYouGo:
                CallCost = 0.12f * usage.getCallMinutes();
                SmsCost = 0.12f * usage.getSmsCount();
                TotalCost = CallCost + SmsCost;
                break;

            case Unlimited:
                TotalCost = 54.90f;
                break;

            default:
                throw new Exception("The current customer type is not supported");
        }
    }

	public float getCallCost() {
		return CallCost;
	}

	public void setCallCost(float callCost) {
		CallCost = callCost;
	}

	public float getSmsCost() {
		return SmsCost;
	}

	public void setSmsCost(float smsCost) {
		SmsCost = smsCost;
	}

	public float getTotalCost() {
		return TotalCost;
	}

	public void setTotalCost(float totalCost) {
		TotalCost = totalCost;
	}
    
    
}
