// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserAclArgs Empty = new UserAclArgs();

    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    @Import(name="propagate")
    private @Nullable Output<Boolean> propagate;

    public Optional<Output<Boolean>> propagate() {
        return Optional.ofNullable(this.propagate);
    }

    @Import(name="roleId", required=true)
    private Output<String> roleId;

    public Output<String> roleId() {
        return this.roleId;
    }

    private UserAclArgs() {}

    private UserAclArgs(UserAclArgs $) {
        this.path = $.path;
        this.propagate = $.propagate;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAclArgs $;

        public Builder() {
            $ = new UserAclArgs();
        }

        public Builder(UserAclArgs defaults) {
            $ = new UserAclArgs(Objects.requireNonNull(defaults));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder propagate(@Nullable Output<Boolean> propagate) {
            $.propagate = propagate;
            return this;
        }

        public Builder propagate(Boolean propagate) {
            return propagate(Output.of(propagate));
        }

        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public UserAclArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.roleId = Objects.requireNonNull($.roleId, "expected parameter 'roleId' to be non-null");
            return $;
        }
    }

}
