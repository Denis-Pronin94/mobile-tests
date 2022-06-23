package owner;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:credentials.properties"})
public interface MobileLocalConfig extends Config {

    @Key("deviceLocalName")
    @DefaultValue("Pixel 4 API 30")
    String DeviceLocalName();

    @Key("osLocalVersion")
    @DefaultValue("11.0")
    String OsVersion();

    @Key("baseLocalUrl")
    @DefaultValue("http://localhost:4723/wd/hub")
    String BaseLocalUrl();

    @Key("platformName")
    @DefaultValue("Android")
    String PlatformName();
}
