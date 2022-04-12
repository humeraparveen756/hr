package com.tectoro.enterprise.hr.data;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * This class acts as base entity
 */
@Entity
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    /**
     *
     * @param be
     * @return
     */
    public final boolean equals(BaseEntity be){
        if(be != null) {
            return this.id.equals(be);
        }
        return false;
    }
}
