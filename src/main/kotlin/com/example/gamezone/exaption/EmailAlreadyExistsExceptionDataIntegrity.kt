package com.example.gamezone.exaption

import org.springframework.dao.DataIntegrityViolationException

class EmailAlreadyExistsExceptionDataIntegrity(message: String) : DataIntegrityViolationException(message)