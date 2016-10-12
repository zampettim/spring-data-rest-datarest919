/**
 * 
 */
package org.springframework.sdr.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author mzampetti
 *
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, String>
{

}
