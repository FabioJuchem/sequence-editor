package com.fabiojuchem.common.domain

import java.util.*
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class EntityBase {

    @Id
    val id: UUID = UUID.randomUUID()
}