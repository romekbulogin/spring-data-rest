package ru.cib.springdatarest.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.sql.Date

@Entity
@Table(name = "_hackaton")
data class HackatonEntity(
    @Id
    @GeneratedValue
    var id: Int? = null,
    var hackatonName: String? = null,
    var dateStart: Date? = null,
    var dateEnd: Date? = null,
    @OneToMany
    var teams: MutableList<TeamEntity>? = null
)
