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
public class EventStatusAlreadyExistsException extends RuntimeException {
	public EventStatusAlreadyExistsException() {
		super("Event Status already exists exception.");
	}
}
