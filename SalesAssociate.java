

public class SalesAssociate {
	private String SalesAssociateName;
	private int StoreId;
	private String Title;

	public String getSalesAssociateName() {
		return SalesAssociateName;
	}

	public void setSalesAssociateName(String salesAssociateName) {
		SalesAssociateName = salesAssociateName;
	}

	public int getStoreId() {
		return StoreId;
	}

	public void setStoreId(int storeId) {
		StoreId = storeId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public SalesAssociate(String SalesAssociateName) {
		setSalesAssociateName(SalesAssociateName);
	}

	public SalesAssociate(String SalesAssociateName, int StoreId) {
		setSalesAssociateName(SalesAssociateName);
		setStoreId(StoreId);
	}

}
