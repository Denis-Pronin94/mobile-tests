package owner;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:credentials.properties"})
public interface MobileLocalConfig extends Config {

    @Key("deviceLocalName")
    String DeviceLocalName();

    @Key("osLocalVersion")
    String OsVersion();

    @Key("baseLocalUrl")
    String BaseLocalUrl();

    @Key("platformName")
    String PlatformName();
}
