package it.polito.server.entity

import it.polito.server.dto.UserDTO
import it.polito.server.dto.UserSlimDTO
import javax.persistence.*


@Entity
@Table(name = "users")
class User (

    @OneToOne(mappedBy = "user", cascade = arrayOf(CascadeType.ALL))
    var activation: Activation?,

    @Column(updatable = true, nullable = false, unique = true)
    var nickname: String,

    @Column(updatable = true, nullable = false, unique = true)
    var email: String,

    @Column(updatable = true, nullable = false, )
    var password: String

   ) {

    @Column(updatable = true, nullable = false, )
    var active : Boolean = false

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "user_generator")
    @SequenceGenerator(name="user_generator",
        sequenceName = "sequence_1",
        initialValue = 1,
        allocationSize = 1)
    @Column(updatable = false, nullable = false)
    var id : Long? = null

    fun toDTO(): UserDTO {
        return UserDTO(id, nickname, email, password, active)
    }
    

    fun toDTOSlim(): UserSlimDTO {
        return UserSlimDTO(id, nickname, email)
    }
}

