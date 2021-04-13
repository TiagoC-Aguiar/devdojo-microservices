package academy.devdojo.youtube.core.property;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "jwt.config")
@Getter
@Setter
@ToString
public class JwtConfiguration {
    private String loginUrl = "/login/**";
    private int expiration = 3600;
    private String privateKey = "FICpPDekBinBbxmbasR5OYTKRBoBzr4E";
    private String type = "encrypted";

    @NestedConfigurationProperty
    private Header header = new Header();

    @Getter
    @Setter
    public static class Header {
        private String name = "Authorization";
        private String prefix = "Bearer ";
    }
}
