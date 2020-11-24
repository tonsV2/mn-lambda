package dk.fitfit.service

import dk.fitfit.domain.Avatar

interface AvatarService {
    fun save(avatar: Avatar): Avatar
    fun findAll(): Iterable<Avatar>
}
