package com.amogh.lms.service;

import com.amogh.lms.service.dto.CourseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Course.
 */
public interface CourseService {

    /**
     * Save a course.
     *
     * @param courseDTO the entity to save
     * @return the persisted entity
     */
    CourseDTO save(CourseDTO courseDTO);

    /**
     * Get all the courses.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<CourseDTO> findAll(Pageable pageable);

    /**
     * Get the "id" course.
     *
     * @param id the id of the entity
     * @return the entity
     */
    CourseDTO findOne(Long id);


    /**
     * Returns the course found matching the name
     * @param courseName - the course name
     * @return CourseDTO object
     */
    CourseDTO findByName(String courseName);

    /**
     * Delete the "id" course.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
