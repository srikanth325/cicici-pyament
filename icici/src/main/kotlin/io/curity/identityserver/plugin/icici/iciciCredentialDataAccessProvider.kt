package io.curity.identityserver.plugin.icici

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import se.curity.identityserver.sdk.attribute.AccountAttributes
import se.curity.identityserver.sdk.attribute.AuthenticationAttributes
import se.curity.identityserver.sdk.datasource.CredentialDataAccessProvider

class iciciCredentialDataAccessProvider(private val _configuration: iciciDataAccessProviderConfig): CredentialDataAccessProvider
{
    override fun updatePassword(accountAttributes: AccountAttributes)
    {
        _logger.debug("Received request to update password for username : {}", accountAttributes.userName)
        TODO()
    }

    override fun verifyPassword(userName: String, password: String): AuthenticationAttributes?
    {
        _logger.debug("Received request to verify password for username : {}", userName)

        TODO()
    }

    override fun customQueryVerifiesPassword(): Boolean
    {
        TODO()
    }

    companion object
    {
        private val _logger: Logger = LoggerFactory.getLogger(iciciCredentialDataAccessProvider::class.java)
    }
}
