package com.fabiojuchem.authapi.domain.user

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table(name = "user_account")
class UserAccount(

    @Column("username")
    val username: String,

    @Column("password")
    val password: String
) {
    @Id
    var id: UUID = UUID.randomUUID()
}