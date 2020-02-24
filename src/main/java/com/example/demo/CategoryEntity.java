package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Category Entity
 *
 * @author taehi
 */
@Entity
@Table(name = "categories")
public class CategoryEntity implements Serializable {
//    private static final long serialVersionUID = 810457109758530244L;

//    Since the roleName is not auto-generated, you should simply not annotate it with @GeneratedValue:
//    @Id
//    @Column(name = "ROLE_NAME", nullable = false)
//    private String roleName;

    //    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String id;
    private String name;
    private String parent_id;
    @Column(name = "_order")
    private int order;
    private String status;
    private boolean active;


    public CategoryEntity() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}


