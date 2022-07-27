package com.fabiojuchem.authapi.domain.token

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import kotlin.math.floor

class TokenBuilder {

    companion object {
        fun build(): String {
            val secret = floor(Math.random()*(9999999-0+1)+0)
            val algorithm: Algorithm = Algorithm.HMAC256(secret.toString())
            return JWT.create()
                    .withIssuer("auth0")
                    .sign(algorithm)
        }

        fun hashSecret(secret: String): String {
            val digest: MessageDigest = MessageDigest.getInstance("SHA-256")
            val hash: ByteArray = digest.digest(secret.toByteArray(StandardCharsets.UTF_8))
            return String(hash)
        }
    }
}