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
public class EventTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer event_type_id;
	private String event_type_name;
	private String event_type_description;
	private String primary_color;
	private String secondary_color;
	
	/**
	 * @return the event_type_id
	 */
	public Integer getEvent_type_id() {
		return event_type_id;
	}
	/**
	 * @param event_type_id the event_type_id to set
	 */
	public void setEvent_type_id(Integer event_type_id) {
		this.event_type_id = event_type_id;
	}
	/**
	 * @return the event_type_name
	 */
	public String getEvent_type_name() {
		return event_type_name;
	}
	/**
	 * @param event_type_name the event_type_name to set
	 */
	public void setEvent_type_name(String event_type_name) {
		this.event_type_name = event_type_name;
	}
	/**
	 * @return the event_type_description
	 */
	public String getEvent_type_description() {
		return event_type_description;
	}
	/**
	 * @param event_type_description the event_type_description to set
	 */
	public void setEvent_type_description(String event_type_description) {
		this.event_type_description = event_type_description;
	}
	/**
	 * @return the primary_color
	 */
	public String getPrimary_color() {
		return primary_color;
	}
	/**
	 * @param primary_color the primary_color to set
	 */
	public void setPrimary_color(String primary_color) {
		this.primary_color = primary_color;
	}
	/**
	 * @return the secondary_color
	 */
	public String getSecondary_color() {
		return secondary_color;
	}
	/**
	 * @param secondary_color the secondary_color to set
	 */
	public void setSecondary_color(String secondary_color) {
		this.secondary_color = secondary_color;
	}
}
