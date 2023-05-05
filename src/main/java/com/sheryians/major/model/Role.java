package com.sheryians.major.model;

import java.util.List;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name='roles')

public class Role {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(nullable = false,unique=true)
    @NotEmpty
    private String name;
    @ManyToMany(mappedBy='roles')
    private List<User>users;

}
