/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Billy Bissic
 *
 */
@Entity
public class EventStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer event_status_id;
	private String event_status_name;
	private String event_status_description;
	
	/**
	 * @return the event_status_id
	 */
	public Integer getEvent_status_id() {
		return event_status_id;
	}
	/**
	 * @param event_status_id the event_status_id to set
	 */
	public void setEvent_status_id(Integer event_status_id) {
		this.event_status_id = event_status_id;
	}
	/**
	 * @return the event_status_name
	 */
	public String getEvent_status_name() {
		return event_status_name;
	}
	/**
	 * @param event_status_name the event_status_name to set
	 */
	public void setEvent_status_name(String event_status_name) {
		this.event_status_name = event_status_name;
	}
	/**
	 * @return the event_status_description
	 */
	public String getEvent_status_description() {
		return event_status_description;
	}
	/**
	 * @param event_status_description the event_status_description to set
	 */
	public void setEvent_status_description(String event_status_description) {
		this.event_status_description = event_status_description;
	}

}
