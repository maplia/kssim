package jp.maplia.kssim.controller

import jp.maplia.kssim.repository.MusicRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class KssimController(
    private val musicRepository: MusicRepository) {
    @GetMapping
    fun index(model: Model): String {
        return "index"
    }

    @GetMapping("musics")
    fun musics(model: Model): String {
        val musics = musicRepository.findAll()
        model.addAttribute("musics", musics)
        return "musics"
    }
}
