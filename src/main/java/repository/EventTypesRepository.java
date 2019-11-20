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

import domain.EventTypes;

/**
 * @author Billy Bissic
 *
 */
public interface EventTypesRepository extends CrudRepository<EventTypes, Integer>{

	/**
	 * @param id
	 */
	
	@Transactional
	@Modifying
	@Query("DELETE FROM EventTypes WHERE event_type_id = ?1")
	void deleteById(Integer id);

	/**
	 * @param event_type_id
	 * @return
	 */
	//@Query("SELECT event_type_id, event_type_name, event_type_description FROM EventTypes WHERE event_type_id = ?1")
	@Query(nativeQuery=true, value="SELECT * FROM EventTypes WHERE event_type_id = ?1")
	EventTypes findById(Integer event_type_id);

	/**
	 * @return
	 */
	

}
