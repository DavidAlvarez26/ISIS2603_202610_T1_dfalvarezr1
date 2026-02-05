package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity

public class MovieEntity extends BaseEntity {
    @ManyToOne
    private DirectorEntity director;
    @ManyToMany
    private List<GenreEntity> genres;
    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private ScriptEntity script;
    private String title;
    private Integer releaseYear;

}
