package com.amogh.lms.service;

import com.amogh.lms.domain.Template;
import com.amogh.lms.domain.enumeration.ContentType;
import com.amogh.lms.service.dto.ExerciseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing Exercise.
 */
public interface ExerciseService {

    /**
     * Save a exercise.
     *
     * @param exerciseDTO the entity to save
     * @return the persisted entity
     */
    ExerciseDTO save(ExerciseDTO exerciseDTO);

    /**
     * Get all the exercises.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ExerciseDTO> findAll(Pageable pageable);

    /**
     * Get the "id" exercise.
     *
     * @param id the id of the entity
     * @return the entity
     */
    ExerciseDTO findOne(Long id);

    /**
     * Delete the "id" exercise.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Finds the exercise object based on template id, content type and content
     * @param template the template object
     * @param contentType the content type
     * @param content the content
     * @return ExceriseDTO object
     */
    ExerciseDTO findByTemplateAndContentTypeAndContent(Template template, ContentType contentType, String content);
}
