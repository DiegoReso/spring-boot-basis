package com.reso.first_spring_app.entities;


import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

}
