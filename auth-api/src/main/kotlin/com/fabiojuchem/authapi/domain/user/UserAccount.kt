package com.fabiojuchem.authapi.domain.user

import com.fabiojuchem.common.domain.EntityBase
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "user_account")
class UserAccount(

    @Column("username")
    val username: String,

    @Column("password")
    val password: String
) : EntityBase()