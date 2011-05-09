/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.views;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.eclipse.core.runtime.PlatformObject;

/**
 * @author simon
 * 
 */
public abstract class ObservedObject extends PlatformObject {
	protected transient PropertyChangeSupport listeners = new PropertyChangeSupport(this);

	/**
	 * Adds a property-change listener.
	 * @param l the listener to add
	 */
	public void addPropertyChangeListener(PropertyChangeListener l) {
		if (l == null) {
			throw new IllegalArgumentException();
		}
		this.listeners.addPropertyChangeListener(l);
	}

	/**
	 * Removes a property-change listener.
	 * 
	 * @param l
	 *            the listener to remove
	 */
	public void removePropertyChangeListener(PropertyChangeListener l) {
		this.listeners.removePropertyChangeListener(l);
	}

	/**
	 * Notificates all listeners to a model-change
	 * 
	 * @param prop
	 *            the property-id
	 * @param old
	 *            the old-value
	 * @param newValue
	 *            the new value
	 */
	protected void firePropertyChange(String prop, Object old, Object newValue) {
		if (this.listeners.hasListeners(prop)) {
			this.listeners.firePropertyChange(prop, old, newValue);
		}
	}
}
