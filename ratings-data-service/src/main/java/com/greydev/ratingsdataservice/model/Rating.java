package com.greydev.ratingsdataservice.model;

public class Rating {

	private String modieId;
	private int rating;

	public Rating() {
		super();
	}

	public Rating(String modieId, int rating) {
		super();
		this.modieId = modieId;
		this.rating = rating;
	}

	public String getModieId() {
		return modieId;
	}

	public void setModieId(String modieId) {
		this.modieId = modieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
