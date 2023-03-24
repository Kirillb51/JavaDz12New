package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieRepo {
    private int id;
    private String name;
    private String movieGenre;
    private boolean premiereTomorrow;

}