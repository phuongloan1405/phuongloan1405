package vn.techmaster;

public enum CustomerType
{
    PayAsYouGo(1),
    Unlimited(0);

    private int typeCode;

    CustomerType(int typeCode) {
        this.setTypeCode(typeCode);
    }

	public int getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}
}
