package abstracts;

public abstract class Electronic { 	// 전자제품 개념의 클래스
	
	protected boolean power;
	protected int button;
	protected String feature;
	
	public Electronic() {}
	
	abstract void buttonColor(String color);
	
	

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getButton() {
		return button;
	}

	public void setButton(int button) {
		this.button = button;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
}
