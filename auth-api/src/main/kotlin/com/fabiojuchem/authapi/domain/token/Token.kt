package com.fabiojuchem.authapi.domain.token

import com.fabiojuchem.authapi.domain.user.User
import com.fabiojuchem.common.domain.EntityBase
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.JoinColumn
import javax.persistence.Table

@Table(name = "token")
class Token(
        @Column(name = "token")
        private val token: String,

        @JoinColumn(name = "user_id")
        val user: User
): EntityBase() {

        @Column(name = "created_at")
        private val createdAt: LocalDateTime = LocalDateTime.now()

        @Column(name = "created_at")
        private val expiresIn: Long = 10000
}