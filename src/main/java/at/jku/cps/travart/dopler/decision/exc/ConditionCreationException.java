package at.jku.cps.travart.dopler.decision.exc;

public class ConditionCreationException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7657446023290258524L;

	public ConditionCreationException(final Exception e) {
		super(e);
	}

	public ConditionCreationException(final String string) {
		super(string);
	}
}
