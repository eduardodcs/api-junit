package br.com.dicasdeumdev.api.domain;

import lombok.*;

import javax.persistence.*;

@Data //Getter, Setter, ToString, EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuarios")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;

}
