package jp.maplia.kssim.entity

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "musics")
class MusicEntity {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    var id: Int = 0

    @Column
    var text_id: String = ""

    @Column
    var number: Int = 0

    @Column
    var title: String = ""

    @Column
    var subtitle: String? = null

    @Column
    var lookup_key: String = ""

    @Column
    var sort_key: String = ""

    @Column
    var esy_level: BigDecimal? = null
}
