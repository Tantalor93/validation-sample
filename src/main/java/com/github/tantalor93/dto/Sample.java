package com.github.tantalor93.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sample {

	private String sampleString;
	private Integer sampleNumber;

	@JsonCreator
	public Sample(
			@JsonProperty("sampleString") String sampleString,
			@JsonProperty("sampleNumber") Integer sampleNumber) {
		this.sampleString = sampleString;
		this.sampleNumber = sampleNumber;
	}

	public String getSampleString() {
		return sampleString;
	}

	public int getSampleNumber() {
		return sampleNumber;
	}

	@Override
	public String toString() {
		return "Sample{" +
				"sampleString='" + sampleString + '\'' +
				", sampleNumber=" + sampleNumber +
				'}';
	}
}