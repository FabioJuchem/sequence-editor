package com.fabiojuchem.processorapi.domain.aminoacid.repository

import com.fabiojuchem.processorapi.domain.aminoacid.Aminoacid
import org.springframework.data.r2dbc.repository.R2dbcRepository
import java.util.*

interface AminoacidRepository: R2dbcRepository<Aminoacid, UUID> {
}