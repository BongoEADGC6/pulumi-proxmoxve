// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerOperatingSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerOperatingSystemArgs Empty = new ContainerOperatingSystemArgs();

    @Import(name="templateFileId", required=true)
    private Output<String> templateFileId;

    public Output<String> templateFileId() {
        return this.templateFileId;
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ContainerOperatingSystemArgs() {}

    private ContainerOperatingSystemArgs(ContainerOperatingSystemArgs $) {
        this.templateFileId = $.templateFileId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerOperatingSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerOperatingSystemArgs $;

        public Builder() {
            $ = new ContainerOperatingSystemArgs();
        }

        public Builder(ContainerOperatingSystemArgs defaults) {
            $ = new ContainerOperatingSystemArgs(Objects.requireNonNull(defaults));
        }

        public Builder templateFileId(Output<String> templateFileId) {
            $.templateFileId = templateFileId;
            return this;
        }

        public Builder templateFileId(String templateFileId) {
            return templateFileId(Output.of(templateFileId));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ContainerOperatingSystemArgs build() {
            $.templateFileId = Objects.requireNonNull($.templateFileId, "expected parameter 'templateFileId' to be non-null");
            return $;
        }
    }

}
