package bg.softuni.pathfinder.model;

import bg.softuni.pathfinder.model.enums.RouteCategory;
import bg.softuni.pathfinder.model.enums.UserRoles;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RouteCategory name;

    @Column(columnDefinition = "text")
    private String description;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public RouteCategory getName() {
        return name;
    }

    public Category setName(RouteCategory name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }
}
