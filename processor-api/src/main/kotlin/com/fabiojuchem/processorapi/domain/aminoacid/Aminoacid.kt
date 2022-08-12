package com.fabiojuchem.processorapi.domain.aminoacid

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table(name = "protein")
class Aminoacid(

    @Column("name")
    private val name: String,

    @Column("initials")
    private val initials: String,

    @Column("symbol")
    private val symbol: String,

    @Column("rna_codon")
    private val rnaCodon: String,

    @Column("rna_anti_codon")
    private val rnaAntiCodon: String,

    @Column("desription")
    private val description: String


) {

    @Id
    var id: UUID = UUID.randomUUID()
}