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
public class EventFrequency {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer event_frequency_id;
	private String event_frequency_name;
	private String event_frequency_description;
	private Integer event_frequency_multiplier;
	
	/**
	 * @return the event_frequency_id
	 */
	public Integer getEvent_frequency_id() {
		return event_frequency_id;
	}
	/**
	 * @param event_frequency_id the event_frequency_id to set
	 */
	public void setEvent_frequency_id(Integer event_frequency_id) {
		this.event_frequency_id = event_frequency_id;
	}
	/**
	 * @return the event_frequency_name
	 */
	public String getEvent_frequency_name() {
		return event_frequency_name;
	}
	/**
	 * @param event_frequency_name the event_frequency_name to set
	 */
	public void setEvent_frequency_name(String event_frequency_name) {
		this.event_frequency_name = event_frequency_name;
	}
	/**
	 * @return the event_frequency_description
	 */
	public String getEvent_frequency_description() {
		return event_frequency_description;
	}
	/**
	 * @param event_frequency_description the event_frequency_description to set
	 */
	public void setEvent_frequency_description(String event_frequency_description) {
		this.event_frequency_description = event_frequency_description;
	}
	/**
	 * @return the event_frequency_multiplier
	 */
	public Integer getEvent_frequency_multiplier() {
		return event_frequency_multiplier;
	}
	/**
	 * @param event_frequency_multiplier the event_frequency_multiplier to set
	 */
	public void setEvent_frequency_multiplier(Integer event_frequency_multiplier) {
		this.event_frequency_multiplier = event_frequency_multiplier;
	}
}
