package com.fabiojuchem.authapi.domain.user

import com.fabiojuchem.common.domain.EntityBase
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "user")
class User(
    @Column(name = "username")
    private val username: String,

    @Column(name = "password")
    private val password: String
) : EntityBase()