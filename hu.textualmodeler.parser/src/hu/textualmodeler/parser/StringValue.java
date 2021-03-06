/**
 * 
 */
package hu.textualmodeler.parser;

/**
 * @author balazs.grill
 *
 */
public class StringValue implements IStringValue {

	private final String value;
	
	public StringValue(String value) {
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IStringValue#getOriginalValue()
	 */
	@Override
	public String getOriginalValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IStringValue#getProcessedValue()
	 */
	@Override
	public String getProcessedValue() {
		return value;
	}

	@Override
	public int[] getLineAndColumn() {
		return new int[]{-1,-1};
	}

}
