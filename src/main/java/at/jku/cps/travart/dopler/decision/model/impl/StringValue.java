/*******************************************************************************
 * TODO: explanation what the class does
 *  
 *  @author Kevin Feichtinger
 *  
 * Copyright 2023 Johannes Kepler University Linz
 * LIT Cyber-Physical Systems Lab
 * All rights reserved
 *******************************************************************************/
package at.jku.cps.travart.dopler.decision.model.impl;

import java.util.Objects;

import at.jku.cps.travart.dopler.decision.model.ARangeValue;

public final class StringValue extends ARangeValue<String> {

	public StringValue(final String str) {
		super(Objects.requireNonNull(str));
	}

	@Override
	public boolean lessThan(final ARangeValue<String> other) {
		return getValue().compareTo(other.getValue()) < 0;
	}

	@Override
	public boolean greaterThan(final ARangeValue<String> other) {
		return getValue().compareTo(other.getValue()) > 0;
	}

	@Override
	public boolean evaluate() {
		return !getValue().isBlank();
	}
}
