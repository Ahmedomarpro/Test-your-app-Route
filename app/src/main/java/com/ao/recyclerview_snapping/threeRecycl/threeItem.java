package com.ao.recyclerview_snapping.threeRecycl;

public class   threeItem {

	String sImageName;
	String sImageUrl;

	public threeItem(String sImageName, String sImageUrl) {
		this.sImageName = sImageName;
		this.sImageUrl = sImageUrl;
	}

	public String getsImageName() {
		return sImageName;
	}

	public void setsImageName(String sImageName) {
		this.sImageName = sImageName;
	}

	public String getsImageUrl() {
		return sImageUrl;
	}

	public void setsImageUrl(String sImageUrl) {
		this.sImageUrl = sImageUrl;
	}
}