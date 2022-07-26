package com.fabiojuchem.authapi.domain.token

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import org.bouncycastle.util.encoders.Hex
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

class TokenBuilder {

    companion object {
        fun build(value: String) {
            val algorithm: Algorithm = Algorithm.HMAC256("secret")
            val token = JWT.create()
                    .withIssuer("auth0")
                    .sign(algorithm)
        }

        fun hashSecret(secret: String): String {
            val digest: MessageDigest = MessageDigest.getInstance("SHA-256")
            val hash: ByteArray = digest.digest(secret.toByteArray(StandardCharsets.UTF_8))
            return String(Hex.encode(hash))
        }
    }
}