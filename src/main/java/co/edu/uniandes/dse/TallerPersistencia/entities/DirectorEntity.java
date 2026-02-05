package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DirectorEntity extends BaseEntity {
    @OneToMany(mappedBy = "director")
    private List<MovieEntity> movies;
    private String name;
    private String nationality;
}
