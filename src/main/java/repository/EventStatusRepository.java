/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import domain.EventStatus;

/**
 * @author Billy Bissic
 *
 */

public interface EventStatusRepository extends CrudRepository<EventStatus, Integer> {

	/**
	 * @param id
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM EventStatus WHERE event_status_id = ?1")
	void deleteById(Integer id);

	/**
	 * @param event_status_id
	 * @return
	 */
	@Query("SELECT event_status_id, event_status_name, event_status_description FROM EventStatus WHERE event_status_id = ?1")
	EventStatus findById(Integer event_status_id);

}
