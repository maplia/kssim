package jp.maplia.kssim.repository

import jp.maplia.kssim.entity.MusicEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MusicRepository: JpaRepository<MusicEntity, Long> {}
