package dk.fitfit.service.impl

import dk.fitfit.domain.Avatar
import dk.fitfit.repository.AvatarRepository
import dk.fitfit.service.AvatarService
import javax.inject.Singleton

@Singleton
class AvatarServiceImpl(private val avatarRepository: AvatarRepository) : AvatarService {
    override fun save(avatar: Avatar): Avatar = avatarRepository.save(avatar)

    override fun findAll(): Iterable<Avatar> = avatarRepository.findAll()
}
