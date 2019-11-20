/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import domain.EventFrequency;

/**
 * @author Billy Bissic
 *
 */
public interface EventFrequencyRepository extends CrudRepository<EventFrequency, Integer> {

	/**
	 * @param id
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM EventFrequency WHERE event_frequency_id = ?1")
	void deleteById(Integer id);

}
