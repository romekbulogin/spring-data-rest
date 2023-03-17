package ru.cib.springdatarest.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import ru.cib.springdatarest.entity.HackatonEntity

@RepositoryRestResource(collectionResourceRel = "hackaton", path = "hackaton")
interface HackatonRepository : JpaRepository<HackatonEntity, Int> {}