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

public final class DoubleValue extends ARangeValue<Double> {

	public DoubleValue(final double value) {
		super(Objects.requireNonNull(value));
	}

	@Override
	public boolean lessThan(final ARangeValue<Double> other) {
		return getValue() < other.getValue();
	}

	@Override
	public boolean greaterThan(final ARangeValue<Double> other) {
		return getValue() > other.getValue();
	}

	@Override
	public boolean evaluate() {
		return Double.isFinite(getValue());
	}
}
