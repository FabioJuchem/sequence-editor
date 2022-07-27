package com.fabiojuchem.authapi.infrastructure.exception

import java.lang.RuntimeException

class LoginInvalidException(
        message: String
): RuntimeException(message)