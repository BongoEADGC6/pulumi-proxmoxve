// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallIPSetCidr {
    private @Nullable String comment;
    private String name;
    private @Nullable Boolean nomatch;

    private FirewallIPSetCidr() {}
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public String name() {
        return this.name;
    }
    public Optional<Boolean> nomatch() {
        return Optional.ofNullable(this.nomatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallIPSetCidr defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private String name;
        private @Nullable Boolean nomatch;
        public Builder() {}
        public Builder(FirewallIPSetCidr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.nomatch = defaults.nomatch;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nomatch(@Nullable Boolean nomatch) {
            this.nomatch = nomatch;
            return this;
        }
        public FirewallIPSetCidr build() {
            final var o = new FirewallIPSetCidr();
            o.comment = comment;
            o.name = name;
            o.nomatch = nomatch;
            return o;
        }
    }
}
