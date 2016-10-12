/**
 * 
 */
package org.springframework.sdr.repositories;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

/**
 * @author mzampetti
 *
 */
@Data
@Document(indexName = "person")
public class Person
{

    @Id
    private String id;
    
    private String name;
    
    @Field(type = FieldType.Nested)
    private HashMap<String, Object> attributes;
}
