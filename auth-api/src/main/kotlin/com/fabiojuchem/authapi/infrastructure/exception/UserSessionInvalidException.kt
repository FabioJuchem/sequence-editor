package com.fabiojuchem.authapi.infrastructure.exception

import java.lang.RuntimeException

class UserSessionInvalidException(
        message: String = "Session invalid"
): RuntimeException(message)