/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

/**
 * @author Billy Bissic
 *
 */
public class EventFrequencyAlreadyExistsException extends RuntimeException {

	public EventFrequencyAlreadyExistsException() {
		super("No event frequency already exists.");
	}
}
