package com.fabiojuchem.processorapi.domain.aminoacid

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table(name = "aminoacid")
class Aminoacid(

    @Column("name")
    val name: String,

    @Column("initials")
    val initials: String,

    @Column("symbol")
    val symbol: String,

    @Column("rna_codon")
    val rnaCodon: String,

    @Column("rna_anti_codon")
    val rnaAntiCodon: String,

    @Column("description")
    val description: String


) {

    @Id
    var id: UUID = UUID.randomUUID()
}