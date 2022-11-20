package study.jpa.ex04;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "name")
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal (TemporalType.TIMESTAMP)
    private Date createdate;

    @Temporal (TemporalType.TIMESTAMP)
    private Date lastModifiedate;

    @Lob
    private String description;

    public Member () {
    }
}
