package com.fabiojuchem.authapi.domain.token

import com.fabiojuchem.common.domain.EntityBase
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.util.*

@Table(name = "token")
class Token(

        @Column("token")
        var token: String,

        @Column("user_account_id")
        var userId: UUID
) {

        @Id
        var id: UUID = UUID.randomUUID()

        @Column("created_at")
        var createdAt: LocalDateTime = LocalDateTime.now()

        @Column("expires_in")
        var expiresIn: Long = 10000

        fun isExpired(): Boolean {
                return LocalDateTime.now().isBefore(createdAt.plusSeconds(expiresIn))
        }

        fun renew() {
                this.createdAt = LocalDateTime.now()
                this.token = TokenBuilder.build()
        }
}