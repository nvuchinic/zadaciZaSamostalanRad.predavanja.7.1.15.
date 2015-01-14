package org.NerminVucinic.zadatak2;

/**
 * {@link ListNode} implementation.
 * 
 * @author emir
 * 
 */
public class ValueWrapper implements ListNode {
	private final Object value;
	private ValueWrapper next;
	private ValueWrapper previous;

	public ValueWrapper(Object value) {
		this.value = value;
	}

	public ValueWrapper getNext() {
		return next;
	}
	
	public ValueWrapper getPrevious() {
		return previous;
	}

	public void setNext(ValueWrapper node) {
		next = node;
	}
	
	public void setPrevious(ValueWrapper node) {
		previous = node;
	}

	public Object getValue() {
		return value;
	}
}