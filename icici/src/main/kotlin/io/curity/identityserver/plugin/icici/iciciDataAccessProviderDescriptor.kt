package io.curity.identityserver.plugin.icici

import se.curity.identityserver.sdk.plugin.descriptor.DataAccessProviderPluginDescriptor

class iciciDataAccessProviderDescriptor: DataAccessProviderPluginDescriptor<iciciDataAccessProviderConfig>
{
    override fun getPluginImplementationType() = "icici"

    override fun getConfigurationType() = iciciDataAccessProviderConfig::class.java

    override fun getCredentialDataAccessProvider() = iciciCredentialDataAccessProvider::class.java

    override fun getUserAccountDataAccessProvider() = iciciUserAccountDataAccessProvider::class.java

    override fun getDeviceDataAccessProvider() = iciciDeviceDataAccessProvider::class.java

    override fun getBucketDataAccessProvider() = iciciBucketDataAccessProvider::class.java

    override fun getDynamicallyRegisteredClientDataAccessProvider() = iciciDynamicallyRegisteredClientDataAccessProvider::class.java
}
