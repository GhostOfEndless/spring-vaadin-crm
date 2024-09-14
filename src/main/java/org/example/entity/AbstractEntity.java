package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private int version;

    @Override
    public int hashCode() {
        if (getId() != null) {
            return getId().hashCode();
        }
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractEntity other)) {
            return false;
        }

        if (getId() != null) {
            return getId().equals(other.getId());
        }

        return super.equals(other);
    }
}
