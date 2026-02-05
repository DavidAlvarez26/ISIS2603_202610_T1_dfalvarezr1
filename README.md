# Taller Persistencia

## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back
# Explicacion Relaciones
La clase central es Movie la cual tiene tres relaciones:
* Director-Movie: tiene una relación de 1 a muchos (@OneToMany), usando mappedBy="director", lo que significa que la relación está definida en el atributo director dentro de la clase Movie, y en la clase Director se maneja una lista de películas asociadas.

* Movie-Genre: tiene una relación de muchos a muchos (@ManyToMany), lo que significa que cada género puede tener muchas películas y cada película puede tener varios géneros. Esta relación genera una tabla intermedia (MOVIE_ENTITY_GENRES) en la base de datos para guardar las asociaciones entre movies y genres.

* Movie-Scrip: es una relacion 1 a 1(OneToOne) la cual tiene una llave foranea en Movie lo que significa que una pelicula solo tiene un script y un script una sola pelicula.

# Reto final
1. Si se borra una Película, lo correcto seria que se borre automáticamente el Script asociado, porque el Script no tiene sentido sin la Movie .
2. Referential integrity constraint violation:
"FK...: PUBLIC.MOVIE_ENTITY FOREIGN KEY(DIRECTOR_ID)
REFERENCES PUBLIC.DIRECTOR_ENTITY(ID)"
Es deseable porque evita que queden películas con referencias inválidas, asegurando consistencia y manteniendo las referencias bien en la base de datos.

Cascade:cuando se hace una operación sobre una entidad (por ejemplo REMOVE), esa operación se propaga automáticamente a las entidades relacionadas, según el CascadeType que se configure.”



### referencia:https://jakarta.ee/specifications/persistence/2.2/apidocs/javax/persistence/cascadetype
