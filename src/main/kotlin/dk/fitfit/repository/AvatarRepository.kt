package dk.fitfit.repository

import dk.fitfit.domain.Avatar
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface AvatarRepository : CrudRepository<Avatar, Long>
