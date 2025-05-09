package com.reso.first_spring_app.dto;


import com.reso.first_spring_app.entities.Category;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CategoryDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public CategoryDTO(Category entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

    private Long id;
    private String name;
}
