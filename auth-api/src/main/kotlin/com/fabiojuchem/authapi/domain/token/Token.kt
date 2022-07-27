package com.fabiojuchem.authapi.domain.token

import com.fabiojuchem.common.domain.EntityBase
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.util.*

@Table(name = "token")
class Token(
        @Column("token")
        private val token: String,

        @Column("user_account_id")
        val userId: UUID
): EntityBase() {

        @Column("created_at")
        private val createdAt: LocalDateTime = LocalDateTime.now()

        @Column("created_at")
        private val expiresIn: Long = 10000
}