package com.aoher.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The Class Location.
 */
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private Set<Element> elements = new HashSet<>();

    private boolean deleted = false;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets elements.
     *
     * @return the elements
     */
    public Set<Element> getElements() {
        return elements;
    }

    /**
     * Sets elements.
     *
     * @param elements the elements
     */
    public void setElements(Set<Element> elements) {
        this.elements = elements;
    }

    /**
     * Is deleted boolean.
     *
     * @return the boolean
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets deleted.
     *
     * @param deleted the deleted
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
