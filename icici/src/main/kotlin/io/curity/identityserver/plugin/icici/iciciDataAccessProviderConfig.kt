package io.curity.identityserver.plugin.icici

import se.curity.identityserver.sdk.config.Configuration
import se.curity.identityserver.sdk.config.annotation.Description

interface iciciDataAccessProviderConfig: Configuration
{
    @Description("A parameter used for demo purposes")
    fun getDemoConnectionUri(): String
}
