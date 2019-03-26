package jp.maplia.kssim.controller

import jp.maplia.kssim.entity.MusicEntity
import jp.maplia.kssim.repository.MusicRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class KssimRestController(
    private val musicRepository: MusicRepository) {
    @GetMapping("musics")
    fun musics(): List<MusicEntity> {
        return musicRepository.findAll()
    }
}
