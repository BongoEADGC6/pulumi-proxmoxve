// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerInitializationDns;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerInitializationIpConfig;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerInitializationUserAccount;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerInitialization {
    private @Nullable ContainerInitializationDns dns;
    private @Nullable String hostname;
    private @Nullable List<ContainerInitializationIpConfig> ipConfigs;
    private @Nullable ContainerInitializationUserAccount userAccount;

    private ContainerInitialization() {}
    public Optional<ContainerInitializationDns> dns() {
        return Optional.ofNullable(this.dns);
    }
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    public List<ContainerInitializationIpConfig> ipConfigs() {
        return this.ipConfigs == null ? List.of() : this.ipConfigs;
    }
    public Optional<ContainerInitializationUserAccount> userAccount() {
        return Optional.ofNullable(this.userAccount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInitialization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ContainerInitializationDns dns;
        private @Nullable String hostname;
        private @Nullable List<ContainerInitializationIpConfig> ipConfigs;
        private @Nullable ContainerInitializationUserAccount userAccount;
        public Builder() {}
        public Builder(ContainerInitialization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dns = defaults.dns;
    	      this.hostname = defaults.hostname;
    	      this.ipConfigs = defaults.ipConfigs;
    	      this.userAccount = defaults.userAccount;
        }

        @CustomType.Setter
        public Builder dns(@Nullable ContainerInitializationDns dns) {
            this.dns = dns;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigs(@Nullable List<ContainerInitializationIpConfig> ipConfigs) {
            this.ipConfigs = ipConfigs;
            return this;
        }
        public Builder ipConfigs(ContainerInitializationIpConfig... ipConfigs) {
            return ipConfigs(List.of(ipConfigs));
        }
        @CustomType.Setter
        public Builder userAccount(@Nullable ContainerInitializationUserAccount userAccount) {
            this.userAccount = userAccount;
            return this;
        }
        public ContainerInitialization build() {
            final var o = new ContainerInitialization();
            o.dns = dns;
            o.hostname = hostname;
            o.ipConfigs = ipConfigs;
            o.userAccount = userAccount;
            return o;
        }
    }
}
