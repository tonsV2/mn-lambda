package dk.fitfit.domain

import javax.persistence.*

@Entity
class Avatar(
        @Column(nullable = false, unique = true) val name: String,
        @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long = 0
)
